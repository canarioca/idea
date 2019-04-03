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

public interface ArrEstudioAnestDao
{
	/** 
	 * Inserts a new row in the arr_estudio_anest table.
	 */
	public ArrEstudioAnestPk insert(ArrEstudioAnest dto) throws ArrEstudioAnestDaoException;

	/** 
	 * Updates a single row in the arr_estudio_anest table.
	 */
	public void update(ArrEstudioAnestPk pk, ArrEstudioAnest dto) throws ArrEstudioAnestDaoException;

	/** 
	 * Deletes a single row in the arr_estudio_anest table.
	 */
	public void delete(ArrEstudioAnestPk pk) throws ArrEstudioAnestDaoException;

	/** 
	 * Returns the rows from the arr_estudio_anest table that matches the specified primary-key value.
	 */
	public ArrEstudioAnest findByPrimaryKey(ArrEstudioAnestPk pk) throws ArrEstudioAnestDaoException;

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the criteria 'IDESTUDIO = :idestudio AND IDANESTESISTA = :idanestesista'.
	 */
	public ArrEstudioAnest findByPrimaryKey(Integer idestudio, String idanestesista) throws ArrEstudioAnestDaoException;

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the criteria ''.
	 */
	public ArrEstudioAnest[] findAll() throws ArrEstudioAnestDaoException;

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioAnest[] findWhereIdestudioEquals(int idestudio) throws ArrEstudioAnestDaoException;

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the criteria 'IDANESTESISTA = :idanestesista'.
	 */
	public ArrEstudioAnest[] findWhereIdanestesistaEquals(String idanestesista) throws ArrEstudioAnestDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioAnest[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioAnestDaoException;

	/** 
	 * Returns all rows from the arr_estudio_anest table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioAnest[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioAnestDaoException;

}
