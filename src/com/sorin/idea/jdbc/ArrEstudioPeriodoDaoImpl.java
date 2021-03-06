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

public class ArrEstudioPeriodoDaoImpl extends AbstractDAO implements ArrEstudioPeriodoDao
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
	protected final String SQL_SELECT = "SELECT IDESTUDIO, IDTIPO, IDTEJIDO, IDS1, REF, IDFARMACO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDESTUDIO, IDTIPO, IDTEJIDO, IDS1, REF, IDFARMACO ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDESTUDIO = ?, IDTIPO = ?, IDTEJIDO = ?, IDS1 = ?, REF = ?, IDFARMACO = ? WHERE IDESTUDIO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDESTUDIO = ?";

	/** 
	 * Index of column IDESTUDIO
	 */
	protected static final int COLUMN_IDESTUDIO = 1;

	/** 
	 * Index of column IDTIPO
	 */
	protected static final int COLUMN_IDTIPO = 2;

	/** 
	 * Index of column IDTEJIDO
	 */
	protected static final int COLUMN_IDTEJIDO = 3;

	/** 
	 * Index of column IDS1
	 */
	protected static final int COLUMN_IDS1 = 4;

	/** 
	 * Index of column REF
	 */
	protected static final int COLUMN_REF = 5;
	protected static final int COLUMN_IDFARMACO = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column IDESTUDIO
	 */
	protected static final int PK_COLUMN_IDESTUDIO = 1;

	/** 
	 * Inserts a new row in the ARR_ESTUDIO_PERIODO table.
	 */
	public ArrEstudioPeriodoPk insert(ArrEstudioPeriodo dto) throws ArrEstudioPeriodoDaoException
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
			if (dto.getIdestudio() != null) {
				stmt.setInt( index++, dto.getIdestudio().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdtipo() != null) {
				stmt.setInt( index++, dto.getIdtipo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getIdtejido() );
			stmt.setString( index++, dto.getIds1());
			stmt.setString( index++, dto.getRef() );
			if (dto.getIdfarmaco() != null) {
				stmt.setInt( index++, dto.getIdfarmaco().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			auditoriaDto.setAccion(AuditoriaDto.insercion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new ArrEstudioPeriodoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_ESTUDIO_PERIODO table.
	 */
	public void update(ArrEstudioPeriodoPk pk, ArrEstudioPeriodo dto) throws ArrEstudioPeriodoDaoException
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
			if (dto.getIdestudio() != null) {
				stmt.setInt( index++, dto.getIdestudio().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdtipo() != null) {
				stmt.setInt( index++, dto.getIdtipo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getIdtejido() );
			stmt.setString( index++, dto.getIds1() );
			stmt.setString( index++, dto.getRef() );
			if (dto.getIdfarmaco() != null) {
				stmt.setInt( index++, dto.getIdfarmaco().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			if (pk.getIdestudio() != null) {
				stmt.setInt( 7, pk.getIdestudio().intValue() );
			} else {
				stmt.setNull(7, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrEstudioPeriodoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_ESTUDIO_PERIODO table.
	 */
	public void delete(ArrEstudioPeriodoPk pk) throws ArrEstudioPeriodoDaoException
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
			if (pk.getIdestudio() != null) {
				stmt.setInt( 1, pk.getIdestudio().intValue() );
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
			throw new ArrEstudioPeriodoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_ESTUDIO_PERIODO table that matches the specified primary-key value.
	 */
	public ArrEstudioPeriodo findByPrimaryKey(ArrEstudioPeriodoPk pk) throws ArrEstudioPeriodoDaoException
	{
		return findByPrimaryKey( pk.getIdestudio() );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioPeriodo findByPrimaryKey(Integer idestudio) throws ArrEstudioPeriodoDaoException
	{
		ArrEstudioPeriodo ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDESTUDIO = ?", new Object[] { idestudio } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria ''.
	 */
	public ArrEstudioPeriodo[] findAll() throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDESTUDIO", null );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioPeriodo[] findWhereIdestudioEquals(long idestudio) throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDESTUDIO = ? ORDER BY IDESTUDIO", new Object[] {  new Long(idestudio) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'IDTIPO = :idtipo'.
	 */
	public ArrEstudioPeriodo[] findWhereIdtipoEquals(long idtipo) throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDTIPO = ? ORDER BY IDTIPO", new Object[] {  new Long(idtipo) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'IDTEJIDO = :idtejido'.
	 */
	public ArrEstudioPeriodo[] findWhereIdtejidoEquals(long idtejido) throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDTEJIDO = ? ORDER BY IDTEJIDO", new Object[] {  new Long(idtejido) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'IDS1 = :ids1'.
	 */
	public ArrEstudioPeriodo[] findWhereIds1Equals(long ids1) throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDS1 = ? ORDER BY IDS1", new Object[] {  new Long(ids1) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the criteria 'REF = :ref'.
	 */
	public ArrEstudioPeriodo[] findWhereRefEquals(String ref) throws ArrEstudioPeriodoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REF = ? ORDER BY REF", new Object[] { ref } );
	}

	/**
	 * Method 'ArrEstudioPeriodoDaoImpl'
	 * 
	 */
	public ArrEstudioPeriodoDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrEstudioPeriodoDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrEstudioPeriodoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrEstudioPeriodoDaoImpl(final java.sql.Connection userConn)
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
		//return "idea.ARR_ESTUDIO_PERIODO";
		return "idea.arr_estudio_periodo";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrEstudioPeriodo fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrEstudioPeriodo dto = new ArrEstudioPeriodo();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrEstudioPeriodo[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrEstudioPeriodo dto = new ArrEstudioPeriodo();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrEstudioPeriodo ret[] = new ArrEstudioPeriodo[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrEstudioPeriodo dto, ResultSet rs) throws SQLException
	{
		dto.setIdestudio( new Integer( rs.getInt(COLUMN_IDESTUDIO) ) );
		dto.setIdtipo( new Integer( rs.getInt(COLUMN_IDTIPO) ) );
		if (rs.wasNull()) {
			dto.setIdtipo( null );
		}
		
		dto.setIdtejido( rs.getString(COLUMN_IDTEJIDO) );
		if (rs.wasNull()) {
			dto.setIdtejido( null );
		}
		
		dto.setIds1( rs.getString(COLUMN_IDS1) );
		dto.setRef( rs.getString( COLUMN_REF ) );
		
		dto.setIdfarmaco( new Integer( rs.getInt(COLUMN_IDFARMACO) ) );
		if (rs.wasNull()) {
			dto.setIdfarmaco( null );
		}
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrEstudioPeriodo dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioPeriodo[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioPeriodoDaoException
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
			throw new ArrEstudioPeriodoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ARR_ESTUDIO_PERIODO table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioPeriodo[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioPeriodoDaoException
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
			throw new ArrEstudioPeriodoDaoException( "Exception: " + _e.getMessage(), _e );
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


