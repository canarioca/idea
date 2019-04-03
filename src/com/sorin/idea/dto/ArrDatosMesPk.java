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
 * This class represents the primary key of the ARR_DATOS_MES table.
 */
public class ArrDatosMesPk implements Serializable
{
	protected String mes;

	protected Integer anio;

	/** 
	 * Sets the value of mes
	 */
	public void setMes(String mes)
	{
		this.mes = mes;
	}

	/** 
	 * Gets the value of mes
	 */
	public String getMes()
	{
		return mes;
	}

	/** 
	 * Sets the value of anio
	 */
	public void setAnio(Integer anio)
	{
		this.anio = anio;
	}

	/** 
	 * Gets the value of anio
	 */
	public Integer getAnio()
	{
		return anio;
	}

	/**
	 * Method 'ArrDatosMesPk'
	 * 
	 */
	public ArrDatosMesPk()
	{
	}

	/**
	 * Method 'ArrDatosMesPk'
	 * 
	 * @param mes
	 * @param anio
	 */
	public ArrDatosMesPk(final String mes, final Integer anio)
	{
		this.mes = mes;
		this.anio = anio;
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
		
		if (!(_other instanceof ArrDatosMesPk)) {
			return false;
		}
		
		final ArrDatosMesPk _cast = (ArrDatosMesPk) _other;
		if (mes == null ? _cast.mes != mes : !mes.equals( _cast.mes )) {
			return false;
		}
		
		if (anio == null ? _cast.anio != anio : !anio.equals( _cast.anio )) {
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
		if (mes != null) {
			_hashCode = 29 * _hashCode + mes.hashCode();
		}
		
		if (anio != null) {
			_hashCode = 29 * _hashCode + anio.hashCode();
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
		ret.append( "hvn.apl.jProyecto2011.dto.ArrDatosMesPk: " );
		ret.append( "mes=" + mes );
		ret.append( ", anio=" + anio );
		return ret.toString();
	}

}