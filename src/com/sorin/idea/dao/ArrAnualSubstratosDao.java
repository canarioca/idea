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


public interface ArrAnualSubstratosDao
{
	/** 
	 * Inserts a new row in the ARR_ANUAL_SUBSTRATOS table.
	 */
	public ArrAnualSubstratosPk insert(ArrAnualSubstratos dto) throws ArrAnualSubstratosDaoException;

	/** 
	 * Updates a single row in the ARR_ANUAL_SUBSTRATOS table.
	 */
	public void update(ArrAnualSubstratosPk pk, ArrAnualSubstratos dto) throws ArrAnualSubstratosDaoException;

	/** 
	 * Deletes a single row in the ARR_ANUAL_SUBSTRATOS table.
	 */
	public void delete(ArrAnualSubstratosPk pk) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns the rows from the ARR_ANUAL_SUBSTRATOS table that matches the specified primary-key value.
	 */
	public ArrAnualSubstratos findByPrimaryKey(ArrAnualSubstratosPk pk) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'ANIO = :anio AND SUBSTRATO = :substrato'.
	 */
	public ArrAnualSubstratos findByPrimaryKey(Integer anio) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria ''.
	 */
	public ArrAnualSubstratos[] findAll() throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'ANIO = :anio'.
	 */
	public ArrAnualSubstratos[] findWhereAnioEquals(long anio) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'SUBSTRATO = :substrato'.
	 */
	public ArrAnualSubstratos[] findWhereSubstratoEquals(long substrato) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO1 = :campo1'.
	 */
	public ArrAnualSubstratos[] findWhereCampo1Equals(String campo1) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO2 = :campo2'.
	 */
	public ArrAnualSubstratos[] findWhereCampo2Equals(String campo2) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO3 = :campo3'.
	 */
	public ArrAnualSubstratos[] findWhereCampo3Equals(String campo3) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO4 = :campo4'.
	 */
	public ArrAnualSubstratos[] findWhereCampo4Equals(String campo4) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO5 = :campo5'.
	 */
	public ArrAnualSubstratos[] findWhereCampo5Equals(String campo5) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO6 = :campo6'.
	 */
	public ArrAnualSubstratos[] findWhereCampo6Equals(String campo6) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO7 = :campo7'.
	 */
	public ArrAnualSubstratos[] findWhereCampo7Equals(String campo7) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO8 = :campo8'.
	 */
	public ArrAnualSubstratos[] findWhereCampo8Equals(String campo8) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO9 = :campo9'.
	 */
	public ArrAnualSubstratos[] findWhereCampo9Equals(String campo9) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO10 = :campo10'.
	 */
	public ArrAnualSubstratos[] findWhereCampo10Equals(String campo10) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO11 = :campo11'.
	 */
	public ArrAnualSubstratos[] findWhereCampo11Equals(String campo11) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO12 = :campo12'.
	 */
	public ArrAnualSubstratos[] findWhereCampo12Equals(String campo12) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO13 = :campo13'.
	 */
	public ArrAnualSubstratos[] findWhereCampo13Equals(String campo13) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO14 = :campo14'.
	 */
	public ArrAnualSubstratos[] findWhereCampo14Equals(String campo14) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO15 = :campo15'.
	 */
	public ArrAnualSubstratos[] findWhereCampo15Equals(String campo15) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO16 = :campo16'.
	 */
	public ArrAnualSubstratos[] findWhereCampo16Equals(String campo16) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO17 = :campo17'.
	 */
	public ArrAnualSubstratos[] findWhereCampo17Equals(String campo17) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO18 = :campo18'.
	 */
	public ArrAnualSubstratos[] findWhereCampo18Equals(String campo18) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO19 = :campo19'.
	 */
	public ArrAnualSubstratos[] findWhereCampo19Equals(String campo19) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO20 = :campo20'.
	 */
	public ArrAnualSubstratos[] findWhereCampo20Equals(String campo20) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO21 = :campo21'.
	 */
	public ArrAnualSubstratos[] findWhereCampo21Equals(String campo21) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO22 = :campo22'.
	 */
	public ArrAnualSubstratos[] findWhereCampo22Equals(String campo22) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO23 = :campo23'.
	 */
	public ArrAnualSubstratos[] findWhereCampo23Equals(String campo23) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO24 = :campo24'.
	 */
	public ArrAnualSubstratos[] findWhereCampo24Equals(String campo24) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO25 = :campo25'.
	 */
	public ArrAnualSubstratos[] findWhereCampo25Equals(String campo25) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO26 = :campo26'.
	 */
	public ArrAnualSubstratos[] findWhereCampo26Equals(String campo26) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO27 = :campo27'.
	 */
	public ArrAnualSubstratos[] findWhereCampo27Equals(String campo27) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO28 = :campo28'.
	 */
	public ArrAnualSubstratos[] findWhereCampo28Equals(String campo28) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO29 = :campo29'.
	 */
	public ArrAnualSubstratos[] findWhereCampo29Equals(String campo29) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO30 = :campo30'.
	 */
	public ArrAnualSubstratos[] findWhereCampo30Equals(String campo30) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO31 = :campo31'.
	 */
	public ArrAnualSubstratos[] findWhereCampo31Equals(String campo31) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO32 = :campo32'.
	 */
	public ArrAnualSubstratos[] findWhereCampo32Equals(String campo32) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO33 = :campo33'.
	 */
	public ArrAnualSubstratos[] findWhereCampo33Equals(String campo33) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the criteria 'CAMPO34 = :campo34'.
	 */
	public ArrAnualSubstratos[] findWhereCampo34Equals(String campo34) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO35 = :campo35'.
	 */
	public ArrAnualSubstratos[] findWhereCampo35Equals(String campo35) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO36 = :campo36'.
	 */
	public ArrAnualSubstratos[] findWhereCampo36Equals(String campo36) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO37 = :campo37'.
	 */
	public ArrAnualSubstratos[] findWhereCampo37Equals(String campo37) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO38 = :campo38'.
	 */
	public ArrAnualSubstratos[] findWhereCampo38Equals(String campo38) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO39 = :campo39'.
	 */
	public ArrAnualSubstratos[] findWhereCampo39Equals(String campo39) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO40 = :campo40'.
	 */
	public ArrAnualSubstratos[] findWhereCampo40Equals(String campo40) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO41 = :campo41'.
	 */
	public ArrAnualSubstratos[] findWhereCampo41Equals(String campo41) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO42 = :campo42'.
	 */
	public ArrAnualSubstratos[] findWhereCampo42Equals(String campo42) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO43 = :campo43'.
	 */
	public ArrAnualSubstratos[] findWhereCampo43Equals(String campo43) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO44 = :campo44'.
	 */
	public ArrAnualSubstratos[] findWhereCampo44Equals(String campo44) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO45 = :campo45'.
	 */
	public ArrAnualSubstratos[] findWhereCampo45Equals(String campo45) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO46 = :campo46'.
	 */
	public ArrAnualSubstratos[] findWhereCampo46Equals(String campo46) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO47 = :campo47'.
	 */
	public ArrAnualSubstratos[] findWhereCampo47Equals(String campo47) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO48 = :campo48'.
	 */
	public ArrAnualSubstratos[] findWhereCampo48Equals(String campo48) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO49 = :campo49'.
	 */
	public ArrAnualSubstratos[] findWhereCampo49Equals(String campo49) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the arr_anual_substratos table that match the criteria 'CAMPO50 = :campo50'.
	 */
	public ArrAnualSubstratos[] findWhereCampo50Equals(String campo50) throws ArrAnualSubstratosDaoException;
	
	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the specified arbitrary SQL statement
	 */
	public ArrAnualSubstratos[] findByDynamicSelect(String sql, Object[] sqlParams) throws ArrAnualSubstratosDaoException;

	/** 
	 * Returns all rows from the ARR_ANUAL_SUBSTRATOS table that match the specified arbitrary SQL statement
	 */
	public ArrAnualSubstratos[] findByDynamicWhere(String sql, Object[] sqlParams) throws ArrAnualSubstratosDaoException;

}