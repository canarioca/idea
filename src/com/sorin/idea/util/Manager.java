package com.sorin.idea.util;

import hvn.cm.dao.DAOException;

import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.PropertyResourceBundle;

import javax.sql.DataSource;

import com.sorin.idea.util.Manager;

/**
 * The Manager provides connections and manages transactions transparently.
 * <br>
 * It is a singleton, you get its instance with the getInstance() method.
 * All of the XxxxManager classes use the Manager to get database connections.
 * Before doing any operation, you must pass either a
 * datasource or a jdbc driver/url/username/password.
 * You may extend it and use setInstance() method to make sure your
 * implementation is used as a singleton.
 * @author sql2java
 * @version $Revision: 1.11 $
 */
public final class Manager
{
    private static Manager instance = new Manager();
    private static InheritableThreadLocal transactionConnection = new InheritableThreadLocal();

    private PrintWriter pw = new PrintWriter(System.out);
    private DataSource ds = null;
    private String jdbcDriver = null;
    private String jdbcUrl = null;
    private String jdbcUsername = null;
    private String jdbcPassword = null;

    /**
     * Returns the manager singleton instance.
     */
    private Manager()
    {
        try
        {
            this.defaultConfigure();
        }
        catch(DAOException de)
        {
            System.err.println(de.getMessage());
        }
    }

    /**
     * Returns the manager singleton instance.
     */
    public static Manager getInstance()
    {
        return instance;
    }

    /**
     * database configuration with the default property values set in .
     * com/capgemini/scp/generated/Manager.properties
     * @throws Exception
     */
    public void defaultConfigure() throws DAOException
    {
        this.configure("com/hp/episodios/modelo/dao/dao.properties");
    }

    /**
     * configure with the parameters given in the given resource filename
     * @param fileName the resource filename to be used
     * @throws Exception
     */
    public void configure(String fileName) throws DAOException
    {
        try
        {
            InputStream inputStream = Manager.class.getClassLoader().getResourceAsStream(fileName);
            PropertyResourceBundle bundle = new PropertyResourceBundle(inputStream);
            this.setJdbcDriver(bundle.getString("jdbc.driver"));
            this.setJdbcUrl(bundle.getString("jdbc.url"));
            this.setJdbcUsername(bundle.getString("jdbc.username"));
            this.setJdbcPassword(bundle.getString("jdbc.password"));
        }
        catch(IOException ioe)
        {
            System.err.println("The property file " + fileName + " could not be found.");
            throw new DAOException(ioe.getMessage(), ioe);
        }
        catch(ClassNotFoundException cnfe)
        {
            System.err.println("The driver class " + this.jdbcDriver + " could not be found.");
            throw new DAOException(cnfe.getMessage(), cnfe);
        }
        catch(InstantiationException ie)
        {
            System.err.println("The driver class " + this.jdbcDriver + " could not be instantiated.");
            throw new DAOException(ie.getMessage(), ie);
        }
        catch(IllegalAccessException iae)
        {
            System.err.println("The driver class " + this.jdbcDriver + " could not be instantiated.");
            throw new DAOException(iae.getMessage(), iae);
        }
    }

    /**
     * Sets the datasource to be used by the manager.
     * <br>
     * A good datasource manages a pool of connections.
     *
     * @param ds the data source
     */
    public void setDataSource(DataSource ds)
    {
        this.ds = ds;
    }

    /**
     * Loads the passed jdbc driver.
     * <br>
     * Only needed if the datasource is not set.
     */
    public void setJdbcDriver(String jdbcDriver) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        this.jdbcDriver = jdbcDriver;
        Class.forName(jdbcDriver).newInstance();
    }

    /**
     * Sets the jdbc url.
     * <br>
     * Only needed if the datasource is not set.
     */
    public void setJdbcUrl(String jdbcUrl)
    {
        this.jdbcUrl = jdbcUrl;
    }

    /**
     * Sets the username used to access the database.
     * <br>
     * Only needed if the datasource is not set.
     */
    public void setJdbcUsername(String jdbcUsername)
    {
        this.jdbcUsername = jdbcUsername;
    }

    /**
     * Sets the password used to access the database.
     * <br>
     * Only needed if the datasource is not set.
     */
    public void setJdbcPassword(String jdbcPassword)
    {
        this.jdbcPassword = jdbcPassword;
    }

    /**
     * Gets an auto commit connection.
     * <br>
     * Normally you do not need this method that much ;-)
     *
     * @return an auto commit connection
     */
    public Connection getConnection() throws SQLException
    {
        synchronized (transactionConnection) {
            Connection tc = (Connection)transactionConnection.get();
            if (tc != null) {
                return tc;
            }

            if (ds!=null) {
                return ds.getConnection();
            } else if (jdbcDriver != null && jdbcUrl != null && jdbcUsername != null && jdbcPassword != null) {
                return DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
            } else {
                throw new IllegalStateException("Please set a datasource or a jdbc driver/url/username/password");
            }
        }
    }

    /**
     * Releases the database connection.
     * <br>
     * Normally you should not need this method ;-)
     */
    public void releaseConnection(Connection c)
    {
        synchronized (transactionConnection) {
            Connection tc = (Connection)transactionConnection.get();
            if (tc != null)
            {
                return;
            }

            try
            {
                if (c != null)
                {
                    c.close();
                }
            }
            catch (SQLException x)
            {
                log("Could not release the connection: "+x.toString());
            }
        }
    }

    /**
     * Initiates a database transaction.
     * <br>
     * When working within a transaction, you should invoke this method first.
     * The connection is returned just in case you need to set the isolation level.
     *
     * @return a non-auto commit connection with the default transaction isolation level
     */
    public Connection beginTransaction() throws SQLException
    {
        Connection c = this.getConnection();
        c.setAutoCommit(false);
        transactionConnection.set(c);
        return c;
    }

    /**
     * Releases connection used for the transaction and performs a commit or rollback.
     *
     * @param commit tells whether this connection should be committed
     *        true for commit(), false for rollback()
     */
    public void endTransaction(boolean commit) throws SQLException
    {
        Connection c = (Connection)transactionConnection.get();
        if (c == null)
        {
            return;
        }

        try
        {
            if (commit)
            {
                c.commit();
            }
            else
            {
                c.rollback();
            }
        }
        finally
        {
            c.setAutoCommit(true);
            transactionConnection.set(null);
            releaseConnection(c);
        }
    }

    /**
     * Sets the PrintWriter where logs are printed.
     * <br>
     * You may pass 'null' to disable logging.
     *
     * @param pw the PrintWriter for log messages
     */
    public void setLogWriter(PrintWriter pw)
    {
        this.pw = pw;
    }

////////////////////////////////////////////////////
// cleaning method
////////////////////////////////////////////////////

    /**
     * Logs a message using the underlying logwriter, if not null.
     */
    public void log(String message)
    {
        if (pw != null) {
            pw.println(message);
        }
    }

    /**
     * Closes the passed Statement.
     */
    public void close(Statement s)
    {
        try
        {
            if (s != null) {
                s.close();
            }
        }
        catch (SQLException x)
        {
            log("Could not close statement!: " + x.toString());
        }
    }

    /**
     * Closes the passed ResultSet.
     */
    public void close(ResultSet rs)
    {
        try
        {
            if (rs != null) {
                rs.close();
            }
        }
        catch (SQLException x)
        {
            log("Could not close result set!: " + x.toString());
        }
    }

    /**
     * Closes the passed Statement and ResultSet.
     */
    public void close(Statement s, ResultSet rs)
    {
        close(rs);
        close(s);
    }

////////////////////////////////////////////////////
// Helper methods for fetching numbers using IDs or names
////////////////////////////////////////////////////

    /**
     * Retrieves an int value from the passed result set as an Integer object.
     */
    public static Integer getInteger(ResultSet rs, int pos) throws SQLException
    {
        int i = rs.getInt(pos);
        return rs.wasNull() ? (Integer)null : new Integer(i);
    }

    /**
     * Retrieves an int value from the passed result set as an Integer object.
     */
    public static Integer getInteger(ResultSet rs, String column) throws SQLException
    {
        int i = rs.getInt(column);
        return rs.wasNull() ? (Integer)null : new Integer(i);
    }

    /**
     * Set an Integer object to the passed prepared statement as an int or as null.
     */
    public static void  setInteger(PreparedStatement ps, int pos, Integer i) throws SQLException
    {
        if (i==null)
        {
            ps.setNull(pos, Types.INTEGER);
        }
        else
        {
            ps.setInt(pos, i.intValue());
        }
    }

    /**
     * Retrieves a float value from the passed result set as a Float object.
     */
    public static Float getFloat(ResultSet rs, int pos) throws SQLException
    {
        float f = rs.getFloat(pos);
        return rs.wasNull() ? (Float)null : new Float(f);
    }

    /**
     * Retrieves a float value from the passed result set as a Float object.
     */
    public static Float getFloat(ResultSet rs, String column) throws SQLException
    {
        float f = rs.getFloat(column);
        return rs.wasNull() ? (Float)null : new Float(f);
    }

    /**
     * Set a Float object to the passed prepared statement as a float or as null.
     */
    public static void  setFloat(PreparedStatement ps, int pos, Float f) throws SQLException
    {
        if (f==null)
        {
            ps.setNull(pos, Types.FLOAT);
        }
        else
        {
            ps.setFloat(pos, f.floatValue());
        }
    }

    /**
     * Retrieves a double value from the passed result set as a Double object.
     */
    public static Double getDouble(ResultSet rs, int pos) throws SQLException
    {
        double d = rs.getDouble(pos);
        return rs.wasNull() ? (Double)null : new Double(d);
    }

    /**
     * Retrieves a double value from the passed result set as a Double object.
     */
    public static Double getDouble(ResultSet rs, String column) throws SQLException
    {
        double d = rs.getDouble(column);
        return rs.wasNull() ? (Double)null : new Double(d);
    }

    /**
     * Set a Double object to the passed prepared statement as a double or as null.
     */
    public static void  setDouble(PreparedStatement ps, int pos, Double d) throws SQLException
    {
        if (d==null)
        {
            ps.setNull(pos, Types.DOUBLE);
        }
        else
        {
            ps.setDouble(pos, d.doubleValue());
        }
    }

    /**
     * Retrieves a long value from the passed result set as a Long object.
     */
    public static Long getLong(ResultSet rs, int pos) throws SQLException
    {
        long l = rs.getLong(pos);
        return rs.wasNull() ? (Long)null : new Long(l);
    }

    /**
     * Retrieves a long value from the passed result set as a Long object.
     */
    public static Long getLong(ResultSet rs, String column) throws SQLException
    {
        long l = rs.getLong(column);
        return rs.wasNull() ? (Long)null : new Long(l);
    }

    /**
     * Set a Long object to the passed prepared statement as a long or as null.
     */
    public static void  setLong(PreparedStatement ps, int pos, Long l) throws SQLException
    {
        if (l==null)
        {
            ps.setNull(pos, Types.BIGINT);
        }
        else
        {
            ps.setLong(pos, l.longValue());
        }
    }

    /**
     * Retrieves a boolean value from the passed result set as a Boolean object.
     */
    public static Boolean getBoolean(ResultSet rs, int pos) throws SQLException
    {
        boolean b = rs.getBoolean(pos);
        return rs.wasNull() ? (Boolean)null : new Boolean(b);
    }

    /**
     * Retrieves a boolean value from the passed result set as a Boolean object.
     */
    public static Boolean getBoolean(ResultSet rs, String column) throws SQLException
    {
        boolean b = rs.getBoolean(column);
        return rs.wasNull() ? (Boolean)null : new Boolean(b);
    }

    /**
     * Set a Boolean object to the passed prepared statement as a boolean or as null.
     */
    public static void  setBoolean(PreparedStatement ps, int pos, Boolean b) throws SQLException
    {
        if (b==null)
        {
            ps.setNull(pos, Types.BOOLEAN);
        }
        else
        {
            ps.setBoolean(pos, b.booleanValue());
        }
    }

    /**
     * Retrieves a date value from the passed result set as a Calendar object.
     */
    public static Calendar getCalendar(ResultSet rs, int pos) throws SQLException
    {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(rs.getDate(pos));
            if (rs.wasNull()) {
                setValueRepresentingNull(calendar);
            }
        } catch (SQLException se) {
            setValueRepresentingNull(calendar);
        }
        return calendar;
    }

    /**
     * Retrieves a date value from the passed result set as a Calendar object.
     */
    public static Calendar getCalendar(ResultSet rs, String column) throws SQLException
    {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(rs.getDate(column));
            if (rs.wasNull()) {
                setValueRepresentingNull(calendar);
            }
        } catch (SQLException se) {
            setValueRepresentingNull(calendar);
        }
        return calendar;
    }

    /**
     * Set a Calendar object to the passed prepared statement as a date or as null.
     */
    public static void  setCalendar(PreparedStatement ps, int pos, Calendar calendar) throws SQLException
    {
        if ((calendar == null) || (isValueRepresentingNull(calendar)))
        {
            ps.setNull(pos, Types.TIMESTAMP);
        }
        else
        {
            ps.setDate(pos, new java.sql.Date(calendar.getTimeInMillis()));
        }
    }

    private static void setValueRepresentingNull(Calendar calendar) {
        calendar.set(Calendar.YEAR, DATE_REPRESENTING_NULL_YEAR);
        calendar.set(Calendar.MONTH, DATE_REPRESENTING_NULL_MONTH);
        calendar.set(Calendar.DATE, DATE_REPRESENTING_NULL_DATE);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.ZONE_OFFSET, 
            (calendar.getTimeZone().getRawOffset() + calendar.getTimeZone().getDSTSavings()) / 60000);
    } 

    public static boolean isValueRepresentingNull(Calendar calendar) {
        return (calendar.get(Calendar.YEAR) == DATE_REPRESENTING_NULL_YEAR) &&
                (calendar.get(Calendar.MONTH) == DATE_REPRESENTING_NULL_MONTH) &&
                (calendar.get(Calendar.DATE) == DATE_REPRESENTING_NULL_DATE);
    } 
 
    private static final int DATE_REPRESENTING_NULL_YEAR = 1899; 
    private static final int DATE_REPRESENTING_NULL_MONTH = Calendar.JANUARY; 
    private static final int DATE_REPRESENTING_NULL_DATE = 1; 

////////////////////////////////////////////////////
// Date helper methods
////////////////////////////////////////////////////

    /**
     * pattern for received date processing.
     */
    private static final String[] PATTERNS = new String[]
    {
        "EEE, dd MMM yyyy HH:mm:ss '-'S '('z')'",
        "EEE, dd MMM yyyy HH:mm:ss '+'S '('z')'",
        "EEE, dd MMM yyyy HH:mm:ss '-'S",
        "EEE, dd MMM yyyy HH:mm:ss '+'S",
        "EEE, dd MMM yyyy HH:mm:ss z",
        "EEE, dd MMM yyyy HH:mm:ss Z",
        "EEE, dd MMM yyyy HH:mm:ss",
        "EEE, d MMM yyyy HH:mm:ss '-'S '('z')'",
        "EEE, d MMM yyyy HH:mm:ss '+'S '('z')'",
        "EEE, d MMM yyyy HH:mm:ss '-'S",
        "EEE, d MMM yyyy HH:mm:ss '+'S",
        "EEE, d MMM yyyy HH:mm:ss z",
        "EEE, d MMM yyyy HH:mm:ss Z",
        "EEE, d MMM yyyy HH:mm:ss",

        "EEE, dd MMM yy HH:mm:ss '-'S '('z')'",
        "EEE, dd MMM yy HH:mm:ss '+'S '('z')'",
        "EEE, dd MMM yy HH:mm:ss '-'S",
        "EEE, dd MMM yy HH:mm:ss '+'S",
        "EEE, dd MMM yy HH:mm:ss z",
        "EEE, dd MMM yy HH:mm:ss Z",
        "EEE, dd MMM yy HH:mm:ss",
        "EEE, d MMM yy HH:mm:ss '-'S '('z')'",
        "EEE, d MMM yy HH:mm:ss '+'S '('z')'",
        "EEE, d MMM yy HH:mm:ss '-'S",
        "EEE, d MMM yy HH:mm:ss '+'S",
        "EEE, d MMM yy HH:mm:ss z",
        "EEE, d MMM yy HH:mm:ss Z",
        "EEE, d MMM yy HH:mm:ss",

        "dd MMM yyyy HH:mm:ss '-'S",
        "dd MMM yyyy HH:mm:ss '+'S",
        "dd MMM yyyy HH:mm:ss '-'S '('z')'",
        "dd MMM yyyy HH:mm:ss '+'S '('z')'",
        "dd MMM yyyy HH:mm:ss z",
        "dd MMM yyyy HH:mm:ss Z",
        "dd MMM yyyy HH:mm:ss",

        "dd MMM yyy HH:mm:ss '-'S",
        "dd MMM yyy HH:mm:ss '+'S",
        "dd MMM yyy HH:mm:ss '-'S '('z')'",
        "dd MMM yyy HH:mm:ss '+'S '('z')'",
        "dd MMM yyy HH:mm:ss z",
        "dd MMM yyy HH:mm:ss Z",
        "dd MMM yyy HH:mm:ss",

        "yyyy.MM.dd HH:mm:ss z",
        "yyyy.MM.dd HH:mm:ss Z",
        "yyyy.MM.d HH:mm:ss z",
        "yyyy.MM.d HH:mm:ss Z",
        "yyyy.MM.dd HH:mm:ss",
        "yyyy.MM.d HH:mm:ss",

        "yy.MM.dd HH:mm:ss z",
        "yy.MM.dd HH:mm:ss Z",
        "yy.MM.d HH:mm:ss z",
        "yy.MM.d HH:mm:ss Z",
        "yy.MM.dd HH:mm:ss",
        "yy.MM.d HH:mm:ss",

        "yyyy MM dd HH:mm:ss",
        "yyyy MM d HH:mm:ss",
        "yyyy MM dd HH:mm:ss z",
        "yyyy MM dd HH:mm:ss Z",
        "yyyy MM d HH:mm:ss z",
        "yyyy MM d HH:mm:ss Z",

        "yy MM dd HH:mm:ss",
        "yy MM d HH:mm:ss",
        "yy MM dd HH:mm:ss z",
        "yy MM dd HH:mm:ss Z",
        "yy MM d HH:mm:ss z",
        "yy MM d HH:mm:ss Z",

        "yyyy-MM-dd HH:mm:ss z",
        "yyyy-MM-dd HH:mm:ss Z",
        "yyyy-MM-d HH:mm:ss z",
        "yyyy-MM-d HH:mm:ss Z",
        "yyyy-MM-dd HH:mm:ss",
        "yyyy-MM-d HH:mm:ss",

        "yy-MM-dd HH:mm:ss z",
        "yy-MM-dd HH:mm:ss Z",
        "yy-MM-d HH:mm:ss z",
        "yy-MM-d HH:mm:ss Z",
        "yy-MM-dd HH:mm:ss",
        "yy-MM-d HH:mm:ss",

        "dd MMM yyyy",
        "d MMM yyyy",

        "dd.MMM.yyyy",
        "d.MMM.yyyy",

        "dd-MMM-yyyy",
        "d-MMM-yyyy",

        "dd MM yyyy",
        "d MM yyyy",

        "dd.MM.yyyy",
        "d.MM.yyyy",

        "dd-MM-yyyy",
        "d-MM-yyyy",

        "yyyy MM dd",
        "yyyy MM d",

        "yyyy.MM.dd",
        "yyyy.MM.d",

        "yyyy-MM-dd",
        "yyyy-MM-d",

        "dd MMM yy",
        "d MMM yy",

        "dd.MMM.yy",
        "d.MMM.yy",

        "dd-MMM-yy",
        "d-MMM-yy",

        "dd MM yy",
        "d MM yy",

        "dd.MM.yy",
        "d.MM.yy",

        "dd-MM-yy",
        "d-MM-yy",

        "yy MMM dd",
        "yy MMM d",

        "yy.MMM.dd",
        "yy.MMM.d",

        "yy-MMM-dd",
        "yy-MMM-d",

        "yy MMM dd",
        "yy MMM d",

        "yy.MMM.dd",
        "yy.MMM.d",

        "yy-MMM-dd",
        "yy-MMM-d",

        "EEE dd, MMM yyyy", // ex: Wed 19, Feb 2003

        "EEE dd, MMM yy" // ex: Wed 19, Feb 03
    };


    /**
     * get a date from a date string representation in one of the registered formats
     * @param strDate the date as string. If (null or empty) or correct pattern was not found
     * @return Date object
     */
    public static java.util.Date getDateFromString(String strDate)
    {
        java.util.Date dReceivedDate = Calendar.getInstance().getTime();
        if (strDate == null) {
            return dReceivedDate;
        } else {
            strDate = strDate.trim();
        }

        SimpleDateFormat pSimpleDateFormat = new SimpleDateFormat("");
        if (!"".equals(strDate))
        {
            for (int i=0; i<PATTERNS.length; i++)
            {
                try
                {
                    pSimpleDateFormat.applyPattern(PATTERNS[i]);
                    dReceivedDate = pSimpleDateFormat.parse(strDate);
                    if (dReceivedDate == null)
                    {
                        continue;
                    }
                    return dReceivedDate;
                }
                catch (ParseException pe)
                {
                    ; // ignore this format try the next one
                }
            }
        }
        return dReceivedDate;
    }

    /**
     * Verify that the string represantes the date with one of the registered formats
     * @param strDate the date as string.
     * @return boolean "true" if the string represantes the date in one of the registed formats.
     */
    public static boolean isDate(String strDate)
    {
        if (strDate == null) {
            return false;
        } else {
            strDate = strDate.trim();
        }

        SimpleDateFormat pSimpleDateFormat = new SimpleDateFormat("");
        if (!"".equals(strDate))
        {
            for (int i=0; i<PATTERNS.length; i++)
            {
                try
                {
                    pSimpleDateFormat.applyPattern(PATTERNS[i]);
                    java.util.Date dReceivedDate = pSimpleDateFormat.parse(strDate);
                    if (dReceivedDate == null) {
                        continue;
                    }
                    return true;
                }
                catch (ParseException pe)
                {
                    ; // ignore as it is reported below
                }
            }
        }
        return false;
    }
    
    public static String buildProcedureCall(String packageName, String procedureName, int paramCount) {
        return buildProcedureCall(packageName + "." + procedureName, paramCount);
    }
    
    public static String buildProcedureCall(String procedureName, int paramCount) {
        StringBuffer sb = new StringBuffer("{call ").append(procedureName).append("(");
        for (int n = 1; n <= paramCount; n++) {
            sb.append("?,");
        }
        if (paramCount > 0) {
            sb.setLength(sb.length()-1);
        }
        return sb.append(")}").toString();
    }
}

