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

public class ArrPacienteHcardioDaoImpl extends AbstractDAO implements ArrPacienteHcardioDao
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
	protected final String SQL_SELECT = "SELECT IDPACIENTE, ID1, ID2, ID3, ID4, ID5, ID6, ID7, ID8 FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDPACIENTE, ID1, ID2, ID3, ID4, ID5, ID6, ID7, ID8 ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDPACIENTE = ?, ID1 = ?, ID2 = ?, ID3 = ?, ID4 = ?, ID5 = ?, ID6 = ?, ID7 = ?, ID8 = ? WHERE IDPACIENTE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDPACIENTE = ?";

	/** 
	 * Index of column IDPACIENTE
	 */
	protected static final int COLUMN_IDPACIENTE = 1;

	/** 
	 * Index of column ID1
	 */
	protected static final int COLUMN_ID1 = 2;

	/** 
	 * Index of column ID2
	 */
	protected static final int COLUMN_ID2 = 3;

	/** 
	 * Index of column ID3
	 */
	protected static final int COLUMN_ID3 = 4;

	/** 
	 * Index of column ID4
	 */
	protected static final int COLUMN_ID4 = 5;

	/** 
	 * Index of column ID5
	 */
	protected static final int COLUMN_ID5 = 6;

	/** 
	 * Index of column ID6
	 */
	protected static final int COLUMN_ID6 = 7;

	/** 
	 * Index of column ID7
	 */
	protected static final int COLUMN_ID7 = 8;
	
	/** 
	 * Index of column ID8
	 */
	protected static final int COLUMN_ID8 = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column IDPACIENTE
	 */
	protected static final int PK_COLUMN_IDPACIENTE = 1;

	/** 
	 * Inserts a new row in the ARR_PACIENTE_HCARDIO table.
	 */
	public ArrPacienteHcardioPk insert(ArrPacienteHcardio dto) throws ArrPacienteHcardioDaoException
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
			if (dto.getIdpaciente() != null) {
				stmt.setInt( index++, dto.getIdpaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId1() != null) {
				stmt.setInt( index++, dto.getId1().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId2() != null) {
				stmt.setInt( index++, dto.getId2().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId3() != null) {
				stmt.setInt( index++, dto.getId3().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId4() != null) {
				stmt.setInt( index++, dto.getId4().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId5() != null) {
				stmt.setInt( index++, dto.getId5().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId6() != null) {
				stmt.setInt( index++, dto.getId6().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId7() != null) {
				stmt.setInt( index++, dto.getId7().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			if (dto.getId8() != null) {
				stmt.setInt( index++, dto.getId8().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			/*auditoriaDto.setAccion(AuditoriaDto.insercion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);*/
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new ArrPacienteHcardioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_PACIENTE_HCARDIO table.
	 */
	public void update(ArrPacienteHcardioPk pk, ArrPacienteHcardio dto) throws ArrPacienteHcardioDaoException
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
			if (dto.getIdpaciente() != null) {
				stmt.setInt( index++, dto.getIdpaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId1() != null) {
				stmt.setInt( index++, dto.getId1().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId2() != null) {
				stmt.setInt( index++, dto.getId2().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId3() != null) {
				stmt.setInt( index++, dto.getId3().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId4() != null) {
				stmt.setInt( index++, dto.getId4().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId5() != null) {
				stmt.setInt( index++, dto.getId5().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId6() != null) {
				stmt.setInt( index++, dto.getId6().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getId7() != null) {
				stmt.setInt( index++, dto.getId7().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			if (dto.getId8() != null) {
				stmt.setInt( index++, dto.getId8().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (pk.getIdpaciente() != null) {
				stmt.setInt( 10, pk.getIdpaciente().intValue() );
			} else {
				stmt.setNull(10, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrPacienteHcardioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_PACIENTE_HCARDIO table.
	 */
	public void delete(ArrPacienteHcardioPk pk) throws ArrPacienteHcardioDaoException
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
			if (pk.getIdpaciente() != null) {
				stmt.setInt( 1, pk.getIdpaciente().intValue() );
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
			throw new ArrPacienteHcardioDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_PACIENTE_HCARDIO table that matches the specified primary-key value.
	 */
	public ArrPacienteHcardio findByPrimaryKey(ArrPacienteHcardioPk pk) throws ArrPacienteHcardioDaoException
	{
		return findByPrimaryKey( pk.getIdpaciente() );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'IDPACIENTE = :idpaciente'.
	 */
	public ArrPacienteHcardio findByPrimaryKey(Integer idpaciente) throws ArrPacienteHcardioDaoException
	{
		ArrPacienteHcardio ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDPACIENTE = ?", new Object[] { idpaciente } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria ''.
	 */
	public ArrPacienteHcardio[] findAll() throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDPACIENTE", null );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'IDPACIENTE = :idpaciente'.
	 */
	public ArrPacienteHcardio[] findWhereIdpacienteEquals(long idpaciente) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDPACIENTE = ? ORDER BY IDPACIENTE", new Object[] {  new Long(idpaciente) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID1 = :id1'.
	 */
	public ArrPacienteHcardio[] findWhereId1Equals(long id1) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID1 = ? ORDER BY ID1", new Object[] {  new Long(id1) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID2 = :id2'.
	 */
	public ArrPacienteHcardio[] findWhereId2Equals(long id2) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID2 = ? ORDER BY ID2", new Object[] {  new Long(id2) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID3 = :id3'.
	 */
	public ArrPacienteHcardio[] findWhereId3Equals(long id3) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID3 = ? ORDER BY ID3", new Object[] {  new Long(id3) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID4 = :id4'.
	 */
	public ArrPacienteHcardio[] findWhereId4Equals(long id4) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID4 = ? ORDER BY ID4", new Object[] {  new Long(id4) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID5 = :id5'.
	 */
	public ArrPacienteHcardio[] findWhereId5Equals(long id5) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID5 = ? ORDER BY ID5", new Object[] {  new Long(id5) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID6 = :id6'.
	 */
	public ArrPacienteHcardio[] findWhereId6Equals(long id6) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID6 = ? ORDER BY ID6", new Object[] {  new Long(id6) } );
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID7 = :id7'.
	 */
	public ArrPacienteHcardio[] findWhereId7Equals(long id7) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID7 = ? ORDER BY ID7", new Object[] {  new Long(id7) } );
	}
	
	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the criteria 'ID8 = :id8'.
	 */
	public ArrPacienteHcardio[] findWhereId8Equals(long id8) throws ArrPacienteHcardioDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID8 = ? ORDER BY ID8", new Object[] {  new Long(id8) } );
	}

	/**
	 * Method 'ArrPacienteHcardioDaoImpl'
	 * 
	 */
	public ArrPacienteHcardioDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrPacienteHcardioDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrPacienteHcardioDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}
	public ArrPacienteHcardioDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
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
		//return "idea.ARR_PACIENTE_HCARDIO";
		return "idea.arr_paciente_hcardio";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrPacienteHcardio fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrPacienteHcardio dto = new ArrPacienteHcardio();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrPacienteHcardio[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrPacienteHcardio dto = new ArrPacienteHcardio();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrPacienteHcardio ret[] = new ArrPacienteHcardio[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrPacienteHcardio dto, ResultSet rs) throws SQLException
	{
		dto.setIdpaciente( new Integer( rs.getInt(COLUMN_IDPACIENTE) ) );
		dto.setId1( new Integer( rs.getInt(COLUMN_ID1) ) );
		if (rs.wasNull()) {
			dto.setId1( null );
		}
		
		dto.setId2( new Integer( rs.getInt(COLUMN_ID2) ) );
		if (rs.wasNull()) {
			dto.setId2( null );
		}
		
		dto.setId3( new Integer( rs.getInt(COLUMN_ID3) ) );
		if (rs.wasNull()) {
			dto.setId3( null );
		}
		
		dto.setId4( new Integer( rs.getInt(COLUMN_ID4) ) );
		if (rs.wasNull()) {
			dto.setId4( null );
		}
		
		dto.setId5( new Integer( rs.getInt(COLUMN_ID5) ) );
		if (rs.wasNull()) {
			dto.setId5( null );
		}
		
		dto.setId6( new Integer( rs.getInt(COLUMN_ID6) ) );
		if (rs.wasNull()) {
			dto.setId6( null );
		}
		
		dto.setId7( new Integer( rs.getInt(COLUMN_ID7) ) );
		if (rs.wasNull()) {
			dto.setId7( null );
		}
		
		dto.setId8( new Integer( rs.getInt(COLUMN_ID8) ) );
		if (rs.wasNull()) {
			dto.setId8( null );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrPacienteHcardio dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the specified arbitrary SQL statement
	 */
	public ArrPacienteHcardio[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrPacienteHcardioDaoException
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
			throw new ArrPacienteHcardioDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ARR_PACIENTE_HCARDIO table that match the specified arbitrary SQL statement
	 */
	public ArrPacienteHcardio[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrPacienteHcardioDaoException
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
			throw new ArrPacienteHcardioDaoException( "Exception: " + _e.getMessage(), _e );
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