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

public class SegPorestimulacionDaoImpl extends AbstractDAO implements SegPorestimulacionDao
{
	private AuditoriaDao auditoriaDao = new AuditoriaDao();
    private AuditoriaDto auditoriaDto = null;
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
	protected final String SQL_SELECT = "SELECT IDPORESTIM, PORAS, PORAP, PORVS, PORVP, TIEMPOFA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDPORESTIM, PORAS, PORAP, PORVS, PORVP, TIEMPOFA ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDPORESTIM = ?, PORAS = ?, PORAP = ?, PORVS = ?, PORVP = ?, TIEMPOFA = ? WHERE IDPORESTIM = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDPORESTIM = ?";

	/** 
	 * Index of column IDPORESTIM
	 */
	protected static final int COLUMN_IDPORESTIM = 1;

	/** 
	 * Index of column PORAS
	 */
	protected static final int COLUMN_PORAS = 2;

	/** 
	 * Index of column PORAP
	 */
	protected static final int COLUMN_PORAP = 3;

	/** 
	 * Index of column PORVS
	 */
	protected static final int COLUMN_PORVS = 4;

	/** 
	 * Index of column PORVP
	 */
	protected static final int COLUMN_PORVP = 5;

	/** 
	 * Index of column TIEMPOFA
	 */
	protected static final int COLUMN_TIEMPOFA = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column IDPORESTIM
	 */
	protected static final int PK_COLUMN_IDPORESTIM = 1;

	/** 
	 * Inserts a new row in the seg_porestimulacion table.
	 */
	public SegPorestimulacionPk insert(SegPorestimulacion dto) throws SegPorestimulacionDaoException
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
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			if (dto.getIdporestim() != null) {
				stmt.setInt( index++, dto.getIdporestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getPoras() );
			stmt.setString( index++, dto.getPorap() );
			stmt.setString( index++, dto.getPorvs() );
			stmt.setString( index++, dto.getPorvp() );
			stmt.setString( index++, dto.getTiempofa() );
			//System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			//System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdporestim( new Integer( rs.getInt(1) ) );
			}
			auditoriaDto.setAccion(AuditoriaDto.insercion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SegPorestimulacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the seg_porestimulacion table.
	 */
	public void update(SegPorestimulacionPk pk, SegPorestimulacion dto) throws SegPorestimulacionDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			//System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			if (dto.getIdporestim() != null) {
				stmt.setInt( index++, dto.getIdporestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getPoras() );
			stmt.setString( index++, dto.getPorap() );
			stmt.setString( index++, dto.getPorvs() );
			stmt.setString( index++, dto.getPorvp() );
			stmt.setString( index++, dto.getTiempofa() );
			if (pk.getIdporestim() != null) {
				stmt.setInt( 7, pk.getIdporestim().intValue() );
			} else {
				stmt.setNull(7, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
			//System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SegPorestimulacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the seg_porestimulacion table.
	 */
	public void delete(SegPorestimulacionPk pk) throws SegPorestimulacionDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			//System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			if (pk.getIdporestim() != null) {
				stmt.setInt( 1, pk.getIdporestim().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			//System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			auditoriaDto.setAccion(AuditoriaDto.borrado);
			auditoriaDto.setDescri(pk.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SegPorestimulacionDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the seg_porestimulacion table that matches the specified primary-key value.
	 */
	public SegPorestimulacion findByPrimaryKey(SegPorestimulacionPk pk) throws SegPorestimulacionDaoException
	{
		return findByPrimaryKey( pk.getIdporestim() );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'IDPORESTIM = :idporestim'.
	 */
	public SegPorestimulacion findByPrimaryKey(Integer idporestim) throws SegPorestimulacionDaoException
	{
		SegPorestimulacion ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDPORESTIM = ?", new Object[] { idporestim } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria ''.
	 */
	public SegPorestimulacion[] findAll() throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDPORESTIM", null );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'IDPORESTIM = :idporestim'.
	 */
	public SegPorestimulacion[] findWhereIdporestimEquals(int idporestim) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDPORESTIM = ? ORDER BY IDPORESTIM", new Object[] {  new Integer(idporestim) } );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'PORAS = :poras'.
	 */
	public SegPorestimulacion[] findWherePorasEquals(String poras) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORAS = ? ORDER BY PORAS", new Object[] { poras } );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'PORAP = :porap'.
	 */
	public SegPorestimulacion[] findWherePorapEquals(String porap) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORAP = ? ORDER BY PORAP", new Object[] { porap } );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'PORVS = :porvs'.
	 */
	public SegPorestimulacion[] findWherePorvsEquals(String porvs) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORVS = ? ORDER BY PORVS", new Object[] { porvs } );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'PORVP = :porvp'.
	 */
	public SegPorestimulacion[] findWherePorvpEquals(String porvp) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PORVP = ? ORDER BY PORVP", new Object[] { porvp } );
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the criteria 'TIEMPOFA = :tiempofa'.
	 */
	public SegPorestimulacion[] findWhereTiempofaEquals(String tiempofa) throws SegPorestimulacionDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIEMPOFA = ? ORDER BY TIEMPOFA", new Object[] { tiempofa } );
	}

	/**
	 * Method 'SegPorestimulacionDaoImpl'
	 * 
	 */
	public SegPorestimulacionDaoImpl()
	{
	}
	/**
	 * Method 'SegPorestimulacionDaoImpl'
	 * 
	 */
	public SegPorestimulacionDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public SegPorestimulacionDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'SegPorestimulacionDaoImpl'
	 * 
	 * @param userConn
	 */
	public SegPorestimulacionDaoImpl(final java.sql.Connection userConn)
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
		return "idea.seg_porestimulacion";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SegPorestimulacion fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SegPorestimulacion dto = new SegPorestimulacion();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SegPorestimulacion[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SegPorestimulacion dto = new SegPorestimulacion();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SegPorestimulacion ret[] = new SegPorestimulacion[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SegPorestimulacion dto, ResultSet rs) throws SQLException
	{
		dto.setIdporestim( new Integer( rs.getInt(COLUMN_IDPORESTIM) ) );
		dto.setPoras( rs.getString( COLUMN_PORAS ) );
		dto.setPorap( rs.getString( COLUMN_PORAP ) );
		dto.setPorvs( rs.getString( COLUMN_PORVS ) );
		dto.setPorvp( rs.getString( COLUMN_PORVP ) );
		dto.setTiempofa( rs.getString( COLUMN_TIEMPOFA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SegPorestimulacion dto)
	{
	}

	/** 
	 * Returns all rows from the seg_porestimulacion table that match the specified arbitrary SQL statement
	 */
	public SegPorestimulacion[] findByDynamicSelect(String sql, Object[] sqlParams) throws SegPorestimulacionDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new SegPorestimulacionDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the seg_porestimulacion table that match the specified arbitrary SQL statement
	 */
	public SegPorestimulacion[] findByDynamicWhere(String sql, Object[] sqlParams) throws SegPorestimulacionDaoException
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
		
		
			//System.out.println( "Executing " + SQL );
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
			_e.printStackTrace();
			throw new SegPorestimulacionDaoException( "Exception: " + _e.getMessage(), _e );
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
