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

import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleTypes;

import org.apache.tomcat.dbcp.dbcp.DelegatingPreparedStatement;

import com.sorin.idea.dao.*;
import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.util.UtilCodifi;
import com.sorin.idea.util.UtilFechas;


public class ArrMesasDaoImpl extends AbstractDAO implements ArrMesasDao
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
	protected final String SQL_SELECT = "SELECT ID_PACIENTE, ID_MESA, FECHA, NPROC, REFERIDOR, INDICACION, EPI_PREVIOS, OP_MED, OP_ENF, COMENTARIOS, COMPLICACIONES, RES_N1, RES_N2, RES_N3, RES_TIEMPO, CARDIOPATIA, SHELDON_A, SHELDON_B, SHELDON_C, SHELDON_D, SHELDON_E, SHELDON_F, SHELDON_G, COMPLICACIONES_SN, EPISODIO, INDICACION_OTRA, EPI_SIN, NTG FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ID_PACIENTE, ID_MESA, FECHA, NPROC, REFERIDOR, INDICACION, EPI_PREVIOS, OP_MED, OP_ENF, COMENTARIOS, COMPLICACIONES, RES_N1, RES_N2, RES_N3, RES_TIEMPO, CARDIOPATIA, SHELDON_A, SHELDON_B, SHELDON_C, SHELDON_D, SHELDON_E, SHELDON_F, SHELDON_G, COMPLICACIONES_SN, EPISODIO, INDICACION_OTRA, EPI_SIN, NTG ) VALUES ( ?, null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ID_PACIENTE = ?, ID_MESA = ?, FECHA = ?, NPROC = ?, REFERIDOR = ?, INDICACION = ?, EPI_PREVIOS = ?, OP_MED = ?, OP_ENF = ?, COMENTARIOS = ?, COMPLICACIONES = ?, RES_N1 = ?, RES_N2 = ?, RES_N3 = ?, RES_TIEMPO = ?, CARDIOPATIA = ?, SHELDON_A = ?, SHELDON_B = ?, SHELDON_C = ?, SHELDON_D = ?, SHELDON_E = ?, SHELDON_F = ?, SHELDON_G = ?, COMPLICACIONES_SN = ?, EPISODIO = ?, INDICACION_OTRA = ?, EPI_SIN = ?, NTG = ? WHERE ID_MESA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ID_MESA = ?";

	/** 
	 * Index of column ID_PACIENTE
	 */
	protected static final int COLUMN_ID_PACIENTE = 1;

	/** 
	 * Index of column ID_MESA
	 */
	protected static final int COLUMN_ID_MESA = 2;

	/** 
	 * Index of column FECHA
	 */
	protected static final int COLUMN_FECHA = 3;

	/** 
	 * Index of column NPROC
	 */
	protected static final int COLUMN_NPROC = 4;

	/** 
	 * Index of column REFERIDOR
	 */
	protected static final int COLUMN_REFERIDOR = 5;

	/** 
	 * Index of column INDICACION
	 */
	protected static final int COLUMN_INDICACION = 6;

	/** 
	 * Index of column EPI_PREVIOS
	 */
	protected static final int COLUMN_EPI_PREVIOS = 7;

	/** 
	 * Index of column OP_MED
	 */
	protected static final int COLUMN_OP_MED = 8;
	
	/** 
	 * Index of column OP_ENF
	 */
	protected static final int COLUMN_OP_ENF = 9;

	/** 
	 * Index of column COMENTARIOS
	 */
	protected static final int COLUMN_COMENTARIOS = 10;

	/** 
	 * Index of column COMPLICACIONES
	 */
	protected static final int COLUMN_COMPLICACIONES = 11;

	/** 
	 * Index of column RES_N1
	 */
	protected static final int COLUMN_RES_N1 = 12;

	/** 
	 * Index of column RES_N2
	 */
	protected static final int COLUMN_RES_N2 = 13;

	/** 
	 * Index of column RES_N3
	 */
	protected static final int COLUMN_RES_N3 = 14;

	/** 
	 * Index of column RES_TIEMPO
	 */
	protected static final int COLUMN_RES_TIEMPO = 15;

	/** 
	 * Index of column CARDIOPATIA
	 */
	protected static final int COLUMN_CARDIOPATIA = 16;

	/** 
	 * Index of column SHELDON_A
	 */
	protected static final int COLUMN_SHELDON_A = 17;

	/** 
	 * Index of column SHELDON_B
	 */
	protected static final int COLUMN_SHELDON_B = 18;

	/** 
	 * Index of column SHELDON_C
	 */
	protected static final int COLUMN_SHELDON_C = 19;

	/** 
	 * Index of column SHELDON_D
	 */
	protected static final int COLUMN_SHELDON_D = 20;

	/** 
	 * Index of column SHELDON_E
	 */
	protected static final int COLUMN_SHELDON_E = 21;

	/** 
	 * Index of column SHELDON_F
	 */
	protected static final int COLUMN_SHELDON_F = 22;

	/** 
	 * Index of column SHELDON_G
	 */
	protected static final int COLUMN_SHELDON_G = 23;

	/** 
	 * Index of column COMPLICACIONES_SN
	 */
	protected static final int COLUMN_COMPLICACIONES_SN = 24;
	
	/** 
	 * Index of column EPISODIO
	 */
	protected static final int COLUMN_EPISODIO = 25;
	
	/**
	 * Index of column INDICACION_OTRA
	 */
	protected static final int COLUMN_INDICACION_OTRA = 26;
	
	/**
	 * Index of column EPI_SIN
	 */
	protected static final int COLUMN_EPI_SIN = 27;
	
	/**
	 * Index of column EPG
	 */
	protected static final int COLUMN_NTG = 28;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 28;

	/** 
	 * Index of primary-key column ID_MESA
	 */
	protected static final int PK_COLUMN_ID_MESA = 1;

	/** 
	 * Inserts a new row in the ARR_MESAS table.
	 */
	public ArrMesasPk insert(ArrMesas dto) throws ArrMesasDaoException
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
			if (dto.getIdPaciente() != null) {
				stmt.setInt( index++, dto.getIdPaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getNproc() );
			stmt.setString( index++, dto.getReferidor() );
		
			if (dto.getIndicacion() != null) {
				stmt.setInt( index++, dto.getIndicacion().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getEpiPrevios() != null) {
				stmt.setInt( index++, dto.getEpiPrevios().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getOpMed());
			stmt.setString( index++, dto.getOpEnf());
			stmt.setString( index++, dto.getComentarios() );
			stmt.setString( index++, dto.getComplicaciones() );
			if (dto.getResN1() != null) {
				stmt.setInt( index++, dto.getResN1().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getResN2() != null) {
				stmt.setInt( index++, dto.getResN2().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getResN3() != null) {
				stmt.setInt( index++, dto.getResN3().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getResTiempo() );
			if (dto.getCardiopatia() != null) {
				stmt.setInt( index++, dto.getCardiopatia().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonA() != null) {
				stmt.setInt( index++, dto.getSheldonA().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonB() != null) {
				stmt.setInt( index++, dto.getSheldonB().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonC() != null) {
				stmt.setInt( index++, dto.getSheldonC().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonD() != null) {
				stmt.setInt( index++, dto.getSheldonD().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonE() != null) {
				stmt.setInt( index++, dto.getSheldonE().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonF() != null) {
				stmt.setInt( index++, dto.getSheldonF().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonG() != null) {
				stmt.setInt( index++, dto.getSheldonG().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getComplicacionesSn() != null) {
				stmt.setInt( index++, dto.getComplicacionesSn().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			stmt.setString( index++, dto.getEpisodio() );
			stmt.setString( index++, dto.getIndicacionOtra() );
			
			if (dto.getEpiSin() != null) {
				stmt.setInt( index++, dto.getEpiSin().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			if (dto.getNtg() != null) {
				stmt.setInt( index++, dto.getNtg().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			int rows = stmt.executeUpdate();
			
			stmt = conn.prepareStatement("SELECT LAST_INSERT_ID() id");
			ResultSet a = stmt.executeQuery();
			while (a.next()) {
				dto.setIdMesa((int) a.getLong(1));
			}
			long t2 = System.currentTimeMillis();
			auditoriaDto.setAccion(AuditoriaDto.insercion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ARR_MESAS table.
	 */
	public void update(ArrMesasPk pk, ArrMesas dto) throws ArrMesasDaoException
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
			if (dto.getIdPaciente() != null) {
				stmt.setInt( index++, dto.getIdPaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getIdMesa() != null) {
				stmt.setInt( index++, dto.getIdMesa().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setTimestamp(index++, dto.getFecha()==null ? null : new java.sql.Timestamp( dto.getFecha().getTime() ) );
			stmt.setString( index++, dto.getNproc() );
			stmt.setString( index++, dto.getReferidor() );
		
			if (dto.getIndicacion() != null) {
				stmt.setInt( index++, dto.getIndicacion().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getEpiPrevios() != null) {
				stmt.setInt( index++, dto.getEpiPrevios().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getOpMed());
			stmt.setString( index++, dto.getOpEnf());
			stmt.setString( index++, dto.getComentarios() );
			stmt.setString( index++, dto.getComplicaciones() );
			if (dto.getResN1() != null) {
				stmt.setInt( index++, dto.getResN1().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getResN2() != null) {
				stmt.setInt( index++, dto.getResN2().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getResN3() != null) {
				stmt.setInt( index++, dto.getResN3().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setString( index++, dto.getResTiempo() );
			if (dto.getCardiopatia() != null) {
				stmt.setInt( index++, dto.getCardiopatia().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonA() != null) {
				stmt.setInt( index++, dto.getSheldonA().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonB() != null) {
				stmt.setInt( index++, dto.getSheldonB().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonC() != null) {
				stmt.setInt( index++, dto.getSheldonC().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonD() != null) {
				stmt.setInt( index++, dto.getSheldonD().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonE() != null) {
				stmt.setInt( index++, dto.getSheldonE().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonF() != null) {
				stmt.setInt( index++, dto.getSheldonF().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getSheldonG() != null) {
				stmt.setInt( index++, dto.getSheldonG().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getComplicacionesSn() != null) {
				stmt.setInt( index++, dto.getComplicacionesSn().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			stmt.setString( index++, dto.getEpisodio() );
			stmt.setString( index++, dto.getIndicacionOtra() );
			
			if (dto.getEpiSin() != null) {
				stmt.setInt( index++, dto.getEpiSin().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
			
			if (dto.getNtg() != null) {
				stmt.setInt( index++, dto.getNtg().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (pk.getIdMesa() != null) {
				stmt.setInt( 29, pk.getIdMesa().intValue() );
			} else {
				stmt.setNull(29, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
			auditoriaDto.setDescri(dto.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ARR_MESAS table.
	 */
	public void delete(ArrMesasPk pk) throws ArrMesasDaoException
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
			if (pk.getIdMesa() != null) {
				stmt.setInt( 1, pk.getIdMesa().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			auditoriaDto.setAccion(AuditoriaDto.borrado);
			auditoriaDto.setDescri(pk.toString());
			auditoriaDao.escribeAuditoria(auditoriaDto);
		}
		catch (Exception _e) {
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ARR_MESAS table that matches the specified primary-key value.
	 */
	public ArrMesas findByPrimaryKey(ArrMesasPk pk) throws ArrMesasDaoException
	{
		return findByPrimaryKey( pk.getIdMesa() );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'ID_MESA = :idMesa'.
	 */
	public ArrMesas findByPrimaryKey(Integer idMesa) throws ArrMesasDaoException
	{
		ArrMesas ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ID_MESA = ?", new Object[] { idMesa } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria ''.
	 */
	public ArrMesas[] findAll() throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ID_MESA", null );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'ID_PACIENTE = :idPaciente'.
	 */
	public ArrMesas[] findByArrPacientes(long idPaciente) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PACIENTE = ?", new Object[] {  new Long(idPaciente) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'ID_PACIENTE = :idPaciente'.
	 */
	public ArrMesas[] findWhereIdPacienteEquals(long idPaciente) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_PACIENTE = ? ORDER BY ID_PACIENTE", new Object[] {  new Long(idPaciente) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'ID_MESA = :idMesa'.
	 */
	public ArrMesas[] findWhereIdMesaEquals(long idMesa) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ID_MESA = ? ORDER BY ID_MESA", new Object[] {  new Long(idMesa) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'FECHA = :fecha'.
	 */
	public ArrMesas[] findWhereFechaEquals(Date fecha) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FECHA = ? ORDER BY FECHA", new Object[] { fecha==null ? null : new java.sql.Timestamp( fecha.getTime() ) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'NPROC = :nproc'.
	 */
	public ArrMesas[] findWhereNprocEquals(long nproc) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NPROC = ? ORDER BY NPROC", new Object[] {  new Long(nproc) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'REFERIDOR = :referidor'.
	 */
	public ArrMesas[] findWhereReferidorEquals(long referidor) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REFERIDOR = ? ORDER BY REFERIDOR", new Object[] {  new Long(referidor) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'INDICACION = :indicacion'.
	 */
	public ArrMesas[] findWhereIndicacionEquals(long indicacion) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE INDICACION = ? ORDER BY INDICACION", new Object[] {  new Long(indicacion) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'EPI_PREVIOS = :epiPrevios'.
	 */
	public ArrMesas[] findWhereEpiPreviosEquals(long epiPrevios) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EPI_PREVIOS = ? ORDER BY EPI_PREVIOS", new Object[] {  new Long(epiPrevios) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'OPMED = :opmed'.
	 */
	public ArrMesas[] findWhereOpMedEquals(Integer opMed) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OP_MED = ? ORDER BY OP_MED", new Object[] { opMed } );
	}
	
	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'OPENF = :openf'.
	 */
	public ArrMesas[] findWhereOpEnfEquals(Integer opEnf) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OP_ENF = ? ORDER BY OP_ENF", new Object[] { opEnf } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ArrMesas[] findWhereComentariosEquals(String comentarios) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMENTARIOS = ? ORDER BY COMENTARIOS", new Object[] { comentarios } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'CARDIOPATIA = :cardiopatia'.
	 */
	public ArrMesas[] findWhereCardiopatiaEquals(long cardiopatia) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARDIOPATIA = ? ORDER BY CARDIOPATIA", new Object[] {  new Long(cardiopatia) } );
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the criteria 'COMPLICACIONES_SN = :complicacionesSn'.
	 */
	public ArrMesas[] findWhereComplicacionesSnEquals(long complicacionesSn) throws ArrMesasDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COMPLICACIONES_SN = ? ORDER BY COMPLICACIONES_SN", new Object[] {  new Long(complicacionesSn) } );
	}

	/**
	 * Method 'ArrMesasDaoImpl'
	 * 
	 */
	public ArrMesasDaoImpl(String usuario) {
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrMesasDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrMesasDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrMesasDaoImpl(final java.sql.Connection userConn)
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
		//return "ARR_MESAS";
		return "arr_mesas";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrMesas fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrMesas dto = new ArrMesas();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrMesas[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrMesas dto = new ArrMesas();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrMesas ret[] = new ArrMesas[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrMesas dto, ResultSet rs) throws SQLException
	{
		dto.setIdPaciente( new Integer( rs.getInt(COLUMN_ID_PACIENTE) ) );
		dto.setIdMesa( new Integer( rs.getInt(COLUMN_ID_MESA) ) );
		dto.setFecha( rs.getTimestamp(COLUMN_FECHA ) );
		dto.setNproc( rs.getString( COLUMN_NPROC ) );
		dto.setReferidor( rs.getString( COLUMN_REFERIDOR ) );
		
		dto.setIndicacion( new Integer( rs.getInt(COLUMN_INDICACION) ) );
		if (rs.wasNull()) {
			dto.setIndicacion( null );
		}
		
		dto.setEpiPrevios( new Integer( rs.getInt(COLUMN_EPI_PREVIOS) ) );
		if (rs.wasNull()) {
			dto.setEpiPrevios( null );
		}
		
		dto.setOpMed( rs.getString( COLUMN_OP_MED));
		dto.setOpEnf( rs.getString( COLUMN_OP_ENF));
		dto.setComentarios( rs.getString( COLUMN_COMENTARIOS ) );
		dto.setComplicaciones( rs.getString( COLUMN_COMPLICACIONES ) );
		dto.setResN1( new Integer( rs.getInt(COLUMN_RES_N1) ) );
		if (rs.wasNull()) {
			dto.setResN1( null );
		}
		
		dto.setResN2( new Integer( rs.getInt(COLUMN_RES_N2) ) );
		if (rs.wasNull()) {
			dto.setResN2( null );
		}
		
		dto.setResN3( new Integer( rs.getInt(COLUMN_RES_N3) ) );
		if (rs.wasNull()) {
			dto.setResN3( null );
		}
		
		dto.setResTiempo( rs.getString( COLUMN_RES_TIEMPO ) );
		dto.setCardiopatia( new Integer( rs.getInt(COLUMN_CARDIOPATIA) ) );
		if (rs.wasNull()) {
			dto.setCardiopatia( null );
		}
		
		dto.setSheldonA( new Integer( rs.getInt(COLUMN_SHELDON_A) ) );
		if (rs.wasNull()) {
			dto.setSheldonA( null );
		}
		
		dto.setSheldonB( new Integer( rs.getInt(COLUMN_SHELDON_B) ) );
		if (rs.wasNull()) {
			dto.setSheldonB( null );
		}
		
		dto.setSheldonC( new Integer( rs.getInt(COLUMN_SHELDON_C) ) );
		if (rs.wasNull()) {
			dto.setSheldonC( null );
		}
		
		dto.setSheldonD( new Integer( rs.getInt(COLUMN_SHELDON_D) ) );
		if (rs.wasNull()) {
			dto.setSheldonD( null );
		}
		
		dto.setSheldonE( new Integer( rs.getInt(COLUMN_SHELDON_E) ) );
		if (rs.wasNull()) {
			dto.setSheldonE( null );
		}
		
		dto.setSheldonF( new Integer( rs.getInt(COLUMN_SHELDON_F) ) );
		if (rs.wasNull()) {
			dto.setSheldonF( null );
		}
		
		dto.setSheldonG( new Integer( rs.getInt(COLUMN_SHELDON_G) ) );
		if (rs.wasNull()) {
			dto.setSheldonG( null );
		}
		
		dto.setComplicacionesSn( new Integer( rs.getInt(COLUMN_COMPLICACIONES_SN) ) );
		if (rs.wasNull()) {
			dto.setComplicacionesSn( null );
		}
		
		dto.setEpisodio( rs.getString( COLUMN_EPISODIO ) );
		dto.setIndicacionOtra( rs.getString( COLUMN_INDICACION_OTRA ) );
		
		dto.setEpiSin( new Integer( rs.getInt(COLUMN_EPI_SIN) ) );
		if (rs.wasNull()) {
			dto.setEpiSin( null );
		}
		
		dto.setNtg( new Integer( rs.getInt(COLUMN_NTG) ) );
		if (rs.wasNull()) {
			dto.setNtg( null );
		}
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrMesas dto)
	{
	}

	/** 
	 * Returns all rows from the ARR_MESAS table that match the specified arbitrary SQL statement
	 */
	public ArrMesas[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrMesasDaoException
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
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
	public ArrayList<ArrayList<Object>> findByDynamicSelect(String sql) throws ArrMesasDaoException
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
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ARR_MESAS table that match the specified arbitrary SQL statement
	 */
	public ArrMesas[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrMesasDaoException
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
			throw new ArrMesasDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}
	public ArrayList<ArrayList<Object>> getEstadisticasMesas(Date fechaini, Date fechafin) throws ArrMesasDaoException{
		StringBuffer sql = new StringBuffer();
		sql.append("select mesa.res_n1 RES_N1, ");
		sql.append("mesa.ntg NTG ");
		sql.append(" from procedimiento proc, ");
		sql.append(" arr_mesas mesa ");
		sql.append(" WHERE proc.fecha between '"+UtilFechas.getFechaString(fechaini)+"' and '"+UtilFechas.getFechaString(fechafin)+"'");
		//sql.append(" WHERE proc.fecha >='"+UtilFechas.dateToString2(new Date(fechaini.getYear(),fechaini.getMonth(),fechaini.getDay()))+"'");
		//sql.append(" and proc.fecha <='"+UtilFechas.dateToString2(new Date(fechafin.getYear(),fechafin.getMonth(),fechafin.getDay()))+"'");
		sql.append(" and proc.tipoprocedimiento = 1066 ");
		sql.append(" and proc.idprocedimiento = mesa.id_mesa ");
		
		return findByDynamicSelect(sql.toString());
	}
	public ArrayList<ArrayList<Object>> getEstadisticas(Date fechaini, Date fechafin,int res) throws ArrMesasDaoException{
		StringBuffer sql = new StringBuffer();
		sql.append("select pac.nhc PACIENTE,");
		sql.append("pac.fechanaci FECHANACI,");
		sql.append("proc.fecha FECHA,");
		sql.append("mesa.res_n1 RES_N1, ");
		sql.append("mesa.referidor REFERIDOR, ");
		sql.append("mesa.indicacion INDICACION, ");
		sql.append("mesa.epi_previos EPI_PREVIOS, ");
		sql.append("mesa.epi_sin EPI_SIN, ");
		sql.append("mesa.op_enf OP_ENF, ");
		sql.append("mesa.op_med OP_MED, ");
		sql.append("mesa.complicaciones COMPLICACIONES, ");
		sql.append("mesa.res_n2 RES_N2, ");
		sql.append("mesa.res_n3 RES_N3, ");
		sql.append("mesa.res_n4 RES_N4, ");
		sql.append("mesa.res_tiempo RES_TIEMPO, ");
		sql.append("mesa.cardiopatia CARDIOPATIA, ");
		sql.append("mesa.ntg NTG, ");
		sql.append("pac.nombre NOMBRE,");
		sql.append("pac.apellid1 APELLID1,");
		sql.append("pac.apellid2 APELLID2,");
		sql.append("pac.nuhsa NUHSA,");//20
		sql.append("mesa.nproc NPROC");
		sql.append(" from procedimiento proc, ");
		sql.append(" arr_pacientes pac, ");
		sql.append(" arr_mesas mesa ");
		sql.append(" WHERE proc.fecha between '"+UtilFechas.getFechaString(fechaini)+"' and '"+UtilFechas.getFechaString(fechafin)+"'");
		sql.append(" and proc.tipoprocedimiento = 1066 ");
		sql.append(" and pac.codigo = proc.codigo ");
		sql.append(" and proc.idprocedimiento = mesa.id_mesa ");
		if(res!=-1)
			sql.append(" and mesa.res_n1 = "+res);
		
		return findByDynamicSelect(sql.toString());
	}

}
