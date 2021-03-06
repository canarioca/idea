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


public interface ArrTestFleEcgDao
{
	/** 
	 * Inserts a new row in the ARR_TEST_FLE_ECG table.
	 */
	public ArrTestFleEcgPk insert(ArrTestFleEcg dto) throws ArrTestFleEcgDaoException;

	/** 
	 * Updates a single row in the ARR_TEST_FLE_ECG table.
	 */
	public void update(ArrTestFleEcgPk pk, ArrTestFleEcg dto) throws ArrTestFleEcgDaoException;

	/** 
	 * Deletes a single row in the ARR_TEST_FLE_ECG table.
	 */
	public void delete(ArrTestFleEcgPk pk) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns the rows from the ARR_TEST_FLE_ECG table that matches the specified primary-key value.
	 */
	public ArrTestFleEcg findByPrimaryKey(ArrTestFleEcgPk pk) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDTEST = :idtest'.
	 */
	public ArrTestFleEcg findByPrimaryKey(Integer idtest) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria ''.
	 */
	public ArrTestFleEcg[] findAll() throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDTEST = :idtest'.
	 */
	public ArrTestFleEcg[] findWhereIdtestEquals(long idtest) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDRITMO = :idritmo'.
	 */
	public ArrTestFleEcg[] findWhereIdritmoEquals(long idritmo) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDCONDUCCION = :idconduccion'.
	 */
	public ArrTestFleEcg[] findWhereIdconduccionEquals(long idconduccion) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDCONDUCCIONNO = :idconduccionno'.
	 */
	public ArrTestFleEcg[] findWhereIdconduccionnoEquals(long idconduccionno) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDQRS = :idqrs'.
	 */
	public ArrTestFleEcg[] findWhereIdqrsEquals(long idqrs) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'IDQRSNO = :idqrsno'.
	 */
	public ArrTestFleEcg[] findWhereIdqrsnoEquals(long idqrsno) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'MORFOLOGIA = :morfologia'.
	 */
	public ArrTestFleEcg[] findWhereMorfologiaEquals(String morfologia) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ArrTestFleEcg[] findWhereComentariosEquals(String comentarios) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'RR = :rr'.
	 */
	public ArrTestFleEcg[] findWhereRrEquals(String rr) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'PR = :pr'.
	 */
	public ArrTestFleEcg[] findWherePrEquals(String pr) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QRS = :qrs'.
	 */
	public ArrTestFleEcg[] findWhereQrsEquals(String qrs) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QT = :qt'.
	 */
	public ArrTestFleEcg[] findWhereQtEquals(String qt) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the criteria 'QTC = :qtc'.
	 */
	public ArrTestFleEcg[] findWhereQtcEquals(String qtc) throws ArrTestFleEcgDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the specified arbitrary SQL statement
	 */
	public ArrTestFleEcg[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrTestFleEcgDaoException;

	/** 
	 * Returns all rows from the ARR_TEST_FLE_ECG table that match the specified arbitrary SQL statement
	 */
	public ArrTestFleEcg[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrTestFleEcgDaoException;

}
