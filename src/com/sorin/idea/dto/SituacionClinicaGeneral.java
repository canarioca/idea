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

public class SituacionClinicaGeneral implements Serializable
{
	/** 
	 * This attribute maps to the column IDPACIENTE in the situacion_clinica_general table.
	 */
	protected Integer idpaciente;

	/** 
	 * This attribute maps to the column FEVI in the situacion_clinica_general table.
	 */
	protected String fevi;

	/** 
	 * This attribute maps to the column FUNCIONVENTRICULAR in the situacion_clinica_general table.
	 */
	protected Integer funcionventricular;

	/** 
	 * This attribute maps to the column FECHAMODFEVI in the situacion_clinica_general table.
	 */
	protected Date fechamodfevi;

	/** 
	 * This attribute maps to the column NYHA in the situacion_clinica_general table.
	 */
	protected Integer nyha;

	/** 
	 * This attribute maps to the column CARDIOPATIA in the situacion_clinica_general table.
	 */
	protected Integer cardiopatia;

	/** 
	 * This attribute maps to the column AEVOLUCION in the situacion_clinica_general table.
	 */
	protected String aevolucion;

	/** 
	 * This attribute maps to the column OTRA in the situacion_clinica_general table.
	 */
	protected String otra;

	/** 
	 * This attribute maps to the column REVASC in the situacion_clinica_general table.
	 */
	protected Short revasc;

	/** 
	 * This attribute maps to the column INFPREVIO in the situacion_clinica_general table.
	 */
	protected Short infprevio;

	/** 
	 * This attribute maps to the column ANIO in the situacion_clinica_general table.
	 */
	protected String anio;

	/** 
	 * This attribute maps to the column LOCALIZACION in the situacion_clinica_general table.
	 */
	protected Integer localizacion;

	/** 
	 * This attribute maps to the column ARRITMIAS in the situacion_clinica_general table.
	 */
	protected Integer arritmias;

	/** 
	 * This attribute maps to the column EEF in the situacion_clinica_general table.
	 */
	protected Integer eef;

	/** 
	 * This attribute maps to the column HTA in the situacion_clinica_general table.
	 */
	protected Short hta;

	/** 
	 * This attribute maps to the column DISLIPEMIA in the situacion_clinica_general table.
	 */
	protected Short dislipemia;

	/** 
	 * This attribute maps to the column DIABETES in the situacion_clinica_general table.
	 */
	protected Short diabetes;

	/** 
	 * This attribute maps to the column TABAQUISMO in the situacion_clinica_general table.
	 */
	protected Short tabaquismo;

	/** 
	 * This attribute maps to the column INGALCOHOLICA in the situacion_clinica_general table.
	 */
	protected Short ingalcoholica;

	/** 
	 * This attribute maps to the column ACV in the situacion_clinica_general table.
	 */
	protected Short acv;

	/** 
	 * This attribute maps to the column AIT in the situacion_clinica_general table.
	 */
	protected Short ait;

	/** 
	 * This attribute maps to the column EPOC in the situacion_clinica_general table.
	 */
	protected Short epoc;

	/** 
	 * This attribute maps to the column SAHS in the situacion_clinica_general table.
	 */
	protected Short sahs;

	/** 
	 * This attribute maps to the column TIPOSAHS in the situacion_clinica_general table.
	 */
	protected Integer tiposahs;

	/** 
	 * This attribute maps to the column AHI in the situacion_clinica_general table.
	 */
	protected String ahi;

	/** 
	 * This attribute maps to the column CPAP in the situacion_clinica_general table.
	 */
	protected Short cpap;

	/** 
	 * This attribute maps to the column INSRENAL in the situacion_clinica_general table.
	 */
	protected Short insrenal;

	/** 
	 * This attribute maps to the column TIPOINSRENAL in the situacion_clinica_general table.
	 */
	protected Integer tipoinsrenal;

	/** 
	 * This attribute maps to the column NEOPLASIA in the situacion_clinica_general table.
	 */
	protected Short neoplasia;

	/** 
	 * This attribute maps to the column TIPONEOPLASIA in the situacion_clinica_general table.
	 */
	protected String tiponeoplasia;

	/** 
	 * This attribute maps to the column AFECTIROIDEA in the situacion_clinica_general table.
	 */
	protected Integer afectiroidea;

	/** 
	 * This attribute maps to the column ANTFA in the situacion_clinica_general table.
	 */
	protected Short antfa;

	/** 
	 * This attribute maps to the column MUERTESUBITA in the situacion_clinica_general table.
	 */
	protected Short muertesubita;

	/** 
	 * This attribute maps to the column NEUROMEDIADOS in the situacion_clinica_general table.
	 */
	protected Integer neuromediados;

	/** 
	 * This attribute maps to the column TRASPLANTECARDIACO in the situacion_clinica_general table.
	 */
	protected Short trasplantecardiaco;

	/** 
	 * This attribute maps to the column SINCOPE in the situacion_clinica_general table.
	 */
	protected Short sincope;

	/** 
	 * This attribute maps to the column PARADACARDIACA in the situacion_clinica_general table.
	 */
	protected Short paradacardiaca;

	/** 
	 * This attribute maps to the column FECHACREACION in the situacion_clinica_general table.
	 */
	protected Date fechacreacion;

	/** 
	 * This attribute maps to the column FECHAMOD in the situacion_clinica_general table.
	 */
	protected Date fechamod;

	/** 
	 * This attribute maps to the column COMENTARIOS in the situacion_clinica_general table.
	 */
	protected String comentarios;

	/** 
	 * This attribute maps to the column AI in the situacion_clinica_general table.
	 */
	protected String ai;

	/** 
	 * This attribute maps to the column AI2 in the situacion_clinica_general table.
	 */
	protected Integer ai2;

	/** 
	 * This attribute maps to the column ENFART in the situacion_clinica_general table.
	 */
	protected Integer enfart;

	/** 
	 * This attribute maps to the column EXITUS in the situacion_clinica_general table.
	 */
	protected Integer exitus;

	/** 
	 * This attribute maps to the column EXITUSFECHADESC in the situacion_clinica_general table.
	 */
	protected Integer exitusfechadesc;

	/** 
	 * This attribute maps to the column EXITUSFECHA in the situacion_clinica_general table.
	 */
	protected Date exitusfecha;

	/** 
	 * This attribute maps to the column FLUTTER in the situacion_clinica_general table.
	 */
	protected Short flutter;
	
	/** 
	 * This attribute maps to the column ALERGIAS in the situacion_clinica_general table.
	 */
	protected String alergias;

	protected boolean ic;
	protected boolean cardiop;
	protected boolean avent;
	protected boolean eefprev;
	protected boolean isquemica;
	protected boolean revascularizacion;
	protected boolean infartoprev;
	protected boolean anteinsrenal;
	protected boolean antefa;
	protected boolean anteflutter;
	protected boolean antediab;
	protected boolean antefam;
	protected boolean antetabaq;
	protected boolean antehipercol;
	protected boolean anteacv;
	protected boolean enfarterios;
	/****/
	private boolean anteHTA;
	private boolean anteDislipemia;
	private boolean anteAlcohol;
	private boolean anteAIT;
	private boolean anteEPOC;
	private boolean anteSAHS;
	private boolean anteNeoplasia;
	private boolean anteCPAP;
	private boolean anteTrasplanteCardiaco;
	private boolean anteSincope;
	private boolean anteParadaCardiaca;
	
	protected boolean exit;
	protected boolean exitdesc;
	protected int scorechadsvasc;
	protected String scorechadsvascporcent;
	
	/**
	 * Method 'SituacionClinicaGeneral'
	 * 
	 */
	public SituacionClinicaGeneral()
	{
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
	 * Method 'getFevi'
	 * 
	 * @return String
	 */
	public String getFevi()
	{
		return fevi;
	}

	/**
	 * Method 'setFevi'
	 * 
	 * @param fevi
	 */
	public void setFevi(String fevi)
	{
		this.fevi = fevi;
	}

	/**
	 * Method 'getFuncionventricular'
	 * 
	 * @return Integer
	 */
	public Integer getFuncionventricular()
	{
		return funcionventricular;
	}

	/**
	 * Method 'setFuncionventricular'
	 * 
	 * @param funcionventricular
	 */
	public void setFuncionventricular(Integer funcionventricular)
	{
		this.funcionventricular = funcionventricular;
	}

	/**
	 * Method 'getFechamodfevi'
	 * 
	 * @return Date
	 */
	public Date getFechamodfevi()
	{
		return fechamodfevi;
	}

	/**
	 * Method 'setFechamodfevi'
	 * 
	 * @param fechamodfevi
	 */
	public void setFechamodfevi(Date fechamodfevi)
	{
		this.fechamodfevi = fechamodfevi;
	}

	/**
	 * Method 'getNyha'
	 * 
	 * @return Integer
	 */
	public Integer getNyha()
	{
		return nyha;
	}

	/**
	 * Method 'setNyha'
	 * 
	 * @param nyha
	 */
	public void setNyha(Integer nyha)
	{
		this.nyha = nyha;
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
	 * Method 'getAevolucion'
	 * 
	 * @return String
	 */
	public String getAevolucion()
	{
		return aevolucion;
	}

	/**
	 * Method 'setAevolucion'
	 * 
	 * @param aevolucion
	 */
	public void setAevolucion(String aevolucion)
	{
		this.aevolucion = aevolucion;
	}

	/**
	 * Method 'getOtra'
	 * 
	 * @return String
	 */
	public String getOtra()
	{
		return otra;
	}

	/**
	 * Method 'setOtra'
	 * 
	 * @param otra
	 */
	public void setOtra(String otra)
	{
		this.otra = otra;
	}

	/**
	 * Method 'getRevasc'
	 * 
	 * @return Short
	 */
	public Short getRevasc()
	{
		return revasc;
	}

	/**
	 * Method 'setRevasc'
	 * 
	 * @param revasc
	 */
	public void setRevasc(Short revasc)
	{
		this.revasc = revasc;
	}

	/**
	 * Method 'getInfprevio'
	 * 
	 * @return Short
	 */
	public Short getInfprevio()
	{
		return infprevio;
	}

	/**
	 * Method 'setInfprevio'
	 * 
	 * @param infprevio
	 */
	public void setInfprevio(Short infprevio)
	{
		this.infprevio = infprevio;
	}

	/**
	 * Method 'getAnio'
	 * 
	 * @return String
	 */
	public String getAnio()
	{
		return anio;
	}

	/**
	 * Method 'setAnio'
	 * 
	 * @param anio
	 */
	public void setAnio(String anio)
	{
		this.anio = anio;
	}

	/**
	 * Method 'getLocalizacion'
	 * 
	 * @return Integer
	 */
	public Integer getLocalizacion()
	{
		return localizacion;
	}

	/**
	 * Method 'setLocalizacion'
	 * 
	 * @param localizacion
	 */
	public void setLocalizacion(Integer localizacion)
	{
		this.localizacion = localizacion;
	}

	/**
	 * Method 'getArritmias'
	 * 
	 * @return Integer
	 */
	public Integer getArritmias()
	{
		return arritmias;
	}

	/**
	 * Method 'setArritmias'
	 * 
	 * @param arritmias
	 */
	public void setArritmias(Integer arritmias)
	{
		this.arritmias = arritmias;
	}

	/**
	 * Method 'getEef'
	 * 
	 * @return Integer
	 */
	public Integer getEef()
	{
		return eef;
	}

	/**
	 * Method 'setEef'
	 * 
	 * @param eef
	 */
	public void setEef(Integer eef)
	{
		this.eef = eef;
	}

	/**
	 * Method 'getHta'
	 * 
	 * @return Short
	 */
	public Short getHta()
	{
		return hta;
	}

	/**
	 * Method 'setHta'
	 * 
	 * @param hta
	 */
	public void setHta(Short hta)
	{
		this.hta = hta;
	}

	/**
	 * Method 'getDislipemia'
	 * 
	 * @return Short
	 */
	public Short getDislipemia()
	{
		return dislipemia;
	}

	/**
	 * Method 'setDislipemia'
	 * 
	 * @param dislipemia
	 */
	public void setDislipemia(Short dislipemia)
	{
		this.dislipemia = dislipemia;
	}

	/**
	 * Method 'getDiabetes'
	 * 
	 * @return Short
	 */
	public Short getDiabetes()
	{
		return diabetes;
	}

	/**
	 * Method 'setDiabetes'
	 * 
	 * @param diabetes
	 */
	public void setDiabetes(Short diabetes)
	{
		this.diabetes = diabetes;
	}

	/**
	 * Method 'getTabaquismo'
	 * 
	 * @return Short
	 */
	public Short getTabaquismo()
	{
		return tabaquismo;
	}

	/**
	 * Method 'setTabaquismo'
	 * 
	 * @param tabaquismo
	 */
	public void setTabaquismo(Short tabaquismo)
	{
		this.tabaquismo = tabaquismo;
	}

	/**
	 * Method 'getIngalcoholica'
	 * 
	 * @return Short
	 */
	public Short getIngalcoholica()
	{
		return ingalcoholica;
	}

	/**
	 * Method 'setIngalcoholica'
	 * 
	 * @param ingalcoholica
	 */
	public void setIngalcoholica(Short ingalcoholica)
	{
		this.ingalcoholica = ingalcoholica;
	}

	/**
	 * Method 'getAcv'
	 * 
	 * @return Short
	 */
	public Short getAcv()
	{
		return acv;
	}

	/**
	 * Method 'setAcv'
	 * 
	 * @param acv
	 */
	public void setAcv(Short acv)
	{
		this.acv = acv;
	}

	/**
	 * Method 'getAit'
	 * 
	 * @return Short
	 */
	public Short getAit()
	{
		return ait;
	}

	/**
	 * Method 'setAit'
	 * 
	 * @param ait
	 */
	public void setAit(Short ait)
	{
		this.ait = ait;
	}

	/**
	 * Method 'getEpoc'
	 * 
	 * @return Short
	 */
	public Short getEpoc()
	{
		return epoc;
	}

	/**
	 * Method 'setEpoc'
	 * 
	 * @param epoc
	 */
	public void setEpoc(Short epoc)
	{
		this.epoc = epoc;
	}

	/**
	 * Method 'getSahs'
	 * 
	 * @return Short
	 */
	public Short getSahs()
	{
		return sahs;
	}

	/**
	 * Method 'setSahs'
	 * 
	 * @param sahs
	 */
	public void setSahs(Short sahs)
	{
		this.sahs = sahs;
	}

	/**
	 * Method 'getTiposahs'
	 * 
	 * @return Integer
	 */
	public Integer getTiposahs()
	{
		return tiposahs;
	}

	/**
	 * Method 'setTiposahs'
	 * 
	 * @param tiposahs
	 */
	public void setTiposahs(Integer tiposahs)
	{
		this.tiposahs = tiposahs;
	}

	/**
	 * Method 'getAhi'
	 * 
	 * @return String
	 */
	public String getAhi()
	{
		return ahi;
	}

	/**
	 * Method 'setAhi'
	 * 
	 * @param ahi
	 */
	public void setAhi(String ahi)
	{
		this.ahi = ahi;
	}

	/**
	 * Method 'getCpap'
	 * 
	 * @return Short
	 */
	public Short getCpap()
	{
		return cpap;
	}

	/**
	 * Method 'setCpap'
	 * 
	 * @param cpap
	 */
	public void setCpap(Short cpap)
	{
		this.cpap = cpap;
	}

	/**
	 * Method 'getInsrenal'
	 * 
	 * @return Short
	 */
	public Short getInsrenal()
	{
		return insrenal;
	}

	/**
	 * Method 'setInsrenal'
	 * 
	 * @param insrenal
	 */
	public void setInsrenal(Short insrenal)
	{
		this.insrenal = insrenal;
	}

	/**
	 * Method 'getTipoinsrenal'
	 * 
	 * @return Integer
	 */
	public Integer getTipoinsrenal()
	{
		return tipoinsrenal;
	}

	/**
	 * Method 'setTipoinsrenal'
	 * 
	 * @param tipoinsrenal
	 */
	public void setTipoinsrenal(Integer tipoinsrenal)
	{
		this.tipoinsrenal = tipoinsrenal;
	}

	/**
	 * Method 'getNeoplasia'
	 * 
	 * @return Short
	 */
	public Short getNeoplasia()
	{
		return neoplasia;
	}

	/**
	 * Method 'setNeoplasia'
	 * 
	 * @param neoplasia
	 */
	public void setNeoplasia(Short neoplasia)
	{
		this.neoplasia = neoplasia;
	}

	/**
	 * Method 'getTiponeoplasia'
	 * 
	 * @return String
	 */
	public String getTiponeoplasia()
	{
		return tiponeoplasia;
	}

	/**
	 * Method 'setTiponeoplasia'
	 * 
	 * @param tiponeoplasia
	 */
	public void setTiponeoplasia(String tiponeoplasia)
	{
		this.tiponeoplasia = tiponeoplasia;
	}

	/**
	 * Method 'getAfectiroidea'
	 * 
	 * @return Integer
	 */
	public Integer getAfectiroidea()
	{
		return afectiroidea;
	}

	/**
	 * Method 'setAfectiroidea'
	 * 
	 * @param afectiroidea
	 */
	public void setAfectiroidea(Integer afectiroidea)
	{
		this.afectiroidea = afectiroidea;
	}

	/**
	 * Method 'getAntfa'
	 * 
	 * @return Short
	 */
	public Short getAntfa()
	{
		return antfa;
	}

	/**
	 * Method 'setAntfa'
	 * 
	 * @param antfa
	 */
	public void setAntfa(Short antfa)
	{
		this.antfa = antfa;
	}

	/**
	 * Method 'getMuertesubita'
	 * 
	 * @return Short
	 */
	public Short getMuertesubita()
	{
		return muertesubita;
	}

	/**
	 * Method 'setMuertesubita'
	 * 
	 * @param muertesubita
	 */
	public void setMuertesubita(Short muertesubita)
	{
		this.muertesubita = muertesubita;
	}

	/**
	 * Method 'getNeuromediados'
	 * 
	 * @return Integer
	 */
	public Integer getNeuromediados()
	{
		return neuromediados;
	}

	/**
	 * Method 'setNeuromediados'
	 * 
	 * @param neuromediados
	 */
	public void setNeuromediados(Integer neuromediados)
	{
		this.neuromediados = neuromediados;
	}

	/**
	 * Method 'getTrasplantecardiaco'
	 * 
	 * @return Short
	 */
	public Short getTrasplantecardiaco()
	{
		return trasplantecardiaco;
	}

	/**
	 * Method 'setTrasplantecardiaco'
	 * 
	 * @param trasplantecardiaco
	 */
	public void setTrasplantecardiaco(Short trasplantecardiaco)
	{
		this.trasplantecardiaco = trasplantecardiaco;
	}

	/**
	 * Method 'getSincope'
	 * 
	 * @return Short
	 */
	public Short getSincope()
	{
		return sincope;
	}

	/**
	 * Method 'setSincope'
	 * 
	 * @param sincope
	 */
	public void setSincope(Short sincope)
	{
		this.sincope = sincope;
	}

	/**
	 * Method 'getParadacardiaca'
	 * 
	 * @return Short
	 */
	public Short getParadacardiaca()
	{
		return paradacardiaca;
	}

	/**
	 * Method 'setParadacardiaca'
	 * 
	 * @param paradacardiaca
	 */
	public void setParadacardiaca(Short paradacardiaca)
	{
		this.paradacardiaca = paradacardiaca;
	}

	/**
	 * Method 'getFechacreacion'
	 * 
	 * @return Date
	 */
	public Date getFechacreacion()
	{
		return fechacreacion;
	}

	/**
	 * Method 'setFechacreacion'
	 * 
	 * @param fechacreacion
	 */
	public void setFechacreacion(Date fechacreacion)
	{
		this.fechacreacion = fechacreacion;
	}

	/**
	 * Method 'getFechamod'
	 * 
	 * @return Date
	 */
	public Date getFechamod()
	{
		return fechamod;
	}

	/**
	 * Method 'setFechamod'
	 * 
	 * @param fechamod
	 */
	public void setFechamod(Date fechamod)
	{
		this.fechamod = fechamod;
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
	 * Method 'getAi'
	 * 
	 * @return String
	 */
	public String getAi()
	{
		return ai;
	}

	/**
	 * Method 'setAi'
	 * 
	 * @param ai
	 */
	public void setAi(String ai)
	{
		this.ai = ai;
	}

	/**
	 * Method 'getAi2'
	 * 
	 * @return Integer
	 */
	public Integer getAi2()
	{
		return ai2;
	}

	/**
	 * Method 'setAi2'
	 * 
	 * @param ai2
	 */
	public void setAi2(Integer ai2)
	{
		this.ai2 = ai2;
	}

	/**
	 * Method 'getEnfart'
	 * 
	 * @return Integer
	 */
	public Integer getEnfart()
	{
		return enfart;
	}

	/**
	 * Method 'setEnfart'
	 * 
	 * @param enfart
	 */
	public void setEnfart(Integer enfart)
	{
		this.enfart = enfart;
	}

	/**
	 * Method 'getExitus'
	 * 
	 * @return Integer
	 */
	public Integer getExitus()
	{
		return exitus;
	}

	/**
	 * Method 'setExitus'
	 * 
	 * @param exitus
	 */
	public void setExitus(Integer exitus)
	{
		this.exitus = exitus;
	}

	/**
	 * Method 'getExitusfechadesc'
	 * 
	 * @return Integer
	 */
	public Integer getExitusfechadesc()
	{
		return exitusfechadesc;
	}

	/**
	 * Method 'setExitusfechadesc'
	 * 
	 * @param exitusfechadesc
	 */
	public void setExitusfechadesc(Integer exitusfechadesc)
	{
		this.exitusfechadesc = exitusfechadesc;
	}

	/**
	 * Method 'getExitusfecha'
	 * 
	 * @return Date
	 */
	public Date getExitusfecha()
	{
		return exitusfecha;
	}

	/**
	 * Method 'setExitusfecha'
	 * 
	 * @param exitusfecha
	 */
	public void setExitusfecha(Date exitusfecha)
	{
		this.exitusfecha = exitusfecha;
	}

	public Short getFlutter() {
		return flutter;
	}

	public void setFlutter(Short flutter) {
		this.flutter = flutter;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
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
		
		if (!(_other instanceof SituacionClinicaGeneral)) {
			return false;
		}
		
		final SituacionClinicaGeneral _cast = (SituacionClinicaGeneral) _other;
		if (idpaciente == null ? _cast.idpaciente != idpaciente : !idpaciente.equals( _cast.idpaciente )) {
			return false;
		}
		
		if (fevi == null ? _cast.fevi != fevi : !fevi.equals( _cast.fevi )) {
			return false;
		}
		
		if (funcionventricular == null ? _cast.funcionventricular != funcionventricular : !funcionventricular.equals( _cast.funcionventricular )) {
			return false;
		}
		
		if (fechamodfevi == null ? _cast.fechamodfevi != fechamodfevi : !fechamodfevi.equals( _cast.fechamodfevi )) {
			return false;
		}
		
		if (nyha == null ? _cast.nyha != nyha : !nyha.equals( _cast.nyha )) {
			return false;
		}
		
		if (cardiopatia == null ? _cast.cardiopatia != cardiopatia : !cardiopatia.equals( _cast.cardiopatia )) {
			return false;
		}
		
		if (aevolucion == null ? _cast.aevolucion != aevolucion : !aevolucion.equals( _cast.aevolucion )) {
			return false;
		}
		
		if (otra == null ? _cast.otra != otra : !otra.equals( _cast.otra )) {
			return false;
		}
		
		if (revasc == null ? _cast.revasc != revasc : !revasc.equals( _cast.revasc )) {
			return false;
		}
		
		if (infprevio == null ? _cast.infprevio != infprevio : !infprevio.equals( _cast.infprevio )) {
			return false;
		}
		
		if (anio == null ? _cast.anio != anio : !anio.equals( _cast.anio )) {
			return false;
		}
		
		if (localizacion == null ? _cast.localizacion != localizacion : !localizacion.equals( _cast.localizacion )) {
			return false;
		}
		
		if (arritmias == null ? _cast.arritmias != arritmias : !arritmias.equals( _cast.arritmias )) {
			return false;
		}
		
		if (eef == null ? _cast.eef != eef : !eef.equals( _cast.eef )) {
			return false;
		}
		
		if (hta == null ? _cast.hta != hta : !hta.equals( _cast.hta )) {
			return false;
		}
		
		if (dislipemia == null ? _cast.dislipemia != dislipemia : !dislipemia.equals( _cast.dislipemia )) {
			return false;
		}
		
		if (diabetes == null ? _cast.diabetes != diabetes : !diabetes.equals( _cast.diabetes )) {
			return false;
		}
		
		if (tabaquismo == null ? _cast.tabaquismo != tabaquismo : !tabaquismo.equals( _cast.tabaquismo )) {
			return false;
		}
		
		if (ingalcoholica == null ? _cast.ingalcoholica != ingalcoholica : !ingalcoholica.equals( _cast.ingalcoholica )) {
			return false;
		}
		
		if (acv == null ? _cast.acv != acv : !acv.equals( _cast.acv )) {
			return false;
		}
		
		if (ait == null ? _cast.ait != ait : !ait.equals( _cast.ait )) {
			return false;
		}
		
		if (epoc == null ? _cast.epoc != epoc : !epoc.equals( _cast.epoc )) {
			return false;
		}
		
		if (sahs == null ? _cast.sahs != sahs : !sahs.equals( _cast.sahs )) {
			return false;
		}
		
		if (tiposahs == null ? _cast.tiposahs != tiposahs : !tiposahs.equals( _cast.tiposahs )) {
			return false;
		}
		
		if (ahi == null ? _cast.ahi != ahi : !ahi.equals( _cast.ahi )) {
			return false;
		}
		
		if (cpap == null ? _cast.cpap != cpap : !cpap.equals( _cast.cpap )) {
			return false;
		}
		
		if (insrenal == null ? _cast.insrenal != insrenal : !insrenal.equals( _cast.insrenal )) {
			return false;
		}
		
		if (tipoinsrenal == null ? _cast.tipoinsrenal != tipoinsrenal : !tipoinsrenal.equals( _cast.tipoinsrenal )) {
			return false;
		}
		
		if (neoplasia == null ? _cast.neoplasia != neoplasia : !neoplasia.equals( _cast.neoplasia )) {
			return false;
		}
		
		if (tiponeoplasia == null ? _cast.tiponeoplasia != tiponeoplasia : !tiponeoplasia.equals( _cast.tiponeoplasia )) {
			return false;
		}
		
		if (afectiroidea == null ? _cast.afectiroidea != afectiroidea : !afectiroidea.equals( _cast.afectiroidea )) {
			return false;
		}
		
		if (antfa == null ? _cast.antfa != antfa : !antfa.equals( _cast.antfa )) {
			return false;
		}
		
		if (muertesubita == null ? _cast.muertesubita != muertesubita : !muertesubita.equals( _cast.muertesubita )) {
			return false;
		}
		
		if (neuromediados == null ? _cast.neuromediados != neuromediados : !neuromediados.equals( _cast.neuromediados )) {
			return false;
		}
		
		if (trasplantecardiaco == null ? _cast.trasplantecardiaco != trasplantecardiaco : !trasplantecardiaco.equals( _cast.trasplantecardiaco )) {
			return false;
		}
		
		if (sincope == null ? _cast.sincope != sincope : !sincope.equals( _cast.sincope )) {
			return false;
		}
		
		if (paradacardiaca == null ? _cast.paradacardiaca != paradacardiaca : !paradacardiaca.equals( _cast.paradacardiaca )) {
			return false;
		}
		
		if (fechacreacion == null ? _cast.fechacreacion != fechacreacion : !fechacreacion.equals( _cast.fechacreacion )) {
			return false;
		}
		
		if (fechamod == null ? _cast.fechamod != fechamod : !fechamod.equals( _cast.fechamod )) {
			return false;
		}
		
		if (comentarios == null ? _cast.comentarios != comentarios : !comentarios.equals( _cast.comentarios )) {
			return false;
		}
		
		if (ai == null ? _cast.ai != ai : !ai.equals( _cast.ai )) {
			return false;
		}
		
		if (ai2 == null ? _cast.ai2 != ai2 : !ai2.equals( _cast.ai2 )) {
			return false;
		}
		
		if (enfart == null ? _cast.enfart != enfart : !enfart.equals( _cast.enfart )) {
			return false;
		}
		
		if (exitus == null ? _cast.exitus != exitus : !exitus.equals( _cast.exitus )) {
			return false;
		}
		
		if (exitusfechadesc == null ? _cast.exitusfechadesc != exitusfechadesc : !exitusfechadesc.equals( _cast.exitusfechadesc )) {
			return false;
		}
		
		if (exitusfecha == null ? _cast.exitusfecha != exitusfecha : !exitusfecha.equals( _cast.exitusfecha )) {
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
		if (idpaciente != null) {
			_hashCode = 29 * _hashCode + idpaciente.hashCode();
		}
		
		if (fevi != null) {
			_hashCode = 29 * _hashCode + fevi.hashCode();
		}
		
		if (funcionventricular != null) {
			_hashCode = 29 * _hashCode + funcionventricular.hashCode();
		}
		
		if (fechamodfevi != null) {
			_hashCode = 29 * _hashCode + fechamodfevi.hashCode();
		}
		
		if (nyha != null) {
			_hashCode = 29 * _hashCode + nyha.hashCode();
		}
		
		if (cardiopatia != null) {
			_hashCode = 29 * _hashCode + cardiopatia.hashCode();
		}
		
		if (aevolucion != null) {
			_hashCode = 29 * _hashCode + aevolucion.hashCode();
		}
		
		if (otra != null) {
			_hashCode = 29 * _hashCode + otra.hashCode();
		}
		
		if (revasc != null) {
			_hashCode = 29 * _hashCode + revasc.hashCode();
		}
		
		if (infprevio != null) {
			_hashCode = 29 * _hashCode + infprevio.hashCode();
		}
		
		if (anio != null) {
			_hashCode = 29 * _hashCode + anio.hashCode();
		}
		
		if (localizacion != null) {
			_hashCode = 29 * _hashCode + localizacion.hashCode();
		}
		
		if (arritmias != null) {
			_hashCode = 29 * _hashCode + arritmias.hashCode();
		}
		
		if (eef != null) {
			_hashCode = 29 * _hashCode + eef.hashCode();
		}
		
		if (hta != null) {
			_hashCode = 29 * _hashCode + hta.hashCode();
		}
		
		if (dislipemia != null) {
			_hashCode = 29 * _hashCode + dislipemia.hashCode();
		}
		
		if (diabetes != null) {
			_hashCode = 29 * _hashCode + diabetes.hashCode();
		}
		
		if (tabaquismo != null) {
			_hashCode = 29 * _hashCode + tabaquismo.hashCode();
		}
		
		if (ingalcoholica != null) {
			_hashCode = 29 * _hashCode + ingalcoholica.hashCode();
		}
		
		if (acv != null) {
			_hashCode = 29 * _hashCode + acv.hashCode();
		}
		
		if (ait != null) {
			_hashCode = 29 * _hashCode + ait.hashCode();
		}
		
		if (epoc != null) {
			_hashCode = 29 * _hashCode + epoc.hashCode();
		}
		
		if (sahs != null) {
			_hashCode = 29 * _hashCode + sahs.hashCode();
		}
		
		if (tiposahs != null) {
			_hashCode = 29 * _hashCode + tiposahs.hashCode();
		}
		
		if (ahi != null) {
			_hashCode = 29 * _hashCode + ahi.hashCode();
		}
		
		if (cpap != null) {
			_hashCode = 29 * _hashCode + cpap.hashCode();
		}
		
		if (insrenal != null) {
			_hashCode = 29 * _hashCode + insrenal.hashCode();
		}
		
		if (tipoinsrenal != null) {
			_hashCode = 29 * _hashCode + tipoinsrenal.hashCode();
		}
		
		if (neoplasia != null) {
			_hashCode = 29 * _hashCode + neoplasia.hashCode();
		}
		
		if (tiponeoplasia != null) {
			_hashCode = 29 * _hashCode + tiponeoplasia.hashCode();
		}
		
		if (afectiroidea != null) {
			_hashCode = 29 * _hashCode + afectiroidea.hashCode();
		}
		
		if (antfa != null) {
			_hashCode = 29 * _hashCode + antfa.hashCode();
		}
		
		if (muertesubita != null) {
			_hashCode = 29 * _hashCode + muertesubita.hashCode();
		}
		
		if (neuromediados != null) {
			_hashCode = 29 * _hashCode + neuromediados.hashCode();
		}
		
		if (trasplantecardiaco != null) {
			_hashCode = 29 * _hashCode + trasplantecardiaco.hashCode();
		}
		
		if (sincope != null) {
			_hashCode = 29 * _hashCode + sincope.hashCode();
		}
		
		if (paradacardiaca != null) {
			_hashCode = 29 * _hashCode + paradacardiaca.hashCode();
		}
		
		if (fechacreacion != null) {
			_hashCode = 29 * _hashCode + fechacreacion.hashCode();
		}
		
		if (fechamod != null) {
			_hashCode = 29 * _hashCode + fechamod.hashCode();
		}
		
		if (comentarios != null) {
			_hashCode = 29 * _hashCode + comentarios.hashCode();
		}
		
		if (ai != null) {
			_hashCode = 29 * _hashCode + ai.hashCode();
		}
		
		if (ai2 != null) {
			_hashCode = 29 * _hashCode + ai2.hashCode();
		}
		
		if (enfart != null) {
			_hashCode = 29 * _hashCode + enfart.hashCode();
		}
		
		if (exitus != null) {
			_hashCode = 29 * _hashCode + exitus.hashCode();
		}
		
		if (exitusfechadesc != null) {
			_hashCode = 29 * _hashCode + exitusfechadesc.hashCode();
		}
		
		if (exitusfecha != null) {
			_hashCode = 29 * _hashCode + exitusfecha.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SituacionClinicaGeneralPk
	 */
	public SituacionClinicaGeneralPk createPk()
	{
		return new SituacionClinicaGeneralPk(idpaciente);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.sorin.idea.dto.SituacionClinicaGeneral: " );
		ret.append( "idpaciente=" + idpaciente );
		ret.append( ", fevi=" + fevi );
		ret.append( ", funcionventricular=" + funcionventricular );
		ret.append( ", fechamodfevi=" + fechamodfevi );
		ret.append( ", nyha=" + nyha );
		ret.append( ", cardiopatia=" + cardiopatia );
		ret.append( ", aevolucion=" + aevolucion );
		ret.append( ", otra=" + otra );
		ret.append( ", revasc=" + revasc );
		ret.append( ", infprevio=" + infprevio );
		ret.append( ", anio=" + anio );
		ret.append( ", localizacion=" + localizacion );
		ret.append( ", arritmias=" + arritmias );
		ret.append( ", eef=" + eef );
		ret.append( ", hta=" + hta );
		ret.append( ", dislipemia=" + dislipemia );
		ret.append( ", diabetes=" + diabetes );
		ret.append( ", tabaquismo=" + tabaquismo );
		ret.append( ", ingalcoholica=" + ingalcoholica );
		ret.append( ", acv=" + acv );
		ret.append( ", ait=" + ait );
		ret.append( ", epoc=" + epoc );
		ret.append( ", sahs=" + sahs );
		ret.append( ", tiposahs=" + tiposahs );
		ret.append( ", ahi=" + ahi );
		ret.append( ", cpap=" + cpap );
		ret.append( ", insrenal=" + insrenal );
		ret.append( ", tipoinsrenal=" + tipoinsrenal );
		ret.append( ", neoplasia=" + neoplasia );
		ret.append( ", tiponeoplasia=" + tiponeoplasia );
		ret.append( ", afectiroidea=" + afectiroidea );
		ret.append( ", antfa=" + antfa );
		ret.append( ", muertesubita=" + muertesubita );
		ret.append( ", neuromediados=" + neuromediados );
		ret.append( ", trasplantecardiaco=" + trasplantecardiaco );
		ret.append( ", sincope=" + sincope );
		ret.append( ", paradacardiaca=" + paradacardiaca );
		ret.append( ", fechacreacion=" + fechacreacion );
		ret.append( ", fechamod=" + fechamod );
		ret.append( ", comentarios=" + comentarios );
		ret.append( ", ai=" + ai );
		ret.append( ", ai2=" + ai2 );
		ret.append( ", enfart=" + enfart );
		ret.append( ", exitus=" + exitus );
		ret.append( ", exitusfechadesc=" + exitusfechadesc );
		ret.append( ", exitusfecha=" + exitusfecha );
		return ret.toString();
	}
	public boolean isIc() {
		return ic;
	}

	public void setIc(boolean ic) {
		this.ic = ic;
	}

	public boolean isAvent() {
		return avent;
	}

	public void setAvent(boolean avent) {
		this.avent = avent;
	}

	public boolean isEefprev() {
		return eefprev;
	}

	public void setEefprev(boolean eefprev) {
		this.eefprev = eefprev;
	}

	public boolean isIsquemica() {
		return isquemica;
	}

	public void setIsquemica(boolean isquemica) {
		this.isquemica = isquemica;
	}

	public boolean isRevascularizacion() {
		return revascularizacion;
	}

	public void setRevascularizacion(boolean revascularizacion) {
		this.revascularizacion = revascularizacion;
	}

	public boolean isInfartoprev() {
		return infartoprev;
	}

	public void setInfartoprev(boolean infartoprev) {
		this.infartoprev = infartoprev;
	}

	public boolean isAnteinsrenal() {
		return anteinsrenal;
	}

	public void setAnteinsrenal(boolean anteinsrenal) {
		this.anteinsrenal = anteinsrenal;
	}

	public boolean isAntefa() {
		return antefa;
	}

	public void setAntefa(boolean antefa) {
		this.antefa = antefa;
	}

	public boolean isAntediab() {
		return antediab;
	}

	public void setAntediab(boolean antediab) {
		this.antediab = antediab;
	}

	public boolean isAntefam() {
		return antefam;
	}

	public void setAntefam(boolean antefam) {
		this.antefam = antefam;
	}

	public boolean isAntetabaq() {
		return antetabaq;
	}

	public void setAntetabaq(boolean antetabaq) {
		this.antetabaq = antetabaq;
	}

	public boolean isAntehipercol() {
		return antehipercol;
	}

	public void setAntehipercol(boolean antehipercol) {
		this.antehipercol = antehipercol;
	}

	public boolean isAnteacv() {
		return anteacv;
	}

	public void setAnteacv(boolean anteacv) {
		this.anteacv = anteacv;
	}

	public boolean isAnteHTA() {
		return anteHTA;
	}

	public void setAnteHTA(boolean anteHTA) {
		this.anteHTA = anteHTA;
	}

	public boolean isAnteDislipemia() {
		return anteDislipemia;
	}

	public void setAnteDislipemia(boolean anteDislipemia) {
		this.anteDislipemia = anteDislipemia;
	}

	public boolean isAnteAlcohol() {
		return anteAlcohol;
	}

	public void setAnteAlcohol(boolean anteAlcohol) {
		this.anteAlcohol = anteAlcohol;
	}

	public boolean isAnteAIT() {
		return anteAIT;
	}

	public void setAnteAIT(boolean anteAIT) {
		this.anteAIT = anteAIT;
	}

	public boolean isAnteEPOC() {
		return anteEPOC;
	}

	public void setAnteEPOC(boolean anteEPOC) {
		this.anteEPOC = anteEPOC;
	}

	public boolean isAnteSAHS() {
		return anteSAHS;
	}

	public void setAnteSAHS(boolean anteSAHS) {
		this.anteSAHS = anteSAHS;
	}

	public boolean isAnteNeoplasia() {
		return anteNeoplasia;
	}

	public void setAnteNeoplasia(boolean anteNeoplasia) {
		this.anteNeoplasia = anteNeoplasia;
	}

	public boolean isAnteCPAP() {
		return anteCPAP;
	}

	public void setAnteCPAP(boolean anteCPAP) {
		this.anteCPAP = anteCPAP;
	}

	public boolean isAnteTrasplanteCardiaco() {
		return anteTrasplanteCardiaco;
	}

	public void setAnteTrasplanteCardiaco(boolean anteTrasplanteCardiaco) {
		this.anteTrasplanteCardiaco = anteTrasplanteCardiaco;
	}

	public boolean isCardiop() {
		return cardiop;
	}

	public void setCardiop(boolean cardiop) {
		this.cardiop = cardiop;
	}

	public boolean isAnteSincope() {
		return anteSincope;
	}

	public void setAnteSincope(boolean anteSincope) {
		this.anteSincope = anteSincope;
	}

	public boolean isAnteParadaCardiaca() {
		return anteParadaCardiaca;
	}

	public void setAnteParadaCardiaca(boolean anteParadaCardiaca) {
		this.anteParadaCardiaca = anteParadaCardiaca;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	public boolean isEnfarterios() {
		return enfarterios;
	}

	public void setEnfarterios(boolean enfarterios) {
		this.enfarterios = enfarterios;
	}

	public boolean isExitdesc() {
		return exitdesc;
	}

	public void setExitdesc(boolean exitdesc) {
		this.exitdesc = exitdesc;
	}

	public int getScorechadsvasc() {
		return scorechadsvasc;
	}

	public void setScorechadsvasc(int scorechadsvasc) {
		this.scorechadsvasc = scorechadsvasc;
	}

	public String getScorechadsvascporcent() {
		return scorechadsvascporcent;
	}

	public void setScorechadsvascporcent(String scorechadsvascporcent) {
		this.scorechadsvascporcent = scorechadsvascporcent;
	}
	
	public boolean isAnteflutter() {
		return anteflutter;
	}

	public void setAnteflutter(boolean anteflutter) {
		this.anteflutter = anteflutter;
	}
	
}
