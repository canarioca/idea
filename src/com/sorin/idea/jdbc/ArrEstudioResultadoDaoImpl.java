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

public class ArrEstudioResultadoDaoImpl extends AbstractDAO implements ArrEstudioResultadoDao
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
	protected final String SQL_SELECT = "SELECT IDESTUDIO, IDRES, IDPARCIAL, IDTIN, IDTAM, IDFA, IDIAM, IDNOIAM, VAC, TAF, TVI, IDABLACION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDESTUDIO, IDRES, IDPARCIAL, IDTIN, IDTAM, IDFA, IDIAM, IDNOIAM, VAC, TAF, TVI, IDABLACION ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDESTUDIO = ?, IDRES = ?, IDPARCIAL = ?, IDTIN = ?, IDTAM = ?, IDFA = ?, IDIAM = ?, IDNOIAM = ?, VAC = ?, TAF = ?, TVI = ?, IDABLACION = ? WHERE IDESTUDIO = ? AND IDABLACION = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDESTUDIO = ? AND IDABLACION = ?";
	protected final String SQL_DELETE_CHICO = "DELETE FROM " + getTableName() + " WHERE IDESTUDIO = ?";

	/** 
	 * Index of column IDESTUDIO
	 */
	protected static final int COLUMN_IDESTUDIO = 1;

	/** 
	 * Index of column IDRES
	 */
	protected static final int COLUMN_IDRES = 2;

	/** 
	 * Index of column IDPARCIAL
	 */
	protected static final int COLUMN_IDPARCIAL = 3;

	/** 
	 * Index of column IDTIN
	 */
	protected static final int COLUMN_IDTIN = 4;

	/** 
	 * Index of column IDTAM
	 */
	protected static final int COLUMN_IDTAM = 5;

	/** 
	 * Index of column IDFA
	 */
	protected static final int COLUMN_IDFA = 6;

	/** 
	 * Index of column IDIAM
	 */
	protected static final int COLUMN_IDIAM = 7;

	/** 
	 * Index of column IDNOIAM
	 */
	protected static final int COLUMN_IDNOIAM = 8;

	/** 
	 * Index of column VAC
	 */
	protected static final int COLUMN_VAC = 9;

	/** 
	 * Index of column TAF
	 */
	protected static final int COLUMN_TAF = 10;

	/** 
	 * Index of column TVI
	 */
	protected static final int COLUMN_TVI = 11;
	
	protected static final int COLUMN_IDABLACION = 12;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 12;

	/** 
	 * Index of primary-key column IDESTUDIO
	 */
	protected static final int PK_COLUMN_IDESTUDIO = 1;

	/** 
	 * Index of primary-key column IDABLACION
	 */
	protected static final int PK_COLUMN_IDABLACION = 2;

	/** 
	 * Inserts a new row in the ARR_ESTUDIO_RESULTADO table.
	 */
	public ArrEstudioResultadoPk insert(ArrEstudioResultado dto) throws ArrEstudioResultadoDaoException
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
		
			if (dto.getIdres() != null) {
				stmt.setInt( index++, dto.getIdres().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdparcial() != null) {
				stmt.setInt( index++, dto.getIdparcial().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdtin() != null) {
				stmt.setInt( index++, dto.getIdtin().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdtam() != null) {
				stmt.setInt( index++, dto.getIdtam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdfa() != null) {
				stmt.setInt( index++, dto.getIdfa().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdiam() != null) {
				stmt.setInt( index++, dto.getIdiam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdnoiam() != null) {
				stmt.setInt( index++, dto.getIdnoiam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getVac() != null) {
				stmt.setInt( index++, dto.getVac().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getTaf() != null) {
				stmt.setInt( index++, dto.getTaf().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getTvi() != null) {
				stmt.setInt( index++, dto.getTvi().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
			
			if (dto.getIdablacion() != null) {
				stmt.setInt( index++, dto.getIdablacion().intValue() );
			} else {
				stmt.setInt(index++, 0);
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
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_ESTUDIO_RESULTADO table.
	 */
	public void update(ArrEstudioResultadoPk pk, ArrEstudioResultado dto) throws ArrEstudioResultadoDaoException
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
		
			if (dto.getIdres() != null) {
				stmt.setInt( index++, dto.getIdres().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdparcial() != null) {
				stmt.setInt( index++, dto.getIdparcial().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdtin() != null) {
				stmt.setInt( index++, dto.getIdtin().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdtam() != null) {
				stmt.setInt( index++, dto.getIdtam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdfa() != null) {
				stmt.setInt( index++, dto.getIdfa().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdiam() != null) {
				stmt.setInt( index++, dto.getIdiam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getIdnoiam() != null) {
				stmt.setInt( index++, dto.getIdnoiam().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getVac() != null) {
				stmt.setInt( index++, dto.getVac().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getTaf() != null) {
				stmt.setInt( index++, dto.getTaf().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (dto.getTvi() != null) {
				stmt.setInt( index++, dto.getTvi().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
			
			if (dto.getIdablacion() != null) {
				stmt.setInt( index++, dto.getIdablacion().intValue() );
			} else {
				stmt.setInt(index++, 0);
			}
		
			if (pk.getIdestudio() != null) {
				stmt.setInt( 13, pk.getIdestudio().intValue() );
			} else {
				stmt.setNull(13, java.sql.Types.INTEGER);
			}
		
			if (pk.getIdablacion() != null) {
				stmt.setInt( 14, pk.getIdablacion().intValue() );
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
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_ESTUDIO_RESULTADO table.
	 */
	public void delete(ArrEstudioResultadoPk pk) throws ArrEstudioResultadoDaoException
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
		
			if (pk.getIdablacion() != null) {
				stmt.setInt( 2, pk.getIdablacion().intValue() );
			} else {
				stmt.setNull(2, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.borrado);
	        auditoriaDto.setDescri(pk.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
	
	public void delete(Integer idestudio) throws ArrEstudioResultadoDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_DELETE_CHICO );
			if (idestudio != null) {
				stmt.setInt( 1, idestudio.intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_ESTUDIO_RESULTADO table that matches the specified primary-key value.
	 */
	public ArrEstudioResultado findByPrimaryKey(ArrEstudioResultadoPk pk) throws ArrEstudioResultadoDaoException
	{
		return findByPrimaryKey( pk.getIdestudio(), pk.getIdablacion() );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDESTUDIO = :idestudio AND IDABLACION = :idablacion'.
	 */
	public ArrEstudioResultado findByPrimaryKey(Integer idestudio, Integer idablacion) throws ArrEstudioResultadoDaoException
	{
		ArrEstudioResultado ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDESTUDIO = ? AND IDABLACION = ?", new Object[] { idestudio, idablacion } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria ''.
	 */
	public ArrEstudioResultado[] findAll() throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDESTUDIO, IDABLACION", null );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioResultado[] findWhereIdestudioEquals(long idestudio) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDESTUDIO = ? ORDER BY IDESTUDIO", new Object[] {  new Long(idestudio) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDRES = :idres'.
	 */
	public ArrEstudioResultado[] findWhereIdresEquals(long idres) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDRES = ? ORDER BY IDRES", new Object[] {  new Long(idres) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDPARCIAL = :idparcial'.
	 */
	public ArrEstudioResultado[] findWhereIdparcialEquals(long idparcial) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDPARCIAL = ? ORDER BY IDPARCIAL", new Object[] {  new Long(idparcial) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDTIN = :idtin'.
	 */
	public ArrEstudioResultado[] findWhereIdtinEquals(long idtin) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDTIN = ? ORDER BY IDTIN", new Object[] {  new Long(idtin) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDTAM = :idtam'.
	 */
	public ArrEstudioResultado[] findWhereIdtamEquals(long idtam) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDTAM = ? ORDER BY IDTAM", new Object[] {  new Long(idtam) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDFA = :idfa'.
	 */
	public ArrEstudioResultado[] findWhereIdfaEquals(long idfa) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDFA = ? ORDER BY IDFA", new Object[] {  new Long(idfa) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDIAM = :idiam'.
	 */
	public ArrEstudioResultado[] findWhereIdiamEquals(long idiam) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDIAM = ? ORDER BY IDIAM", new Object[] {  new Long(idiam) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'IDNOIAM = :idnoiam'.
	 */
	public ArrEstudioResultado[] findWhereIdnoiamEquals(long idnoiam) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDNOIAM = ? ORDER BY IDNOIAM", new Object[] {  new Long(idnoiam) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'VAC = :vac'.
	 */
	public ArrEstudioResultado[] findWhereVacEquals(long vac) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VAC = ? ORDER BY VAC", new Object[] {  new Long(vac) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'TAF = :taf'.
	 */
	public ArrEstudioResultado[] findWhereTafEquals(long taf) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TAF = ? ORDER BY TAF", new Object[] {  new Long(taf) } );
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the criteria 'TVI = :tvi'.
	 */
	public ArrEstudioResultado[] findWhereTviEquals(long tvi) throws ArrEstudioResultadoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TVI = ? ORDER BY TVI", new Object[] {  new Long(tvi) } );
	}

	/**
	 * Method 'ArrEstudioResultadoDaoImpl'
	 * 
	 */
	public ArrEstudioResultadoDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrEstudioResultadoDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrEstudioResultadoDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrEstudioResultadoDaoImpl(final java.sql.Connection userConn)
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
		//return "idea.ARR_ESTUDIO_RESULTADO";
		return "idea.arr_estudio_resultado";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrEstudioResultado fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrEstudioResultado dto = new ArrEstudioResultado();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrEstudioResultado[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrEstudioResultado dto = new ArrEstudioResultado();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrEstudioResultado ret[] = new ArrEstudioResultado[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrEstudioResultado dto, ResultSet rs) throws SQLException
	{
		dto.setIdestudio( new Integer( rs.getInt(COLUMN_IDESTUDIO) ) );
		dto.setIdres( new Integer( rs.getInt(COLUMN_IDRES) ) );
		if (rs.wasNull()) {
			dto.setIdres( null );
		}
		
		dto.setIdparcial( new Integer( rs.getInt(COLUMN_IDPARCIAL) ) );
		if (rs.wasNull()) {
			dto.setIdparcial( null );
		}
		
		dto.setIdtin( new Integer( rs.getInt(COLUMN_IDTIN) ) );
		if (rs.wasNull()) {
			dto.setIdtin( null );
		}
		
		dto.setIdtam( new Integer( rs.getInt(COLUMN_IDTAM) ) );
		if (rs.wasNull()) {
			dto.setIdtam( null );
		}
		
		dto.setIdfa( new Integer( rs.getInt(COLUMN_IDFA) ) );
		if (rs.wasNull()) {
			dto.setIdfa( null );
		}
		
		dto.setIdiam( new Integer( rs.getInt(COLUMN_IDIAM) ) );
		if (rs.wasNull()) {
			dto.setIdiam( null );
		}
		
		dto.setIdnoiam( new Integer( rs.getInt(COLUMN_IDNOIAM) ) );
		if (rs.wasNull()) {
			dto.setIdnoiam( null );
		}
		
		dto.setVac( new Integer( rs.getInt(COLUMN_VAC) ) );
		if (rs.wasNull()) {
			dto.setVac( null );
		}
		
		dto.setTaf( new Integer( rs.getInt(COLUMN_TAF) ) );
		if (rs.wasNull()) {
			dto.setTaf( null );
		}
		
		dto.setTvi( new Integer( rs.getInt(COLUMN_TVI) ) );
		if (rs.wasNull()) {
			dto.setTvi( null );
		}
		dto.setIdablacion( new Integer( rs.getInt(COLUMN_IDABLACION) ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrEstudioResultado dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioResultado[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioResultadoDaoException
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
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ARR_ESTUDIO_RESULTADO table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioResultado[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioResultadoDaoException
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
			throw new ArrEstudioResultadoDaoException( "Exception: " + _e.getMessage(), _e );
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
