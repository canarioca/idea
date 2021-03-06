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
 * This class represents the primary key of the imp_implante_electrodos table.
 */
public class ImpImplanteElectrodosPk implements Serializable
{
	protected Integer idimpelectrodos;

	/** 
	 * Sets the value of idimpelectrodos
	 */
	public void setIdimpelectrodos(Integer idimpelectrodos)
	{
		this.idimpelectrodos = idimpelectrodos;
	}

	/** 
	 * Gets the value of idimpelectrodos
	 */
	public Integer getIdimpelectrodos()
	{
		return idimpelectrodos;
	}

	/**
	 * Method 'ImpImplanteElectrodosPk'
	 * 
	 */
	public ImpImplanteElectrodosPk()
	{
	}

	/**
	 * Method 'ImpImplanteElectrodosPk'
	 * 
	 * @param idimpelectrodos
	 */
	public ImpImplanteElectrodosPk(final Integer idimpelectrodos)
	{
		this.idimpelectrodos = idimpelectrodos;
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
		
		if (!(_other instanceof ImpImplanteElectrodosPk)) {
			return false;
		}
		
		final ImpImplanteElectrodosPk _cast = (ImpImplanteElectrodosPk) _other;
		if (idimpelectrodos == null ? _cast.idimpelectrodos != idimpelectrodos : !idimpelectrodos.equals( _cast.idimpelectrodos )) {
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
		if (idimpelectrodos != null) {
			_hashCode = 29 * _hashCode + idimpelectrodos.hashCode();
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
		ret.append( "com.sorin.idea.dto.ImpImplanteElectrodosPk: " );
		ret.append( "idimpelectrodos=" + idimpelectrodos );
		return ret.toString();
	}

}
