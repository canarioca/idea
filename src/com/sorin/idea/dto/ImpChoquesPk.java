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
 * This class represents the primary key of the imp_choques table.
 */
public class ImpChoquesPk implements Serializable
{
	protected Integer idch;

	/** 
	 * Sets the value of idch
	 */
	public void setIdch(Integer idch)
	{
		this.idch = idch;
	}

	/** 
	 * Gets the value of idch
	 */
	public Integer getIdch()
	{
		return idch;
	}

	/**
	 * Method 'ImpChoquesPk'
	 * 
	 */
	public ImpChoquesPk()
	{
	}

	/**
	 * Method 'ImpChoquesPk'
	 * 
	 * @param idch
	 */
	public ImpChoquesPk(final Integer idch)
	{
		this.idch = idch;
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
		
		if (!(_other instanceof ImpChoquesPk)) {
			return false;
		}
		
		final ImpChoquesPk _cast = (ImpChoquesPk) _other;
		if (idch == null ? _cast.idch != idch : !idch.equals( _cast.idch )) {
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
		if (idch != null) {
			_hashCode = 29 * _hashCode + idch.hashCode();
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
		ret.append( "hvn.apl.jProyecto2011.dto.ImpChoquesPk: " );
		ret.append( "idch=" + idch );
		return ret.toString();
	}

}
