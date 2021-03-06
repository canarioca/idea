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

public class ArrAnualLab implements Serializable
{
	/** 
	 * This attribute maps to the column ANIO in the ARR_ANUAL_LAB table.
	 */
	protected Integer anio;

	/** 
	 * This attribute maps to the column PLANTILLA in the ARR_ANUAL_LAB table.
	 */
	protected String plantilla;

	/** 
	 * This attribute maps to the column PLANTILLATC in the ARR_ANUAL_LAB table.
	 */
	protected String plantillatc;

	/** 
	 * This attribute maps to the column BECARIOS in the ARR_ANUAL_LAB table.
	 */
	protected String becarios;

	/** 
	 * This attribute maps to the column MIR in the ARR_ANUAL_LAB table.
	 */
	protected String mir;

	/** 
	 * This attribute maps to the column ATS in the ARR_ANUAL_LAB table.
	 */
	protected String ats;

	/** 
	 * This attribute maps to the column ATR in the ARR_ANUAL_LAB table.
	 */
	protected String atr;

	/** 
	 * This attribute maps to the column SALAC in the ARR_ANUAL_LAB table.
	 */
	protected String salac;

	/** 
	 * This attribute maps to the column SALAD in the ARR_ANUAL_LAB table.
	 */
	protected String salad;

	/** 
	 * This attribute maps to the column IDEXCLUSIVA in the ARR_ANUAL_LAB table.
	 */
	protected Integer idexclusiva = 0;
	protected Integer idportatil = 0;

	/** 
	 * This attribute maps to the column EXCLUSIVAS in the ARR_ANUAL_LAB table.
	 */
	protected String exclusivas;

	/** 
	 * This attribute maps to the column DIAS in the ARR_ANUAL_LAB table.
	 */
	protected String dias;

	/** 
	 * This attribute maps to the column IDMP in the ARR_ANUAL_LAB table.
	 */
	protected Integer idmp = 0;

	/** 
	 * This attribute maps to the column IDDAI in the ARR_ANUAL_LAB table.
	 */
	protected Integer iddai = 0;

	/** 
	 * This attribute maps to the column IDCVEXTERNA in the ARR_ANUAL_LAB table.
	 */
	protected Integer idcvexterna = 0;

	/** 
	 * This attribute maps to the column IDCVINTERNA in the ARR_ANUAL_LAB table.
	 */
	protected Integer idcvinterna = 0;

	/** 
	 * This attribute maps to the column PROCEDIMIENTOS in the ARR_ANUAL_LAB table.
	 */
	protected String procedimientos;

	/** 
	 * This attribute maps to the column IDPOLIGRAFO in the ARR_ANUAL_LAB table.
	 */
	protected Integer idpoligrafo = 0;

	/** 
	 * This attribute maps to the column POLIGRAFO in the ARR_ANUAL_LAB table.
	 */
	protected String poligrafo;

	/** 
	 * This attribute maps to the column ANE in the arr_anual_lab table.
	 */
	protected Integer ane = 0;

	/** 
	 * This attribute maps to the column NRXFIJO in the arr_anual_lab table.
	 */
	protected String nrxfijo;

	/** 
	 * This attribute maps to the column NRXPORTATIL in the arr_anual_lab table.
	 */
	protected String nrxportatil;

	/** 
	 * This attribute maps to the column IDCRT in the arr_anual_lab table.
	 */
	protected Integer idcrt;

	/** 
	 * This attribute maps to the column IDHOLTER in the arr_anual_lab table.
	 */
	protected Integer idholter;

	/** 
	 * This attribute maps to the column IDDENREN in the arr_anual_lab table.
	 */
	protected Integer iddenren;

	/** 
	 * This attribute maps to the column IDCIEORE in the arr_anual_lab table.
	 */
	protected Integer idcieore;
	
	/**
	 * Method 'ArrAnualLab'
	 * 
	 */
	public ArrAnualLab()
	{
	}

	public ArrAnualLab(Integer anio2) {
		this.anio = anio2;
	}

	/**
	 * Method 'getAnio'
	 * 
	 * @return Integer
	 */
	public Integer getAnio()
	{
		return anio;
	}

	/**
	 * Method 'setAnio'
	 * 
	 * @param anio
	 */
	public void setAnio(Integer anio)
	{
		this.anio = anio;
	}

	/**
	 * Method 'getPlantilla'
	 * 
	 * @return String
	 */
	public String getPlantilla()
	{
		return plantilla;
	}

	/**
	 * Method 'setPlantilla'
	 * 
	 * @param plantilla
	 */
	public void setPlantilla(String plantilla)
	{
		this.plantilla = plantilla;
	}

	/**
	 * Method 'getPlantillatc'
	 * 
	 * @return String
	 */
	public String getPlantillatc()
	{
		return plantillatc;
	}

	/**
	 * Method 'setPlantillatc'
	 * 
	 * @param plantillatc
	 */
	public void setPlantillatc(String plantillatc)
	{
		this.plantillatc = plantillatc;
	}

	/**
	 * Method 'getBecarios'
	 * 
	 * @return String
	 */
	public String getBecarios()
	{
		return becarios;
	}

	/**
	 * Method 'setBecarios'
	 * 
	 * @param becarios
	 */
	public void setBecarios(String becarios)
	{
		this.becarios = becarios;
	}

	/**
	 * Method 'getMir'
	 * 
	 * @return String
	 */
	public String getMir()
	{
		return mir;
	}

	/**
	 * Method 'setMir'
	 * 
	 * @param mir
	 */
	public void setMir(String mir)
	{
		this.mir = mir;
	}

	/**
	 * Method 'getAts'
	 * 
	 * @return String
	 */
	public String getAts()
	{
		return ats;
	}

	/**
	 * Method 'setAts'
	 * 
	 * @param ats
	 */
	public void setAts(String ats)
	{
		this.ats = ats;
	}

	/**
	 * Method 'getAtr'
	 * 
	 * @return String
	 */
	public String getAtr()
	{
		return atr;
	}

	/**
	 * Method 'setAtr'
	 * 
	 * @param atr
	 */
	public void setAtr(String atr)
	{
		this.atr = atr;
	}

	/**
	 * Method 'getSalac'
	 * 
	 * @return String
	 */
	public String getSalac()
	{
		return salac;
	}

	/**
	 * Method 'setSalac'
	 * 
	 * @param salac
	 */
	public void setSalac(String salac)
	{
		this.salac = salac;
	}

	/**
	 * Method 'getSalad'
	 * 
	 * @return String
	 */
	public String getSalad()
	{
		return salad;
	}

	/**
	 * Method 'setSalad'
	 * 
	 * @param salad
	 */
	public void setSalad(String salad)
	{
		this.salad = salad;
	}

	/**
	 * Method 'getIdexclusiva'
	 * 
	 * @return Integer
	 */
	public Integer getIdexclusiva()
	{
		return idexclusiva;
	}

	/**
	 * Method 'setIdexclusiva'
	 * 
	 * @param idexclusiva
	 */
	public void setIdexclusiva(Integer idexclusiva)
	{
		this.idexclusiva = idexclusiva;
	}

	public Integer getIdportatil() {
		return idportatil;
	}

	public void setIdportatil(Integer idportatil) {
		this.idportatil = idportatil;
	}

	/**
	 * Method 'getExclusivas'
	 * 
	 * @return String
	 */
	public String getExclusivas()
	{
		return exclusivas;
	}

	/**
	 * Method 'setExclusivas'
	 * 
	 * @param exclusivas
	 */
	public void setExclusivas(String exclusivas)
	{
		this.exclusivas = exclusivas;
	}

	/**
	 * Method 'getDias'
	 * 
	 * @return String
	 */
	public String getDias()
	{
		return dias;
	}

	/**
	 * Method 'setDias'
	 * 
	 * @param dias
	 */
	public void setDias(String dias)
	{
		this.dias = dias;
	}

	/**
	 * Method 'getIdmp'
	 * 
	 * @return Integer
	 */
	public Integer getIdmp()
	{
		return idmp;
	}

	/**
	 * Method 'setIdmp'
	 * 
	 * @param idmp
	 */
	public void setIdmp(Integer idmp)
	{
		this.idmp = idmp;
	}

	/**
	 * Method 'getIddai'
	 * 
	 * @return Integer
	 */
	public Integer getIddai()
	{
		return iddai;
	}

	/**
	 * Method 'setIddai'
	 * 
	 * @param iddai
	 */
	public void setIddai(Integer iddai)
	{
		this.iddai = iddai;
	}

	/**
	 * Method 'getIdcvexterna'
	 * 
	 * @return Integer
	 */
	public Integer getIdcvexterna()
	{
		return idcvexterna;
	}

	/**
	 * Method 'setIdcvexterna'
	 * 
	 * @param idcvexterna
	 */
	public void setIdcvexterna(Integer idcvexterna)
	{
		this.idcvexterna = idcvexterna;
	}

	/**
	 * Method 'getIdcvinterna'
	 * 
	 * @return Integer
	 */
	public Integer getIdcvinterna()
	{
		return idcvinterna;
	}

	/**
	 * Method 'setIdcvinterna'
	 * 
	 * @param idcvinterna
	 */
	public void setIdcvinterna(Integer idcvinterna)
	{
		this.idcvinterna = idcvinterna;
	}

	/**
	 * Method 'getProcedimientos'
	 * 
	 * @return String
	 */
	public String getProcedimientos()
	{
		return procedimientos;
	}

	/**
	 * Method 'setProcedimientos'
	 * 
	 * @param procedimientos
	 */
	public void setProcedimientos(String procedimientos)
	{
		this.procedimientos = procedimientos;
	}

	/**
	 * Method 'getIdpoligrafo'
	 * 
	 * @return Integer
	 */
	public Integer getIdpoligrafo()
	{
		return idpoligrafo;
	}

	/**
	 * Method 'setIdpoligrafo'
	 * 
	 * @param idpoligrafo
	 */
	public void setIdpoligrafo(Integer idpoligrafo)
	{
		this.idpoligrafo = idpoligrafo;
	}

	/**
	 * Method 'getPoligrafo'
	 * 
	 * @return String
	 */
	public String getPoligrafo()
	{
		return poligrafo;
	}

	/**
	 * Method 'setPoligrafo'
	 * 
	 * @param poligrafo
	 */
	public void setPoligrafo(String poligrafo)
	{
		this.poligrafo = poligrafo;
	}

	/**
	 * Method 'getAne'
	 * 
	 * @return Integer
	 */
	public Integer getAne()
	{
		return ane;
	}

	/**
	 * Method 'setAne'
	 * 
	 * @param ane
	 */
	public void setAne(Integer ane)
	{
		this.ane = ane;
	}

	/**
	 * Method 'getNrxfijo'
	 * 
	 * @return String
	 */
	public String getNrxfijo()
	{
		return nrxfijo;
	}

	/**
	 * Method 'setNrxfijo'
	 * 
	 * @param nrxfijo
	 */
	public void setNrxfijo(String nrxfijo)
	{
		this.nrxfijo = nrxfijo;
	}

	/**
	 * Method 'getNrxportatil'
	 * 
	 * @return String
	 */
	public String getNrxportatil()
	{
		return nrxportatil;
	}

	/**
	 * Method 'setNrxportatil'
	 * 
	 * @param nrxportatil
	 */
	public void setNrxportatil(String nrxportatil)
	{
		this.nrxportatil = nrxportatil;
	}

	/**
	 * Method 'getIdcrt'
	 * 
	 * @return Integer
	 */
	public Integer getIdcrt()
	{
		return idcrt;
	}

	/**
	 * Method 'setIdcrt'
	 * 
	 * @param idcrt
	 */
	public void setIdcrt(Integer idcrt)
	{
		this.idcrt = idcrt;
	}

	/**
	 * Method 'getIdholter'
	 * 
	 * @return Integer
	 */
	public Integer getIdholter()
	{
		return idholter;
	}

	/**
	 * Method 'setIdholter'
	 * 
	 * @param idholter
	 */
	public void setIdholter(Integer idholter)
	{
		this.idholter = idholter;
	}

	/**
	 * Method 'getIddenren'
	 * 
	 * @return Integer
	 */
	public Integer getIddenren()
	{
		return iddenren;
	}

	/**
	 * Method 'setIddenren'
	 * 
	 * @param iddenren
	 */
	public void setIddenren(Integer iddenren)
	{
		this.iddenren = iddenren;
	}

	/**
	 * Method 'getIdcieore'
	 * 
	 * @return Integer
	 */
	public Integer getIdcieore()
	{
		return idcieore;
	}

	/**
	 * Method 'setIdcieore'
	 * 
	 * @param idcieore
	 */
	public void setIdcieore(Integer idcieore)
	{
		this.idcieore = idcieore;
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
		
		if (!(_other instanceof ArrAnualLab)) {
			return false;
		}
		
		final ArrAnualLab _cast = (ArrAnualLab) _other;
		if (anio == null ? _cast.anio != anio : !anio.equals( _cast.anio )) {
			return false;
		}
		
		if (plantilla == null ? _cast.plantilla != plantilla : !plantilla.equals( _cast.plantilla )) {
			return false;
		}
		
		if (plantillatc == null ? _cast.plantillatc != plantillatc : !plantillatc.equals( _cast.plantillatc )) {
			return false;
		}
		
		if (becarios == null ? _cast.becarios != becarios : !becarios.equals( _cast.becarios )) {
			return false;
		}
		
		if (mir == null ? _cast.mir != mir : !mir.equals( _cast.mir )) {
			return false;
		}
		
		if (ats == null ? _cast.ats != ats : !ats.equals( _cast.ats )) {
			return false;
		}
		
		if (atr == null ? _cast.atr != atr : !atr.equals( _cast.atr )) {
			return false;
		}
		
		if (salac == null ? _cast.salac != salac : !salac.equals( _cast.salac )) {
			return false;
		}
		
		if (salad == null ? _cast.salad != salad : !salad.equals( _cast.salad )) {
			return false;
		}
		
		if (idexclusiva == null ? _cast.idexclusiva != idexclusiva : !idexclusiva.equals( _cast.idexclusiva )) {
			return false;
		}
		
		if (exclusivas == null ? _cast.exclusivas != exclusivas : !exclusivas.equals( _cast.exclusivas )) {
			return false;
		}
		
		if (dias == null ? _cast.dias != dias : !dias.equals( _cast.dias )) {
			return false;
		}
		
		if (idmp == null ? _cast.idmp != idmp : !idmp.equals( _cast.idmp )) {
			return false;
		}
		
		if (iddai == null ? _cast.iddai != iddai : !iddai.equals( _cast.iddai )) {
			return false;
		}
		
		if (idcvexterna == null ? _cast.idcvexterna != idcvexterna : !idcvexterna.equals( _cast.idcvexterna )) {
			return false;
		}
		
		if (idcvinterna == null ? _cast.idcvinterna != idcvinterna : !idcvinterna.equals( _cast.idcvinterna )) {
			return false;
		}
		
		if (procedimientos == null ? _cast.procedimientos != procedimientos : !procedimientos.equals( _cast.procedimientos )) {
			return false;
		}
		
		if (idpoligrafo == null ? _cast.idpoligrafo != idpoligrafo : !idpoligrafo.equals( _cast.idpoligrafo )) {
			return false;
		}
		
		if (poligrafo == null ? _cast.poligrafo != poligrafo : !poligrafo.equals( _cast.poligrafo )) {
			return false;
		}
		
		if (ane == null ? _cast.ane != ane : !ane.equals( _cast.ane )) {
			return false;
		}
		
		if (nrxfijo == null ? _cast.nrxfijo != nrxfijo : !nrxfijo.equals( _cast.nrxfijo )) {
			return false;
		}
		
		if (nrxportatil == null ? _cast.nrxportatil != nrxportatil : !nrxportatil.equals( _cast.nrxportatil )) {
			return false;
		}
		
		if (idcrt == null ? _cast.idcrt != idcrt : !idcrt.equals( _cast.idcrt )) {
			return false;
		}
		
		if (idholter == null ? _cast.idholter != idholter : !idholter.equals( _cast.idholter )) {
			return false;
		}
		
		if (iddenren == null ? _cast.iddenren != iddenren : !iddenren.equals( _cast.iddenren )) {
			return false;
		}
		
		if (idcieore == null ? _cast.idcieore != idcieore : !idcieore.equals( _cast.idcieore )) {
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
		if (anio != null) {
			_hashCode = 29 * _hashCode + anio.hashCode();
		}
		
		if (plantilla != null) {
			_hashCode = 29 * _hashCode + plantilla.hashCode();
		}
		
		if (plantillatc != null) {
			_hashCode = 29 * _hashCode + plantillatc.hashCode();
		}
		
		if (becarios != null) {
			_hashCode = 29 * _hashCode + becarios.hashCode();
		}
		
		if (mir != null) {
			_hashCode = 29 * _hashCode + mir.hashCode();
		}
		
		if (ats != null) {
			_hashCode = 29 * _hashCode + ats.hashCode();
		}
		
		if (atr != null) {
			_hashCode = 29 * _hashCode + atr.hashCode();
		}
		
		if (salac != null) {
			_hashCode = 29 * _hashCode + salac.hashCode();
		}
		
		if (salad != null) {
			_hashCode = 29 * _hashCode + salad.hashCode();
		}
		
		if (idexclusiva != null) {
			_hashCode = 29 * _hashCode + idexclusiva.hashCode();
		}
		
		if (exclusivas != null) {
			_hashCode = 29 * _hashCode + exclusivas.hashCode();
		}
		
		if (dias != null) {
			_hashCode = 29 * _hashCode + dias.hashCode();
		}
		
		if (idmp != null) {
			_hashCode = 29 * _hashCode + idmp.hashCode();
		}
		
		if (iddai != null) {
			_hashCode = 29 * _hashCode + iddai.hashCode();
		}
		
		if (idcvexterna != null) {
			_hashCode = 29 * _hashCode + idcvexterna.hashCode();
		}
		
		if (idcvinterna != null) {
			_hashCode = 29 * _hashCode + idcvinterna.hashCode();
		}
		
		if (procedimientos != null) {
			_hashCode = 29 * _hashCode + procedimientos.hashCode();
		}
		
		if (idpoligrafo != null) {
			_hashCode = 29 * _hashCode + idpoligrafo.hashCode();
		}
		
		if (poligrafo != null) {
			_hashCode = 29 * _hashCode + poligrafo.hashCode();
		}
		
		if (ane != null) {
			_hashCode = 29 * _hashCode + ane.hashCode();
		}
		
		if (nrxfijo != null) {
			_hashCode = 29 * _hashCode + nrxfijo.hashCode();
		}
		
		if (nrxportatil != null) {
			_hashCode = 29 * _hashCode + nrxportatil.hashCode();
		}
		
		if (idcrt != null) {
			_hashCode = 29 * _hashCode + idcrt.hashCode();
		}
		
		if (idholter != null) {
			_hashCode = 29 * _hashCode + idholter.hashCode();
		}
		
		if (iddenren != null) {
			_hashCode = 29 * _hashCode + iddenren.hashCode();
		}
		
		if (idcieore != null) {
			_hashCode = 29 * _hashCode + idcieore.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrAnualLabPk
	 */
	public ArrAnualLabPk createPk()
	{
		return new ArrAnualLabPk(anio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.ArrAnualLab: " );
		ret.append( "anio=" + anio );
		ret.append( ", plantilla=" + plantilla );
		ret.append( ", plantillatc=" + plantillatc );
		ret.append( ", becarios=" + becarios );
		ret.append( ", mir=" + mir );
		ret.append( ", ats=" + ats );
		ret.append( ", atr=" + atr );
		ret.append( ", salac=" + salac );
		ret.append( ", salad=" + salad );
		ret.append( ", idexclusiva=" + idexclusiva );
		ret.append( ", exclusivas=" + exclusivas );
		ret.append( ", dias=" + dias );
		ret.append( ", idmp=" + idmp );
		ret.append( ", iddai=" + iddai );
		ret.append( ", idcvexterna=" + idcvexterna );
		ret.append( ", idcvinterna=" + idcvinterna );
		ret.append( ", procedimientos=" + procedimientos );
		ret.append( ", idpoligrafo=" + idpoligrafo );
		ret.append( ", poligrafo=" + poligrafo );
		ret.append( ", ane=" + ane );
		ret.append( ", nrxfijo=" + nrxfijo );
		ret.append( ", nrxportatil=" + nrxportatil );
		ret.append( ", idcrt=" + idcrt );
		ret.append( ", idholter=" + idholter );
		ret.append( ", iddenren=" + iddenren );
		ret.append( ", idcieore=" + idcieore );
		return ret.toString();
	}

}
