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
 * This class represents the primary key of the protocolos_procedimientos table.
 */
public class ProtocolosProcedimientosPk implements Serializable
{
	protected Integer idprotocolo;

	protected Integer idprocedimiento;

	protected Integer tipoprocedimiento;

	/** 
	 * Sets the value of idprotocolo
	 */
	public void setIdprotocolo(Integer idprotocolo)
	{
		this.idprotocolo = idprotocolo;
	}

	/** 
	 * Gets the value of idprotocolo
	 */
	public Integer getIdprotocolo()
	{
		return idprotocolo;
	}

	/** 
	 * Sets the value of idprocedimiento
	 */
	public void setIdprocedimiento(Integer idprocedimiento)
	{
		this.idprocedimiento = idprocedimiento;
	}

	/** 
	 * Gets the value of idprocedimiento
	 */
	public Integer getIdprocedimiento()
	{
		return idprocedimiento;
	}

	/** 
	 * Sets the value of tipoprocedimiento
	 */
	public void setTipoprocedimiento(Integer tipoprocedimiento)
	{
		this.tipoprocedimiento = tipoprocedimiento;
	}

	/** 
	 * Gets the value of tipoprocedimiento
	 */
	public Integer getTipoprocedimiento()
	{
		return tipoprocedimiento;
	}

	/**
	 * Method 'ProtocolosProcedimientosPk'
	 * 
	 */
	public ProtocolosProcedimientosPk()
	{
	}

	/**
	 * Method 'ProtocolosProcedimientosPk'
	 * 
	 * @param idprotocolo
	 * @param idprocedimiento
	 * @param tipoprocedimiento
	 */
	public ProtocolosProcedimientosPk(final Integer idprotocolo, final Integer idprocedimiento, final Integer tipoprocedimiento)
	{
		this.idprotocolo = idprotocolo;
		this.idprocedimiento = idprocedimiento;
		this.tipoprocedimiento = tipoprocedimiento;
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
		
		if (!(_other instanceof ProtocolosProcedimientosPk)) {
			return false;
		}
		
		final ProtocolosProcedimientosPk _cast = (ProtocolosProcedimientosPk) _other;
		if (idprotocolo == null ? _cast.idprotocolo != idprotocolo : !idprotocolo.equals( _cast.idprotocolo )) {
			return false;
		}
		
		if (idprocedimiento == null ? _cast.idprocedimiento != idprocedimiento : !idprocedimiento.equals( _cast.idprocedimiento )) {
			return false;
		}
		
		if (tipoprocedimiento == null ? _cast.tipoprocedimiento != tipoprocedimiento : !tipoprocedimiento.equals( _cast.tipoprocedimiento )) {
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
		if (idprotocolo != null) {
			_hashCode = 29 * _hashCode + idprotocolo.hashCode();
		}
		
		if (idprocedimiento != null) {
			_hashCode = 29 * _hashCode + idprocedimiento.hashCode();
		}
		
		if (tipoprocedimiento != null) {
			_hashCode = 29 * _hashCode + tipoprocedimiento.hashCode();
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
		ret.append( "com.sorin.idea.dto.ProtocolosProcedimientosPk: " );
		ret.append( "idprotocolo=" + idprotocolo );
		ret.append( ", idprocedimiento=" + idprocedimiento );
		ret.append( ", tipoprocedimiento=" + tipoprocedimiento );
		return ret.toString();
	}

}