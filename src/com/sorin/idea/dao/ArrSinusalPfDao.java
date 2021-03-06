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


public interface ArrSinusalPfDao
{
	/** 
	 * Inserts a new row in the ARR_CONDUC_PF table.
	 */
	public ArrSinusalPfPk insert(ArrSinusalPf dto) throws ArrSinusalPfDaoException;

	/** 
	 * Updates a single row in the ARR_CONDUC_PF table.
	 */
	public void update(ArrSinusalPfPk pk, ArrSinusalPf dto) throws ArrSinusalPfDaoException;

	/** 
	 * Deletes a single row in the ARR_CONDUC_PF table.
	 */
	public void delete(ArrSinusalPfPk pk) throws ArrSinusalPfDaoException;

	/** 
	 * Returns the rows from the ARR_CONDUC_PF table that matches the specified primary-key value.
	 */
	public ArrSinusalPf findByPrimaryKey(ArrSinusalPfPk pk) throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the criteria 'IDCONDUCCAV = :idconduccav AND IDPRUEBA = :idprueba'.
	 */
	public ArrSinusalPf findByPrimaryKey(Integer idconduccav) throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the criteria ''.
	 */
	public ArrSinusalPf[] findAll() throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the criteria 'IDCONDUCCAV = :idconduccav'.
	 */
	public ArrSinusalPf[] findWhereIdfuncionEquals(long idconduccav) throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the criteria 'PRUEBA = :prueba'.
	 */
	public ArrSinusalPf[] findWherePruebaEquals(long prueba) throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the criteria 'RESULTADO = :resultado'.
	 */
	public ArrSinusalPf[] findWhereResultadoEquals(String resultado) throws ArrSinusalPfDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the specified arbitrary SQL statement
	 */
	public ArrSinusalPf[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrSinusalPfDaoException;

	/** 
	 * Returns all rows from the ARR_CONDUC_PF table that match the specified arbitrary SQL statement
	 */
	public ArrSinusalPf[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrSinusalPfDaoException;

}
