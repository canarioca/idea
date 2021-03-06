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

public class ComplicacionesPacientes implements Serializable
{
	/** 
	 * This attribute maps to the column IDCOMPAC in the complicaciones_pacientes table.
	 */
	protected Integer idcompac;

	/** 
	 * This attribute maps to the column IDPACIENTE in the complicaciones_pacientes table.
	 */
	protected Integer idpaciente;

	/** 
	 * This attribute maps to the column TIPO in the complicaciones_pacientes table.
	 */
	protected Integer tipo;

	/** 
	 * This attribute maps to the column TIPOPROCEDIMIENTO in the complicaciones_pacientes table.
	 */
	protected Integer tipoprocedimiento;

	/** 
	 * This attribute maps to the column IDPROCEDIMIENTO in the complicaciones_pacientes table.
	 */
	protected Integer idprocedimiento;

	/** 
	 * This attribute maps to the column COMPLICACION in the complicaciones_pacientes table.
	 */
	protected Integer complicacion;

	/** 
	 * This attribute maps to the column COMPLICACION1 in the complicaciones_pacientes table.
	 */
	protected Integer complicacion1;

	/** 
	 * This attribute maps to the column COMPLICACION_OTRA in the complicaciones_pacientes table.
	 */
	protected String complicacionOtra;

	/** 
	 * This attribute maps to the column IDRELACION in the complicaciones_pacientes table.
	 */
	protected Integer idrelacion;

	/** 
	 * This attribute maps to the column IDLUGAR in the complicaciones_pacientes table.
	 */
	protected Integer idlugar;

	/** 
	 * This attribute maps to the column FECHAINI in the complicaciones_pacientes table.
	 */
	protected Date fechaini;

	/** 
	 * This attribute maps to the column FECHAFIN in the complicaciones_pacientes table.
	 */
	protected Date fechafin;

	/** 
	 * This attribute maps to the column RESUELTA in the complicaciones_pacientes table.
	 */
	protected Integer resuelta;

	/** 
	 * This attribute maps to the column RESUELTA_OTROS in the complicaciones_pacientes table.
	 */
	protected String resueltaOtros;

	/** 
	 * This attribute maps to the column TRATAMIENTO in the complicaciones_pacientes table.
	 */
	protected Integer tratamiento;

	/** 
	 * This attribute maps to the column TRATAMIENTO_TIPO in the complicaciones_pacientes table.
	 */
	protected Integer tratamientoTipo;

	/** 
	 * This attribute maps to the column TRATAMIENTO_DESCR in the complicaciones_pacientes table.
	 */
	protected String tratamientoDescr;

	/** 
	 * This attribute maps to the column INGRESO in the complicaciones_pacientes table.
	 */
	protected Integer ingreso;

	/** 
	 * This attribute maps to the column DESCRIPCION in the complicaciones_pacientes table.
	 */
	protected String descripcion;

	/** 
	 * This attribute maps to the column COMPLICACION2 in the complicaciones_pacientes table.
	 */
	protected Integer complicacion2;

	private String nombreComplicacion;
	private Date fechaProc;
	
	/**
	 * Method 'ComplicacionesPacientes'
	 * 
	 */
	public ComplicacionesPacientes()
	{
	}

	/**
	 * Method 'getIdcompac'
	 * 
	 * @return Integer
	 */
	public Integer getIdcompac()
	{
		return idcompac;
	}

	/**
	 * Method 'setIdcompac'
	 * 
	 * @param idcompac
	 */
	public void setIdcompac(Integer idcompac)
	{
		this.idcompac = idcompac;
	}

	/**
	 * Method 'getIdpaciente'
	 * 
	 * @return Integer
	 */
	public Integer getIdpaciente()
	{
		return idpaciente;
	}

	/**
	 * Method 'setIdpaciente'
	 * 
	 * @param idpaciente
	 */
	public void setIdpaciente(Integer idpaciente)
	{
		this.idpaciente = idpaciente;
	}

	/**
	 * Method 'getTipo'
	 * 
	 * @return Integer
	 */
	public Integer getTipo()
	{
		return tipo;
	}

	/**
	 * Method 'setTipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(Integer tipo)
	{
		this.tipo = tipo;
	}

	/**
	 * Method 'getTipoprocedimiento'
	 * 
	 * @return Integer
	 */
	public Integer getTipoprocedimiento()
	{
		return tipoprocedimiento;
	}

	/**
	 * Method 'setTipoprocedimiento'
	 * 
	 * @param tipoprocedimiento
	 */
	public void setTipoprocedimiento(Integer tipoprocedimiento)
	{
		this.tipoprocedimiento = tipoprocedimiento;
	}

	/**
	 * Method 'getIdprocedimiento'
	 * 
	 * @return Integer
	 */
	public Integer getIdprocedimiento()
	{
		return idprocedimiento;
	}

	/**
	 * Method 'setIdprocedimiento'
	 * 
	 * @param idprocedimiento
	 */
	public void setIdprocedimiento(Integer idprocedimiento)
	{
		this.idprocedimiento = idprocedimiento;
	}

	/**
	 * Method 'getComplicacion'
	 * 
	 * @return Integer
	 */
	public Integer getComplicacion()
	{
		return complicacion;
	}

	/**
	 * Method 'setComplicacion'
	 * 
	 * @param complicacion
	 */
	public void setComplicacion(Integer complicacion)
	{
		this.complicacion = complicacion;
	}

	/**
	 * Method 'getComplicacion1'
	 * 
	 * @return Integer
	 */
	public Integer getComplicacion1()
	{
		return complicacion1;
	}

	/**
	 * Method 'setComplicacion1'
	 * 
	 * @param complicacion1
	 */
	public void setComplicacion1(Integer complicacion1)
	{
		this.complicacion1 = complicacion1;
	}

	/**
	 * Method 'getComplicacionOtra'
	 * 
	 * @return String
	 */
	public String getComplicacionOtra()
	{
		return complicacionOtra;
	}

	/**
	 * Method 'setComplicacionOtra'
	 * 
	 * @param complicacionOtra
	 */
	public void setComplicacionOtra(String complicacionOtra)
	{
		this.complicacionOtra = complicacionOtra;
	}

	/**
	 * Method 'getIdrelacion'
	 * 
	 * @return Integer
	 */
	public Integer getIdrelacion()
	{
		return idrelacion;
	}

	/**
	 * Method 'setIdrelacion'
	 * 
	 * @param idrelacion
	 */
	public void setIdrelacion(Integer idrelacion)
	{
		this.idrelacion = idrelacion;
	}

	/**
	 * Method 'getIdlugar'
	 * 
	 * @return Integer
	 */
	public Integer getIdlugar()
	{
		return idlugar;
	}

	/**
	 * Method 'setIdlugar'
	 * 
	 * @param idlugar
	 */
	public void setIdlugar(Integer idlugar)
	{
		this.idlugar = idlugar;
	}

	/**
	 * Method 'getFechaini'
	 * 
	 * @return Date
	 */
	public Date getFechaini()
	{
		return fechaini;
	}

	/**
	 * Method 'setFechaini'
	 * 
	 * @param fechaini
	 */
	public void setFechaini(Date fechaini)
	{
		this.fechaini = fechaini;
	}

	/**
	 * Method 'getFechafin'
	 * 
	 * @return Date
	 */
	public Date getFechafin()
	{
		return fechafin;
	}

	/**
	 * Method 'setFechafin'
	 * 
	 * @param fechafin
	 */
	public void setFechafin(Date fechafin)
	{
		this.fechafin = fechafin;
	}

	/**
	 * Method 'getResuelta'
	 * 
	 * @return Integer
	 */
	public Integer getResuelta()
	{
		return resuelta;
	}

	/**
	 * Method 'setResuelta'
	 * 
	 * @param resuelta
	 */
	public void setResuelta(Integer resuelta)
	{
		this.resuelta = resuelta;
	}

	/**
	 * Method 'getResueltaOtros'
	 * 
	 * @return String
	 */
	public String getResueltaOtros()
	{
		return resueltaOtros;
	}

	/**
	 * Method 'setResueltaOtros'
	 * 
	 * @param resueltaOtros
	 */
	public void setResueltaOtros(String resueltaOtros)
	{
		this.resueltaOtros = resueltaOtros;
	}

	/**
	 * Method 'getTratamiento'
	 * 
	 * @return Integer
	 */
	public Integer getTratamiento()
	{
		return tratamiento;
	}

	/**
	 * Method 'setTratamiento'
	 * 
	 * @param tratamiento
	 */
	public void setTratamiento(Integer tratamiento)
	{
		this.tratamiento = tratamiento;
	}

	/**
	 * Method 'getTratamientoTipo'
	 * 
	 * @return Integer
	 */
	public Integer getTratamientoTipo()
	{
		return tratamientoTipo;
	}

	/**
	 * Method 'setTratamientoTipo'
	 * 
	 * @param tratamientoTipo
	 */
	public void setTratamientoTipo(Integer tratamientoTipo)
	{
		this.tratamientoTipo = tratamientoTipo;
	}

	/**
	 * Method 'getTratamientoDescr'
	 * 
	 * @return String
	 */
	public String getTratamientoDescr()
	{
		return tratamientoDescr;
	}

	/**
	 * Method 'setTratamientoDescr'
	 * 
	 * @param tratamientoDescr
	 */
	public void setTratamientoDescr(String tratamientoDescr)
	{
		this.tratamientoDescr = tratamientoDescr;
	}

	/**
	 * Method 'getIngreso'
	 * 
	 * @return Integer
	 */
	public Integer getIngreso()
	{
		return ingreso;
	}

	/**
	 * Method 'setIngreso'
	 * 
	 * @param ingreso
	 */
	public void setIngreso(Integer ingreso)
	{
		this.ingreso = ingreso;
	}

	/**
	 * Method 'getDescripcion'
	 * 
	 * @return String
	 */
	public String getDescripcion()
	{
		return descripcion;
	}

	/**
	 * Method 'setDescripcion'
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	/**
	 * Method 'getComplicacion2'
	 * 
	 * @return Integer
	 */
	public Integer getComplicacion2()
	{
		return complicacion2;
	}

	/**
	 * Method 'setComplicacion2'
	 * 
	 * @param complicacion2
	 */
	public void setComplicacion2(Integer complicacion2)
	{
		this.complicacion2 = complicacion2;
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
		
		if (!(_other instanceof ComplicacionesPacientes)) {
			return false;
		}
		
		final ComplicacionesPacientes _cast = (ComplicacionesPacientes) _other;
		if (idcompac == null ? _cast.idcompac != idcompac : !idcompac.equals( _cast.idcompac )) {
			return false;
		}
		
		if (idpaciente == null ? _cast.idpaciente != idpaciente : !idpaciente.equals( _cast.idpaciente )) {
			return false;
		}
		
		if (tipo == null ? _cast.tipo != tipo : !tipo.equals( _cast.tipo )) {
			return false;
		}
		
		if (tipoprocedimiento == null ? _cast.tipoprocedimiento != tipoprocedimiento : !tipoprocedimiento.equals( _cast.tipoprocedimiento )) {
			return false;
		}
		
		if (idprocedimiento == null ? _cast.idprocedimiento != idprocedimiento : !idprocedimiento.equals( _cast.idprocedimiento )) {
			return false;
		}
		
		if (complicacion == null ? _cast.complicacion != complicacion : !complicacion.equals( _cast.complicacion )) {
			return false;
		}
		
		if (complicacion1 == null ? _cast.complicacion1 != complicacion1 : !complicacion1.equals( _cast.complicacion1 )) {
			return false;
		}
		
		if (complicacionOtra == null ? _cast.complicacionOtra != complicacionOtra : !complicacionOtra.equals( _cast.complicacionOtra )) {
			return false;
		}
		
		if (idrelacion == null ? _cast.idrelacion != idrelacion : !idrelacion.equals( _cast.idrelacion )) {
			return false;
		}
		
		if (idlugar == null ? _cast.idlugar != idlugar : !idlugar.equals( _cast.idlugar )) {
			return false;
		}
		
		if (fechaini == null ? _cast.fechaini != fechaini : !fechaini.equals( _cast.fechaini )) {
			return false;
		}
		
		if (fechafin == null ? _cast.fechafin != fechafin : !fechafin.equals( _cast.fechafin )) {
			return false;
		}
		
		if (resuelta == null ? _cast.resuelta != resuelta : !resuelta.equals( _cast.resuelta )) {
			return false;
		}
		
		if (resueltaOtros == null ? _cast.resueltaOtros != resueltaOtros : !resueltaOtros.equals( _cast.resueltaOtros )) {
			return false;
		}
		
		if (tratamiento == null ? _cast.tratamiento != tratamiento : !tratamiento.equals( _cast.tratamiento )) {
			return false;
		}
		
		if (tratamientoTipo == null ? _cast.tratamientoTipo != tratamientoTipo : !tratamientoTipo.equals( _cast.tratamientoTipo )) {
			return false;
		}
		
		if (tratamientoDescr == null ? _cast.tratamientoDescr != tratamientoDescr : !tratamientoDescr.equals( _cast.tratamientoDescr )) {
			return false;
		}
		
		if (ingreso == null ? _cast.ingreso != ingreso : !ingreso.equals( _cast.ingreso )) {
			return false;
		}
		
		if (descripcion == null ? _cast.descripcion != descripcion : !descripcion.equals( _cast.descripcion )) {
			return false;
		}
		
		if (complicacion2 == null ? _cast.complicacion2 != complicacion2 : !complicacion2.equals( _cast.complicacion2 )) {
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
		if (idcompac != null) {
			_hashCode = 29 * _hashCode + idcompac.hashCode();
		}
		
		if (idpaciente != null) {
			_hashCode = 29 * _hashCode + idpaciente.hashCode();
		}
		
		if (tipo != null) {
			_hashCode = 29 * _hashCode + tipo.hashCode();
		}
		
		if (tipoprocedimiento != null) {
			_hashCode = 29 * _hashCode + tipoprocedimiento.hashCode();
		}
		
		if (idprocedimiento != null) {
			_hashCode = 29 * _hashCode + idprocedimiento.hashCode();
		}
		
		if (complicacion != null) {
			_hashCode = 29 * _hashCode + complicacion.hashCode();
		}
		
		if (complicacion1 != null) {
			_hashCode = 29 * _hashCode + complicacion1.hashCode();
		}
		
		if (complicacionOtra != null) {
			_hashCode = 29 * _hashCode + complicacionOtra.hashCode();
		}
		
		if (idrelacion != null) {
			_hashCode = 29 * _hashCode + idrelacion.hashCode();
		}
		
		if (idlugar != null) {
			_hashCode = 29 * _hashCode + idlugar.hashCode();
		}
		
		if (fechaini != null) {
			_hashCode = 29 * _hashCode + fechaini.hashCode();
		}
		
		if (fechafin != null) {
			_hashCode = 29 * _hashCode + fechafin.hashCode();
		}
		
		if (resuelta != null) {
			_hashCode = 29 * _hashCode + resuelta.hashCode();
		}
		
		if (resueltaOtros != null) {
			_hashCode = 29 * _hashCode + resueltaOtros.hashCode();
		}
		
		if (tratamiento != null) {
			_hashCode = 29 * _hashCode + tratamiento.hashCode();
		}
		
		if (tratamientoTipo != null) {
			_hashCode = 29 * _hashCode + tratamientoTipo.hashCode();
		}
		
		if (tratamientoDescr != null) {
			_hashCode = 29 * _hashCode + tratamientoDescr.hashCode();
		}
		
		if (ingreso != null) {
			_hashCode = 29 * _hashCode + ingreso.hashCode();
		}
		
		if (descripcion != null) {
			_hashCode = 29 * _hashCode + descripcion.hashCode();
		}
		
		if (complicacion2 != null) {
			_hashCode = 29 * _hashCode + complicacion2.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ComplicacionesPacientesPk
	 */
	public ComplicacionesPacientesPk createPk()
	{
		return new ComplicacionesPacientesPk(idcompac);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.ComplicacionesPacientes: " );
		ret.append( "idcompac=" + idcompac );
		ret.append( ", idpaciente=" + idpaciente );
		ret.append( ", tipo=" + tipo );
		ret.append( ", tipoprocedimiento=" + tipoprocedimiento );
		ret.append( ", idprocedimiento=" + idprocedimiento );
		ret.append( ", complicacion=" + complicacion );
		ret.append( ", complicacion1=" + complicacion1 );
		ret.append( ", complicacionOtra=" + complicacionOtra );
		ret.append( ", idrelacion=" + idrelacion );
		ret.append( ", idlugar=" + idlugar );
		ret.append( ", fechaini=" + fechaini );
		ret.append( ", fechafin=" + fechafin );
		ret.append( ", resuelta=" + resuelta );
		ret.append( ", resueltaOtros=" + resueltaOtros );
		ret.append( ", tratamiento=" + tratamiento );
		ret.append( ", tratamientoTipo=" + tratamientoTipo );
		ret.append( ", tratamientoDescr=" + tratamientoDescr );
		ret.append( ", ingreso=" + ingreso );
		ret.append( ", descripcion=" + descripcion );
		ret.append( ", complicacion2=" + complicacion2 );
		return ret.toString();
	}

	public String getNombreComplicacion() {
		return nombreComplicacion;
	}

	public void setNombreComplicacion(String nombreComplicacion) {
		this.nombreComplicacion = nombreComplicacion;
	}

	public Date getFechaProc() {
		return fechaProc;
	}

	public void setFechaProc(Date fechaProc) {
		this.fechaProc = fechaProc;
	}
	
}
