/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dao;

import java.util.ArrayList;

import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;


public interface ArrEstudioViasDao
{
	/** 
	 * Inserts a new row in the ARR_ESTUDIO_VIAS table.
	 */
	public ArrEstudioViasPk insert(ArrEstudioVias dto) throws ArrEstudioViasDaoException;

	/** 
	 * Updates a single row in the ARR_ESTUDIO_VIAS table.
	 */
	public void update(ArrEstudioViasPk pk, ArrEstudioVias dto) throws ArrEstudioViasDaoException;

	/** 
	 * Deletes a single row in the ARR_ESTUDIO_VIAS table.
	 */
	public void delete(ArrEstudioViasPk pk) throws ArrEstudioViasDaoException;

	/** 
	 * Returns the rows from the ARR_ESTUDIO_VIAS table that matches the specified primary-key value.
	 */
	public ArrEstudioVias findByPrimaryKey(ArrEstudioViasPk pk) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioVias findByPrimaryKey(Integer idestudio) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria ''.
	 */
	public ArrEstudioVias[] findAll() throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioVias[] findWhereIdestudioEquals(long idestudio) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'IDVIA = :idvia'.
	 */
	public ArrEstudioVias[] findWhereIdviaEquals(long idvia) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'IDSENTIDO = :idsentido'.
	 */
	public ArrEstudioVias[] findWhereIdsentidoEquals(long idsentido) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'IDTIPO = :idtipo'.
	 */
	public ArrEstudioVias[] findWhereIdtipoEquals(long idtipo) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'CA = :ca'.
	 */
	public ArrEstudioVias[] findWhereCaEquals(String ca) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'CR = :cr'.
	 */
	public ArrEstudioVias[] findWhereCrEquals(String cr) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the criteria 'RR = :rr'.
	 */
	public ArrEstudioVias[] findWhereRrEquals(String rr) throws ArrEstudioViasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioVias[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioViasDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_VIAS table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioVias[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioViasDaoException;
	
	public ArrayList<ArrayList<Object>> getEstadisticas(String nhcs, String eefs) throws ArrEstudioViasDaoException;	

}
