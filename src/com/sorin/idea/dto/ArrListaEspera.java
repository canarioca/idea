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
import com.sorin.idea.util.UtilFechas;
import com.sorin.idea.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class ArrListaEspera implements Serializable
{
	/** 
	 * This attribute maps to the column CODIGO_PACIENTE in the arr_lista_espera table.
	 */
	protected Integer codigoPaciente;

	/** 
	 * This attribute maps to the column INGRESO in the arr_lista_espera table.
	 */
	protected Date ingreso = new Date();
	protected Date ingresomax = new Date();

	/** 
	 * This attribute maps to the column ARRITMIA in the arr_lista_espera table.
	 */
	protected String arritmia;

	/** 
	 * This attribute maps to the column NOTAS in the arr_lista_espera table.
	 */
	protected String notas;

	/** 
	 * This attribute maps to the column CARACTER in the arr_lista_espera table.
	 */
	protected String caracter;

	/** 
	 * This attribute maps to the column CARDIOPATIA in the arr_lista_espera table.
	 */
	protected String cardiopatia;

	/** 
	 * This attribute maps to the column ANESTESIA in the arr_lista_espera table.
	 */
	protected String anestesia;

	/** 
	 * This attribute maps to the column PROCEDIMIENTO in the arr_lista_espera table.
	 */
	protected String procedimiento;

	/** 
	 * This attribute maps to the column TRATAMIENTO1 in the arr_lista_espera table.
	 */
	protected String tratamiento1;

	/** 
	 * This attribute maps to the column CODIGO_LE in the arr_lista_espera table.
	 */
	protected Integer codigoLe;

	/** 
	 * This attribute maps to the column ESTADO in the arr_lista_espera table.
	 */
	protected Integer estado;

	/** 
	 * This attribute maps to the column RECLAMACION in the arr_lista_espera table.
	 */
	protected Date reclamacion;

	/** 
	 * This attribute maps to the column INCLUIDOPOR in the arr_lista_espera table.
	 */
	protected Integer incluidopor;

	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String nhc;
	protected String telefono1;
	protected String telefono2;
	protected Integer edadmin;
	protected Integer edadmax;
	protected String cip;
	/**
	 * Method 'ArrListaEspera'
	 * 
	 */
	public ArrListaEspera()
	{
	}

	/**
	 * Method 'getCodigoPaciente'
	 * 
	 * @return Integer
	 */
	public Integer getCodigoPaciente()
	{
		return codigoPaciente;
	}

	/**
	 * Method 'setCodigoPaciente'
	 * 
	 * @param codigoPaciente
	 */
	public void setCodigoPaciente(Integer codigoPaciente)
	{
		this.codigoPaciente = codigoPaciente;
	}

	/**
	 * Method 'getIngreso'
	 * 
	 * @return Date
	 */
	public Date getIngreso()
	{
		return ingreso;
	}
	public String getIngresostr()
	{
		if(ingreso != null)
			return UtilFechas.dateToString(ingreso);
		else
			return "";
	}

	/**
	 * Method 'setIngreso'
	 * 
	 * @param ingreso
	 */
	public void setIngreso(Date ingreso)
	{
		this.ingreso = ingreso;
	}
	
	public Date getIngresomax() {
		return ingresomax;
	}

	public void setIngresomax(Date ingresomax) {
		this.ingresomax = ingresomax;
	}

	/**
	 * Method 'getArritmia'
	 * 
	 * @return String
	 */
	public String getArritmia()
	{
		return arritmia;
	}

	/**
	 * Method 'setArritmia'
	 * 
	 * @param arritmia
	 */
	public void setArritmia(String arritmia)
	{
		this.arritmia = arritmia;
	}

	/**
	 * Method 'getNotas'
	 * 
	 * @return String
	 */
	public String getNotas()
	{
		return notas;
	}

	/**
	 * Method 'setNotas'
	 * 
	 * @param notas
	 */
	public void setNotas(String notas)
	{
		this.notas = notas;
	}

	/**
	 * Method 'getCaracter'
	 * 
	 * @return String
	 */
	public String getCaracter()
	{
		return caracter;
	}

	/**
	 * Method 'setCaracter'
	 * 
	 * @param caracter
	 */
	public void setCaracter(String caracter)
	{
		this.caracter = caracter;
	}

	/**
	 * Method 'getCardiopatia'
	 * 
	 * @return String
	 */
	public String getCardiopatia()
	{
		return cardiopatia;
	}

	/**
	 * Method 'setCardiopatia'
	 * 
	 * @param cardiopatia
	 */
	public void setCardiopatia(String cardiopatia)
	{
		this.cardiopatia = cardiopatia;
	}

	/**
	 * Method 'getAnestesia'
	 * 
	 * @return String
	 */
	public String getAnestesia()
	{
		return anestesia;
	}

	/**
	 * Method 'setAnestesia'
	 * 
	 * @param anestesia
	 */
	public void setAnestesia(String anestesia)
	{
		this.anestesia = anestesia;
	}

	/**
	 * Method 'getProcedimiento'
	 * 
	 * @return String
	 */
	public String getProcedimiento()
	{
		return procedimiento;
	}

	/**
	 * Method 'setProcedimiento'
	 * 
	 * @param procedimiento
	 */
	public void setProcedimiento(String procedimiento)
	{
		this.procedimiento = procedimiento;
	}

	/**
	 * Method 'getTratamiento1'
	 * 
	 * @return String
	 */
	public String getTratamiento1()
	{
		return tratamiento1;
	}

	/**
	 * Method 'setTratamiento1'
	 * 
	 * @param tratamiento1
	 */
	public void setTratamiento1(String tratamiento1)
	{
		this.tratamiento1 = tratamiento1;
	}

	/**
	 * Method 'getCodigoLe'
	 * 
	 * @return Integer
	 */
	public Integer getCodigoLe()
	{
		return codigoLe;
	}

	/**
	 * Method 'setCodigoLe'
	 * 
	 * @param codigoLe
	 */
	public void setCodigoLe(Integer codigoLe)
	{
		this.codigoLe = codigoLe;
	}

	public Integer getEstado() {
		if(estado == null)
			return 0;
		return estado;
	}
	
	public String getEstadoString() {
		switch (getEstado()){
		case 1:
			return "Activo";
		case 2:
			return "No Realizado";
		case 3:
			return "Realizado";
		case 4:
			return "Repetir";
		case 5:
			return "Citado";
		default:
			return "";
		}
	}

	public void setEstado(Integer estado) {
		if (estado == null)
			estado = 1;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNhc() {
		return nhc;
	}

	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2==null?"":telefono2;
	}
	
	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1==null?"":telefono1;
	}

	public Integer getEdadmin() {
		return edadmin;
	}

	public void setEdadmin(Integer edadmin) {
		this.edadmin = edadmin;
	}

	public void setEdadmin(Date edad) {
		if(edad != null)
			this.edadmin = new Date().getYear() - edad.getYear();
		else 
			this.edadmin = null;
	}

	public Integer getEdadmax() {
		return edadmax;
	}

	public void setEdadmax(Integer edadmax) {
		this.edadmax = edadmax;
	}

	public Date getReclamacion() {
		return reclamacion;
	}
	public String getReclamacionstr()
	{
		if(reclamacion != null)
			return UtilFechas.dateToString(reclamacion);
		else
			return "";
	}

	public void setReclamacion(Date reclamacion) {
		this.reclamacion = reclamacion;
	}


	/**
	 * Method 'getIncluidopor'
	 * 
	 * @return Integer
	 */
	public Integer getIncluidopor()
	{
		return incluidopor;
	}

	/**
	 * Method 'setIncluidopor'
	 * 
	 * @param incluidopor
	 */
	public void setIncluidopor(Integer incluidopor)
	{
		this.incluidopor = incluidopor;
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
		
		if (!(_other instanceof ArrListaEspera)) {
			return false;
		}
		
		final ArrListaEspera _cast = (ArrListaEspera) _other;
		if (codigoPaciente == null ? _cast.codigoPaciente != codigoPaciente : !codigoPaciente.equals( _cast.codigoPaciente )) {
			return false;
		}
		
		if (ingreso == null ? _cast.ingreso != ingreso : !ingreso.equals( _cast.ingreso )) {
			return false;
		}
		
		if (arritmia == null ? _cast.arritmia != arritmia : !arritmia.equals( _cast.arritmia )) {
			return false;
		}
		
		if (notas == null ? _cast.notas != notas : !notas.equals( _cast.notas )) {
			return false;
		}
		
		if (caracter == null ? _cast.caracter != caracter : !caracter.equals( _cast.caracter )) {
			return false;
		}
		
		if (cardiopatia == null ? _cast.cardiopatia != cardiopatia : !cardiopatia.equals( _cast.cardiopatia )) {
			return false;
		}
		
		if (anestesia == null ? _cast.anestesia != anestesia : !anestesia.equals( _cast.anestesia )) {
			return false;
		}
		
		if (procedimiento == null ? _cast.procedimiento != procedimiento : !procedimiento.equals( _cast.procedimiento )) {
			return false;
		}
		
		if (tratamiento1 == null ? _cast.tratamiento1 != tratamiento1 : !tratamiento1.equals( _cast.tratamiento1 )) {
			return false;
		}
		
		if (codigoLe == null ? _cast.codigoLe != codigoLe : !codigoLe.equals( _cast.codigoLe )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (reclamacion == null ? _cast.reclamacion != reclamacion : !reclamacion.equals( _cast.reclamacion )) {
			return false;
		}
		
		if (incluidopor == null ? _cast.incluidopor != incluidopor : !incluidopor.equals( _cast.incluidopor )) {
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
		if (codigoPaciente != null) {
			_hashCode = 29 * _hashCode + codigoPaciente.hashCode();
		}
		
		if (ingreso != null) {
			_hashCode = 29 * _hashCode + ingreso.hashCode();
		}
		
		if (arritmia != null) {
			_hashCode = 29 * _hashCode + arritmia.hashCode();
		}
		
		if (notas != null) {
			_hashCode = 29 * _hashCode + notas.hashCode();
		}
		
		if (caracter != null) {
			_hashCode = 29 * _hashCode + caracter.hashCode();
		}
		
		if (cardiopatia != null) {
			_hashCode = 29 * _hashCode + cardiopatia.hashCode();
		}
		
		if (anestesia != null) {
			_hashCode = 29 * _hashCode + anestesia.hashCode();
		}
		
		if (procedimiento != null) {
			_hashCode = 29 * _hashCode + procedimiento.hashCode();
		}
		
		if (tratamiento1 != null) {
			_hashCode = 29 * _hashCode + tratamiento1.hashCode();
		}
		
		if (codigoLe != null) {
			_hashCode = 29 * _hashCode + codigoLe.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		if (reclamacion != null) {
			_hashCode = 29 * _hashCode + reclamacion.hashCode();
		}
		
		if (incluidopor != null) {
			_hashCode = 29 * _hashCode + incluidopor.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrListaEsperaPk
	 */
	public ArrListaEsperaPk createPk()
	{
		return new ArrListaEsperaPk(codigoPaciente, codigoLe);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.ArrListaEspera: " );
		ret.append( "codigoPaciente=" + codigoPaciente );
		ret.append( ", ingreso=" + ingreso );
		ret.append( ", arritmia=" + arritmia );
		ret.append( ", notas=" + notas );
		ret.append( ", caracter=" + caracter );
		ret.append( ", cardiopatia=" + cardiopatia );
		ret.append( ", anestesia=" + anestesia );
		ret.append( ", procedimiento=" + procedimiento );
		ret.append( ", tratamiento1=" + tratamiento1 );
		ret.append( ", codigoLe=" + codigoLe );
		ret.append( ", estado=" + estado );
		ret.append( ", reclamacion=" + reclamacion );
		ret.append( ", incluidopor=" + incluidopor );
		return ret.toString();
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

}
