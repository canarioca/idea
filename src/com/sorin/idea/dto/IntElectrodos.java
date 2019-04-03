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
import java.util.Date;

public class IntElectrodos implements Serializable
{
	/** 
	 * This attribute maps to the column IDINTEGRACION in the int_electrodos table.
	 */
	protected Integer idintegracion;

	/** 
	 * This attribute maps to the column MODELO in the int_electrodos table.
	 */
	protected String modelo;

	/** 
	 * This attribute maps to the column NSERIE in the int_electrodos table.
	 */
	protected String nserie;

	/** 
	 * This attribute maps to the column FABRICANTE in the int_electrodos table.
	 */
	protected String fabricante;

	/** 
	 * This attribute maps to the column CAMARA in the int_electrodos table.
	 */
	protected Integer camara;

	/** 
	 * This attribute maps to the column ZONA in the int_electrodos table.
	 */
	protected Integer zona;

	/** 
	 * This attribute maps to the column ESTADO in the int_electrodos table.
	 */
	protected Integer estado;

	/** 
	 * This attribute maps to the column FECHAIMPLANTE in the int_electrodos table.
	 */
	protected Date fechaimplante;
	
	private ArrayList<Electrodos> elecs;
	private boolean mostrarelec;
	private Integer idelecsel;
	private String modeloelecsel;
	private boolean seleccion;

	/**
	 * Method 'IntElectrodos'
	 * 
	 */
	public IntElectrodos()
	{
		this.elecs = new ArrayList<Electrodos>();
	}

	/**
	 * Method 'getIdintegracion'
	 * 
	 * @return Integer
	 */
	public Integer getIdintegracion()
	{
		return idintegracion;
	}

	/**
	 * Method 'setIdintegracion'
	 * 
	 * @param idintegracion
	 */
	public void setIdintegracion(Integer idintegracion)
	{
		this.idintegracion = idintegracion;
	}

	/**
	 * Method 'getModelo'
	 * 
	 * @return String
	 */
	public String getModelo()
	{
		return modelo;
	}

	/**
	 * Method 'setModelo'
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	/**
	 * Method 'getNserie'
	 * 
	 * @return String
	 */
	public String getNserie()
	{
		return nserie;
	}

	/**
	 * Method 'setNserie'
	 * 
	 * @param nserie
	 */
	public void setNserie(String nserie)
	{
		this.nserie = nserie;
	}

	/**
	 * Method 'getFabricante'
	 * 
	 * @return String
	 */
	public String getFabricante()
	{
		return fabricante;
	}

	/**
	 * Method 'setFabricante'
	 * 
	 * @param fabricante
	 */
	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	/**
	 * Method 'getCamara'
	 * 
	 * @return Integer
	 */
	public Integer getCamara()
	{
		return camara;
	}

	/**
	 * Method 'setCamara'
	 * 
	 * @param camara
	 */
	public void setCamara(Integer camara)
	{
		this.camara = camara;
	}

	/**
	 * Method 'getZona'
	 * 
	 * @return Integer
	 */
	public Integer getZona()
	{
		return zona;
	}

	/**
	 * Method 'setZona'
	 * 
	 * @param zona
	 */
	public void setZona(Integer zona)
	{
		this.zona = zona;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return Integer
	 */
	public Integer getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(Integer estado)
	{
		this.estado = estado;
	}

	/**
	 * Method 'getFechaimplante'
	 * 
	 * @return Date
	 */
	public Date getFechaimplante()
	{
		return fechaimplante;
	}

	/**
	 * Method 'setFechaimplante'
	 * 
	 * @param fechaimplante
	 */
	public void setFechaimplante(Date fechaimplante)
	{
		this.fechaimplante = fechaimplante;
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
		
		if (!(_other instanceof IntElectrodos)) {
			return false;
		}
		
		final IntElectrodos _cast = (IntElectrodos) _other;
		if (idintegracion == null ? _cast.idintegracion != idintegracion : !idintegracion.equals( _cast.idintegracion )) {
			return false;
		}
		
		if (modelo == null ? _cast.modelo != modelo : !modelo.equals( _cast.modelo )) {
			return false;
		}
		
		if (nserie == null ? _cast.nserie != nserie : !nserie.equals( _cast.nserie )) {
			return false;
		}
		
		if (fabricante == null ? _cast.fabricante != fabricante : !fabricante.equals( _cast.fabricante )) {
			return false;
		}
		
		if (camara == null ? _cast.camara != camara : !camara.equals( _cast.camara )) {
			return false;
		}
		
		if (zona == null ? _cast.zona != zona : !zona.equals( _cast.zona )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (fechaimplante == null ? _cast.fechaimplante != fechaimplante : !fechaimplante.equals( _cast.fechaimplante )) {
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
		if (idintegracion != null) {
			_hashCode = 29 * _hashCode + idintegracion.hashCode();
		}
		
		if (modelo != null) {
			_hashCode = 29 * _hashCode + modelo.hashCode();
		}
		
		if (nserie != null) {
			_hashCode = 29 * _hashCode + nserie.hashCode();
		}
		
		if (fabricante != null) {
			_hashCode = 29 * _hashCode + fabricante.hashCode();
		}
		
		if (camara != null) {
			_hashCode = 29 * _hashCode + camara.hashCode();
		}
		
		if (zona != null) {
			_hashCode = 29 * _hashCode + zona.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		if (fechaimplante != null) {
			_hashCode = 29 * _hashCode + fechaimplante.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return IntElectrodosPk
	 */
	public IntElectrodosPk createPk()
	{
		return new IntElectrodosPk(idintegracion, modelo, nserie);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.IntElectrodos: " );
		ret.append( "idintegracion=" + idintegracion );
		ret.append( ", modelo=" + modelo );
		ret.append( ", nserie=" + nserie );
		ret.append( ", fabricante=" + fabricante );
		ret.append( ", camara=" + camara );
		ret.append( ", zona=" + zona );
		ret.append( ", estado=" + estado );
		ret.append( ", fechaimplante=" + fechaimplante );
		return ret.toString();
	}
	
	public ArrayList<Electrodos> getElecs() {
		return elecs;
	}

	public void setElecs(ArrayList<Electrodos> elecs) {
		this.elecs = elecs;
	}

	public boolean isMostrarelec() {
		return mostrarelec;
	}

	public void setMostrarelec(boolean mostrarelec) {
		this.mostrarelec = mostrarelec;
	}

	public Integer getIdelecsel() {
		return idelecsel;
	}

	public void setIdelecsel(Integer idelecsel) {
		this.idelecsel = idelecsel;
	}

	public boolean isSeleccion() {
		return seleccion;
	}

	public void setSeleccion(boolean seleccion) {
		this.seleccion = seleccion;
	}

	public String getModeloelecsel() {
		return modeloelecsel;
	}

	public void setModeloelecsel(String modeloelecsel) {
		this.modeloelecsel = modeloelecsel;
	}

}
