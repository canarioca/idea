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
 * This class represents the primary key of the prot_sincope table.
 */
public class ProtSincopePk implements Serializable
{
	protected Integer idprotsincope;

	/** 
	 * Sets the value of idprotsincope
	 */
	public void setIdprotsincope(Integer idprotsincope)
	{
		this.idprotsincope = idprotsincope;
	}

	/** 
	 * Gets the value of idprotsincope
	 */
	public Integer getIdprotsincope()
	{
		return idprotsincope;
	}

	/**
	 * Method 'ProtSincopePk'
	 * 
	 */
	public ProtSincopePk()
	{
	}

	/**
	 * Method 'ProtSincopePk'
	 * 
	 * @param idprotsincope
	 */
	public ProtSincopePk(final Integer idprotsincope)
	{
		this.idprotsincope = idprotsincope;
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
		
		if (!(_other instanceof ProtSincopePk)) {
			return false;
		}
		
		final ProtSincopePk _cast = (ProtSincopePk) _other;
		if (idprotsincope == null ? _cast.idprotsincope != idprotsincope : !idprotsincope.equals( _cast.idprotsincope )) {
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
		if (idprotsincope != null) {
			_hashCode = 29 * _hashCode + idprotsincope.hashCode();
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
		ret.append( "com.sorin.idea.dto.ProtSincopePk: " );
		ret.append( "idprotsincope=" + idprotsincope );
		return ret.toString();
	}

}