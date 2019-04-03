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

public interface ArrEstudioCatUsoDao
{
	/** 
	 * Inserts a new row in the arr_estudio_cat_uso table.
	 */
	public ArrEstudioCatUsoPk insert(ArrEstudioCatUso dto) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Updates a single row in the arr_estudio_cat_uso table.
	 */
	public void update(ArrEstudioCatUsoPk pk, ArrEstudioCatUso dto) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Deletes a single row in the arr_estudio_cat_uso table.
	 */
	public void delete(ArrEstudioCatUsoPk pk) throws ArrEstudioCatUsoDaoException;
	public void delete(Integer idestudio) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns the rows from the arr_estudio_cat_uso table that matches the specified primary-key value.
	 */
	public ArrEstudioCatUso findByPrimaryKey(ArrEstudioCatUsoPk pk) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDCATUSO = :idcatuso'.
	 */
	public ArrEstudioCatUso findByPrimaryKey(Integer idcatuso) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria ''.
	 */
	public ArrEstudioCatUso[] findAll() throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDCATUSO = :idcatuso'.
	 */
	public ArrEstudioCatUso[] findWhereIdcatusoEquals(int idcatuso) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDCATETER = :idcateter'.
	 */
	public ArrEstudioCatUso[] findWhereIdcateterEquals(int idcateter) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDEEF = :ideef'.
	 */
	public ArrEstudioCatUso[] findWhereIdeefEquals(int ideef) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDVIA = :idvia'.
	 */
	public ArrEstudioCatUso[] findWhereIdviaEquals(int idvia) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDLOCALIZACION = :idlocalizacion'.
	 */
	public ArrEstudioCatUso[] findWhereIdlocalizacionEquals(int idlocalizacion) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'IDABLACION = :idablacion'.
	 */
	public ArrEstudioCatUso[] findWhereIdablacionEquals(int idablacion) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'TIEMPO = :tiempo'.
	 */
	public ArrEstudioCatUso[] findWhereTiempoEquals(String tiempo) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'REUTILIZADO = :reutilizado'.
	 */
	public ArrEstudioCatUso[] findWhereReutilizadoEquals(int reutilizado) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'DEFECTUOSO = :defectuoso'.
	 */
	public ArrEstudioCatUso[] findWhereDefectuosoEquals(int defectuoso) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the criteria 'LOTE = :lote'.
	 */
	public ArrEstudioCatUso[] findWhereLoteEquals(String lote) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioCatUso[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioCatUsoDaoException;

	/** 
	 * Returns all rows from the arr_estudio_cat_uso table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioCatUso[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioCatUsoDaoException;

}