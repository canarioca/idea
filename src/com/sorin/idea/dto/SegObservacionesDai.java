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

public class SegObservacionesDai implements Serializable
{
	/** 
	 * This attribute maps to the column IDOBSDAI in the seg_observaciones_dai table.
	 */
	protected Integer idobsdai;

	/** 
	 * This attribute maps to the column NUMEPISODIOS in the seg_observaciones_dai table.
	 */
	protected String numepisodios;

	/** 
	 * This attribute maps to the column NUMEPITSV in the seg_observaciones_dai table.
	 */
	protected String numepitsv;

	/** 
	 * This attribute maps to the column NUMEPITV in the seg_observaciones_dai table.
	 */
	protected String numepitv;

	/** 
	 * This attribute maps to the column NUMEPIFV in the seg_observaciones_dai table.
	 */
	protected String numepifv;

	/** 
	 * This attribute maps to the column NUMEPINOSOST in the seg_observaciones_dai table.
	 */
	protected String numepinosost;

	/** 
	 * This attribute maps to the column NUMEPINOESP in the seg_observaciones_dai table.
	 */
	protected String numepinoesp;

	/** 
	 * This attribute maps to the column ATP in the seg_observaciones_dai table.
	 */
	protected Short atp;

	/** 
	 * This attribute maps to the column NUMTERATP in the seg_observaciones_dai table.
	 */
	protected String numteratp;

	/** 
	 * This attribute maps to the column TODASEFECATP in the seg_observaciones_dai table.
	 */
	protected Short todasefecatp;

	/** 
	 * This attribute maps to the column CHOQ in the seg_observaciones_dai table.
	 */
	protected Short choq;

	/** 
	 * This attribute maps to the column NUMTERCHOQ in the seg_observaciones_dai table.
	 */
	protected String numterchoq;

	/** 
	 * This attribute maps to the column TODASEFECTCHOQ in the seg_observaciones_dai table.
	 */
	protected Short todasefectchoq;

	/** 
	 * This attribute maps to the column ULTCHOQENERGIA in the seg_observaciones_dai table.
	 */
	protected String ultchoqenergia;

	/** 
	 * This attribute maps to the column ULTCHOQTCARGA in the seg_observaciones_dai table.
	 */
	protected String ultchoqtcarga;

	/** 
	 * This attribute maps to the column ULTCHOQIMPEDANCIA in the seg_observaciones_dai table.
	 */
	protected String ultchoqimpedancia;

	/** 
	 * This attribute maps to the column TODASAPROPIADAS in the seg_observaciones_dai table.
	 */
	protected Integer todasapropiadas;

	/** 
	 * This attribute maps to the column MOTIVOTODASAPROPIADAS in the seg_observaciones_dai table.
	 */
	protected Integer motivotodasapropiadas;

	/** 
	 * This attribute maps to the column EPIRUIDO in the seg_observaciones_dai table.
	 */
	protected Short epiruido;
	
	protected boolean arritmias;
	protected boolean episodios;
	protected boolean terapiaentregada;
	protected boolean teratp;
	protected boolean terapiaefecatp;
	protected boolean terchoques;
	protected boolean terapiaefecchoq;
	protected boolean episodiosruido;

	/**
	 * Method 'SegObservacionesDai'
	 * 
	 */
	public SegObservacionesDai()
	{
	}

	/**
	 * Method 'getIdobsdai'
	 * 
	 * @return Integer
	 */
	public Integer getIdobsdai()
	{
		return idobsdai;
	}

	/**
	 * Method 'setIdobsdai'
	 * 
	 * @param idobsdai
	 */
	public void setIdobsdai(Integer idobsdai)
	{
		this.idobsdai = idobsdai;
	}

	/**
	 * Method 'getNumepisodios'
	 * 
	 * @return String
	 */
	public String getNumepisodios()
	{
		return numepisodios;
	}

	/**
	 * Method 'setNumepisodios'
	 * 
	 * @param numepisodios
	 */
	public void setNumepisodios(String numepisodios)
	{
		this.numepisodios = numepisodios;
	}

	/**
	 * Method 'getNumepitsv'
	 * 
	 * @return String
	 */
	public String getNumepitsv()
	{
		return numepitsv;
	}

	/**
	 * Method 'setNumepitsv'
	 * 
	 * @param numepitsv
	 */
	public void setNumepitsv(String numepitsv)
	{
		this.numepitsv = numepitsv;
	}

	/**
	 * Method 'getNumepitv'
	 * 
	 * @return String
	 */
	public String getNumepitv()
	{
		return numepitv;
	}

	/**
	 * Method 'setNumepitv'
	 * 
	 * @param numepitv
	 */
	public void setNumepitv(String numepitv)
	{
		this.numepitv = numepitv;
	}

	/**
	 * Method 'getNumepifv'
	 * 
	 * @return String
	 */
	public String getNumepifv()
	{
		return numepifv;
	}

	/**
	 * Method 'setNumepifv'
	 * 
	 * @param numepifv
	 */
	public void setNumepifv(String numepifv)
	{
		this.numepifv = numepifv;
	}

	/**
	 * Method 'getNumepinosost'
	 * 
	 * @return String
	 */
	public String getNumepinosost()
	{
		return numepinosost;
	}

	/**
	 * Method 'setNumepinosost'
	 * 
	 * @param numepinosost
	 */
	public void setNumepinosost(String numepinosost)
	{
		this.numepinosost = numepinosost;
	}

	/**
	 * Method 'getNumepinoesp'
	 * 
	 * @return String
	 */
	public String getNumepinoesp()
	{
		return numepinoesp;
	}

	/**
	 * Method 'setNumepinoesp'
	 * 
	 * @param numepinoesp
	 */
	public void setNumepinoesp(String numepinoesp)
	{
		this.numepinoesp = numepinoesp;
	}

	/**
	 * Method 'getAtp'
	 * 
	 * @return Short
	 */
	public Short getAtp()
	{
		return atp;
	}

	/**
	 * Method 'setAtp'
	 * 
	 * @param atp
	 */
	public void setAtp(Short atp)
	{
		this.atp = atp;
	}

	/**
	 * Method 'getNumteratp'
	 * 
	 * @return String
	 */
	public String getNumteratp()
	{
		return numteratp;
	}

	/**
	 * Method 'setNumteratp'
	 * 
	 * @param numteratp
	 */
	public void setNumteratp(String numteratp)
	{
		this.numteratp = numteratp;
	}

	/**
	 * Method 'getTodasefecatp'
	 * 
	 * @return Short
	 */
	public Short getTodasefecatp()
	{
		return todasefecatp;
	}

	/**
	 * Method 'setTodasefecatp'
	 * 
	 * @param todasefecatp
	 */
	public void setTodasefecatp(Short todasefecatp)
	{
		this.todasefecatp = todasefecatp;
	}

	/**
	 * Method 'getChoq'
	 * 
	 * @return Short
	 */
	public Short getChoq()
	{
		return choq;
	}

	/**
	 * Method 'setChoq'
	 * 
	 * @param choq
	 */
	public void setChoq(Short choq)
	{
		this.choq = choq;
	}

	/**
	 * Method 'getNumterchoq'
	 * 
	 * @return String
	 */
	public String getNumterchoq()
	{
		return numterchoq;
	}

	/**
	 * Method 'setNumterchoq'
	 * 
	 * @param numterchoq
	 */
	public void setNumterchoq(String numterchoq)
	{
		this.numterchoq = numterchoq;
	}

	/**
	 * Method 'getTodasefectchoq'
	 * 
	 * @return Short
	 */
	public Short getTodasefectchoq()
	{
		return todasefectchoq;
	}

	/**
	 * Method 'setTodasefectchoq'
	 * 
	 * @param todasefectchoq
	 */
	public void setTodasefectchoq(Short todasefectchoq)
	{
		this.todasefectchoq = todasefectchoq;
	}

	/**
	 * Method 'getUltchoqenergia'
	 * 
	 * @return String
	 */
	public String getUltchoqenergia()
	{
		return ultchoqenergia;
	}

	/**
	 * Method 'setUltchoqenergia'
	 * 
	 * @param ultchoqenergia
	 */
	public void setUltchoqenergia(String ultchoqenergia)
	{
		this.ultchoqenergia = ultchoqenergia;
	}

	/**
	 * Method 'getUltchoqtcarga'
	 * 
	 * @return String
	 */
	public String getUltchoqtcarga()
	{
		return ultchoqtcarga;
	}

	/**
	 * Method 'setUltchoqtcarga'
	 * 
	 * @param ultchoqtcarga
	 */
	public void setUltchoqtcarga(String ultchoqtcarga)
	{
		this.ultchoqtcarga = ultchoqtcarga;
	}

	/**
	 * Method 'getUltchoqimpedancia'
	 * 
	 * @return String
	 */
	public String getUltchoqimpedancia()
	{
		return ultchoqimpedancia;
	}

	/**
	 * Method 'setUltchoqimpedancia'
	 * 
	 * @param ultchoqimpedancia
	 */
	public void setUltchoqimpedancia(String ultchoqimpedancia)
	{
		this.ultchoqimpedancia = ultchoqimpedancia;
	}

	/**
	 * Method 'getTodasapropiadas'
	 * 
	 * @return Integer
	 */
	public Integer getTodasapropiadas()
	{
		return todasapropiadas;
	}

	/**
	 * Method 'setTodasapropiadas'
	 * 
	 * @param todasapropiadas
	 */
	public void setTodasapropiadas(Integer todasapropiadas)
	{
		this.todasapropiadas = todasapropiadas;
	}

	/**
	 * Method 'getMotivotodasapropiadas'
	 * 
	 * @return Integer
	 */
	public Integer getMotivotodasapropiadas()
	{
		return motivotodasapropiadas;
	}

	/**
	 * Method 'setMotivotodasapropiadas'
	 * 
	 * @param motivotodasapropiadas
	 */
	public void setMotivotodasapropiadas(Integer motivotodasapropiadas)
	{
		this.motivotodasapropiadas = motivotodasapropiadas;
	}

	/**
	 * Method 'getEpiruido'
	 * 
	 * @return Short
	 */
	public Short getEpiruido()
	{
		return epiruido;
	}

	/**
	 * Method 'setEpiruido'
	 * 
	 * @param epiruido
	 */
	public void setEpiruido(Short epiruido)
	{
		this.epiruido = epiruido;
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
		
		if (!(_other instanceof SegObservacionesDai)) {
			return false;
		}
		
		final SegObservacionesDai _cast = (SegObservacionesDai) _other;
		if (idobsdai == null ? _cast.idobsdai != idobsdai : !idobsdai.equals( _cast.idobsdai )) {
			return false;
		}
		
		if (numepisodios == null ? _cast.numepisodios != numepisodios : !numepisodios.equals( _cast.numepisodios )) {
			return false;
		}
		
		if (numepitsv == null ? _cast.numepitsv != numepitsv : !numepitsv.equals( _cast.numepitsv )) {
			return false;
		}
		
		if (numepitv == null ? _cast.numepitv != numepitv : !numepitv.equals( _cast.numepitv )) {
			return false;
		}
		
		if (numepifv == null ? _cast.numepifv != numepifv : !numepifv.equals( _cast.numepifv )) {
			return false;
		}
		
		if (numepinosost == null ? _cast.numepinosost != numepinosost : !numepinosost.equals( _cast.numepinosost )) {
			return false;
		}
		
		if (numepinoesp == null ? _cast.numepinoesp != numepinoesp : !numepinoesp.equals( _cast.numepinoesp )) {
			return false;
		}
		
		if (atp == null ? _cast.atp != atp : !atp.equals( _cast.atp )) {
			return false;
		}
		
		if (numteratp == null ? _cast.numteratp != numteratp : !numteratp.equals( _cast.numteratp )) {
			return false;
		}
		
		if (todasefecatp == null ? _cast.todasefecatp != todasefecatp : !todasefecatp.equals( _cast.todasefecatp )) {
			return false;
		}
		
		if (choq == null ? _cast.choq != choq : !choq.equals( _cast.choq )) {
			return false;
		}
		
		if (numterchoq == null ? _cast.numterchoq != numterchoq : !numterchoq.equals( _cast.numterchoq )) {
			return false;
		}
		
		if (todasefectchoq == null ? _cast.todasefectchoq != todasefectchoq : !todasefectchoq.equals( _cast.todasefectchoq )) {
			return false;
		}
		
		if (ultchoqenergia == null ? _cast.ultchoqenergia != ultchoqenergia : !ultchoqenergia.equals( _cast.ultchoqenergia )) {
			return false;
		}
		
		if (ultchoqtcarga == null ? _cast.ultchoqtcarga != ultchoqtcarga : !ultchoqtcarga.equals( _cast.ultchoqtcarga )) {
			return false;
		}
		
		if (ultchoqimpedancia == null ? _cast.ultchoqimpedancia != ultchoqimpedancia : !ultchoqimpedancia.equals( _cast.ultchoqimpedancia )) {
			return false;
		}
		
		if (todasapropiadas == null ? _cast.todasapropiadas != todasapropiadas : !todasapropiadas.equals( _cast.todasapropiadas )) {
			return false;
		}
		
		if (motivotodasapropiadas == null ? _cast.motivotodasapropiadas != motivotodasapropiadas : !motivotodasapropiadas.equals( _cast.motivotodasapropiadas )) {
			return false;
		}
		
		if (epiruido == null ? _cast.epiruido != epiruido : !epiruido.equals( _cast.epiruido )) {
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
		if (idobsdai != null) {
			_hashCode = 29 * _hashCode + idobsdai.hashCode();
		}
		
		if (numepisodios != null) {
			_hashCode = 29 * _hashCode + numepisodios.hashCode();
		}
		
		if (numepitsv != null) {
			_hashCode = 29 * _hashCode + numepitsv.hashCode();
		}
		
		if (numepitv != null) {
			_hashCode = 29 * _hashCode + numepitv.hashCode();
		}
		
		if (numepifv != null) {
			_hashCode = 29 * _hashCode + numepifv.hashCode();
		}
		
		if (numepinosost != null) {
			_hashCode = 29 * _hashCode + numepinosost.hashCode();
		}
		
		if (numepinoesp != null) {
			_hashCode = 29 * _hashCode + numepinoesp.hashCode();
		}
		
		if (atp != null) {
			_hashCode = 29 * _hashCode + atp.hashCode();
		}
		
		if (numteratp != null) {
			_hashCode = 29 * _hashCode + numteratp.hashCode();
		}
		
		if (todasefecatp != null) {
			_hashCode = 29 * _hashCode + todasefecatp.hashCode();
		}
		
		if (choq != null) {
			_hashCode = 29 * _hashCode + choq.hashCode();
		}
		
		if (numterchoq != null) {
			_hashCode = 29 * _hashCode + numterchoq.hashCode();
		}
		
		if (todasefectchoq != null) {
			_hashCode = 29 * _hashCode + todasefectchoq.hashCode();
		}
		
		if (ultchoqenergia != null) {
			_hashCode = 29 * _hashCode + ultchoqenergia.hashCode();
		}
		
		if (ultchoqtcarga != null) {
			_hashCode = 29 * _hashCode + ultchoqtcarga.hashCode();
		}
		
		if (ultchoqimpedancia != null) {
			_hashCode = 29 * _hashCode + ultchoqimpedancia.hashCode();
		}
		
		if (todasapropiadas != null) {
			_hashCode = 29 * _hashCode + todasapropiadas.hashCode();
		}
		
		if (motivotodasapropiadas != null) {
			_hashCode = 29 * _hashCode + motivotodasapropiadas.hashCode();
		}
		
		if (epiruido != null) {
			_hashCode = 29 * _hashCode + epiruido.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SegObservacionesDaiPk
	 */
	public SegObservacionesDaiPk createPk()
	{
		return new SegObservacionesDaiPk(idobsdai);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.SegObservacionesDai: " );
		ret.append( "idobsdai=" + idobsdai );
		ret.append( ", numepisodios=" + numepisodios );
		ret.append( ", numepitsv=" + numepitsv );
		ret.append( ", numepitv=" + numepitv );
		ret.append( ", numepifv=" + numepifv );
		ret.append( ", numepinosost=" + numepinosost );
		ret.append( ", numepinoesp=" + numepinoesp );
		ret.append( ", atp=" + atp );
		ret.append( ", numteratp=" + numteratp );
		ret.append( ", todasefecatp=" + todasefecatp );
		ret.append( ", choq=" + choq );
		ret.append( ", numterchoq=" + numterchoq );
		ret.append( ", todasefectchoq=" + todasefectchoq );
		ret.append( ", ultchoqenergia=" + ultchoqenergia );
		ret.append( ", ultchoqtcarga=" + ultchoqtcarga );
		ret.append( ", ultchoqimpedancia=" + ultchoqimpedancia );
		ret.append( ", todasapropiadas=" + todasapropiadas );
		ret.append( ", motivotodasapropiadas=" + motivotodasapropiadas );
		ret.append( ", epiruido=" + epiruido );
		return ret.toString();
	}
	public boolean isEpisodios() {
		return episodios;
	}

	public void setEpisodios(boolean episodios) {
		this.episodios = episodios;
	}

	public boolean isTerapiaentregada() {
		return terapiaentregada;
	}

	public void setTerapiaentregada(boolean terapiaentregada) {
		this.terapiaentregada = terapiaentregada;
	}

	public boolean isTeratp() {
		return teratp;
	}

	public void setTeratp(boolean teratp) {
		this.teratp = teratp;
	}

	public boolean isTerapiaefecatp() {
		return terapiaefecatp;
	}

	public void setTerapiaefecatp(boolean terapiaefecatp) {
		this.terapiaefecatp = terapiaefecatp;
	}

	public boolean isTerchoques() {
		return terchoques;
	}

	public void setTerchoques(boolean terchoques) {
		this.terchoques = terchoques;
	}

	public boolean isTerapiaefecchoq() {
		return terapiaefecchoq;
	}

	public void setTerapiaefecchoq(boolean terapiaefecchoq) {
		this.terapiaefecchoq = terapiaefecchoq;
	}

	public boolean isArritmias() {
		return arritmias;
	}

	public void setArritmias(boolean arritmias) {
		this.arritmias = arritmias;
	}

	public boolean isEpisodiosruido() {
		return episodiosruido;
	}

	public void setEpisodiosruido(boolean episodiosruido) {
		this.episodiosruido = episodiosruido;
	}

}