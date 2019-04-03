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

import org.apache.myfaces.component.html.ext.HtmlDataTable;

import com.sorin.idea.dao.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.util.UtilFechas;

public class ArrRegistrador implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PACIENTE in the arr_registrador table.
	 */
	protected Integer idPaciente;

	/** 
	 * This attribute maps to the column ID_REGISTRADOR in the arr_registrador table.
	 */
	protected Integer idRegistrador;

	/** 
	 * This attribute maps to the column FECHA in the arr_registrador table.
	 */
	protected Date fecha = new Date();;

	/** 
	 * This attribute maps to the column NPROC in the arr_registrador table.
	 */
	protected String nproc;

	/** 
	 * This attribute maps to the column REFERIDOR in the arr_registrador table.
	 */
	protected String referidor;

	/** 
	 * This attribute maps to the column INDICACION in the arr_registrador table.
	 */
	protected Integer indicacion;

	/** 
	 * This attribute maps to the column INDICACIONSINCOPE in the arr_registrador table.
	 */
	protected Integer indicacionsincope;

	/** 
	 * This attribute maps to the column INDICACIONSINCOPEN in the arr_registrador table.
	 */
	protected Integer indicacionsincopen;

	/** 
	 * This attribute maps to the column OP_ENF in the arr_registrador table.
	 */
	protected String opEnf;

	/** 
	 * This attribute maps to the column OP_MED in the arr_registrador table.
	 */
	protected String opMed;

	/** 
	 * This attribute maps to the column IMPLANTE_SALA in the arr_registrador table.
	 */
	protected String implanteSala;

	/** 
	 * This attribute maps to the column IMPLANTE_MODELO in the arr_registrador table.
	 */
	protected String implanteModelo;

	/** 
	 * This attribute maps to the column IMPLANTE_ZONA in the arr_registrador table.
	 */
	protected Integer implanteZona;

	/** 
	 * This attribute maps to the column CARDIOPATIA in the arr_registrador table.
	 */
	protected Integer cardiopatia;

	/** 
	 * This attribute maps to the column SHELDON_A in the arr_registrador table.
	 */
	protected Integer sheldonA;

	/** 
	 * This attribute maps to the column SHELDON_B in the arr_registrador table.
	 */
	protected Integer sheldonB;

	/** 
	 * This attribute maps to the column SHELDON_C in the arr_registrador table.
	 */
	protected Integer sheldonC;

	/** 
	 * This attribute maps to the column SHELDON_D in the arr_registrador table.
	 */
	protected Integer sheldonD;

	/** 
	 * This attribute maps to the column SHELDON_E in the arr_registrador table.
	 */
	protected Integer sheldonE;

	/** 
	 * This attribute maps to the column SHELDON_F in the arr_registrador table.
	 */
	protected Integer sheldonF;

	/** 
	 * This attribute maps to the column SHELDON_G in the arr_registrador table.
	 */
	protected Integer sheldonG;

	/** 
	 * This attribute maps to the column RES_N1 in the arr_registrador table.
	 */
	protected Integer resN1;

	/** 
	 * This attribute maps to the column RES_N2 in the arr_registrador table.
	 */
	protected Integer resN2;

	/** 
	 * This attribute maps to the column EXPLANTE_FECHA in the arr_registrador table.
	 */
	protected Date explanteFecha;

	/** 
	 * This attribute maps to the column EXPLANTE_OP_ENF in the arr_registrador table.
	 */
	protected String explanteOpEnf;

	/** 
	 * This attribute maps to the column EXPLANTE_OPMED in the arr_registrador table.
	 */
	protected String explanteOpmed;

	/** 
	 * This attribute maps to the column EXPLANTE_DIAGNOSTICO in the arr_registrador table.
	 */
	protected Integer explanteDiagnostico;

	/** 
	 * This attribute maps to the column COMENTARIOS in the arr_registrador table.
	 */
	protected String comentarios;

	/** 
	 * This attribute maps to the column COMPLICACIONES in the arr_registrador table.
	 */
	protected String complicaciones;

	/** 
	 * This attribute maps to the column EPISODIO in the arr_registrador table.
	 */
	protected String episodio;

	/** 
	 * This attribute maps to the column NSERIE in the arr_registrador table.
	 */
	protected String nserie;

	/** 
	 * This attribute maps to the column IDMODELOREG in the arr_registrador table.
	 */
	protected Integer idmodeloreg;

	/**
	 * Method 'ArrRegistrador'
	 * 
	 */
	 
	protected ArrRegistradorEcg ecgdto;
	
	protected ArrayList<GenericosDto> compArr;
	protected HtmlDataTable bincomp;
	
	private String barcode;
	private boolean muestrabarcode;
	
	public ArrRegistrador()
	{
		this.fecha = new Date();
		String a�o = "" + (this.fecha.getYear() + 1900);
		this.nproc = a�o.substring(2);
		this.ecgdto = new ArrRegistradorEcg();
		this.compArr = new ArrayList<GenericosDto>();
		this.comentarios = "";
		this.complicaciones = "";
		this.referidor = "0";
		this.opMed = "0";
		this.opEnf = "0";
		this.explanteOpEnf = "0";
		this.explanteOpmed = "0";
		this.indicacion = 0;
		this.indicacionsincope = 0;
		this.indicacionsincopen = 0;
		this.implanteModelo = "";
		this.muestrabarcode = true;
	}

	public String getFechaStr()
	{
		return UtilFechas.dateToString(fecha);
	}
	
	/**
	 * Method 'getIdPaciente'
	 * 
	 * @return Integer
	 */
	public Integer getIdPaciente()
	{
		return idPaciente;
	}

	/**
	 * Method 'setIdPaciente'
	 * 
	 * @param idPaciente
	 */
	public void setIdPaciente(Integer idPaciente)
	{
		this.idPaciente = idPaciente;
	}

	/**
	 * Method 'getIdRegistrador'
	 * 
	 * @return Integer
	 */
	public Integer getIdRegistrador()
	{
		return idRegistrador;
	}

	/**
	 * Method 'setIdRegistrador'
	 * 
	 * @param idRegistrador
	 */
	public void setIdRegistrador(Integer idRegistrador)
	{
		this.idRegistrador = idRegistrador;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
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
	 * Method 'getIndicacion'
	 * 
	 * @return Integer
	 */
	public Integer getIndicacion()
	{
		return indicacion;
	}

	/**
	 * Method 'setIndicacion'
	 * 
	 * @param indicacion
	 */
	public void setIndicacion(Integer indicacion)
	{
		this.indicacion = indicacion;
	}

	/**
	 * Method 'getIndicacionsincope'
	 * 
	 * @return Integer
	 */
	public Integer getIndicacionsincope()
	{
		return indicacionsincope;
	}

	/**
	 * Method 'setIndicacionsincope'
	 * 
	 * @param indicacionsincope
	 */
	public void setIndicacionsincope(Integer indicacionsincope)
	{
		this.indicacionsincope = indicacionsincope;
	}

	/**
	 * Method 'getIndicacionsincopen'
	 * 
	 * @return Integer
	 */
	public Integer getIndicacionsincopen()
	{
		return indicacionsincopen;
	}

	/**
	 * Method 'setIndicacionsincopen'
	 * 
	 * @param indicacionsincopen
	 */
	public void setIndicacionsincopen(Integer indicacionsincopen)
	{
		this.indicacionsincopen = indicacionsincopen;
	}

	/**
	 * Method 'getOpEnf'
	 * 
	 * @return String
	 */
	public String getOpEnf()
	{
		return opEnf;
	}

	/**
	 * Method 'setOpEnf'
	 * 
	 * @param opEnf
	 */
	public void setOpEnf(String opEnf)
	{
		this.opEnf = opEnf;
	}

	/**
	 * Method 'getOpMed'
	 * 
	 * @return String
	 */
	public String getOpMed()
	{
		return opMed;
	}

	/**
	 * Method 'setOpMed'
	 * 
	 * @param opMed
	 */
	public void setOpMed(String opMed)
	{
		this.opMed = opMed;
	}

	/**
	 * Method 'getImplanteSala'
	 * 
	 * @return String
	 */
	public String getImplanteSala()
	{
		return implanteSala;
	}

	/**
	 * Method 'setImplanteSala'
	 * 
	 * @param implanteSala
	 */
	public void setImplanteSala(String implanteSala)
	{
		this.implanteSala = implanteSala;
	}

	/**
	 * Method 'getImplanteModelo'
	 * 
	 * @return String
	 */
	public String getImplanteModelo()
	{
		return implanteModelo;
	}

	/**
	 * Method 'setImplanteModelo'
	 * 
	 * @param implanteModelo
	 */
	public void setImplanteModelo(String implanteModelo)
	{
		this.implanteModelo = implanteModelo;
	}

	/**
	 * Method 'getImplanteZona'
	 * 
	 * @return Integer
	 */
	public Integer getImplanteZona()
	{
		return implanteZona;
	}

	/**
	 * Method 'setImplanteZona'
	 * 
	 * @param implanteZona
	 */
	public void setImplanteZona(Integer implanteZona)
	{
		this.implanteZona = implanteZona;
	}

	/**
	 * Method 'getCardiopatia'
	 * 
	 * @return Integer
	 */
	public Integer getCardiopatia()
	{
		return cardiopatia;
	}

	/**
	 * Method 'setCardiopatia'
	 * 
	 * @param cardiopatia
	 */
	public void setCardiopatia(Integer cardiopatia)
	{
		this.cardiopatia = cardiopatia;
	}

	/**
	 * Method 'getSheldonA'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonA()
	{
		return sheldonA;
	}

	/**
	 * Method 'setSheldonA'
	 * 
	 * @param sheldonA
	 */
	public void setSheldonA(Integer sheldonA)
	{
		this.sheldonA = sheldonA;
	}

	/**
	 * Method 'getSheldonB'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonB()
	{
		return sheldonB;
	}

	/**
	 * Method 'setSheldonB'
	 * 
	 * @param sheldonB
	 */
	public void setSheldonB(Integer sheldonB)
	{
		this.sheldonB = sheldonB;
	}

	/**
	 * Method 'getSheldonC'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonC()
	{
		return sheldonC;
	}

	/**
	 * Method 'setSheldonC'
	 * 
	 * @param sheldonC
	 */
	public void setSheldonC(Integer sheldonC)
	{
		this.sheldonC = sheldonC;
	}

	/**
	 * Method 'getSheldonD'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonD()
	{
		return sheldonD;
	}

	/**
	 * Method 'setSheldonD'
	 * 
	 * @param sheldonD
	 */
	public void setSheldonD(Integer sheldonD)
	{
		this.sheldonD = sheldonD;
	}

	/**
	 * Method 'getSheldonE'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonE()
	{
		return sheldonE;
	}

	/**
	 * Method 'setSheldonE'
	 * 
	 * @param sheldonE
	 */
	public void setSheldonE(Integer sheldonE)
	{
		this.sheldonE = sheldonE;
	}

	/**
	 * Method 'getSheldonF'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonF()
	{
		return sheldonF;
	}

	/**
	 * Method 'setSheldonF'
	 * 
	 * @param sheldonF
	 */
	public void setSheldonF(Integer sheldonF)
	{
		this.sheldonF = sheldonF;
	}

	/**
	 * Method 'getSheldonG'
	 * 
	 * @return Integer
	 */
	public Integer getSheldonG()
	{
		return sheldonG;
	}

	/**
	 * Method 'setSheldonG'
	 * 
	 * @param sheldonG
	 */
	public void setSheldonG(Integer sheldonG)
	{
		this.sheldonG = sheldonG;
	}

	/**
	 * Method 'getResN1'
	 * 
	 * @return Integer
	 */
	public Integer getResN1()
	{
		return resN1;
	}

	/**
	 * Method 'setResN1'
	 * 
	 * @param resN1
	 */
	public void setResN1(Integer resN1)
	{
		this.resN1 = resN1;
	}

	/**
	 * Method 'getResN2'
	 * 
	 * @return Integer
	 */
	public Integer getResN2()
	{
		return resN2;
	}

	/**
	 * Method 'setResN2'
	 * 
	 * @param resN2
	 */
	public void setResN2(Integer resN2)
	{
		this.resN2 = resN2;
	}

	/**
	 * Method 'getExplanteFecha'
	 * 
	 * @return Date
	 */
	public Date getExplanteFecha()
	{
		return explanteFecha;
	}

	/**
	 * Method 'setExplanteFecha'
	 * 
	 * @param explanteFecha
	 */
	public void setExplanteFecha(Date explanteFecha)
	{
		this.explanteFecha = explanteFecha;
	}

	/**
	 * Method 'getExplanteOpEnf'
	 * 
	 * @return String
	 */
	public String getExplanteOpEnf()
	{
		return explanteOpEnf;
	}

	/**
	 * Method 'setExplanteOpEnf'
	 * 
	 * @param explanteOpEnf
	 */
	public void setExplanteOpEnf(String explanteOpEnf)
	{
		this.explanteOpEnf = explanteOpEnf;
	}

	/**
	 * Method 'getExplanteOpmed'
	 * 
	 * @return String
	 */
	public String getExplanteOpmed()
	{
		return explanteOpmed;
	}

	/**
	 * Method 'setExplanteOpmed'
	 * 
	 * @param explanteOpmed
	 */
	public void setExplanteOpmed(String explanteOpmed)
	{
		this.explanteOpmed = explanteOpmed;
	}

	/**
	 * Method 'getExplanteDiagnostico'
	 * 
	 * @return Integer
	 */
	public Integer getExplanteDiagnostico()
	{
		return explanteDiagnostico;
	}

	/**
	 * Method 'setExplanteDiagnostico'
	 * 
	 * @param explanteDiagnostico
	 */
	public void setExplanteDiagnostico(Integer explanteDiagnostico)
	{
		this.explanteDiagnostico = explanteDiagnostico;
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
	 * Method 'getComplicaciones'
	 * 
	 * @return String
	 */
	public String getComplicaciones()
	{
		return complicaciones;
	}

	/**
	 * Method 'setComplicaciones'
	 * 
	 * @param complicaciones
	 */
	public void setComplicaciones(String complicaciones)
	{
		this.complicaciones = complicaciones;
	}

	/**
	 * Method 'getEpisodio'
	 * 
	 * @return String
	 */
	public String getEpisodio()
	{
		return episodio;
	}

	/**
	 * Method 'setEpisodio'
	 * 
	 * @param episodio
	 */
	public void setEpisodio(String episodio)
	{
		this.episodio = episodio;
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
	 * Method 'getIdmodeloreg'
	 * 
	 * @return Integer
	 */
	public Integer getIdmodeloreg()
	{
		return idmodeloreg;
	}

	/**
	 * Method 'setIdmodeloreg'
	 * 
	 * @param idmodeloreg
	 */
	public void setIdmodeloreg(Integer idmodeloreg)
	{
		this.idmodeloreg = idmodeloreg;
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
		
		if (!(_other instanceof ArrRegistrador)) {
			return false;
		}
		
		final ArrRegistrador _cast = (ArrRegistrador) _other;
		if (idPaciente == null ? _cast.idPaciente != idPaciente : !idPaciente.equals( _cast.idPaciente )) {
			return false;
		}
		
		if (idRegistrador == null ? _cast.idRegistrador != idRegistrador : !idRegistrador.equals( _cast.idRegistrador )) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (nproc == null ? _cast.nproc != nproc : !nproc.equals( _cast.nproc )) {
			return false;
		}
		
		if (referidor == null ? _cast.referidor != referidor : !referidor.equals( _cast.referidor )) {
			return false;
		}
		
		if (indicacion == null ? _cast.indicacion != indicacion : !indicacion.equals( _cast.indicacion )) {
			return false;
		}
		
		if (indicacionsincope == null ? _cast.indicacionsincope != indicacionsincope : !indicacionsincope.equals( _cast.indicacionsincope )) {
			return false;
		}
		
		if (indicacionsincopen == null ? _cast.indicacionsincopen != indicacionsincopen : !indicacionsincopen.equals( _cast.indicacionsincopen )) {
			return false;
		}
		
		if (opEnf == null ? _cast.opEnf != opEnf : !opEnf.equals( _cast.opEnf )) {
			return false;
		}
		
		if (opMed == null ? _cast.opMed != opMed : !opMed.equals( _cast.opMed )) {
			return false;
		}
		
		if (implanteSala == null ? _cast.implanteSala != implanteSala : !implanteSala.equals( _cast.implanteSala )) {
			return false;
		}
		
		if (implanteModelo == null ? _cast.implanteModelo != implanteModelo : !implanteModelo.equals( _cast.implanteModelo )) {
			return false;
		}
		
		if (implanteZona == null ? _cast.implanteZona != implanteZona : !implanteZona.equals( _cast.implanteZona )) {
			return false;
		}
		
		if (cardiopatia == null ? _cast.cardiopatia != cardiopatia : !cardiopatia.equals( _cast.cardiopatia )) {
			return false;
		}
		
		if (sheldonA == null ? _cast.sheldonA != sheldonA : !sheldonA.equals( _cast.sheldonA )) {
			return false;
		}
		
		if (sheldonB == null ? _cast.sheldonB != sheldonB : !sheldonB.equals( _cast.sheldonB )) {
			return false;
		}
		
		if (sheldonC == null ? _cast.sheldonC != sheldonC : !sheldonC.equals( _cast.sheldonC )) {
			return false;
		}
		
		if (sheldonD == null ? _cast.sheldonD != sheldonD : !sheldonD.equals( _cast.sheldonD )) {
			return false;
		}
		
		if (sheldonE == null ? _cast.sheldonE != sheldonE : !sheldonE.equals( _cast.sheldonE )) {
			return false;
		}
		
		if (sheldonF == null ? _cast.sheldonF != sheldonF : !sheldonF.equals( _cast.sheldonF )) {
			return false;
		}
		
		if (sheldonG == null ? _cast.sheldonG != sheldonG : !sheldonG.equals( _cast.sheldonG )) {
			return false;
		}
		
		if (resN1 == null ? _cast.resN1 != resN1 : !resN1.equals( _cast.resN1 )) {
			return false;
		}
		
		if (resN2 == null ? _cast.resN2 != resN2 : !resN2.equals( _cast.resN2 )) {
			return false;
		}
		
		if (explanteFecha == null ? _cast.explanteFecha != explanteFecha : !explanteFecha.equals( _cast.explanteFecha )) {
			return false;
		}
		
		if (explanteOpEnf == null ? _cast.explanteOpEnf != explanteOpEnf : !explanteOpEnf.equals( _cast.explanteOpEnf )) {
			return false;
		}
		
		if (explanteOpmed == null ? _cast.explanteOpmed != explanteOpmed : !explanteOpmed.equals( _cast.explanteOpmed )) {
			return false;
		}
		
		if (explanteDiagnostico == null ? _cast.explanteDiagnostico != explanteDiagnostico : !explanteDiagnostico.equals( _cast.explanteDiagnostico )) {
			return false;
		}
		
		if (comentarios == null ? _cast.comentarios != comentarios : !comentarios.equals( _cast.comentarios )) {
			return false;
		}
		
		if (complicaciones == null ? _cast.complicaciones != complicaciones : !complicaciones.equals( _cast.complicaciones )) {
			return false;
		}
		
		if (episodio == null ? _cast.episodio != episodio : !episodio.equals( _cast.episodio )) {
			return false;
		}
		
		if (nserie == null ? _cast.nserie != nserie : !nserie.equals( _cast.nserie )) {
			return false;
		}
		
		if (idmodeloreg == null ? _cast.idmodeloreg != idmodeloreg : !idmodeloreg.equals( _cast.idmodeloreg )) {
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
		if (idPaciente != null) {
			_hashCode = 29 * _hashCode + idPaciente.hashCode();
		}
		
		if (idRegistrador != null) {
			_hashCode = 29 * _hashCode + idRegistrador.hashCode();
		}
		
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		if (nproc != null) {
			_hashCode = 29 * _hashCode + nproc.hashCode();
		}
		
		if (referidor != null) {
			_hashCode = 29 * _hashCode + referidor.hashCode();
		}
		
		if (indicacion != null) {
			_hashCode = 29 * _hashCode + indicacion.hashCode();
		}
		
		if (indicacionsincope != null) {
			_hashCode = 29 * _hashCode + indicacionsincope.hashCode();
		}
		
		if (indicacionsincopen != null) {
			_hashCode = 29 * _hashCode + indicacionsincopen.hashCode();
		}
		
		if (opEnf != null) {
			_hashCode = 29 * _hashCode + opEnf.hashCode();
		}
		
		if (opMed != null) {
			_hashCode = 29 * _hashCode + opMed.hashCode();
		}
		
		if (implanteSala != null) {
			_hashCode = 29 * _hashCode + implanteSala.hashCode();
		}
		
		if (implanteModelo != null) {
			_hashCode = 29 * _hashCode + implanteModelo.hashCode();
		}
		
		if (implanteZona != null) {
			_hashCode = 29 * _hashCode + implanteZona.hashCode();
		}
		
		if (cardiopatia != null) {
			_hashCode = 29 * _hashCode + cardiopatia.hashCode();
		}
		
		if (sheldonA != null) {
			_hashCode = 29 * _hashCode + sheldonA.hashCode();
		}
		
		if (sheldonB != null) {
			_hashCode = 29 * _hashCode + sheldonB.hashCode();
		}
		
		if (sheldonC != null) {
			_hashCode = 29 * _hashCode + sheldonC.hashCode();
		}
		
		if (sheldonD != null) {
			_hashCode = 29 * _hashCode + sheldonD.hashCode();
		}
		
		if (sheldonE != null) {
			_hashCode = 29 * _hashCode + sheldonE.hashCode();
		}
		
		if (sheldonF != null) {
			_hashCode = 29 * _hashCode + sheldonF.hashCode();
		}
		
		if (sheldonG != null) {
			_hashCode = 29 * _hashCode + sheldonG.hashCode();
		}
		
		if (resN1 != null) {
			_hashCode = 29 * _hashCode + resN1.hashCode();
		}
		
		if (resN2 != null) {
			_hashCode = 29 * _hashCode + resN2.hashCode();
		}
		
		if (explanteFecha != null) {
			_hashCode = 29 * _hashCode + explanteFecha.hashCode();
		}
		
		if (explanteOpEnf != null) {
			_hashCode = 29 * _hashCode + explanteOpEnf.hashCode();
		}
		
		if (explanteOpmed != null) {
			_hashCode = 29 * _hashCode + explanteOpmed.hashCode();
		}
		
		if (explanteDiagnostico != null) {
			_hashCode = 29 * _hashCode + explanteDiagnostico.hashCode();
		}
		
		if (comentarios != null) {
			_hashCode = 29 * _hashCode + comentarios.hashCode();
		}
		
		if (complicaciones != null) {
			_hashCode = 29 * _hashCode + complicaciones.hashCode();
		}
		
		if (episodio != null) {
			_hashCode = 29 * _hashCode + episodio.hashCode();
		}
		
		if (nserie != null) {
			_hashCode = 29 * _hashCode + nserie.hashCode();
		}
		
		if (idmodeloreg != null) {
			_hashCode = 29 * _hashCode + idmodeloreg.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrRegistradorPk
	 */
	public ArrRegistradorPk createPk()
	{
		return new ArrRegistradorPk(idRegistrador);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.ArrRegistrador: " );
		ret.append( "idPaciente=" + idPaciente );
		ret.append( ", idRegistrador=" + idRegistrador );
		ret.append( ", fecha=" + fecha );
		ret.append( ", nproc=" + nproc );
		ret.append( ", referidor=" + referidor );
		ret.append( ", indicacion=" + indicacion );
		ret.append( ", indicacionsincope=" + indicacionsincope );
		ret.append( ", indicacionsincopen=" + indicacionsincopen );
		ret.append( ", opEnf=" + opEnf );
		ret.append( ", opMed=" + opMed );
		ret.append( ", implanteSala=" + implanteSala );
		ret.append( ", implanteModelo=" + implanteModelo );
		ret.append( ", implanteZona=" + implanteZona );
		ret.append( ", cardiopatia=" + cardiopatia );
		ret.append( ", sheldonA=" + sheldonA );
		ret.append( ", sheldonB=" + sheldonB );
		ret.append( ", sheldonC=" + sheldonC );
		ret.append( ", sheldonD=" + sheldonD );
		ret.append( ", sheldonE=" + sheldonE );
		ret.append( ", sheldonF=" + sheldonF );
		ret.append( ", sheldonG=" + sheldonG );
		ret.append( ", resN1=" + resN1 );
		ret.append( ", resN2=" + resN2 );
		ret.append( ", explanteFecha=" + explanteFecha );
		ret.append( ", explanteOpEnf=" + explanteOpEnf );
		ret.append( ", explanteOpmed=" + explanteOpmed );
		ret.append( ", explanteDiagnostico=" + explanteDiagnostico );
		ret.append( ", comentarios=" + comentarios );
		ret.append( ", complicaciones=" + complicaciones );
		ret.append( ", episodio=" + episodio );
		ret.append( ", nserie=" + nserie );
		ret.append( ", idmodeloreg=" + idmodeloreg );
		return ret.toString();
	}
	
	public ArrRegistradorEcg getEcgdto() {
		return ecgdto;
	}

	public void setEcgdto(ArrRegistradorEcg ecgdto) {
		this.ecgdto = ecgdto;
	}

	public ArrayList<GenericosDto> getCompArr() {
		return compArr;
	}

	public void setCompArr(ArrayList<GenericosDto> compArr) {
		this.compArr = compArr;
	}

	public HtmlDataTable getBincomp() {
		return bincomp;
	}

	public void setBincomp(HtmlDataTable bincomp) {
		this.bincomp = bincomp;
	}

	public boolean isMuestrabarcode() {
		return muestrabarcode;
	}

	public void setMuestrabarcode(boolean muestrabarcode) {
		this.muestrabarcode = muestrabarcode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}