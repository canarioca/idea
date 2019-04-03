/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.jdbc;

import com.sorin.idea.dao.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.util.UtilFechas;

import java.util.Date;
import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;
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

public class ArrListaEsperaDaoImpl extends AbstractDAO implements ArrListaEsperaDao
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
	protected final String SQL_SELECT = "SELECT CODIGO_PACIENTE, INGRESO, ARRITMIA, NOTAS, CARACTER, CARDIOPATIA, ANESTESIA, PROCEDIMIENTO, TRATAMIENTO1, CODIGO_LE, ESTADO, RECLAMACION, INCLUIDOPOR FROM " + getTableName() + "";
	protected final String SQL_SELECT_2 = "SELECT CODIGO_PACIENTE, INGRESO, ARRITMIA, NOTAS, CARACTER, CARDIOPATIA, ANESTESIA, PROCEDIMIENTO, TRATAMIENTO1, CODIGO_LE, arr_lista_espera.ESTADO, NOMBRE, APELLID1, APELLID2, NHC, TELEFONO1, TELEFONO2, FECHANACI, RECLAMACION, INCLUIDOPOR FROM " + getTableName() + ", arr_pacientes ";
	
	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( CODIGO_PACIENTE, INGRESO, ARRITMIA, NOTAS, CARACTER, CARDIOPATIA, ANESTESIA, PROCEDIMIENTO, TRATAMIENTO1, CODIGO_LE, ESTADO, RECLAMACION, INCLUIDOPOR ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET CODIGO_PACIENTE = ?, INGRESO = ?, ARRITMIA = ?, NOTAS = ?, CARACTER = ?, CARDIOPATIA = ?, ANESTESIA = ?, PROCEDIMIENTO = ?, TRATAMIENTO1 = ?, CODIGO_LE = ?, ESTADO = ?, RECLAMACION = ?, INCLUIDOPOR = ? WHERE CODIGO_PACIENTE = ? AND CODIGO_LE = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE CODIGO_PACIENTE = ? AND CODIGO_LE = ?";

	/** 
	 * Index of column CODIGO_PACIENTE
	 */
	protected static final int COLUMN_CODIGO_PACIENTE = 1;

	/** 
	 * Index of column INGRESO
	 */
	protected static final int COLUMN_INGRESO = 2;

	/** 
	 * Index of column ARRITMIA
	 */
	protected static final int COLUMN_ARRITMIA = 3;

	/** 
	 * Index of column NOTAS
	 */
	protected static final int COLUMN_NOTAS = 4;

	/** 
	 * Index of column CARACTER
	 */
	protected static final int COLUMN_CARACTER = 5;

	/** 
	 * Index of column CARDIOPATIA
	 */
	protected static final int COLUMN_CARDIOPATIA = 6;

	/** 
	 * Index of column ANESTESIA
	 */
	protected static final int COLUMN_ANESTESIA = 7;

	/** 
	 * Index of column PROCEDIMIENTO
	 */
	protected static final int COLUMN_PROCEDIMIENTO = 8;

	/** 
	 * Index of column TRATAMIENTO1
	 */
	protected static final int COLUMN_TRATAMIENTO1 = 9;

	/** 
	 * Index of column CODIGO_LE
	 */
	protected static final int COLUMN_CODIGO_LE = 10;

	/** 
	 * Index of column ESTADO
	 */
	protected static final int COLUMN_ESTADO = 11;

	/** 
	 * Index of column RECLAMACION
	 */
	protected static final int COLUMN_RECLAMACION = 12;

	protected static final int COLUMN_NOMBRE = 12;
	protected static final int COLUMN_APELLIDO1 = 13;
	protected static final int COLUMN_APELLIDO2 = 14;
	protected static final int COLUMN_NHC = 15;
	protected static final int COLUMN_TELEFONO1 = 16;
	protected static final int COLUMN_TELEFONO2 = 17;
	protected static final int COLUMN_FECHANACI = 18;
	protected static final int COLUMN_RECLAMACION_FILTRO = 19;
	
	/** 
	 * Index of column INCLUIDOPOR
	 */
	protected static final int COLUMN_INCLUIDOPOR = 20;
	
	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 20;

	/** 
	 * Index of primary-key column CODIGO_PACIENTE
	 */
	protected static final int PK_COLUMN_CODIGO_PACIENTE = 1;

	/** 
	 * Index of primary-key column CODIGO_LE
	 */
	protected static final int PK_COLUMN_CODIGO_LE = 2;

	/** 
	 * Inserts a new row in the arr_lista_espera table.
	 */
	public ArrListaEsperaPk insert(ArrListaEspera dto) throws ArrListaEsperaDaoException
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
		
			stmt = conn.prepareStatement( "SELECT max(CODIGO_LE) FROM idea.arr_lista_espera" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setCodigoLe(new Integer( rs.getInt(1) ) );
				rs.close();
				stmt.close();
			}
			
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			if (dto.getCodigoPaciente() != null) {
				stmt.setInt( index++, dto.getCodigoPaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setDate(index++, dto.getIngreso()==null ? null : new java.sql.Date( dto.getIngreso().getTime() ) );
			stmt.setString( index++, dto.getArritmia() );
			stmt.setString( index++, dto.getNotas() );
			stmt.setString( index++, dto.getCaracter() );
			stmt.setString( index++, dto.getCardiopatia() );
			stmt.setString( index++, dto.getAnestesia() );
			stmt.setString( index++, dto.getProcedimiento() );
			stmt.setString( index++, dto.getTratamiento1() );
			if (dto.getCodigoLe() != null) {
				stmt.setInt( index++, dto.getCodigoLe().intValue() + 1 );
			} else {
				stmt.setInt(index++, 1);
			}
		
			if (dto.getEstado() != null) {
				stmt.setInt( index++, dto.getEstado().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setDate(index++, dto.getReclamacion()==null ? null : new java.sql.Date( dto.getReclamacion().getTime() ) );
			if (dto.getIncluidopor() != null) {
				stmt.setInt( index++, dto.getIncluidopor().intValue() );
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
			_e.printStackTrace();
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the arr_lista_espera table.
	 */
	public void update(ArrListaEsperaPk pk, ArrListaEspera dto) throws ArrListaEsperaDaoException
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
			if (dto.getCodigoPaciente() != null) {
				stmt.setInt( index++, dto.getCodigoPaciente().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setDate(index++, dto.getIngreso()==null ? null : new java.sql.Date( dto.getIngreso().getTime() ) );
			stmt.setString( index++, dto.getArritmia() );
			stmt.setString( index++, dto.getNotas() );
			stmt.setString( index++, dto.getCaracter() );
			stmt.setString( index++, dto.getCardiopatia() );
			stmt.setString( index++, dto.getAnestesia() );
			stmt.setString( index++, dto.getProcedimiento() );
			stmt.setString( index++, dto.getTratamiento1() );
			if (dto.getCodigoLe() != null) {
				stmt.setInt( index++, dto.getCodigoLe().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (dto.getEstado() != null) {
				stmt.setInt( index++, dto.getEstado().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			stmt.setDate(index++, dto.getReclamacion()==null ? null : new java.sql.Date( dto.getReclamacion().getTime() ) );
			if (dto.getIncluidopor() != null) {
				stmt.setInt( index++, dto.getIncluidopor().intValue() );
			} else {
				stmt.setNull(index++, java.sql.Types.INTEGER);
			}
		
			if (pk.getCodigoPaciente() != null) {
				stmt.setInt( 14, pk.getCodigoPaciente().intValue() );
			} else {
				stmt.setNull(14, java.sql.Types.INTEGER);
			}
		
			if (pk.getCodigoLe() != null) {
				stmt.setInt( 15, pk.getCodigoLe().intValue() );
			} else {
				stmt.setNull(15, java.sql.Types.INTEGER);
			}
		
			int rows = stmt.executeUpdate();
			auditoriaDto.setAccion(AuditoriaDto.modificacion);
	        auditoriaDto.setDescri(dto.toString());
	        auditoriaDao.escribeAuditoria(auditoriaDto);
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the arr_lista_espera table.
	 */
	public void delete(ArrListaEsperaPk pk) throws ArrListaEsperaDaoException
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
			if (pk.getCodigoPaciente() != null) {
				stmt.setInt( 1, pk.getCodigoPaciente().intValue() );
			} else {
				stmt.setNull(1, java.sql.Types.INTEGER);
			}
		
			if (pk.getCodigoLe() != null) {
				stmt.setInt( 2, pk.getCodigoLe().intValue() );
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
			_e.printStackTrace();
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the arr_lista_espera table that matches the specified primary-key value.
	 */
	public ArrListaEspera findByPrimaryKey(ArrListaEsperaPk pk) throws ArrListaEsperaDaoException
	{
		return findByPrimaryKey( pk.getCodigoPaciente(), pk.getCodigoLe() );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'CODIGO_PACIENTE = :codigoPaciente AND CODIGO_LE = :codigoLe'.
	 */
	public ArrListaEspera findByPrimaryKey(Integer codigoPaciente, Integer codigoLe) throws ArrListaEsperaDaoException
	{
		ArrListaEspera ret[] = findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_PACIENTE = ? AND CODIGO_LE = ?", new Object[] { codigoPaciente, codigoLe } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria ''.
	 */
	public ArrListaEspera[] findAll() throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY CODIGO_PACIENTE, CODIGO_LE", null );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'CODIGO_PACIENTE = :codigoPaciente'.
	 */
	public ArrListaEspera[] findWhereCodigoPacienteEquals(int codigoPaciente) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_PACIENTE = ? ORDER BY CODIGO_PACIENTE", new Object[] {  new Integer(codigoPaciente) } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'INGRESO = :ingreso'.
	 */
	public ArrListaEspera[] findWhereIngresoEquals(Date ingreso) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE INGRESO = ? ORDER BY INGRESO", new Object[] { ingreso==null ? null : new java.sql.Date( ingreso.getTime() ) } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'ARRITMIA = :arritmia'.
	 */
	public ArrListaEspera[] findWhereArritmiaEquals(String arritmia) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ARRITMIA = ? ORDER BY ARRITMIA", new Object[] { arritmia } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'NOTAS = :notas'.
	 */
	public ArrListaEspera[] findWhereNotasEquals(String notas) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOTAS = ? ORDER BY NOTAS", new Object[] { notas } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'CARACTER = :caracter'.
	 */
	public ArrListaEspera[] findWhereCaracterEquals(String caracter) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARACTER = ? ORDER BY CARACTER", new Object[] { caracter } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'CARDIOPATIA = :cardiopatia'.
	 */
	public ArrListaEspera[] findWhereCardiopatiaEquals(String cardiopatia) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CARDIOPATIA = ? ORDER BY CARDIOPATIA", new Object[] { cardiopatia } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'ANESTESIA = :anestesia'.
	 */
	public ArrListaEspera[] findWhereAnestesiaEquals(String anestesia) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ANESTESIA = ? ORDER BY ANESTESIA", new Object[] { anestesia } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'PROCEDIMIENTO = :procedimiento'.
	 */
	public ArrListaEspera[] findWhereProcedimientoEquals(String procedimiento) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PROCEDIMIENTO = ? ORDER BY PROCEDIMIENTO", new Object[] { procedimiento } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'TRATAMIENTO1 = :tratamiento1'.
	 */
	public ArrListaEspera[] findWhereTratamiento1Equals(String tratamiento1) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TRATAMIENTO1 = ? ORDER BY TRATAMIENTO1", new Object[] { tratamiento1 } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'CODIGO_LE = :codigoLe'.
	 */
	public ArrListaEspera[] findWhereCodigoLeEquals(int codigoLe) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CODIGO_LE = ? ORDER BY CODIGO_LE", new Object[] {  new Integer(codigoLe) } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'ESTADO = :estado'.
	 */
	public ArrListaEspera[] findWhereEstadoEquals(int estado) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ESTADO = ? ORDER BY ESTADO", new Object[] {  new Integer(estado) } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'RECLAMACION = :reclamacion'.
	 */
	public ArrListaEspera[] findWhereReclamacionEquals(Date reclamacion) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECLAMACION = ? ORDER BY RECLAMACION", new Object[] { reclamacion==null ? null : new java.sql.Date( reclamacion.getTime() ) } );
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the criteria 'INCLUIDOPOR = :incluidopor'.
	 */
	public ArrListaEspera[] findWhereIncluidoporEquals(int incluidopor) throws ArrListaEsperaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE INCLUIDOPOR = ? ORDER BY INCLUIDOPOR", new Object[] {  new Integer(incluidopor) } );
	}

	public ArrayList<ArrListaEspera> findWhereFiltro(ArrListaEspera filtro) throws ArrListaEsperaDaoException
	{
		String where = " WHERE CODIGO_PACIENTE = CODIGO ";
		if(filtro != null){
			if(filtro.getEstado() != null && filtro.getEstado() > 0)
				where += " AND arr_lista_espera.ESTADO = " + filtro.getEstado();
			if(filtro.getNombre() != null && filtro.getNombre().length() > 0)
				where += " AND upper(NOMBRE) like '%" + filtro.getNombre().trim().toUpperCase() + "%'";
			if(filtro.getApellido1() != null && filtro.getApellido1().length() > 0)
				where += " AND upper(APELLID1) like '%" + filtro.getApellido1().trim().toUpperCase() + "%'";
			if(filtro.getApellido2() != null && filtro.getApellido2().length() > 0)
				where += " AND upper(APELLID2) like '%" + filtro.getApellido2().trim().toUpperCase() + "%'";
			if(filtro.getNhc() != null && filtro.getNhc().length() > 0)
				where += " AND NHC = '" + filtro.getNhc()+"'";
			if(filtro.getCip() != null && filtro.getCip().length() > 0)
				where += " AND NUHSA = '" + filtro.getCip()+"'";
			if(filtro.getCodigoLe() != null && filtro.getCodigoLe() > 0)
				where += " AND CODIGO_LE = " + filtro.getCodigoLe();
			if(filtro.getCodigoPaciente() != null)
				where += " AND CODIGO_PACIENTE = " + filtro.getCodigoPaciente();
			if(filtro.getEdadmin() != null && filtro.getEdadmin() > 0)
				where += " AND FECHANACI <= '"+(1900+(new Date().getYear() - filtro.getEdadmin())) + "-01-01'";
				//where += " AND FECHANACI <= STR_TO_DATE('01/01/ " + (1900+(new Date().getYear() - filtro.getEdadmin())) + "','%d/%m/%Y')";
			if(filtro.getEdadmax() != null && filtro.getEdadmax() > 0)
				where += " AND FECHANACI >= '" + (1900+(new Date().getYear() - filtro.getEdadmax())) + "-01-01'";
			if(filtro.getIngreso() != null)
				where += " AND INGRESO >= '"+UtilFechas.getFechaString(filtro.getIngreso())+"'";
				//where += " AND INGRESO >= STR_TO_DATE('" + UtilFechas.dateToString(filtro.getIngreso()) + "','%d/%m/%Y')";
			if(filtro.getIngresomax() != null)
				where += " AND INGRESO <= '"+UtilFechas.getFechaString(filtro.getIngreso())+"'";
				//where += " AND INGRESO <= STR_TO_DATE('" + UtilFechas.dateToString(filtro.getIngresomax()) + "','%d/%m/%Y')";
			if(filtro.getArritmia() != null && filtro.getArritmia().length() > 1)
				where += " AND upper(ARRITMIA) = '" + filtro.getArritmia() + "'";
			if(filtro.getCaracter() != null && filtro.getCaracter().length() > 1)
				where += " AND upper(CARACTER) = '" + filtro.getCaracter() + "'";
			if(filtro.getProcedimiento() != null && filtro.getProcedimiento().length() > 1)
				where += " AND upper(PROCEDIMIENTO) = '" + filtro.getProcedimiento() + "'";
			if(filtro.getTratamiento1() != null && filtro.getTratamiento1().length() > 1)
				where += " AND upper(TRATAMIENTO1) = '" + filtro.getTratamiento1() + "'";
			if(filtro.getIncluidopor() != null && filtro.getIncluidopor()!=0)
				where += " AND INCLUIDOPOR = " + filtro.getIncluidopor();
		}
		where += " ORDER BY APELLID1, APELLID2, NOMBRE";
		return findByFiltroSelect( SQL_SELECT_2 + where);
	}
	
	/**
	 * Method 'ArrListaEsperaDaoImpl'
	 * 
	 */
	public ArrListaEsperaDaoImpl()
	{
	}
	public ArrListaEsperaDaoImpl(String usuario)
	{
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}
	public ArrListaEsperaDaoImpl(final java.sql.Connection userConn,String usuario)
	{
		this.userConn = userConn;
		this.auditoriaDto = new AuditoriaDto(usuario, getTableName());
	}

	/**
	 * Method 'ArrListaEsperaDaoImpl'
	 * 
	 * @param userConn
	 */
	public ArrListaEsperaDaoImpl(final java.sql.Connection userConn)
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
		return "idea.arr_lista_espera";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ArrListaEspera fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ArrListaEspera dto = new ArrListaEspera();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ArrListaEspera[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrListaEspera dto = new ArrListaEspera();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ArrListaEspera ret[] = new ArrListaEspera[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}
	
	protected ArrayList<ArrListaEspera> fetchMultiResultsFiltro(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ArrListaEspera dto = new ArrListaEspera();
			populateDtoFiltro( dto, rs);
			resultList.add( dto );
		}
		
		return (ArrayList<ArrListaEspera>) resultList;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ArrListaEspera dto, ResultSet rs) throws SQLException
	{
		dto.setCodigoPaciente( new Integer( rs.getInt(COLUMN_CODIGO_PACIENTE) ) );
		dto.setIngreso( rs.getDate(COLUMN_INGRESO ) );
		dto.setArritmia( rs.getString( COLUMN_ARRITMIA ) );
		dto.setNotas( rs.getString( COLUMN_NOTAS ) );
		dto.setCaracter( rs.getString( COLUMN_CARACTER ) );
		dto.setCardiopatia( rs.getString( COLUMN_CARDIOPATIA ) );
		dto.setAnestesia( rs.getString( COLUMN_ANESTESIA ) );
		dto.setProcedimiento( rs.getString( COLUMN_PROCEDIMIENTO ) );
		dto.setTratamiento1( rs.getString( COLUMN_TRATAMIENTO1 ) );
		dto.setCodigoLe( new Integer( rs.getInt(COLUMN_CODIGO_LE) ) );
		dto.setEstado( new Integer( rs.getInt(COLUMN_ESTADO) ) );
		if (rs.wasNull()) {
			dto.setEstado( null );
		}
		dto.setReclamacion( rs.getDate(COLUMN_RECLAMACION ) );
		/*dto.setIncluidopor( new Integer( rs.getInt(COLUMN_INCLUIDOPOR) ) );
		if (rs.wasNull()) {
			dto.setIncluidopor( null );
		}*/
		
	}
	
	protected void populateDtoFiltro(ArrListaEspera dto, ResultSet rs) throws SQLException
	{
		dto.setCodigoPaciente( new Integer( rs.getInt(COLUMN_CODIGO_PACIENTE) ) );
		dto.setIngreso( rs.getTimestamp(COLUMN_INGRESO ) );
		dto.setArritmia( rs.getString( COLUMN_ARRITMIA ) );
		dto.setNotas( rs.getString( COLUMN_NOTAS ) );
		dto.setCaracter( rs.getString( COLUMN_CARACTER ) );
		dto.setCardiopatia( rs.getString( COLUMN_CARDIOPATIA ) );
		dto.setAnestesia( rs.getString( COLUMN_ANESTESIA ) );
		dto.setProcedimiento( rs.getString( COLUMN_PROCEDIMIENTO ) );
		dto.setTratamiento1( rs.getString( COLUMN_TRATAMIENTO1 ) );
		dto.setCodigoLe( new Integer( rs.getInt(COLUMN_CODIGO_LE) ) );
		dto.setEstado( new Integer( rs.getInt(COLUMN_ESTADO) ) );
		if (rs.wasNull()) {
			dto.setEstado( null );
		}
		dto.setNombre( rs.getString(COLUMN_NOMBRE) );
		dto.setApellido1( rs.getString(COLUMN_APELLIDO1) );
		dto.setApellido2( rs.getString(COLUMN_APELLIDO2) );
		dto.setNhc( rs.getString(COLUMN_NHC) );
		dto.setTelefono1( rs.getString(COLUMN_TELEFONO1) );
		dto.setTelefono2( rs.getString(COLUMN_TELEFONO2) );
		dto.setEdadmin(rs.getDate(COLUMN_FECHANACI));
		dto.setReclamacion( rs.getTimestamp(COLUMN_RECLAMACION_FILTRO ) );
		dto.setIncluidopor(new Integer(rs.getInt(COLUMN_INCLUIDOPOR)));
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ArrListaEspera dto)
	{
	}

	/** 
	 * Returns all rows from the arr_lista_espera table that match the specified arbitrary SQL statement
	 */
	public ArrListaEspera[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrListaEsperaDaoException
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
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	public ArrayList<ArrListaEspera> findByFiltroSelect(String sql) throws ArrListaEsperaDaoException
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
			return fetchMultiResultsFiltro(rs);
		}
		catch (Exception _e) {
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the arr_lista_espera table that match the specified arbitrary SQL statement
	 */
	public ArrListaEspera[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrListaEsperaDaoException
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
			throw new ArrListaEsperaDaoException( "Exception: " + _e.getMessage(), _e );
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
