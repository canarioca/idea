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

public class ArrEstudioPeriodo implements Serializable
{
	/** 
	 * This attribute maps to the column IDESTUDIO in the ARR_ESTUDIO_PERIODO table.
	 */
	protected Integer idestudio;

	/** 
	 * This attribute maps to the column IDTIPO in the ARR_ESTUDIO_PERIODO table.
	 */
	protected Integer idtipo;

	/** 
	 * This attribute maps to the column IDTEJIDO in the ARR_ESTUDIO_PERIODO table.
	 */
	protected String idtejido;

	/** 
	 * This attribute maps to the column IDS1 in the ARR_ESTUDIO_PERIODO table.
	 */
	protected String ids1;

	/** 
	 * This attribute maps to the column REF in the ARR_ESTUDIO_PERIODO table.
	 */
	protected String ref;
	
	protected Integer idfarmaco;

	protected ArrayList<GenericosDto> farmacos;
	/**
	 * Method 'ArrEstudioPeriodo'
	 * 
	 */
	public ArrEstudioPeriodo()
	{
		this.farmacos = new ArrayList<GenericosDto>();
	}

	/**
	 * Method 'getIdestudio'
	 * 
	 * @return Integer
	 */
	public Integer getIdestudio()
	{
		return idestudio;
	}

	/**
	 * Method 'setIdestudio'
	 * 
	 * @param idestudio
	 */
	public void setIdestudio(Integer idestudio)
	{
		this.idestudio = idestudio;
	}

	/**
	 * Method 'getIdtipo'
	 * 
	 * @return Integer
	 */
	public Integer getIdtipo()
	{
		return idtipo;
	}

	/**
	 * Method 'setIdtipo'
	 * 
	 * @param idtipo
	 */
	public void setIdtipo(Integer idtipo)
	{
		this.idtipo = idtipo;
	}

	/**
	 * Method 'getIdtejido'
	 * 
	 * @return Integer
	 */
	public String getIdtejido()
	{
		return idtejido;
	}

	/**
	 * Method 'setIdtejido'
	 * 
	 * @param idtejido
	 */
	public void setIdtejido(String idtejido)
	{
		this.idtejido = idtejido;
	}

	/**
	 * Method 'getIds1'
	 * 
	 * @return Integer
	 */
	public String getIds1()
	{
		return ids1;
	}

	/**
	 * Method 'setIds1'
	 * 
	 * @param ids1
	 */
	public void setIds1(String ids1)
	{
		this.ids1 = ids1;
	}

	/**
	 * Method 'getRef'
	 * 
	 * @return String
	 */
	public String getRef()
	{
		return ref;
	}

	/**
	 * Method 'setRef'
	 * 
	 * @param ref
	 */
	public void setRef(String ref)
	{
		this.ref = ref;
	}
	
	public Integer getIdfarmaco() {
		return idfarmaco;
	}

	public void setIdfarmaco(Integer idfarmaco) {
		this.idfarmaco = idfarmaco;
	}

	public ArrayList<GenericosDto> getFarmacos() {
		return farmacos;
	}

	public void setFarmacos(ArrayList<GenericosDto> farmacos) {
		this.farmacos = farmacos;
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
		
		if (!(_other instanceof ArrEstudioPeriodo)) {
			return false;
		}
		
		final ArrEstudioPeriodo _cast = (ArrEstudioPeriodo) _other;
		if (idestudio == null ? _cast.idestudio != idestudio : !idestudio.equals( _cast.idestudio )) {
			return false;
		}
		
		if (idtipo == null ? _cast.idtipo != idtipo : !idtipo.equals( _cast.idtipo )) {
			return false;
		}
		
		if (idtejido == null ? _cast.idtejido != idtejido : !idtejido.equals( _cast.idtejido )) {
			return false;
		}
		
		if (ids1 == null ? _cast.ids1 != ids1 : !ids1.equals( _cast.ids1 )) {
			return false;
		}
		
		if (ref == null ? _cast.ref != ref : !ref.equals( _cast.ref )) {
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
		if (idestudio != null) {
			_hashCode = 29 * _hashCode + idestudio.hashCode();
		}
		
		if (idtipo != null) {
			_hashCode = 29 * _hashCode + idtipo.hashCode();
		}
		
		if (idtejido != null) {
			_hashCode = 29 * _hashCode + idtejido.hashCode();
		}
		
		if (ids1 != null) {
			_hashCode = 29 * _hashCode + ids1.hashCode();
		}
		
		if (ref != null) {
			_hashCode = 29 * _hashCode + ref.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrEstudioPeriodoPk
	 */
	public ArrEstudioPeriodoPk createPk()
	{
		return new ArrEstudioPeriodoPk(idestudio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.ArrEstudioPeriodo: " );
		ret.append( "idestudio=" + idestudio );
		ret.append( ", idtipo=" + idtipo );
		ret.append( ", idtejido=" + idtejido );
		ret.append( ", ids1=" + ids1 );
		ret.append( ", ref=" + ref );
		return ret.toString();
	}

}
