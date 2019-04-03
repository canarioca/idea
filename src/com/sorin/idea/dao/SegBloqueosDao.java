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


public interface SegBloqueosDao
{
	/** 
	 * Inserts a new row in the seg_bloqueos table.
	 */
	public SegBloqueosPk insert(SegBloqueos dto) throws SegBloqueosDaoException;

	/** 
	 * Updates a single row in the seg_bloqueos table.
	 */
	public void update(SegBloqueosPk pk, SegBloqueos dto) throws SegBloqueosDaoException;

	/** 
	 * Deletes a single row in the seg_bloqueos table.
	 */
	public void delete(SegBloqueosPk pk) throws SegBloqueosDaoException;

	/** 
	 * Returns the rows from the seg_bloqueos table that matches the specified primary-key value.
	 */
	public SegBloqueos findByPrimaryKey(SegBloqueosPk pk) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria 'IDBLOQUEO = :idbloqueo'.
	 */
	public SegBloqueos findByPrimaryKey(Integer idbloqueo) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria ''.
	 */
	public SegBloqueos[] findAll() throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria 'IDBLOQUEO = :idbloqueo'.
	 */
	public SegBloqueos[] findWhereIdbloqueoEquals(int idbloqueo) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria 'BAV1 = :bav1'.
	 */
	public SegBloqueos[] findWhereBav1Equals(String bav1) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria 'BAV2 = :bav2'.
	 */
	public SegBloqueos[] findWhereBav2Equals(String bav2) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the criteria 'BAV3 = :bav3'.
	 */
	public SegBloqueos[] findWhereBav3Equals(String bav3) throws SegBloqueosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the seg_bloqueos table that match the specified arbitrary SQL statement
	 */
	public SegBloqueos[] findByDynamicSelect(String sql, Object[] sqlParams) throws SegBloqueosDaoException;

	/** 
	 * Returns all rows from the seg_bloqueos table that match the specified arbitrary SQL statement
	 */
	public SegBloqueos[] findByDynamicWhere(String sql, Object[] sqlParams) throws SegBloqueosDaoException;

}
