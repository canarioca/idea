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
 * This class represents the primary key of the seg_porestimulacion table.
 */
public class SegPorestimulacionPk implements Serializable
{
	protected Integer idporestim;

	/** 
	 * Sets the value of idporestim
	 */
	public void setIdporestim(Integer idporestim)
	{
		this.idporestim = idporestim;
	}

	/** 
	 * Gets the value of idporestim
	 */
	public Integer getIdporestim()
	{
		return idporestim;
	}

	/**
	 * Method 'SegPorestimulacionPk'
	 * 
	 */
	public SegPorestimulacionPk()
	{
	}

	/**
	 * Method 'SegPorestimulacionPk'
	 * 
	 * @param idporestim
	 */
	public SegPorestimulacionPk(final Integer idporestim)
	{
		this.idporestim = idporestim;
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
		
		if (!(_other instanceof SegPorestimulacionPk)) {
			return false;
		}
		
		final SegPorestimulacionPk _cast = (SegPorestimulacionPk) _other;
		if (idporestim == null ? _cast.idporestim != idporestim : !idporestim.equals( _cast.idporestim )) {
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
		if (idporestim != null) {
			_hashCode = 29 * _hashCode + idporestim.hashCode();
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
		ret.append( "hvn.apl.jProyecto2011.dto.SegPorestimulacionPk: " );
		ret.append( "idporestim=" + idporestim );
		return ret.toString();
	}

}
