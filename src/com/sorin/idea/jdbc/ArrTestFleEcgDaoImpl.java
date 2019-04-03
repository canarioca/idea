/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.jdbc;

import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import com.sorin.idea.dao.*;
import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;

public class ArrTestFleEcgDaoImpl extends AbstractDAO implements ArrTestFleEcgDao
{
	private AuditoriaDao auditoriaDao = new AuditoriaDao();
	private AuditoriaDto auditoriaDto = null;
	
	public long getMAX_REGISTROS_SQL() {
		return 10000;
	}
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT IDTEST, IDRITMO, IDCONDUCCION, IDCONDUCCIONNO, IDQRS, IDQRSNO, MORFOLOGIA, COMENTARIOS, RR, PR, QRS, QT, QTC FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDTEST, IDRITMO, IDCONDUCCION, IDCONDUCCIONNO, IDQRS, IDQRSNO, MORFOLOGIA, COMENTARIOS, RR, PR, QRS, QT, QTC ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDTEST = ?, IDRITMO = ?, IDCONDUCCION = ?, IDCONDUCCIONNO = ?, IDQRS = ?, IDQRSNO = ?, MORFOLOGIA = ?, COMENTARIOS = ?, RR = ?, PR = ?, QRS = ?, QT = ?, QTC = ? WHERE IDTEST = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDTEST = ?";

	/** 
	 * Index of column IDTEST
	 */
	protected static final int COLUMN_IDTEST = 1;

	/** 
	 * Index of column IDRITMO
	 */
	protected static final int COLUMN_IDRITMO = 2;

	/** 
	 * Index of column IDCONDUCCION
	 */
	protected static final int COLUMN_IDCONDUCCION = 3;

	/** 
	 * Index of column IDCONDUCCIONNO
	 */
	protected static final int COLUMN_IDCONDUCCIONNO = 4;

	/** 
	 * Index of column IDQRS
	 */
	protected static final int COLUMN_IDQRS = 5;

	/** 
	 * Index of column IDQRSNO
	 */
	protected static final int COLUMN_IDQRSNO = 6;

	/** 
	 * Index of column MORFOLOGIA
	 */
	protected static final int COLUMN_MORFOLOGIA = 7;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 8;

	/** 
	 * Index of column RR
	 */
	protected static final int COLUMN_RR = 9;

	/** 
	 * Index of column PR
	 */
	protected static final int COLUMN_PR = 10;

	/** 
	 * Index of column QRS
	 */
	protected static final int COLUMN_QRS = 11;

	/** 
	 * Index of column QT
	 */
	protected static final int COLUMN_QT = 12;

	/** 
	 * Index of column QTC
	 */
	protected static final int COLUMN_QTC = 13;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 13;

	/** 
	 * Index of primary-key column IDTEST
	 */
	protected static final int PK_COLUMN_IDTEST = 1;

	/** 
	 * Inserts a new row in the ARR_TEST_FLE_ECG table.
	 */
	public ArrTestFleEcgPk insert(ArrTestFleEcg dto) throws ArrTestFleEcgDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			if (dto.getIdtest() != null) {
				stmt.setInt( index++, dto.getIdtest().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdritmo() != null) {
				stmt.setInt( index++, dto.getIdritmo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdconduccion() != null) {
				stmt.setInt( index++, dto.getIdconduccion().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdconduccionno() != null) {
				stmt.setInt( index++, dto.getIdconduccionno().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdqrs() != null) {
				stmt.setInt( index++, dto.getIdqrs().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdqrsno() != null) {
				stmt.setInt( index++, dto.getIdqrsno().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getMorfologia() );
			stmt.setString( index++, dto.getComentarios() );
			stmt.setString( index++, dto.getRr() );
			stmt.setString( index++, dto.getPr() );
			stmt.setString( index++, dto.getQrs() );
			stmt.setString( index++, dto.getQt() );
			stmt.setString( index++, dto.getQtc() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			auditoriaDto.setAccion(AuditoriaDto.insercion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new ArrTestFleEcgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_TEST_FLE_ECG table.
	 */
	public void update(ArrTestFleEcgPk pk, ArrTestFleEcg dto) throws ArrTestFleEcgDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			if (dto.getIdtest() != null) {
				stmt.setInt( index++, dto.getIdtest().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdritmo() != null) {
				stmt.setInt( index++, dto.getIdritmo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdconduccion() != null) {
				stmt.setInt( index++, dto.getIdconduccion().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdconduccionno() != null) {
				stmt.setInt( index++, dto.getIdconduccionno().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdqrs() != null) {
				stmt.setInt( index++, dto.getIdqrs().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdqrsno() != null) {
				stmt.setInt( index++, dto.getIdqrsno().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getMorfologia() );
			stmt.setString( index++, dto.getComentarios() );
			stmt.setString( index++, dto.getRr() );
			stmt.setString( index++, dto.getPr() );
			stmt.setString( index++, dto.getQrs() );
			stmt.setString( index++, dto.getQt() );
			stmt.setString( index++, dto.getQtc() );
			if (pk.getIdtest() != null) {
				stmt.setInt( 14, pk.getIdtest().intValue() );
			} else {
				stmt.setNull(14, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrTestFleEcgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_TEST_FLE_ECG table.
	 */
	public void delete(ArrTestFleEcgPk pk) throws ArrTestFleEcgDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_DELETE );
			if (pk.getIdtest() != null) {
				stmt.setInt( 1, pk.getIdtest().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.borrado);
			auditoriaDto.setDescri(pk.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrTestFleEcgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_TEST_FLE_ECG table that matches the specified primary-key value.
	 */
	public ArrTestFleEcg findByPrimaryKey(ArrTestFleEcgPk pk) throws ArrTestFleEcgDaoException
	{
		return findByPrimaryKey( pk.getIdtest() );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDTEST = :idtest'.
	 */
	public ArrTestFleEcg findByPrimaryKey(Integer idtest) throws ArrTestFleEcgDaoException
	{
		ArrTestFleEcg ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDTEST = ?", new Object[] { idtest } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria ''.
	 */
	public ArrTestFleEcg[] findAll() throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDTEST", null );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDTEST = :idtest'.
	 */
	public ArrTestFleEcg[] findWhereIdtestEquals(long idtest) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDTEST = ? ORDER BY IDTEST", new Object[] {  new Long(idtest) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDRITMO = :idritmo'.
	 */
	public ArrTestFleEcg[] findWhereIdritmoEquals(long idritmo) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDRITMO = ? ORDER BY IDRITMO", new Object[] {  new Long(idritmo) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDCONDUCCION = :idconduccion'.
	 */
	public ArrTestFleEcg[] findWhereIdconduccionEquals(long idconduccion) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDCONDUCCION = ? ORDER BY IDCONDUCCION", new Object[] {  new Long(idconduccion) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDCONDUCCIONNO = :idconduccionno'.
	 */
	public ArrTestFleEcg[] findWhereIdconduccionnoEquals(long idconduccionno) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDCONDUCCIONNO = ? ORDER BY IDCONDUCCIONNO", new Object[] {  new Long(idconduccionno) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDQRS = :idqrs'.
	 */
	public ArrTestFleEcg[] findWhereIdqrsEquals(long idqrs) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDQRS = ? ORDER BY IDQRS", new Object[] {  new Long(idqrs) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDQRSNO = :idqrsno'.
	 */
	public ArrTestFleEcg[] findWhereIdqrsnoEquals(long idqrsno) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDQRSNO = ? ORDER BY IDQRSNO", new Object[] {  new Long(idqrsno) } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'MORFOLOGIA = :morfologia'.
	 */
	public ArrTestFleEcg[] findWhereMorfologiaEquals(String morfologia) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MORFOLOGIA = ? ORDER BY MORFOLOGIA", new Object[] { morfologia } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ArrTestFleEcg[] findWhereComentariosEquals(String comentarios) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'RR = :rr'.
	 */
	public ArrTestFleEcg[] findWhereRrEquals(String rr) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RR = ? ORDER BY RR", new Object[] { rr } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'PR = :pr'.
	 */
	public ArrTestFleEcg[] findWherePrEquals(String pr) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PR = ? ORDER BY PR", new Object[] { pr } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QRS = :qrs'.
	 */
	public ArrTestFleEcg[] findWhereQrsEquals(String qrs) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE QRS = ? ORDER BY QRS", new Object[] { qrs } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QT = :qt'.
	 */
	public ArrTestFleEcg[] findWhereQtEquals(String qt) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE QT = ? ORDER BY QT", new Object[] { qt } );
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QTC = :qtc'.
	 */
	public ArrTestFleEcg[] findWhereQtcEquals(String qtc) throws ArrTestFleEcgDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE QTC = ? ORDER BY QTC", new Object[] { qtc } );
	}

	/**
	 * Method 'ArrTestFleEcgDaoImpl'
	 * 
	 */
	public ArrTestFleEcgDaoImpl()
	{
	}
	public ArrTestFleEcgDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrTestFleEcgDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrTestFleEcgDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrTestFleEcgDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		//return "idea.ARR_TEST_FLE_ECG";
		return "idea.arr_test_fle_ecg";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrTestFleEcg fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrTestFleEcg dto = new ArrTestFleEcg();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrTestFleEcg[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrTestFleEcg dto = new ArrTestFleEcg();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrTestFleEcg ret[] = new ArrTestFleEcg[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrTestFleEcg dto, ResultSet rs) throws SQLException
	{
		dto.setIdtest( new Integer( rs.getInt(COLUMN_IDTEST) ) );
		dto.setIdritmo( new Integer( rs.getInt(COLUMN_IDRITMO) ) );
		if (rs.wasNull()) {
			dto.setIdritmo( null );
		}
		
		dto.setIdconduccion( new Integer( rs.getInt(COLUMN_IDCONDUCCION) ) );
		if (rs.wasNull()) {
			dto.setIdconduccion( null );
		}
		
		dto.setIdconduccionno( new Integer( rs.getInt(COLUMN_IDCONDUCCIONNO) ) );
		if (rs.wasNull()) {
			dto.setIdconduccionno( null );
		}
		
		dto.setIdqrs( new Integer( rs.getInt(COLUMN_IDQRS) ) );
		if (rs.wasNull()) {
			dto.setIdqrs( null );
		}
		
		dto.setIdqrsno( new Integer( rs.getInt(COLUMN_IDQRSNO) ) );
		if (rs.wasNull()) {
			dto.setIdqrsno( null );
		}
		
		dto.setMorfologia( rs.getString( COLUMN_MORFOLOGIA ) );
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		dto.setRr( rs.getString( COLUMN_RR ) );
		dto.setPr( rs.getString( COLUMN_PR ) );
		dto.setQrs( rs.getString( COLUMN_QRS ) );
		dto.setQt( rs.getString( COLUMN_QT ) );
		dto.setQtc( rs.getString( COLUMN_QTC ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrTestFleEcg dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the specified arbitrary SQL statement
	 */
	public ArrTestFleEcg[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrTestFleEcgDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			throw new ArrTestFleEcgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the specified arbitrary SQL statement
	 */
	public ArrTestFleEcg[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrTestFleEcgDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			throw new ArrTestFleEcgDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
