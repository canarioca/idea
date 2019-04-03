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
 * This class represents the primary key of the med_comercial table.
 */
public class MedComercialPk implements Serializable
{
	protected Integer idmedcom;

	/** 
	 * Sets the value of idmedcom
	 */
	public void setIdmedcom(Integer idmedcom)
	{
		this.idmedcom = idmedcom;
	}

	/** 
	 * Gets the value of idmedcom
	 */
	public Integer getIdmedcom()
	{
		return idmedcom;
	}

	/**
	 * Method 'MedComercialPk'
	 * 
	 */
	public MedComercialPk()
	{
	}

	/**
	 * Method 'MedComercialPk'
	 * 
	 * @param idmedcom
	 */
	public MedComercialPk(final Integer idmedcom)
	{
		this.idmedcom = idmedcom;
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
		
		if (!(_other instanceof MedComercialPk)) {
			return false;
		}
		
		final MedComercialPk _cast = (MedComercialPk) _other;
		if (idmedcom == null ? _cast.idmedcom != idmedcom : !idmedcom.equals( _cast.idmedcom )) {
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
		if (idmedcom != null) {
			_hashCode = 29 * _hashCode + idmedcom.hashCode();
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
		ret.append( "com.sorin.idea.dto.MedComercialPk: " );
		ret.append( "idmedcom=" + idmedcom );
		return ret.toString();
	}

}
