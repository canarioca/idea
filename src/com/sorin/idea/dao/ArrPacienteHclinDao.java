/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dao;

import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;


public interface ArrPacienteHclinDao
{
	/** 
	 * Inserts a new row in the ARR_PACIENTE_HCLIN table.
	 */
	public ArrPacienteHclinPk insert(ArrPacienteHclin dto) throws ArrPacienteHclinDaoException;

	/** 
	 * Updates a single row in the ARR_PACIENTE_HCLIN table.
	 */
	public void update(ArrPacienteHclinPk pk, ArrPacienteHclin dto) throws ArrPacienteHclinDaoException;

	/** 
	 * Deletes a single row in the ARR_PACIENTE_HCLIN table.
	 */
	public void delete(ArrPacienteHclinPk pk) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns the rows from the ARR_PACIENTE_HCLIN table that matches the specified primary-key value.
	 */
	public ArrPacienteHclin findByPrimaryKey(ArrPacienteHclinPk pk) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'IDPACIENTE = :idpaciente'.
	 */
	public ArrPacienteHclin findByPrimaryKey(Integer idpaciente) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria ''.
	 */
	public ArrPacienteHclin[] findAll() throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'IDPACIENTE = :idpaciente'.
	 */
	public ArrPacienteHclin[] findWhereIdpacienteEquals(long idpaciente) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'FEVI = :fevi'.
	 */
	public ArrPacienteHclin[] findWhereFeviEquals(String fevi) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'FUNCION = :funcion'.
	 */
	public ArrPacienteHclin[] findWhereFuncionEquals(String funcion) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'HTA = :hta'.
	 */
	public ArrPacienteHclin[] findWhereHtaEquals(long hta) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'DISLIPEMIA = :dislipemia'.
	 */
	public ArrPacienteHclin[] findWhereDislipemiaEquals(long dislipemia) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'DIABETES = :diabetes'.
	 */
	public ArrPacienteHclin[] findWhereDiabetesEquals(long diabetes) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'TABAQUISMO = :tabaquismo'.
	 */
	public ArrPacienteHclin[] findWhereTabaquismoEquals(long tabaquismo) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'ACV = :acv'.
	 */
	public ArrPacienteHclin[] findWhereAcvEquals(long acv) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'INSUF = :insuf'.
	 */
	public ArrPacienteHclin[] findWhereInsufEquals(long insuf) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'SAOS = :saos'.
	 */
	public ArrPacienteHclin[] findWhereSaosEquals(long saos) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'AFECTA = :afecta'.
	 */
	public ArrPacienteHclin[] findWhereAfectaEquals(long afecta) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'IDCARDIO = :idcardio'.
	 */
	public ArrPacienteHclin[] findWhereIdcardioEquals(long idcardio) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'IDISQUEMICA = :idisquemica'.
	 */
	public ArrPacienteHclin[] findWhereIdisquemicaEquals(long idisquemica) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'LOCALIZACION = :localizacion'.
	 */
	public ArrPacienteHclin[] findWhereLocalizacionEquals(String localizacion) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'CONGENITASTR = :congenitastr'.
	 */
	public ArrPacienteHclin[] findWhereCongenitastrEquals(String congenitastr) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'IDCIRCARDIA = :idcircardia'.
	 */
	public ArrPacienteHclin[] findWhereIdcircardiaEquals(long idcircardia) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the criteria 'OTRASSTR = :otrasstr'.
	 */
	public ArrPacienteHclin[] findWhereOtrasstrEquals(String otrasstr) throws ArrPacienteHclinDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the specified arbitrary SQL statement
	 */
	public ArrPacienteHclin[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrPacienteHclinDaoException;

	/** 
	 * Returns all rows from the ARR_PACIENTE_HCLIN table that match the specified arbitrary SQL statement
	 */
	public ArrPacienteHclin[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrPacienteHclinDaoException;

}
