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


public interface ArrAnualCentroDao
{
	/** 
	 * Inserts a new row in the ARR_ANUAL_CENTRO table.
	 */
	public ArrAnualCentroPk insert(ArrAnualCentro dto) throws ArrAnualCentroDaoException;

	/** 
	 * Updates a single row in the ARR_ANUAL_CENTRO table.
	 */
	public void update(ArrAnualCentroPk pk, ArrAnualCentro dto) throws ArrAnualCentroDaoException;

	/** 
	 * Deletes a single row in the ARR_ANUAL_CENTRO table.
	 */
	public void delete(ArrAnualCentroPk pk) throws ArrAnualCentroDaoException;

	/** 
	 * Returns the rows from the ARR_ANUAL_CENTRO table that matches the specified primary-key value.
	 */
	public ArrAnualCentro findByPrimaryKey(ArrAnualCentroPk pk) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'ANIO = :anio'.
	 */
	public ArrAnualCentro findByPrimaryKey(Integer anio) throws ArrAnualCentroDaoException;
	public ArrAnualCentro findByMaxAnio() throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria ''.
	 */
	public ArrAnualCentro[] findAll() throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'ANIO = :anio'.
	 */
	public ArrAnualCentro[] findWhereAnioEquals(long anio) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'HOSPITAL = :hospital'.
	 */
	public ArrAnualCentro[] findWhereHospitalEquals(String hospital) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'CODCENTRO = :codcentro'.
	 */
	public ArrAnualCentro[] findWhereCodcentroEquals(String codcentro) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'DIRECCION = :direccion'.
	 */
	public ArrAnualCentro[] findWhereDireccionEquals(String direccion) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'PROVINCIA = :provincia'.
	 */
	public ArrAnualCentro[] findWhereProvinciaEquals(String provincia) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'CP = :cp'.
	 */
	public ArrAnualCentro[] findWhereCpEquals(String cp) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'COMUNIDAD = :comunidad'.
	 */
	public ArrAnualCentro[] findWhereComunidadEquals(String comunidad) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'TELEFONO = :telefono'.
	 */
	public ArrAnualCentro[] findWhereTelefonoEquals(String telefono) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'EXT = :ext'.
	 */
	public ArrAnualCentro[] findWhereExtEquals(String ext) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'FAX = :fax'.
	 */
	public ArrAnualCentro[] findWhereFaxEquals(String fax) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'RESPONSABLE = :responsable'.
	 */
	public ArrAnualCentro[] findWhereResponsableEquals(String responsable) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'TELCONTACTO = :telcontacto'.
	 */
	public ArrAnualCentro[] findWhereTelcontactoEquals(String telcontacto) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'EMAILCONTACTO = :emailcontacto'.
	 */
	public ArrAnualCentro[] findWhereEmailcontactoEquals(String emailcontacto) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'IDTIPOHOSPI1 = :idtipohospi1'.
	 */
	public ArrAnualCentro[] findWhereIdtipohospi1Equals(long idtipohospi1) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'IDTIPOHOSPI2 = :idtipohospi2'.
	 */
	public ArrAnualCentro[] findWhereIdtipohospi2Equals(long idtipohospi2) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'IDSERVICIO = :idservicio'.
	 */
	public ArrAnualCentro[] findWhereIdservicioEquals(long idservicio) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the criteria 'IDCIRUGIA = :idcirugia'.
	 */
	public ArrAnualCentro[] findWhereIdcirugiaEquals(long idcirugia) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the arr_anual_centro table that match the criteria 'POBLACION = :poblacion'.
	 */
	public ArrAnualCentro[] findWherePoblacionEquals(String poblacion) throws ArrAnualCentroDaoException;
	
	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the specified arbitrary SQL statement
	 */
	public ArrAnualCentro[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrAnualCentroDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_CENTRO table that match the specified arbitrary SQL statement
	 */
	public ArrAnualCentro[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrAnualCentroDaoException;

}
