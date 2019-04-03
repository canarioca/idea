/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dto;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.*;

import com.sorin.idea.dao.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;

public class ArrMesasEcg implements Serializable
{
	/** 
	 * This attribute maps to the column IDMESA in the ARR_MESAS_ECG table.
	 */
	protected Integer idmesa;

	/** 
	 * This attribute maps to the column IDRITMO in the ARR_MESAS_ECG table.
	 */
	protected Integer idritmo;

	/** 
	 * This attribute maps to the column IDCONDUCCION in the ARR_MESAS_ECG table.
	 */
	protected Integer idconduccion;

	/** 
	 * This attribute maps to the column IDCONDUCCIONNO in the ARR_MESAS_ECG table.
	 */
	protected Integer idconduccionno;

	/** 
	 * This attribute maps to the column IDQRS in the ARR_MESAS_ECG table.
	 */
	protected Integer idqrs;

	/** 
	 * This attribute maps to the column IDQRSNO in the ARR_MESAS_ECG table.
	 */
	protected Integer idqrsno;

	/** 
	 * This attribute maps to the column MORFOLOGIA in the ARR_MESAS_ECG table.
	 */
	protected String morfologia;

	/** 
	 * This attribute maps to the column COMENTARIOS in the ARR_MESAS_ECG table.
	 */
	protected String comentarios;

	/** 
	 * This attribute maps to the column RR in the ARR_MESAS_ECG table.
	 */
	protected String rr;

	/** 
	 * This attribute maps to the column PR in the ARR_MESAS_ECG table.
	 */
	protected String pr;

	/** 
	 * This attribute maps to the column QRS in the ARR_MESAS_ECG table.
	 */
	protected String qrs;

	/** 
	 * This attribute maps to the column QT in the ARR_MESAS_ECG table.
	 */
	protected String qt;

	/** 
	 * This attribute maps to the column QTC in the ARR_MESAS_ECG table.
	 */
	protected String qtc;

	/**
	 * Method 'ArrMesasEcg'
	 * 
	 */
	public ArrMesasEcg()
	{
	}

	/**
	 * Method 'getIdmesa'
	 * 
	 * @return Integer
	 */
	public Integer getIdmesa()
	{
		return idmesa;
	}

	/**
	 * Method 'setIdmesa'
	 * 
	 * @param idmesa
	 */
	public void setIdmesa(Integer idmesa)
	{
		this.idmesa = idmesa;
	}

	/**
	 * Method 'getIdritmo'
	 * 
	 * @return Integer
	 */
	public Integer getIdritmo()
	{
		return idritmo;
	}

	/**
	 * Method 'setIdritmo'
	 * 
	 * @param idritmo
	 */
	public void setIdritmo(Integer idritmo)
	{
		this.idritmo = idritmo;
	}

	/**
	 * Method 'getIdconduccion'
	 * 
	 * @return Integer
	 */
	public Integer getIdconduccion()
	{
		return idconduccion;
	}

	/**
	 * Method 'setIdconduccion'
	 * 
	 * @param idconduccion
	 */
	public void setIdconduccion(Integer idconduccion)
	{
		this.idconduccion = idconduccion;
	}

	/**
	 * Method 'getIdconduccionno'
	 * 
	 * @return Integer
	 */
	public Integer getIdconduccionno()
	{
		return idconduccionno;
	}

	/**
	 * Method 'setIdconduccionno'
	 * 
	 * @param idconduccionno
	 */
	public void setIdconduccionno(Integer idconduccionno)
	{
		this.idconduccionno = idconduccionno;
	}

	/**
	 * Method 'getIdqrs'
	 * 
	 * @return Integer
	 */
	public Integer getIdqrs()
	{
		return idqrs;
	}

	/**
	 * Method 'setIdqrs'
	 * 
	 * @param idqrs
	 */
	public void setIdqrs(Integer idqrs)
	{
		this.idqrs = idqrs;
	}

	/**
	 * Method 'getIdqrsno'
	 * 
	 * @return Integer
	 */
	public Integer getIdqrsno()
	{
		return idqrsno;
	}

	/**
	 * Method 'setIdqrsno'
	 * 
	 * @param idqrsno
	 */
	public void setIdqrsno(Integer idqrsno)
	{
		this.idqrsno = idqrsno;
	}

	/**
	 * Method 'getMorfologia'
	 * 
	 * @return String
	 */
	public String getMorfologia()
	{
		return morfologia;
	}

	/**
	 * Method 'setMorfologia'
	 * 
	 * @param morfologia
	 */
	public void setMorfologia(String morfologia)
	{
		this.morfologia = morfologia;
	}

	/**
	 * Method 'getComentarios'
	 * 
	 * @return String
	 */
	public String getComentarios()
	{
		return comentarios;
	}

	/**
	 * Method 'setComentarios'
	 * 
	 * @param comentarios
	 */
	public void setComentarios(String comentarios)
	{
		this.comentarios = comentarios;
	}

	/**
	 * Method 'getRr'
	 * 
	 * @return String
	 */
	public String getRr()
	{
		return rr;
	}

	/**
	 * Method 'setRr'
	 * 
	 * @param rr
	 */
	public void setRr(String rr)
	{
		this.rr = rr;
	}

	/**
	 * Method 'getPr'
	 * 
	 * @return String
	 */
	public String getPr()
	{
		return pr;
	}

	/**
	 * Method 'setPr'
	 * 
	 * @param pr
	 */
	public void setPr(String pr)
	{
		this.pr = pr;
	}

	/**
	 * Method 'getQrs'
	 * 
	 * @return String
	 */
	public String getQrs()
	{
		return qrs;
	}

	/**
	 * Method 'setQrs'
	 * 
	 * @param qrs
	 */
	public void setQrs(String qrs)
	{
		this.qrs = qrs;
	}

	/**
	 * Method 'getQt'
	 * 
	 * @return String
	 */
	public String getQt()
	{
		return qt;
	}

	/**
	 * Method 'setQt'
	 * 
	 * @param qt
	 */
	public void setQt(String qt)
	{
		this.qt = qt;
	}

	/**
	 * Method 'getQtc'
	 * 
	 * @return String
	 */
	public String getQtc()
	{
		String retorno = "";
		if(this.qt != null && this.qt.length() > 0 && this.rr != null && this.rr.length() > 0){
			Float qt = new Float(this.qt.replace(",", "."));
			Float rr = new Float(this.rr.replace(",", "."));
			Float ret = new Float(qt/Math.sqrt(((float)rr/1000)));
			DecimalFormat df = new DecimalFormat("#.##");
			retorno = df.format(ret).toString();
		}
		return retorno;
	}

	/**
	 * Method 'setQtc'
	 * 
	 * @param qtc
	 */
	public void setQtc(String qtc)
	{
		this.qtc = qtc;
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
		
		if (!(_other instanceof ArrMesasEcg)) {
			return false;
		}
		
		final ArrMesasEcg _cast = (ArrMesasEcg) _other;
		if (idmesa == null ? _cast.idmesa != idmesa : !idmesa.equals( _cast.idmesa )) {
			return false;
		}
		
		if (idritmo == null ? _cast.idritmo != idritmo : !idritmo.equals( _cast.idritmo )) {
			return false;
		}
		
		if (idconduccion == null ? _cast.idconduccion != idconduccion : !idconduccion.equals( _cast.idconduccion )) {
			return false;
		}
		
		if (idconduccionno == null ? _cast.idconduccionno != idconduccionno : !idconduccionno.equals( _cast.idconduccionno )) {
			return false;
		}
		
		if (idqrs == null ? _cast.idqrs != idqrs : !idqrs.equals( _cast.idqrs )) {
			return false;
		}
		
		if (idqrsno == null ? _cast.idqrsno != idqrsno : !idqrsno.equals( _cast.idqrsno )) {
			return false;
		}
		
		if (morfologia == null ? _cast.morfologia != morfologia : !morfologia.equals( _cast.morfologia )) {
			return false;
		}
		
		if (comentarios == null ? _cast.comentarios != comentarios : !comentarios.equals( _cast.comentarios )) {
			return false;
		}
		
		if (rr == null ? _cast.rr != rr : !rr.equals( _cast.rr )) {
			return false;
		}
		
		if (pr == null ? _cast.pr != pr : !pr.equals( _cast.pr )) {
			return false;
		}
		
		if (qrs == null ? _cast.qrs != qrs : !qrs.equals( _cast.qrs )) {
			return false;
		}
		
		if (qt == null ? _cast.qt != qt : !qt.equals( _cast.qt )) {
			return false;
		}
		
		if (qtc == null ? _cast.qtc != qtc : !qtc.equals( _cast.qtc )) {
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
		if (idmesa != null) {
			_hashCode = 29 * _hashCode + idmesa.hashCode();
		}
		
		if (idritmo != null) {
			_hashCode = 29 * _hashCode + idritmo.hashCode();
		}
		
		if (idconduccion != null) {
			_hashCode = 29 * _hashCode + idconduccion.hashCode();
		}
		
		if (idconduccionno != null) {
			_hashCode = 29 * _hashCode + idconduccionno.hashCode();
		}
		
		if (idqrs != null) {
			_hashCode = 29 * _hashCode + idqrs.hashCode();
		}
		
		if (idqrsno != null) {
			_hashCode = 29 * _hashCode + idqrsno.hashCode();
		}
		
		if (morfologia != null) {
			_hashCode = 29 * _hashCode + morfologia.hashCode();
		}
		
		if (comentarios != null) {
			_hashCode = 29 * _hashCode + comentarios.hashCode();
		}
		
		if (rr != null) {
			_hashCode = 29 * _hashCode + rr.hashCode();
		}
		
		if (pr != null) {
			_hashCode = 29 * _hashCode + pr.hashCode();
		}
		
		if (qrs != null) {
			_hashCode = 29 * _hashCode + qrs.hashCode();
		}
		
		if (qt != null) {
			_hashCode = 29 * _hashCode + qt.hashCode();
		}
		
		if (qtc != null) {
			_hashCode = 29 * _hashCode + qtc.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrMesasEcgPk
	 */
	public ArrMesasEcgPk createPk()
	{
		return new ArrMesasEcgPk(idmesa);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.ArrMesasEcg: " );
		ret.append( "idmesa=" + idmesa );
		ret.append( ", idritmo=" + idritmo );
		ret.append( ", idconduccion=" + idconduccion );
		ret.append( ", idconduccionno=" + idconduccionno );
		ret.append( ", idqrs=" + idqrs );
		ret.append( ", idqrsno=" + idqrsno );
		ret.append( ", morfologia=" + morfologia );
		ret.append( ", comentarios=" + comentarios );
		ret.append( ", rr=" + rr );
		ret.append( ", pr=" + pr );
		ret.append( ", qrs=" + qrs );
		ret.append( ", qt=" + qt );
		ret.append( ", qtc=" + qtc );
		return ret.toString();
	}

}
