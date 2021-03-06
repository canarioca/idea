/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dao;

import java.util.Date;
import com.sorin.idea.dto.*;
import com.sorin.idea.exceptions.*;

public interface IntPendientesDao
{
	/** 
	 * Inserts a new row in the int_pendientes table.
	 */
	public IntPendientesPk insert(IntPendientes dto) throws IntPendientesDaoException;

	/** 
	 * Updates a single row in the int_pendientes table.
	 */
	public void update(IntPendientesPk pk, IntPendientes dto) throws IntPendientesDaoException;

	/** 
	 * Deletes a single row in the int_pendientes table.
	 */
	public void delete(IntPendientesPk pk) throws IntPendientesDaoException;

	/** 
	 * Returns the rows from the int_pendientes table that matches the specified primary-key value.
	 */
	public IntPendientes findByPrimaryKey(IntPendientesPk pk) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria 'IDINTEGRACION = :idintegracion'.
	 */
	public IntPendientes findByPrimaryKey(Integer idintegracion) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria ''.
	 */
	public IntPendientes[] findAll() throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria 'IDINTEGRACION = :idintegracion'.
	 */
	public IntPendientes[] findWhereIdintegracionEquals(int idintegracion) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria 'FECHARX = :fecharx'.
	 */
	public IntPendientes[] findWhereFecharxEquals(Date fecharx) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria 'ESTADO = :estado'.
	 */
	public IntPendientes[] findWhereEstadoEquals(int estado) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the criteria 'FECHAMOD = :fechamod'.
	 */
	public IntPendientes[] findWhereFechamodEquals(Date fechamod) throws IntPendientesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the int_pendientes table that match the specified arbitrary SQL statement
	 */
	public IntPendientes[] findByDynamicSelect(String sql, Object[] sqlParams) throws IntPendientesDaoException;

	/** 
	 * Returns all rows from the int_pendientes table that match the specified arbitrary SQL statement
	 */
	public IntPendientes[] findByDynamicWhere(String sql, Object[] sqlParams) throws IntPendientesDaoException;

}
