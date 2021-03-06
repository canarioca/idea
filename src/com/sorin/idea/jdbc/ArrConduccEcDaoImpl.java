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

public class ArrConduccEcDaoImpl extends AbstractDAO implements ArrConduccEcDao
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
	protected final String SQL_SELECT = "SELECT IDCONDUCCAV, IDESTIM, CONDUC, FARMACO, BLOQUEO, NVIEL, MS FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDCONDUCCAV, IDESTIM, CONDUC, FARMACO, BLOQUEO, NVIEL, MS ) VALUES ( ?,null, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDCONDUCCAV = ?, IDESTIM = ?, CONDUC = ?, FARMACO = ?, BLOQUEO = ?, NVIEL = ?, MS = ? WHERE IDCONDUCCAV = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDCONDUCCAV = ?";

	/** 
	 * Index of column IDCONDUCCAV
	 */
	protected static final int COLUMN_IDCONDUCCAV = 1;

	/** 
	 * Index of column IDESTIM
	 */
	protected static final int COLUMN_IDESTIM = 2;

	/** 
	 * Index of column CONDUC
	 */
	protected static final int COLUMN_CONDUC = 3;

	/** 
	 * Index of column FARMACO
	 */
	protected static final int COLUMN_FARMACO = 4;

	/** 
	 * Index of column BLOQUEO
	 */
	protected static final int COLUMN_BLOQUEO = 5;

	/** 
	 * Index of column NVIEL
	 */
	protected static final int COLUMN_NVIEL = 6;

	/** 
	 * Index of column MS
	 */
	protected static final int COLUMN_MS = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column IDCONDUCCAV
	 */
	protected static final int PK_COLUMN_IDCONDUCCAV = 1;

	/** 
	 * Inserts a new row in the ARR_CONDUCC_EC table.
	 */
	public ArrConduccEcPk insert(ArrConduccEc dto) throws ArrConduccEcDaoException
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
			if (dto.getIdconduccav() != null) {
				stmt.setInt( index++, dto.getIdconduccav().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			/*if (dto.getIdestim() != null) {
				stmt.setInt( index++, dto.getIdestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}*/
		
			if (dto.getConduc() != null) {
				stmt.setInt( index++, dto.getConduc().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getFarmaco() );
			if (dto.getBloqueo() != null) {
				stmt.setInt( index++, dto.getBloqueo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getNviel() != null) {
				stmt.setInt( index++, dto.getNviel().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getMs() );
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.insercion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			long t2 = System.currentTimeMillis();
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new ArrConduccEcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_CONDUCC_EC table.
	 */
	public void update(ArrConduccEcPk pk, ArrConduccEc dto) throws ArrConduccEcDaoException
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
			if (dto.getIdconduccav() != null) {
				stmt.setInt( index++, dto.getIdconduccav().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdestim() != null) {
				stmt.setInt( index++, dto.getIdestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getConduc() != null) {
				stmt.setInt( index++, dto.getConduc().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getFarmaco() );
			if (dto.getBloqueo() != null) {
				stmt.setInt( index++, dto.getBloqueo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getNviel() != null) {
				stmt.setInt( index++, dto.getNviel().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getMs() );
			if (pk.getIdconduccav() != null) {
				stmt.setInt( 8, pk.getIdconduccav().intValue() );
			} else {
				stmt.setNull(8, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrConduccEcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_CONDUCC_EC table.
	 */
	public void delete(ArrConduccEcPk pk) throws ArrConduccEcDaoException
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
			if (pk.getIdconduccav() != null) {
				stmt.setInt( 1, pk.getIdconduccav().intValue() );
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
			throw new ArrConduccEcDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_CONDUCC_EC table that matches the specified primary-key value.
	 */
	public ArrConduccEc findByPrimaryKey(ArrConduccEcPk pk) throws ArrConduccEcDaoException
	{
		return findByPrimaryKey( pk.getIdconduccav() );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'IDESTIM = :idestim AND IDCONDUCCAV = :idconduccav'.
	 */
	public ArrConduccEc findByPrimaryKey(Integer idconduccav) throws ArrConduccEcDaoException
	{
		ArrConduccEc ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDCONDUCCAV = ?", new Object[] { idconduccav } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria ''.
	 */
	public ArrConduccEc[] findAll() throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDCONDUCCAV", null );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'IDCONDUCCAV = :idconduccav'.
	 */
	public ArrConduccEc[] findWhereIdconduccavEquals(long idconduccav) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDCONDUCCAV = ? ORDER BY IDCONDUCCAV", new Object[] {  new Long(idconduccav) } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'IDESTIM = :idestim'.
	 */
	public ArrConduccEc[] findWhereIdestimEquals(long idestim) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDESTIM = ? ORDER BY IDESTIM", new Object[] {  new Long(idestim) } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'CONDUC = :conduc'.
	 */
	public ArrConduccEc[] findWhereConducEquals(long conduc) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONDUC = ? ORDER BY CONDUC", new Object[] {  new Long(conduc) } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'FARMACO = :farmaco'.
	 */
	public ArrConduccEc[] findWhereFarmacoEquals(String farmaco) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FARMACO = ? ORDER BY FARMACO", new Object[] { farmaco } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'BLOQUEO = :bloqueo'.
	 */
	public ArrConduccEc[] findWhereBloqueoEquals(long bloqueo) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BLOQUEO = ? ORDER BY BLOQUEO", new Object[] {  new Long(bloqueo) } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'NVIEL = :nviel'.
	 */
	public ArrConduccEc[] findWhereNvielEquals(long nviel) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NVIEL = ? ORDER BY NVIEL", new Object[] {  new Long(nviel) } );
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the criteria 'MS = :ms'.
	 */
	public ArrConduccEc[] findWhereMsEquals(String ms) throws ArrConduccEcDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MS = ? ORDER BY MS", new Object[] { ms } );
	}

	/**
	 * Method 'ArrConduccEcDaoImpl'
	 * 
	 */
	public ArrConduccEcDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrConduccEcDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrConduccEcDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrConduccEcDaoImpl(final java.sql.Connection userConn)
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
		//return "idea.ARR_CONDUCC_EC";
		return "idea.arr_conducc_ec";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrConduccEc fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrConduccEc dto = new ArrConduccEc();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrConduccEc[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrConduccEc dto = new ArrConduccEc();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrConduccEc ret[] = new ArrConduccEc[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrConduccEc dto, ResultSet rs) throws SQLException
	{
		dto.setIdconduccav( new Integer( rs.getInt(COLUMN_IDCONDUCCAV) ) );
		dto.setIdestim( new Integer( rs.getInt(COLUMN_IDESTIM) ) );
		dto.setConduc( new Integer( rs.getInt(COLUMN_CONDUC) ) );
		if (rs.wasNull()) {
			dto.setConduc( null );
		}
		
		dto.setFarmaco( rs.getString( COLUMN_FARMACO ) );
		dto.setBloqueo( new Integer( rs.getInt(COLUMN_BLOQUEO) ) );
		if (rs.wasNull()) {
			dto.setBloqueo( null );
		}
		
		dto.setNviel( new Integer( rs.getInt(COLUMN_NVIEL) ) );
		if (rs.wasNull()) {
			dto.setNviel( null );
		}
		
		dto.setMs( rs.getString( COLUMN_MS ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrConduccEc dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_CONDUCC_EC table that match the specified arbitrary SQL statement
	 */
	public ArrConduccEc[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrConduccEcDaoException
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
			throw new ArrConduccEcDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ARR_CONDUCC_EC table that match the specified arbitrary SQL statement
	 */
	public ArrConduccEc[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrConduccEcDaoException
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
			throw new ArrConduccEcDaoException( "Exception: " + _e.getMessage(), _e );
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
