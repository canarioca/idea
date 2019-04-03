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

public interface ElectrodosDao
{
	/** 
	 * Inserts a new row in the electrodos table.
	 */
	public ElectrodosPk insert(Electrodos dto) throws ElectrodosDaoException;

	/** 
	 * Updates a single row in the electrodos table.
	 */
	public void update(ElectrodosPk pk, Electrodos dto) throws ElectrodosDaoException;

	/** 
	 * Deletes a single row in the electrodos table.
	 */
	public void delete(ElectrodosPk pk) throws ElectrodosDaoException;

	/** 
	 * Returns the rows from the electrodos table that matches the specified primary-key value.
	 */
	public Electrodos findByPrimaryKey(ElectrodosPk pk) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'IDELECTRODO = :idelectrodo'.
	 */
	public Electrodos findByPrimaryKey(Integer idelectrodo) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria ''.
	 */
	public Electrodos[] findAll() throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'IDELECTRODO = :idelectrodo'.
	 */
	public Electrodos[] findWhereIdelectrodoEquals(int idelectrodo) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'MODELO = :modelo'.
	 */
	public Electrodos[] findWhereModeloEquals(String modelo) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'FABRICANTE = :fabricante'.
	 */
	public Electrodos[] findWhereFabricanteEquals(String fabricante) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'POLARIDAD = :polaridad'.
	 */
	public Electrodos[] findWherePolaridadEquals(String polaridad) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'FIJACION = :fijacion'.
	 */
	public Electrodos[] findWhereFijacionEquals(String fijacion) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'BOBINA = :bobina'.
	 */
	public Electrodos[] findWhereBobinaEquals(String bobina) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'CONECTOR = :conector'.
	 */
	public Electrodos[] findWhereConectorEquals(String conector) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'CODIGO = :codigo'.
	 */
	public Electrodos[] findWhereCodigoEquals(String codigo) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'NUMEROMODELO = :numeromodelo'.
	 */
	public Electrodos[] findWhereNumeromodeloEquals(String numeromodelo) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'GS128 = :gs128'.
	 */
	public Electrodos[] findWhereGs128Equals(String gs128) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the criteria 'ACTIVO = :activo'.
	 */
	public Electrodos[] findWhereActivoEquals(int activo) throws ElectrodosDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the electrodos table that match the specified arbitrary SQL statement
	 */
	public Electrodos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ElectrodosDaoException;

	/** 
	 * Returns all rows from the electrodos table that match the specified arbitrary SQL statement
	 */
	public Electrodos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ElectrodosDaoException;

}
