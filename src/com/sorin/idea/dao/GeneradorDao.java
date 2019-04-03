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

public interface GeneradorDao
{
	/** 
	 * Inserts a new row in the generador table.
	 */
	public GeneradorPk insert(Generador dto) throws GeneradorDaoException;

	/** 
	 * Updates a single row in the generador table.
	 */
	public void update(GeneradorPk pk, Generador dto) throws GeneradorDaoException;

	/** 
	 * Deletes a single row in the generador table.
	 */
	public void delete(GeneradorPk pk) throws GeneradorDaoException;

	/** 
	 * Returns the rows from the generador table that matches the specified primary-key value.
	 */
	public Generador findByPrimaryKey(GeneradorPk pk) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'IDGENERADOR = :idgenerador'.
	 */
	public Generador findByPrimaryKey(Integer idgenerador) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria ''.
	 */
	public Generador[] findAll() throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'IDGENERADOR = :idgenerador'.
	 */
	public Generador[] findWhereIdgeneradorEquals(int idgenerador) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'MODELO = :modelo'.
	 */
	public Generador[] findWhereModeloEquals(String modelo) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'FABRICANTE = :fabricante'.
	 */
	public Generador[] findWhereFabricanteEquals(String fabricante) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'TIPO = :tipo'.
	 */
	public Generador[] findWhereTipoEquals(String tipo) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'MODO = :modo'.
	 */
	public Generador[] findWhereModoEquals(String modo) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CONECTORAD = :conectorad'.
	 */
	public Generador[] findWhereConectoradEquals(String conectorad) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CONECTORVD = :conectorvd'.
	 */
	public Generador[] findWhereConectorvdEquals(String conectorvd) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CONECTORVI = :conectorvi'.
	 */
	public Generador[] findWhereConectorviEquals(String conectorvi) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'RF = :rf'.
	 */
	public Generador[] findWhereRfEquals(short rf) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'MRI = :mri'.
	 */
	public Generador[] findWhereMriEquals(short mri) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CODIGO = :codigo'.
	 */
	public Generador[] findWhereCodigoEquals(String codigo) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CONECTOR_VD2 = :conectorVd2'.
	 */
	public Generador[] findWhereConectorVd2Equals(String conectorVd2) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'CONECTORVCS = :conectorvcs'.
	 */
	public Generador[] findWhereConectorvcsEquals(String conectorvcs) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'NUMEROMODELO = :numeromodelo'.
	 */
	public Generador[] findWhereNumeromodeloEquals(String numeromodelo) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'GS128 = :gs128'.
	 */
	public Generador[] findWhereGs128Equals(String gs128) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'IDRX = :idrx'.
	 */
	public Generador[] findWhereIdrxEquals(String idrx) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the criteria 'ACTIVO = :activo'.
	 */
	public Generador[] findWhereActivoEquals(int activo) throws GeneradorDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the generador table that match the specified arbitrary SQL statement
	 */
	public Generador[] findByDynamicSelect(String sql, Object[] sqlParams) throws GeneradorDaoException;

	/** 
	 * Returns all rows from the generador table that match the specified arbitrary SQL statement
	 */
	public Generador[] findByDynamicWhere(String sql, Object[] sqlParams) throws GeneradorDaoException;

	public ArrayList<ArrayList<Object>> getGeneradorProcedimiento(int id) throws GeneradorDaoException;
}
