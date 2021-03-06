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

public class RegistradorEventosExt implements Serializable
{
	/** 
	 * This attribute maps to the column IDEVENTO in the registrador_eventos_ext table.
	 */
	protected Integer idevento;

	/** 
	 * This attribute maps to the column FECHACOLOCACION in the registrador_eventos_ext table.
	 */
	protected Date fechacolocacion;

	/** 
	 * This attribute maps to the column FECHALECTURA in the registrador_eventos_ext table.
	 */
	protected Date fechalectura;

	/** 
	 * This attribute maps to the column FECHARETIRADA in the registrador_eventos_ext table.
	 */
	protected Date fecharetirada;

	/** 
	 * This attribute maps to the column FECHANALISIS in the registrador_eventos_ext table.
	 */
	protected Date fechanalisis;

	/** 
	 * This attribute maps to the column ESTADO in the registrador_eventos_ext table.
	 */
	protected Integer estado;

	/** 
	 * This attribute maps to the column COMENTARIOS_COL in the registrador_eventos_ext table.
	 */
	protected String comentariosCol;

	/** 
	 * This attribute maps to the column COMENTARIOS_ANA in the registrador_eventos_ext table.
	 */
	protected String comentariosAna;

	/** 
	 * This attribute maps to the column RECOMENDACIONES in the registrador_eventos_ext table.
	 */
	protected String recomendaciones;

	/** 
	 * This attribute maps to the column DIAGNOSTICOINI in the registrador_eventos_ext table.
	 */
	protected Integer diagnosticoini;

	/** 
	 * This attribute maps to the column DIAGNOSTICOFIN in the registrador_eventos_ext table.
	 */
	protected Integer diagnosticofin;

	/** 
	 * This attribute maps to the column REFERIDOR in the registrador_eventos_ext table.
	 */
	protected String referidor;

	/** 
	 * This attribute maps to the column COLOCACION_ENF in the registrador_eventos_ext table.
	 */
	protected String colocacionEnf;

	/** 
	 * This attribute maps to the column COLOCACION_MED in the registrador_eventos_ext table.
	 */
	protected String colocacionMed;

	/** 
	 * This attribute maps to the column ANALISIS_MED in the registrador_eventos_ext table.
	 */
	protected String analisisMed;

	/** 
	 * This attribute maps to the column RETIRADA_ENF in the registrador_eventos_ext table.
	 */
	protected String retiradaEnf;

	/** 
	 * This attribute maps to the column RETIRADA_MED in the registrador_eventos_ext table.
	 */
	protected String retiradaMed;

	/** 
	 * This attribute maps to the column NPROC in the registrador_eventos_ext table.
	 */
	protected String nproc;

	/** 
	 * This attribute maps to the column DIAGINIOTRO in the registrador_eventos_ext table.
	 */
	protected String diaginiotro;

	/** 
	 * This attribute maps to the column DIAGFINOTRO in the registrador_eventos_ext table.
	 */
	protected String diagfinotro;

	private String identevento;
	private Boolean lecturasd;
	
	/**
	 * Method 'RegistradorEventosExt'
	 * 
	 */
	public RegistradorEventosExt()
	{
	}

	/**
	 * Method 'getIdevento'
	 * 
	 * @return Integer
	 */
	public Integer getIdevento()
	{
		return idevento;
	}

	/**
	 * Method 'setIdevento'
	 * 
	 * @param idevento
	 */
	public void setIdevento(Integer idevento)
	{
		this.idevento = idevento;
	}

	/**
	 * Method 'getFechacolocacion'
	 * 
	 * @return Date
	 */
	public Date getFechacolocacion()
	{
		return fechacolocacion;
	}

	/**
	 * Method 'setFechacolocacion'
	 * 
	 * @param fechacolocacion
	 */
	public void setFechacolocacion(Date fechacolocacion)
	{
		this.fechacolocacion = fechacolocacion;
	}

	/**
	 * Method 'getFechalectura'
	 * 
	 * @return Date
	 */
	public Date getFechalectura()
	{
		return fechalectura;
	}

	/**
	 * Method 'setFechalectura'
	 * 
	 * @param fechalectura
	 */
	public void setFechalectura(Date fechalectura)
	{
		this.fechalectura = fechalectura;
	}

	/**
	 * Method 'getFecharetirada'
	 * 
	 * @return Date
	 */
	public Date getFecharetirada()
	{
		return fecharetirada;
	}

	/**
	 * Method 'setFecharetirada'
	 * 
	 * @param fecharetirada
	 */
	public void setFecharetirada(Date fecharetirada)
	{
		this.fecharetirada = fecharetirada;
	}

	/**
	 * Method 'getFechanalisis'
	 * 
	 * @return Date
	 */
	public Date getFechanalisis()
	{
		return fechanalisis;
	}

	/**
	 * Method 'setFechanalisis'
	 * 
	 * @param fechanalisis
	 */
	public void setFechanalisis(Date fechanalisis)
	{
		this.fechanalisis = fechanalisis;
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
	 * Method 'getComentariosCol'
	 * 
	 * @return String
	 */
	public String getComentariosCol()
	{
		return comentariosCol;
	}

	/**
	 * Method 'setComentariosCol'
	 * 
	 * @param comentariosCol
	 */
	public void setComentariosCol(String comentariosCol)
	{
		this.comentariosCol = comentariosCol;
	}

	/**
	 * Method 'getComentariosAna'
	 * 
	 * @return String
	 */
	public String getComentariosAna()
	{
		return comentariosAna;
	}

	/**
	 * Method 'setComentariosAna'
	 * 
	 * @param comentariosAna
	 */
	public void setComentariosAna(String comentariosAna)
	{
		this.comentariosAna = comentariosAna;
	}

	/**
	 * Method 'getRecomendaciones'
	 * 
	 * @return String
	 */
	public String getRecomendaciones()
	{
		return recomendaciones;
	}

	/**
	 * Method 'setRecomendaciones'
	 * 
	 * @param recomendaciones
	 */
	public void setRecomendaciones(String recomendaciones)
	{
		this.recomendaciones = recomendaciones;
	}

	/**
	 * Method 'getDiagnosticoini'
	 * 
	 * @return Integer
	 */
	public Integer getDiagnosticoini()
	{
		return diagnosticoini;
	}

	/**
	 * Method 'setDiagnosticoini'
	 * 
	 * @param diagnosticoini
	 */
	public void setDiagnosticoini(Integer diagnosticoini)
	{
		this.diagnosticoini = diagnosticoini;
	}

	/**
	 * Method 'getDiagnosticofin'
	 * 
	 * @return Integer
	 */
	public Integer getDiagnosticofin()
	{
		return diagnosticofin;
	}

	/**
	 * Method 'setDiagnosticofin'
	 * 
	 * @param diagnosticofin
	 */
	public void setDiagnosticofin(Integer diagnosticofin)
	{
		this.diagnosticofin = diagnosticofin;
	}

	/**
	 * Method 'getReferidor'
	 * 
	 * @return String
	 */
	public String getReferidor()
	{
		return referidor;
	}

	/**
	 * Method 'setReferidor'
	 * 
	 * @param referidor
	 */
	public void setReferidor(String referidor)
	{
		this.referidor = referidor;
	}

	/**
	 * Method 'getColocacionEnf'
	 * 
	 * @return String
	 */
	public String getColocacionEnf()
	{
		return colocacionEnf;
	}

	/**
	 * Method 'setColocacionEnf'
	 * 
	 * @param colocacionEnf
	 */
	public void setColocacionEnf(String colocacionEnf)
	{
		this.colocacionEnf = colocacionEnf;
	}

	/**
	 * Method 'getColocacionMed'
	 * 
	 * @return String
	 */
	public String getColocacionMed()
	{
		return colocacionMed;
	}

	/**
	 * Method 'setColocacionMed'
	 * 
	 * @param colocacionMed
	 */
	public void setColocacionMed(String colocacionMed)
	{
		this.colocacionMed = colocacionMed;
	}

	/**
	 * Method 'getAnalisisMed'
	 * 
	 * @return String
	 */
	public String getAnalisisMed()
	{
		return analisisMed;
	}

	/**
	 * Method 'setAnalisisMed'
	 * 
	 * @param analisisMed
	 */
	public void setAnalisisMed(String analisisMed)
	{
		this.analisisMed = analisisMed;
	}

	/**
	 * Method 'getRetiradaEnf'
	 * 
	 * @return String
	 */
	public String getRetiradaEnf()
	{
		return retiradaEnf;
	}

	/**
	 * Method 'setRetiradaEnf'
	 * 
	 * @param retiradaEnf
	 */
	public void setRetiradaEnf(String retiradaEnf)
	{
		this.retiradaEnf = retiradaEnf;
	}

	/**
	 * Method 'getRetiradaMed'
	 * 
	 * @return String
	 */
	public String getRetiradaMed()
	{
		return retiradaMed;
	}

	/**
	 * Method 'setRetiradaMed'
	 * 
	 * @param retiradaMed
	 */
	public void setRetiradaMed(String retiradaMed)
	{
		this.retiradaMed = retiradaMed;
	}

	/**
	 * Method 'getNproc'
	 * 
	 * @return String
	 */
	public String getNproc()
	{
		return nproc;
	}

	/**
	 * Method 'setNproc'
	 * 
	 * @param nproc
	 */
	public void setNproc(String nproc)
	{
		this.nproc = nproc;
	}

	/**
	 * Method 'getDiaginiotro'
	 * 
	 * @return String
	 */
	public String getDiaginiotro()
	{
		return diaginiotro;
	}

	/**
	 * Method 'setDiaginiotro'
	 * 
	 * @param diaginiotro
	 */
	public void setDiaginiotro(String diaginiotro)
	{
		this.diaginiotro = diaginiotro;
	}

	/**
	 * Method 'getDiagfinotro'
	 * 
	 * @return String
	 */
	public String getDiagfinotro()
	{
		return diagfinotro;
	}

	/**
	 * Method 'setDiagfinotro'
	 * 
	 * @param diagfinotro
	 */
	public void setDiagfinotro(String diagfinotro)
	{
		this.diagfinotro = diagfinotro;
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
		
		if (!(_other instanceof RegistradorEventosExt)) {
			return false;
		}
		
		final RegistradorEventosExt _cast = (RegistradorEventosExt) _other;
		if (idevento == null ? _cast.idevento != idevento : !idevento.equals( _cast.idevento )) {
			return false;
		}
		
		if (fechacolocacion == null ? _cast.fechacolocacion != fechacolocacion : !fechacolocacion.equals( _cast.fechacolocacion )) {
			return false;
		}
		
		if (fechalectura == null ? _cast.fechalectura != fechalectura : !fechalectura.equals( _cast.fechalectura )) {
			return false;
		}
		
		if (fecharetirada == null ? _cast.fecharetirada != fecharetirada : !fecharetirada.equals( _cast.fecharetirada )) {
			return false;
		}
		
		if (fechanalisis == null ? _cast.fechanalisis != fechanalisis : !fechanalisis.equals( _cast.fechanalisis )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
			return false;
		}
		
		if (comentariosCol == null ? _cast.comentariosCol != comentariosCol : !comentariosCol.equals( _cast.comentariosCol )) {
			return false;
		}
		
		if (comentariosAna == null ? _cast.comentariosAna != comentariosAna : !comentariosAna.equals( _cast.comentariosAna )) {
			return false;
		}
		
		if (recomendaciones == null ? _cast.recomendaciones != recomendaciones : !recomendaciones.equals( _cast.recomendaciones )) {
			return false;
		}
		
		if (diagnosticoini == null ? _cast.diagnosticoini != diagnosticoini : !diagnosticoini.equals( _cast.diagnosticoini )) {
			return false;
		}
		
		if (diagnosticofin == null ? _cast.diagnosticofin != diagnosticofin : !diagnosticofin.equals( _cast.diagnosticofin )) {
			return false;
		}
		
		if (referidor == null ? _cast.referidor != referidor : !referidor.equals( _cast.referidor )) {
			return false;
		}
		
		if (colocacionEnf == null ? _cast.colocacionEnf != colocacionEnf : !colocacionEnf.equals( _cast.colocacionEnf )) {
			return false;
		}
		
		if (colocacionMed == null ? _cast.colocacionMed != colocacionMed : !colocacionMed.equals( _cast.colocacionMed )) {
			return false;
		}
		
		if (analisisMed == null ? _cast.analisisMed != analisisMed : !analisisMed.equals( _cast.analisisMed )) {
			return false;
		}
		
		if (retiradaEnf == null ? _cast.retiradaEnf != retiradaEnf : !retiradaEnf.equals( _cast.retiradaEnf )) {
			return false;
		}
		
		if (retiradaMed == null ? _cast.retiradaMed != retiradaMed : !retiradaMed.equals( _cast.retiradaMed )) {
			return false;
		}
		
		if (nproc == null ? _cast.nproc != nproc : !nproc.equals( _cast.nproc )) {
			return false;
		}
		
		if (diaginiotro == null ? _cast.diaginiotro != diaginiotro : !diaginiotro.equals( _cast.diaginiotro )) {
			return false;
		}
		
		if (diagfinotro == null ? _cast.diagfinotro != diagfinotro : !diagfinotro.equals( _cast.diagfinotro )) {
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
		if (idevento != null) {
			_hashCode = 29 * _hashCode + idevento.hashCode();
		}
		
		if (fechacolocacion != null) {
			_hashCode = 29 * _hashCode + fechacolocacion.hashCode();
		}
		
		if (fechalectura != null) {
			_hashCode = 29 * _hashCode + fechalectura.hashCode();
		}
		
		if (fecharetirada != null) {
			_hashCode = 29 * _hashCode + fecharetirada.hashCode();
		}
		
		if (fechanalisis != null) {
			_hashCode = 29 * _hashCode + fechanalisis.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		if (comentariosCol != null) {
			_hashCode = 29 * _hashCode + comentariosCol.hashCode();
		}
		
		if (comentariosAna != null) {
			_hashCode = 29 * _hashCode + comentariosAna.hashCode();
		}
		
		if (recomendaciones != null) {
			_hashCode = 29 * _hashCode + recomendaciones.hashCode();
		}
		
		if (diagnosticoini != null) {
			_hashCode = 29 * _hashCode + diagnosticoini.hashCode();
		}
		
		if (diagnosticofin != null) {
			_hashCode = 29 * _hashCode + diagnosticofin.hashCode();
		}
		
		if (referidor != null) {
			_hashCode = 29 * _hashCode + referidor.hashCode();
		}
		
		if (colocacionEnf != null) {
			_hashCode = 29 * _hashCode + colocacionEnf.hashCode();
		}
		
		if (colocacionMed != null) {
			_hashCode = 29 * _hashCode + colocacionMed.hashCode();
		}
		
		if (analisisMed != null) {
			_hashCode = 29 * _hashCode + analisisMed.hashCode();
		}
		
		if (retiradaEnf != null) {
			_hashCode = 29 * _hashCode + retiradaEnf.hashCode();
		}
		
		if (retiradaMed != null) {
			_hashCode = 29 * _hashCode + retiradaMed.hashCode();
		}
		
		if (nproc != null) {
			_hashCode = 29 * _hashCode + nproc.hashCode();
		}
		
		if (diaginiotro != null) {
			_hashCode = 29 * _hashCode + diaginiotro.hashCode();
		}
		
		if (diagfinotro != null) {
			_hashCode = 29 * _hashCode + diagfinotro.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return RegistradorEventosExtPk
	 */
	public RegistradorEventosExtPk createPk()
	{
		return new RegistradorEventosExtPk(idevento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.RegistradorEventosExt: " );
		ret.append( "idevento=" + idevento );
		ret.append( ", fechacolocacion=" + fechacolocacion );
		ret.append( ", fechalectura=" + fechalectura );
		ret.append( ", fecharetirada=" + fecharetirada );
		ret.append( ", fechanalisis=" + fechanalisis );
		ret.append( ", estado=" + estado );
		ret.append( ", comentariosCol=" + comentariosCol );
		ret.append( ", comentariosAna=" + comentariosAna );
		ret.append( ", recomendaciones=" + recomendaciones );
		ret.append( ", diagnosticoini=" + diagnosticoini );
		ret.append( ", diagnosticofin=" + diagnosticofin );
		ret.append( ", referidor=" + referidor );
		ret.append( ", colocacionEnf=" + colocacionEnf );
		ret.append( ", colocacionMed=" + colocacionMed );
		ret.append( ", analisisMed=" + analisisMed );
		ret.append( ", retiradaEnf=" + retiradaEnf );
		ret.append( ", retiradaMed=" + retiradaMed );
		ret.append( ", nproc=" + nproc );
		ret.append( ", diaginiotro=" + diaginiotro );
		ret.append( ", diagfinotro=" + diagfinotro );
		return ret.toString();
	}

	public String getIdentevento() {
		return identevento;
	}

	public void setIdentevento(String identevento) {
		this.identevento = identevento;
	}
	
	public boolean isIniciado(){
		if(this.getEstado()!=null && this.getEstado()==2)
			return true;
		else return false;
	}

	public Boolean getLecturasd() {
		return lecturasd;
	}

	public void setLecturasd(Boolean lecturasd) {
		this.lecturasd = lecturasd;
	}

}
