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

public interface IntElectrodosDao
{
	/** 
	 * Inserts a new row in the int_electrodos table.
	 */
	public IntElectrodosPk insert(IntElectrodos dto) throws IntElectrodosDaoException;

	/** 
	 * Updates a single row in the int_electrodos table.
	 */
	public void update(IntElectrodosPk pk, IntElectrodos dto) throws IntElectrodosDaoException;

	/** 
	 * Deletes a single row in the int_electrodos table.
	 */
	public void delete(IntElectrodosPk pk) throws IntElectrodosDaoException;

	/** 
	 * Returns the rows from the int_electrodos table that matches the specified primary-key value.
	 */
	public IntElectrodos findByPrimaryKey(IntElectrodosPk pk) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'IDINTEGRACION = :idintegracion AND MODELO = :modelo AND NSERIE = :nserie'.
	 */
	public IntElectrodos findByPrimaryKey(Integer idintegracion, String modelo, String nserie) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria ''.
	 */
	public IntElectrodos[] findAll() throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'IDINTEGRACION = :idintegracion'.
	 */
	public IntElectrodos[] findWhereIdintegracionEquals(int idintegracion) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'MODELO = :modelo'.
	 */
	public IntElectrodos[] findWhereModeloEquals(String modelo) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'NSERIE = :nserie'.
	 */
	public IntElectrodos[] findWhereNserieEquals(String nserie) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'FABRICANTE = :fabricante'.
	 */
	public IntElectrodos[] findWhereFabricanteEquals(String fabricante) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'CAMARA = :camara'.
	 */
	public IntElectrodos[] findWhereCamaraEquals(int camara) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'ZONA = :zona'.
	 */
	public IntElectrodos[] findWhereZonaEquals(int zona) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'ESTADO = :estado'.
	 */
	public IntElectrodos[] findWhereEstadoEquals(int estado) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the criteria 'FECHAIMPLANTE = :fechaimplante'.
	 */
	public IntElectrodos[] findWhereFechaimplanteEquals(Date fechaimplante) throws IntElectrodosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the int_electrodos table that match the specified arbitrary SQL statement
	 */
	public IntElectrodos[] findByDynamicSelect(String sql, Object[] sqlParams) throws IntElectrodosDaoException;

	/** 
	 * Returns all rows from the int_electrodos table that match the specified arbitrary SQL statement
	 */
	public IntElectrodos[] findByDynamicWhere(String sql, Object[] sqlParams) throws IntElectrodosDaoException;

}