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


public interface ArrEstudioTaquiDao
{
	/** 
	 * Inserts a new row in the ARR_ESTUDIO_TAQUI table.
	 */
	public ArrEstudioTaquiPk insert(ArrEstudioTaqui dto) throws ArrEstudioTaquiDaoException;

	/** 
	 * Updates a single row in the ARR_ESTUDIO_TAQUI table.
	 */
	public void update(ArrEstudioTaquiPk pk, ArrEstudioTaqui dto) throws ArrEstudioTaquiDaoException;

	/** 
	 * Deletes a single row in the ARR_ESTUDIO_TAQUI table.
	 */
	public void delete(ArrEstudioTaquiPk pk) throws ArrEstudioTaquiDaoException;
	public void delete(Integer idestudio) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns the rows from the ARR_ESTUDIO_TAQUI table that matches the specified primary-key value.
	 */
	public ArrEstudioTaqui findByPrimaryKey(ArrEstudioTaquiPk pk) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDESTUDIO = :idestudio AND IDTAQUI = :idtaqui'.
	 */
	public ArrEstudioTaqui findByPrimaryKey(Integer idestudio, Integer idtaqui) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria ''.
	 */
	public ArrEstudioTaqui[] findAll() throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDESTUDIO = :idestudio'.
	 */
	public ArrEstudioTaqui[] findWhereIdestudioEquals(long idestudio) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDTAQUI = :idtaqui'.
	 */
	public ArrEstudioTaqui[] findWhereIdtaquiEquals(long idtaqui) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'NUMTAQUI = :numtaqui'.
	 */
	public ArrEstudioTaqui[] findWhereNumtaquiEquals(long numtaqui) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'INDUCCION = :induccion'.
	 */
	public ArrEstudioTaqui[] findWhereInduccionEquals(long induccion) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'TAQUIINDU = :taquiindu'.
	 */
	public ArrEstudioTaqui[] findWhereTaquiinduEquals(long taquiindu) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'NUMNOCLIN = :numnoclin'.
	 */
	public ArrEstudioTaqui[] findWhereNumnoclinEquals(String numnoclin) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'COMPORTAMIENTO = :comportamiento'.
	 */
	public ArrEstudioTaqui[] findWhereComportamientoEquals(long comportamiento) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDN1 = :idn1'.
	 */
	public ArrEstudioTaqui[] findWhereIdn1Equals(long idn1) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDN2 = :idn2'.
	 */
	public ArrEstudioTaqui[] findWhereIdn2Equals(long idn2) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'IDN3 = :idn3'.
	 */
	public ArrEstudioTaqui[] findWhereIdn3Equals(long idn3) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'PUNTOEST = :puntoest'.
	 */
	public ArrEstudioTaqui[] findWherePuntoestEquals(long puntoest) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'MODOIND = :modoind'.
	 */
	public ArrEstudioTaqui[] findWhereModoindEquals(long modoind) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'PROTOCOLO = :protocolo'.
	 */
	public ArrEstudioTaqui[] findWhereProtocoloEquals(long protocolo) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'LCTREN = :lctren'.
	 */
	public ArrEstudioTaqui[] findWhereLctrenEquals(String lctren) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'NEXTRA = :nextra'.
	 */
	public ArrEstudioTaqui[] findWhereNextraEquals(String nextra) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'AAVV = :aavv'.
	 */
	public ArrEstudioTaqui[] findWhereAavvEquals(long aavv) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'FARMACOS = :farmacos'.
	 */
	public ArrEstudioTaqui[] findWhereFarmacosEquals(String farmacos) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the criteria 'COMENTARIOS = :comentarios'.
	 */
	public ArrEstudioTaqui[] findWhereComentariosEquals(String comentarios) throws ArrEstudioTaquiDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioTaqui[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrEstudioTaquiDaoException;

	/** 
	 * Returns all rows from the ARR_ESTUDIO_TAQUI table that match the specified arbitrary SQL statement
	 */
	public ArrEstudioTaqui[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrEstudioTaquiDaoException;

	public ArrayList<ArrayList<Object>> getEstadisticas(String nhcs, String eefs) throws ArrEstudioTaquiDaoException;
}
