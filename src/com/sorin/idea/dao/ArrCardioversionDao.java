/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dao;

import java.util.ArrayList;
import java.util.Date;

import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;


public interface ArrCardioversionDao
{
	/** 
	 * Inserts a new row in the ARR_CARDIOVERSION table.
	 */
	public ArrCardioversionPk insert(ArrCardioversion dto) throws ArrCardioversionDaoException;

	/** 
	 * Updates a single row in the ARR_CARDIOVERSION table.
	 */
	public void update(ArrCardioversionPk pk, ArrCardioversion dto) throws ArrCardioversionDaoException;

	/** 
	 * Deletes a single row in the ARR_CARDIOVERSION table.
	 */
	public void delete(ArrCardioversionPk pk) throws ArrCardioversionDaoException;

	/** 
	 * Returns the rows from the ARR_CARDIOVERSION table that matches the specified primary-key value.
	 */
	public ArrCardioversion findByPrimaryKey(ArrCardioversionPk pk) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CODIGO_PACIENTE = :codigoPaciente AND CODIGO_CARDIOVERSION = :codigoCardioversion'.
	 */
	public ArrCardioversion findByPrimaryKey(Integer codigoPaciente, Integer codigoCardioversion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria ''.
	 */
	public ArrCardioversion[] findAll() throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CODIGO_PACIENTE = :codigoPaciente'.
	 */
	public ArrCardioversion[] findWhereCodigoPacienteEquals(long codigoPaciente) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CODIGO_CARDIOVERSION = :codigoCardioversion'.
	 */
	public ArrCardioversion[] findWhereCodigoCardioversionEquals(long codigoCardioversion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'FECHA = :fecha'.
	 */
	public ArrCardioversion[] findWhereFechaEquals(Date fecha) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'FIBRILACION = :fibrilacion'.
	 */
	public ArrCardioversion[] findWhereFibrilacionEquals(long fibrilacion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'FLUTERATIPICO = :fluteratipico'.
	 */
	public ArrCardioversion[] findWhereFluteratipicoEquals(long fluteratipico) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'FLUTERTIPICO = :flutertipico'.
	 */
	public ArrCardioversion[] findWhereFlutertipicoEquals(long flutertipico) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDPROCEDENCIA = :idprocedencia'.
	 */
	public ArrCardioversion[] findWhereIdprocedenciaEquals(long idprocedencia) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CVENO = :cveno'.
	 */
	public ArrCardioversion[] findWhereCvenoEquals(long cveno) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CVESI = :cvesi'.
	 */
	public ArrCardioversion[] findWhereCvesiEquals(long cvesi) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CVENUMERO = :cvenumero'.
	 */
	public ArrCardioversion[] findWhereCvenumeroEquals(String cvenumero) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CVEEFICAZ = :cveeficaz'.
	 */
	public ArrCardioversion[] findWhereCveeficazEquals(long cveeficaz) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDABLACION = :idablacion'.
	 */
	public ArrCardioversion[] findWhereIdablacionEquals(long idablacion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'NYHA = :nyha'.
	 */
	public ArrCardioversion[] findWhereNyhaEquals(String nyha) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDCARDIOPATIA = :idcardiopatia'.
	 */
	public ArrCardioversion[] findWhereIdcardiopatiaEquals(long idcardiopatia) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'HTA = :hta'.
	 */
	public ArrCardioversion[] findWhereHtaEquals(long hta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'EPOC = :epoc'.
	 */
	public ArrCardioversion[] findWhereEpocEquals(long epoc) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'MPDEFINITIVO = :mpdefinitivo'.
	 */
	public ArrCardioversion[] findWhereMpdefinitivoEquals(long mpdefinitivo) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ACV = :acv'.
	 */
	public ArrCardioversion[] findWhereAcvEquals(long acv) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DIABETES = :diabetes'.
	 */
	public ArrCardioversion[] findWhereDiabetesEquals(long diabetes) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDTABACO = :idtabaco'.
	 */
	public ArrCardioversion[] findWhereIdtabacoEquals(long idtabaco) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DIGOXINA = :digoxina'.
	 */
	public ArrCardioversion[] findWhereDigoxinaEquals(long digoxina) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AMIOD = :amiod'.
	 */
	public ArrCardioversion[] findWhereAmiodEquals(long amiod) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SOTALOL = :sotalol'.
	 */
	public ArrCardioversion[] findWhereSotalolEquals(long sotalol) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IECA = :ieca'.
	 */
	public ArrCardioversion[] findWhereIecaEquals(long ieca) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'BBLOQ = :bbloq'.
	 */
	public ArrCardioversion[] findWhereBbloqEquals(long bbloq) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AAS = :aas'.
	 */
	public ArrCardioversion[] findWhereAasEquals(long aas) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CLASEI = :clasei'.
	 */
	public ArrCardioversion[] findWhereClaseiEquals(long clasei) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ARAII = :araii'.
	 */
	public ArrCardioversion[] findWhereAraiiEquals(long araii) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ANTCA = :antca'.
	 */
	public ArrCardioversion[] findWhereAntcaEquals(long antca) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DRONEDARONA = :dronedarona'.
	 */
	public ArrCardioversion[] findWhereDronedaronaEquals(long dronedarona) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DIURETICOS = :diureticos'.
	 */
	public ArrCardioversion[] findWhereDiureticosEquals(long diureticos) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDDURACION = :idduracion'.
	 */
	public ArrCardioversion[] findWhereIdduracionEquals(long idduracion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'FE = :fe'.
	 */
	public ArrCardioversion[] findWhereFeEquals(String fe) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AL = :al'.
	 */
	public ArrCardioversion[] findWhereAlEquals(String al) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'OTROSECO = :otroseco'.
	 */
	public ArrCardioversion[] findWhereOtrosecoEquals(String otroseco) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AVTA = :avta'.
	 */
	public ArrCardioversion[] findWhereAvtaEquals(long avta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ETE = :ete'.
	 */
	public ArrCardioversion[] findWhereEteEquals(long ete) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'OTROSTTO = :otrostto'.
	 */
	public ArrCardioversion[] findWhereOtrosttoEquals(String otrostto) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDEXITOFINAL = :idexitofinal'.
	 */
	public ArrCardioversion[] findWhereIdexitofinalEquals(long idexitofinal) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDCOMPLICACION = :idcomplicacion'.
	 */
	public ArrCardioversion[] findWhereIdcomplicacionEquals(long idcomplicacion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'COMPLICACION = :complicacion'.
	 */
	public ArrCardioversion[] findWhereComplicacionEquals(String complicacion) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'EXITOTRANS = :exitotrans'.
	 */
	public ArrCardioversion[] findWhereExitotransEquals(long exitotrans) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'NUMEXITOTRANS = :numexitotrans'.
	 */
	public ArrCardioversion[] findWhereNumexitotransEquals(String numexitotrans) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DURACIONEXTRANS = :duracionextrans'.
	 */
	public ArrCardioversion[] findWhereDuracionextransEquals(String duracionextrans) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ENERGIAEXTRANS = :energiaextrans'.
	 */
	public ArrCardioversion[] findWhereEnergiaextransEquals(String energiaextrans) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SEC1 = :sec1'.
	 */
	public ArrCardioversion[] findWhereSec1Equals(String sec1) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDSEC1 = :idsec1'.
	 */
	public ArrCardioversion[] findWhereIdsec1Equals(long idsec1) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SEC2 = :sec2'.
	 */
	public ArrCardioversion[] findWhereSec2Equals(String sec2) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDSEC2 = :idsec2'.
	 */
	public ArrCardioversion[] findWhereIdsec2Equals(long idsec2) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SEC3 = :sec3'.
	 */
	public ArrCardioversion[] findWhereSec3Equals(String sec3) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDSEC3 = :idsec3'.
	 */
	public ArrCardioversion[] findWhereIdsec3Equals(long idsec3) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SEC4 = :sec4'.
	 */
	public ArrCardioversion[] findWhereSec4Equals(String sec4) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDSEC4 = :idsec4'.
	 */
	public ArrCardioversion[] findWhereIdsec4Equals(long idsec4) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SEC5 = :sec5'.
	 */
	public ArrCardioversion[] findWhereSec5Equals(String sec5) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IDSEC5 = :idsec5'.
	 */
	public ArrCardioversion[] findWhereIdsec5Equals(long idsec5) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'PARCHES = :parches'.
	 */
	public ArrCardioversion[] findWhereParchesEquals(long parches) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ATROPINA = :atropina'.
	 */
	public ArrCardioversion[] findWhereAtropinaEquals(long atropina) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ESTIMTMPEXT = :estimtmpext'.
	 */
	public ArrCardioversion[] findWhereEstimtmpextEquals(long estimtmpext) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'BBALTA = :bbalta'.
	 */
	public ArrCardioversion[] findWhereBbaltaEquals(long bbalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AVTAALTA = :avtaalta'.
	 */
	public ArrCardioversion[] findWhereAvtaaltaEquals(long avtaalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'ARAALTA = :araalta'.
	 */
	public ArrCardioversion[] findWhereAraaltaEquals(long araalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'AMIODARONAALTA = :amiodaronaalta'.
	 */
	public ArrCardioversion[] findWhereAmiodaronaaltaEquals(long amiodaronaalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'CLASEIALTA = :claseialta'.
	 */
	public ArrCardioversion[] findWhereClaseialtaEquals(long claseialta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'DRONEDARONAALTA = :dronedaronaalta'.
	 */
	public ArrCardioversion[] findWhereDronedaronaaltaEquals(long dronedaronaalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'SOLATOLOLALTA = :solatololalta'.
	 */
	public ArrCardioversion[] findWhereSolatololaltaEquals(long solatololalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'IECAALTA = :iecaalta'.
	 */
	public ArrCardioversion[] findWhereIecaaltaEquals(long iecaalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'OTROSALTA = :otrosalta'.
	 */
	public ArrCardioversion[] findWhereOtrosaltaEquals(long otrosalta) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the criteria 'TIPOPROCEDIMIENTO = :tipoprocedimiento'.
	 */
	public ArrCardioversion[] findWhereTipoprocedimientoEquals(long tipoprocedimiento) throws ArrCardioversionDaoException;
	
	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the specified arbitrary SQL statement
	 */
	public ArrCardioversion[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrCardioversionDaoException;
	public ArrCardioversion[] findByDynamicSelect(String sql) throws ArrCardioversionDaoException;

	/** 
	 * Returns all rows from the ARR_CARDIOVERSION table that match the specified arbitrary SQL statement
	 */
	public ArrCardioversion[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrCardioversionDaoException;
	
	/** 
	 * Devuelve la consulta estadística de las Cardioversiones
	 * @param cv 
	 */
	public ArrCardioversion[] getEstadisticas(Date fechaini,Date fechafin,ArrCardioversion cv) throws ArrCardioversionDaoException;
	public ArrayList<ArrayList<Object>> getEstadisticasCv(Date fechaini,Date fechafin) throws ArrCardioversionDaoException;
}
