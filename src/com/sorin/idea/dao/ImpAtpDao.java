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


public interface ImpAtpDao
{
	/** 
	 * Inserts a new row in the imp_atp table.
	 */
	public ImpAtpPk insert(ImpAtp dto) throws ImpAtpDaoException;

	/** 
	 * Updates a single row in the imp_atp table.
	 */
	public void update(ImpAtpPk pk, ImpAtp dto) throws ImpAtpDaoException;

	/** 
	 * Deletes a single row in the imp_atp table.
	 */
	public void delete(ImpAtpPk pk) throws ImpAtpDaoException;

	/** 
	 * Returns the rows from the imp_atp table that matches the specified primary-key value.
	 */
	public ImpAtp findByPrimaryKey(ImpAtpPk pk) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'IDATP = :idatp'.
	 */
	public ImpAtp findByPrimaryKey(Integer idatp) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria ''.
	 */
	public ImpAtp[] findAll() throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'IDZONA = :idzona'.
	 */
	public ImpAtp[] findByImpZona(int idzona) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'IDATP = :idatp'.
	 */
	public ImpAtp[] findWhereIdatpEquals(int idatp) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'IDZONA = :idzona'.
	 */
	public ImpAtp[] findWhereIdzonaEquals(int idzona) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'TIPO = :tipo'.
	 */
	public ImpAtp[] findWhereTipoEquals(String tipo) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'NUMSEC = :numsec'.
	 */
	public ImpAtp[] findWhereNumsecEquals(String numsec) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'CICLOSEC = :ciclosec'.
	 */
	public ImpAtp[] findWhereCiclosecEquals(String ciclosec) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'ACOPLAMIENTO = :acoplamiento'.
	 */
	public ImpAtp[] findWhereAcoplamientoEquals(String acoplamiento) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the criteria 'DECREMENTO = :decremento'.
	 */
	public ImpAtp[] findWhereDecrementoEquals(String decremento) throws ImpAtpDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the imp_atp table that match the specified arbitrary SQL statement
	 */
	public ImpAtp[] findByDynamicSelect(String sql, Object[] sqlParams) throws ImpAtpDaoException;

	/** 
	 * Returns all rows from the imp_atp table that match the specified arbitrary SQL statement
	 */
	public ImpAtp[] findByDynamicWhere(String sql, Object[] sqlParams) throws ImpAtpDaoException;

}