/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dto;

import com.sorin.idea.dao.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class ArrAccesoPriv implements Serializable
{
	/** 
	 * This attribute maps to the column IDROL in the arr_acceso_priv table.
	 */
	protected Integer idrol;

	/** 
	 * This attribute maps to the column INSERCION in the arr_acceso_priv table.
	 */
	protected Integer insercion;

	/** 
	 * This attribute maps to the column EDICION in the arr_acceso_priv table.
	 */
	protected Integer edicion;

	/** 
	 * This attribute maps to the column BORRADO in the arr_acceso_priv table.
	 */
	protected Integer borrado;

	/** 
	 * This attribute maps to the column TIEMPOEDICION in the arr_acceso_priv table.
	 */
	protected Integer tiempoedicion = 1;

	/**
	 * Method 'ArrAccesoPriv'
	 * 
	 */
	public ArrAccesoPriv()
	{
	}

	/**
	 * Method 'getIdrol'
	 * 
	 * @return Integer
	 */
	public Integer getIdrol()
	{
		return idrol;
	}

	/**
	 * Method 'setIdrol'
	 * 
	 * @param idrol
	 */
	public void setIdrol(Integer idrol)
	{
		this.idrol = idrol;
	}

	/**
	 * Method 'getInsercion'
	 * 
	 * @return Integer
	 */
	public Integer getInsercion()
	{
		return insercion;
	}

	/**
	 * Method 'setInsercion'
	 * 
	 * @param insercion
	 */
	public void setInsercion(Integer insercion)
	{
		this.insercion = insercion;
	}

	/**
	 * Method 'getEdicion'
	 * 
	 * @return Integer
	 */
	public Integer getEdicion()
	{
		return edicion;
	}

	/**
	 * Method 'setEdicion'
	 * 
	 * @param edicion
	 */
	public void setEdicion(Integer edicion)
	{
		this.edicion = edicion;
	}

	/**
	 * Method 'getBorrado'
	 * 
	 * @return Integer
	 */
	public Integer getBorrado()
	{
		return borrado;
	}

	/**
	 * Method 'setBorrado'
	 * 
	 * @param borrado
	 */
	public void setBorrado(Integer borrado)
	{
		this.borrado = borrado;
	}

	/**
	 * Method 'getTiempoedicion'
	 * 
	 * @return Integer
	 */
	public Integer getTiempoedicion()
	{
		return tiempoedicion;
	}

	/**
	 * Method 'setTiempoedicion'
	 * 
	 * @param tiempoedicion
	 */
	public void setTiempoedicion(Integer tiempoedicion)
	{
		this.tiempoedicion = tiempoedicion;
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
		
		if (!(_other instanceof ArrAccesoPriv)) {
			return false;
		}
		
		final ArrAccesoPriv _cast = (ArrAccesoPriv) _other;
		if (idrol == null ? _cast.idrol != idrol : !idrol.equals( _cast.idrol )) {
			return false;
		}
		
		if (insercion == null ? _cast.insercion != insercion : !insercion.equals( _cast.insercion )) {
			return false;
		}
		
		if (edicion == null ? _cast.edicion != edicion : !edicion.equals( _cast.edicion )) {
			return false;
		}
		
		if (borrado == null ? _cast.borrado != borrado : !borrado.equals( _cast.borrado )) {
			return false;
		}
		
		if (tiempoedicion == null ? _cast.tiempoedicion != tiempoedicion : !tiempoedicion.equals( _cast.tiempoedicion )) {
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
		if (idrol != null) {
			_hashCode = 29 * _hashCode + idrol.hashCode();
		}
		
		if (insercion != null) {
			_hashCode = 29 * _hashCode + insercion.hashCode();
		}
		
		if (edicion != null) {
			_hashCode = 29 * _hashCode + edicion.hashCode();
		}
		
		if (borrado != null) {
			_hashCode = 29 * _hashCode + borrado.hashCode();
		}
		
		if (tiempoedicion != null) {
			_hashCode = 29 * _hashCode + tiempoedicion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrAccesoPrivPk
	 */
	public ArrAccesoPrivPk createPk()
	{
		return new ArrAccesoPrivPk(idrol);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.ArrAccesoPriv: " );
		ret.append( "idrol=" + idrol );
		ret.append( ", insercion=" + insercion );
		ret.append( ", edicion=" + edicion );
		ret.append( ", borrado=" + borrado );
		ret.append( ", tiempoedicion=" + tiempoedicion );
		return ret.toString();
	}

}