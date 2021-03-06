/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the ARR_ESTUDIO_CATETER table.
 */
public class ArrEstudioCateterPk implements Serializable
{
	protected Integer idenfermeria;

	

	public Integer getIdenfermeria() {
		return idenfermeria;
	}

	public void setIdenfermeria(Integer idenfermeria) {
		this.idenfermeria = idenfermeria;
	}

	/**
	 * Method 'ArrEstudioCateterPk'
	 * 
	 */
	public ArrEstudioCateterPk()
	{
	}

	/**
	 * Method 'ArrEstudioCateterPk'
	 * 
	 * @param idestudio
	 */
	public ArrEstudioCateterPk(final Integer idenfermeria)
	{
		this.idenfermeria = idenfermeria;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ArrEstudioCateterPk)) {
			return false;
		}
		
		final ArrEstudioCateterPk _cast = (ArrEstudioCateterPk) _other;
		if (idenfermeria == null ? _cast.idenfermeria != idenfermeria : !idenfermeria.equals( _cast.idenfermeria )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idenfermeria != null) {
			_hashCode = 29 * _hashCode + idenfermeria.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.ArrEstudioCateterPk: " );
		ret.append( "idenfermeria=" + idenfermeria );
		return ret.toString();
	}

}
