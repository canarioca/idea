/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dto;

import java.io.Serializable;
import java.util.*;

import com.sorin.idea.dao.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;

public class ArrConducPf implements Serializable
{
	/** 
	 * This attribute maps to the column IDCONDUCCAV in the ARR_CONDUC_PF table.
	 */
	protected Integer idconduccav;

	/** 
	 * This attribute maps to the column PRUEBA in the ARR_CONDUC_PF table.
	 */
	protected Integer prueba;

	/** 
	 * This attribute maps to the column RESULTADO in the ARR_CONDUC_PF table.
	 */
	protected String resultado;

	/**
	 * Method 'ArrConducPf'
	 * 
	 */
	public ArrConducPf()
	{
		this.setPrueba(0);
		this.setResultado("0");
	}

	/**
	 * Method 'getIdconduccav'
	 * 
	 * @return Integer
	 */
	public Integer getIdconduccav()
	{
		return idconduccav;
	}

	/**
	 * Method 'setIdconduccav'
	 * 
	 * @param idconduccav
	 */
	public void setIdconduccav(Integer idconduccav)
	{
		this.idconduccav = idconduccav;
	}

	/**
	 * Method 'getPrueba'
	 * 
	 * @return Integer
	 */
	public Integer getPrueba()
	{
		return prueba;
	}

	/**
	 * Method 'setPrueba'
	 * 
	 * @param prueba
	 */
	public void setPrueba(Integer prueba)
	{
		this.prueba = prueba;
	}

	/**
	 * Method 'getResultado'
	 * 
	 * @return String
	 */
	public String getResultado()
	{
		return resultado;
	}

	/**
	 * Method 'setResultado'
	 * 
	 * @param resultado
	 */
	public void setResultado(String resultado)
	{
		this.resultado = resultado;
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
		
		if (!(_other instanceof ArrConducPf)) {
			return false;
		}
		
		final ArrConducPf _cast = (ArrConducPf) _other;
		if (idconduccav == null ? _cast.idconduccav != idconduccav : !idconduccav.equals( _cast.idconduccav )) {
			return false;
		}
		
		if (prueba == null ? _cast.prueba != prueba : !prueba.equals( _cast.prueba )) {
			return false;
		}
		
		if (resultado == null ? _cast.resultado != resultado : !resultado.equals( _cast.resultado )) {
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
		if (idconduccav != null) {
			_hashCode = 29 * _hashCode + idconduccav.hashCode();
		}
		
		if (prueba != null) {
			_hashCode = 29 * _hashCode + prueba.hashCode();
		}
		
		if (resultado != null) {
			_hashCode = 29 * _hashCode + resultado.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrConducPfPk
	 */
	public ArrConducPfPk createPk()
	{
		return new ArrConducPfPk(idconduccav);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.ArrConducPf: " );
		ret.append( "idconduccav=" + idconduccav );
		ret.append( ", prueba=" + prueba );
		ret.append( ", resultado=" + resultado );
		return ret.toString();
	}

}
