/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.jdbc;

import java.util.Date;
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
import com.sorin.idea.util.UtilCodifi;
import com.sorin.idea.util.UtilFechas;

public class SegSeguimientoDaoImpl extends AbstractDAO implements SegSeguimientoDao
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
	protected final String SQL_SELECT = "SELECT IDSEG, IDIMPL, IDSISTEMA, IDPORESTIM, IDBLOQUEO, IDOBSMP, IDOBSDAI, TIPOSEGUIMIENTO, MOTIVONOPROG, REMOTO, OPERADOR, FECHA, FECHAPROXIMOSEG, CARACTERPROXIMO, COMENTARIOS, IDEV, OPERADORENF FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( IDSEG, IDIMPL, IDSISTEMA, IDPORESTIM, IDBLOQUEO, IDOBSMP, IDOBSDAI, TIPOSEGUIMIENTO, MOTIVONOPROG, REMOTO, OPERADOR, FECHA, FECHAPROXIMOSEG, CARACTERPROXIMO, COMENTARIOS, IDEV, OPERADORENF ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET IDSEG = ?, IDIMPL = ?, IDSISTEMA = ?, IDPORESTIM = ?, IDBLOQUEO = ?, IDOBSMP = ?, IDOBSDAI = ?, TIPOSEGUIMIENTO = ?, MOTIVONOPROG = ?, REMOTO = ?, OPERADOR = ?, FECHA = ?, FECHAPROXIMOSEG = ?, CARACTERPROXIMO = ?, COMENTARIOS = ?, IDEV = ?, OPERADORENF = ? WHERE IDSEG = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE IDSEG = ?";

	/** 
	 * Index of column IDSEG
	 */
	protected static final int COLUMN_IDSEG = 1;

	/** 
	 * Index of column IDIMPL
	 */
	protected static final int COLUMN_IDIMPL = 2;

	/** 
	 * Index of column IDSISTEMA
	 */
	protected static final int COLUMN_IDSISTEMA = 3;

	/** 
	 * Index of column IDPORESTIM
	 */
	protected static final int COLUMN_IDPORESTIM = 4;

	/** 
	 * Index of column IDBLOQUEO
	 */
	protected static final int COLUMN_IDBLOQUEO = 5;

	/** 
	 * Index of column IDOBSMP
	 */
	protected static final int COLUMN_IDOBSMP = 6;

	/** 
	 * Index of column IDOBSDAI
	 */
	protected static final int COLUMN_IDOBSDAI = 7;

	/** 
	 * Index of column TIPOSEGUIMIENTO
	 */
	protected static final int COLUMN_TIPOSEGUIMIENTO = 8;

	/** 
	 * Index of column MOTIVONOPROG
	 */
	protected static final int COLUMN_MOTIVONOPROG = 9;

	/** 
	 * Index of column REMOTO
	 */
	protected static final int COLUMN_REMOTO = 10;

	/** 
	 * Index of column OPERADOR
	 */
	protected static final int COLUMN_OPERADOR = 11;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 12;

	/** 
	 * Index of column FECHAPROXIMOSEG
	 */
	protected static final int COLUMN_FECHAPROXIMOSEG = 13;

	/** 
	 * Index of column CARACTERPROXIMO
	 */
	protected static final int COLUMN_CARACTERPROXIMO = 14;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 15;

	/** 
	 * Index of column IDEV
	 */
	protected static final int COLUMN_IDEV = 16;

	/** 
	 * Index of column OPERADOR
	 */
	protected static final int COLUMN_OPERADORENF = 17;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 17;

	/** 
	 * Index of primary-key column IDSEG
	 */
	protected static final int PK_COLUMN_IDSEG = 1;

	/** 
	 * Inserts a new row in the seg_seguimiento table.
	 */
	public SegSeguimientoPk insert(SegSeguimiento dto) throws SegSeguimientoDaoException
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
			if (dto.getIdseg() != null) {
				stmt.setInt( index++, dto.getIdseg().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdimpl() != null) {
				stmt.setInt( index++, dto.getIdimpl().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdsistema() != null) {
				stmt.setInt( index++, dto.getIdsistema().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdporestim() != null) {
				stmt.setInt( index++, dto.getIdporestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdbloqueo() != null) {
				stmt.setInt( index++, dto.getIdbloqueo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdobsmp() != null) {
				stmt.setInt( index++, dto.getIdobsmp().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdobsdai() != null) {
				stmt.setInt( index++, dto.getIdobsdai().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getTiposeguimiento() != null) {
				stmt.setInt( index++, dto.getTiposeguimiento().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getMotivonoprog() != null) {
				stmt.setInt( index++, dto.getMotivonoprog().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getRemoto() != null) {
				stmt.setShort( index++, dto.getRemoto().shortValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.SMALLINT);
			}
		
			stmt.setString( index++, dto.getOperador() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			stmt.setDate(index++, dto.getFechaproximoseg()==null ? null : new java.sql.Date( dto.getFechaproximoseg().getTime() ) );
			if (dto.getCaracterproximo() != null) {
				stmt.setInt( index++, dto.getCaracterproximo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getComentarios() );
			if (dto.getIdev() != null) {
				stmt.setInt( index++, dto.getIdev().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			stmt.setString( index++, dto.getOperadorenf() );
		
			//System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			//System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdseg( new Integer( rs.getInt(1) ) );
			}
			auditoriaDto.setAccion(AuditoriaDto.insercion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the seg_seguimiento table.
	 */
	public void update(SegSeguimientoPk pk, SegSeguimiento dto) throws SegSeguimientoDaoException
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
			if (dto.getIdseg() != null) {
				stmt.setInt( index++, dto.getIdseg().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdimpl() != null) {
				stmt.setInt( index++, dto.getIdimpl().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdsistema() != null) {
				stmt.setInt( index++, dto.getIdsistema().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdporestim() != null) {
				stmt.setInt( index++, dto.getIdporestim().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdbloqueo() != null) {
				stmt.setInt( index++, dto.getIdbloqueo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdobsmp() != null) {
				stmt.setInt( index++, dto.getIdobsmp().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdobsdai() != null) {
				stmt.setInt( index++, dto.getIdobsdai().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getTiposeguimiento() != null) {
				stmt.setInt( index++, dto.getTiposeguimiento().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getMotivonoprog() != null) {
				stmt.setInt( index++, dto.getMotivonoprog().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getRemoto() != null) {
				stmt.setShort( index++, dto.getRemoto().shortValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.SMALLINT);
			}
		
			stmt.setString( index++, dto.getOperador() );
			stmt.setDate(index++, dto.getFecha()==null ? null : new java.sql.Date( dto.getFecha().getTime() ) );
			stmt.setDate(index++, dto.getFechaproximoseg()==null ? null : new java.sql.Date( dto.getFechaproximoseg().getTime() ) );
			if (dto.getCaracterproximo() != null) {
				stmt.setInt( index++, dto.getCaracterproximo().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getComentarios() );
			if (dto.getIdev() != null) {
				stmt.setInt( index++, dto.getIdev().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			stmt.setString( index++, dto.getOperadorenf() );
		
			if (pk.getIdseg() != null) {
				stmt.setInt( 18, pk.getIdseg().intValue() );
			} else {
				stmt.setNull(18, java.sql.Types.INTEGER);
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
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the seg_seguimiento table.
	 */
	public void delete(SegSeguimientoPk pk) throws SegSeguimientoDaoException
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
			if (pk.getIdseg() != null) {
				stmt.setInt( 1, pk.getIdseg().intValue() );
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
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the seg_seguimiento table that matches the specified primary-key value.
	 */
	public SegSeguimiento findByPrimaryKey(SegSeguimientoPk pk) throws SegSeguimientoDaoException
	{
		return findByPrimaryKey( pk.getIdseg() );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDSEG = :idseg'.
	 */
	public SegSeguimiento findByPrimaryKey(Integer idseg) throws SegSeguimientoDaoException
	{
		SegSeguimiento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE IDSEG = ?", new Object[] { idseg } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria ''.
	 */
	public SegSeguimiento[] findAll() throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY IDSEG", null );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDSEG = :idseg'.
	 */
	public SegSeguimiento[] findWhereIdsegEquals(int idseg) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDSEG = ? ORDER BY IDSEG", new Object[] {  new Integer(idseg) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDIMPL = :idimpl'.
	 */
	public SegSeguimiento[] findWhereIdimplEquals(int idimpl) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDIMPL = ? ORDER BY IDIMPL", new Object[] {  new Integer(idimpl) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDSISTEMA = :idsistema'.
	 */
	public SegSeguimiento[] findWhereIdsistemaEquals(int idsistema) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDSISTEMA = ? ORDER BY IDSISTEMA", new Object[] {  new Integer(idsistema) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDPORESTIM = :idporestim'.
	 */
	public SegSeguimiento[] findWhereIdporestimEquals(int idporestim) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDPORESTIM = ? ORDER BY IDPORESTIM", new Object[] {  new Integer(idporestim) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDBLOQUEO = :idbloqueo'.
	 */
	public SegSeguimiento[] findWhereIdbloqueoEquals(int idbloqueo) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDBLOQUEO = ? ORDER BY IDBLOQUEO", new Object[] {  new Integer(idbloqueo) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDOBSMP = :idobsmp'.
	 */
	public SegSeguimiento[] findWhereIdobsmpEquals(int idobsmp) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDOBSMP = ? ORDER BY IDOBSMP", new Object[] {  new Integer(idobsmp) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDOBSDAI = :idobsdai'.
	 */
	public SegSeguimiento[] findWhereIdobsdaiEquals(int idobsdai) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDOBSDAI = ? ORDER BY IDOBSDAI", new Object[] {  new Integer(idobsdai) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'TIPOSEGUIMIENTO = :tiposeguimiento'.
	 */
	public SegSeguimiento[] findWhereTiposeguimientoEquals(int tiposeguimiento) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TIPOSEGUIMIENTO = ? ORDER BY TIPOSEGUIMIENTO", new Object[] {  new Integer(tiposeguimiento) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'MOTIVONOPROG = :motivonoprog'.
	 */
	public SegSeguimiento[] findWhereMotivonoprogEquals(int motivonoprog) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MOTIVONOPROG = ? ORDER BY MOTIVONOPROG", new Object[] {  new Integer(motivonoprog) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'REMOTO = :remoto'.
	 */
	public SegSeguimiento[] findWhereRemotoEquals(short remoto) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REMOTO = ? ORDER BY REMOTO", new Object[] {  new Short(remoto) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'OPERADOR = :operador'.
	 */
	public SegSeguimiento[] findWhereOperadorEquals(String operador) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OPERADOR = ? ORDER BY OPERADOR", new Object[] { operador } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'FECHA = :fecha'.
	 */
	public SegSeguimiento[] findWhereFechaEquals(Date fecha) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Date( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'FECHAPROXIMOSEG = :fechaproximoseg'.
	 */
	public SegSeguimiento[] findWhereFechaproximosegEquals(Date fechaproximoseg) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHAPROXIMOSEG = ? ORDER BY FECHAPROXIMOSEG", new Object[] { fechaproximoseg==null ? null : new java.sql.Date( fechaproximoseg.getTime() ) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'CARACTERPROXIMO = :caracterproximo'.
	 */
	public SegSeguimiento[] findWhereCaracterproximoEquals(int caracterproximo) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARACTERPROXIMO = ? ORDER BY CARACTERPROXIMO", new Object[] {  new Integer(caracterproximo) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public SegSeguimiento[] findWhereComentariosEquals(String comentarios) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'IDEV = :idev'.
	 */
	public SegSeguimiento[] findWhereIdevEquals(int idev) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IDEV = ? ORDER BY IDEV", new Object[] {  new Integer(idev) } );
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the criteria 'OPERADORENF = :operadorenf'.
	 */
	public SegSeguimiento[] findWhereOperadorenfEquals(String operadorenf) throws SegSeguimientoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OPERADORENF = ? ORDER BY OPERADORENF", new Object[] { operadorenf } );
	}

	/**
	 * Method 'SegSeguimientoDaoImpl'
	 * 
	 */
	public SegSeguimientoDaoImpl()
	{
	}
	/**
	 * Method 'SegSeguimientoDaoImpl'
	 * 
	 */
	public SegSeguimientoDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public SegSeguimientoDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'SegSeguimientoDaoImpl'
	 * 
	 * @param userConn
	 */
	public SegSeguimientoDaoImpl(final java.sql.Connection userConn)
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
		return "idea.seg_seguimiento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected SegSeguimiento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			SegSeguimiento dto = new SegSeguimiento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected SegSeguimiento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			SegSeguimiento dto = new SegSeguimiento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		SegSeguimiento ret[] = new SegSeguimiento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(SegSeguimiento dto, ResultSet rs) throws SQLException
	{
		dto.setIdseg( new Integer( rs.getInt(COLUMN_IDSEG) ) );
		dto.setIdimpl( new Integer( rs.getInt(COLUMN_IDIMPL) ) );
		dto.setIdsistema( new Integer( rs.getInt(COLUMN_IDSISTEMA) ) );
		dto.setIdporestim( new Integer( rs.getInt(COLUMN_IDPORESTIM) ) );
		dto.setIdbloqueo( new Integer( rs.getInt(COLUMN_IDBLOQUEO) ) );
		dto.setIdobsmp( new Integer( rs.getInt(COLUMN_IDOBSMP) ) );
		if (rs.wasNull()) {
			dto.setIdobsmp( null );
		}
		
		dto.setIdobsdai( new Integer( rs.getInt(COLUMN_IDOBSDAI) ) );
		if (rs.wasNull()) {
			dto.setIdobsdai( null );
		}
		
		dto.setTiposeguimiento( new Integer( rs.getInt(COLUMN_TIPOSEGUIMIENTO) ) );
		if (rs.wasNull()) {
			dto.setTiposeguimiento( null );
		}
		
		dto.setMotivonoprog( new Integer( rs.getInt(COLUMN_MOTIVONOPROG) ) );
		if (rs.wasNull()) {
			dto.setMotivonoprog( null );
		}
		
		dto.setRemoto( new Short( rs.getShort(COLUMN_REMOTO) ) );
		if (rs.wasNull()) {
			dto.setRemoto( null );
		}
		
		dto.setOperador( rs.getString( COLUMN_OPERADOR ) );
		dto.setFecha( rs.getDate(COLUMN_FECHA ) );
		dto.setFechaproximoseg( rs.getDate(COLUMN_FECHAPROXIMOSEG ) );
		dto.setCaracterproximo( new Integer( rs.getInt(COLUMN_CARACTERPROXIMO) ) );
		if (rs.wasNull()) {
			dto.setCaracterproximo( null );
		}
		
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		dto.setIdev( new Integer( rs.getInt(COLUMN_IDEV) ) );
		dto.setOperadorenf( rs.getString( COLUMN_OPERADORENF ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(SegSeguimiento dto)
	{
	}

	/** 
	 * Returns all rows from the seg_seguimiento table that match the specified arbitrary SQL statement
	 */
	public SegSeguimiento[] findByDynamicSelect(String sql, Object[] sqlParams) throws SegSeguimientoDaoException
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
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the seg_seguimiento table that match the specified arbitrary SQL statement
	 */
	public SegSeguimiento[] findByDynamicWhere(String sql, Object[] sqlParams) throws SegSeguimientoDaoException
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
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
	
	public ArrayList<ArrayList<Object>> findByDynamicSelect(String sql) throws SegSeguimientoDaoException
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
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return UtilCodifi.Results2Array(rs);
		}
		catch (Exception _e) {
			throw new SegSeguimientoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
	
	public ArrayList<ArrayList<Object>> getEstadisticasSeguimiento(Integer codigo, Integer idimpgen) throws SegSeguimientoDaoException{
		StringBuffer sql = new StringBuffer();
		sql.append("select proc.fecha FECHA, ");
		sql.append(" sist.voltaje VOLTAJE, ");
		sql.append(" sist.impedancia IMPEDANCIA, ");
		sql.append(" sist.fmagnetica FMAGNETICA, ");
		sql.append(" impelec.camara CAMARA, ");
		sql.append(" impelec.ondarp_ev ONDARP_EV, ");
		sql.append(" impelec.umbralv_ev UMBRALV_EV, ");
		sql.append(" impelec.umbralms_ev UMBRALMS_EV, ");
		sql.append(" impelec.impohm_ev IMPOHM_EV, ");
		sql.append(" impelec.durimpulso DURIMPULSO, ");
		sql.append(" impelec.voltaje VOLTAJE, ");
		sql.append(" impelec.sensibilidad SENSIBILIDAD ");
		sql.append(" from procedimiento proc, ");
		sql.append(" imp_implante_electrodos impelec, ");
		sql.append(" imp_implante imp, ");
		sql.append(" imp_hoja_implante himp, ");
		sql.append(" imp_generador impgen, ");
		sql.append(" seg_seguimiento seg, ");
		sql.append(" seg_sistema sist");
		sql.append(" WHERE proc.tipoprocedimiento = 983");
		sql.append(" and proc.codigo = "+codigo);
		sql.append(" and proc.idprocedimiento = seg.idseg");	
		sql.append(" and seg.idsistema = sist.idsistema ");
		sql.append(" and impelec.idseg = seg.idseg ");
		sql.append(" and imp.idimplante = seg.idimpl ");
		sql.append(" and imp.idhojaimp = himp.idhojaimp ");
		sql.append(" and himp.idhojaimp = impgen.idhojaimp ");
		sql.append(" and impgen.idimpgenerador = "+idimpgen);
		
		return findByDynamicSelect(sql.toString());
	}
	
	public ArrayList<ArrayList<Object>> getEstadisticasElectrodosSeguimiento(Integer codigo, Date fecha_muestreo) throws SegSeguimientoDaoException{
		StringBuffer sql = new StringBuffer();		
		sql.append("select proc.fecha FECHA, ");
		sql.append(" impelec.camara CAMARA, ");
		sql.append(" impelec.numserie NUMSERIE, ");
		sql.append(" impelec.idelectrodo IDELECTRODO, ");
		sql.append(" impelec.ondarp_ev ONDARP_EV, ");
		sql.append(" impelec.umbralv_ev UMBRALV_EV, ");
		sql.append(" impelec.umbralms_ev UMBRALMS_EV, ");
		sql.append(" impelec.impohm_ev IMPOHM_EV, ");
		sql.append(" impelec.durimpulso DURIMPULSO, ");
		sql.append(" impelec.voltaje VOLTAJE, ");
		sql.append(" impelec.sensibilidad SENSIBILIDAD ");
		sql.append(" from procedimiento proc, ");
		sql.append(" imp_implante_electrodos impelec, ");
		sql.append(" seg_seguimiento seg ");		
		sql.append(" WHERE proc.tipoprocedimiento = 983");
		sql.append(" and proc.codigo = "+codigo);
		sql.append(" and proc.fecha <= '"+fecha_muestreo+"'");
		sql.append(" and proc.idprocedimiento = impelec.idseg");
		sql.append(" and proc.idprocedimiento = seg.idseg");
		sql.append(" and seg.idseg = impelec.idseg");
		sql.append(" and impelec.estado = 0 ");	
	
		return findByDynamicSelect(sql.toString());
	}

}
