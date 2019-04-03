/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.sorin.idea.dto;


import java.io.Serializable;
import java.sql.Time;
import java.util.*;

import javax.faces.event.ActionEvent;

import org.apache.myfaces.component.html.ext.HtmlDataTable;

import com.sorin.idea.dao.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.util.UtilFechas;

public class ArrEstudio implements Serializable {
	/**
	 * This attribute maps to the column IDESTUDIO in the ARR_ESTUDIO table.
	 */
	protected Integer idestudio;

	/**
	 * This attribute maps to the column FECHA in the ARR_ESTUDIO table.
	 */
	protected Date fecha;

	/**
	 * This attribute maps to the column MOTIVO in the ARR_ESTUDIO table.
	 */
	protected String motivo;

	/**
	 * This attribute maps to the column HALLAZGOS in the ARR_ESTUDIO table.
	 */
	protected String hallazgos;

	/**
	 * This attribute maps to the column DIAGNOSTICO in the ARR_ESTUDIO table.
	 */
	protected Integer diagnostico;

	/**
	 * This attribute maps to the column ANESTESISTA in the ARR_ESTUDIO table.
	 */
	protected Integer anestesista;

	/**
	 * This attribute maps to the column INTERES in the ARR_ESTUDIO table.
	 */
	protected Integer interes;

	/**
	 * This attribute maps to the column NAVEGADOR in the ARR_ESTUDIO table.
	 */
	protected Integer navegador;

	/**
	 * This attribute maps to the column ESCOPIA in the ARR_ESTUDIO table.
	 */
	protected Integer escopia;

	/**
	 * This attribute maps to the column ECOGRAFIA in the ARR_ESTUDIO table.
	 */
	protected Integer ecografia;

	/**
	 * This attribute maps to the column ECG in the ARR_ESTUDIO table.
	 */
	protected Integer ecg;

	/**
	 * This attribute maps to the column CATETERES in the ARR_ESTUDIO table.
	 */
	protected Integer cateteres;

	/**
	 * This attribute maps to the column SINUSAL in the ARR_ESTUDIO table.
	 */
	protected Integer sinusal;

	/**
	 * This attribute maps to the column TAQUICARDIAS in the ARR_ESTUDIO table.
	 */
	protected Integer taquicardias;

	/**
	 * This attribute maps to the column CONDUCCION in the ARR_ESTUDIO table.
	 */
	protected Integer conduccion;

	/**
	 * This attribute maps to the column VIAS in the ARR_ESTUDIO table.
	 */
	protected Integer vias;

	/**
	 * This attribute maps to the column PERIODOS in the ARR_ESTUDIO table.
	 */
	protected Integer periodos;

	/**
	 * This attribute maps to the column COMPLICACIONES in the ARR_ESTUDIO
	 * table.
	 */
	protected Integer complicaciones;

	/**
	 * This attribute maps to the column ABLACION in the ARR_ESTUDIO table.
	 */
	protected Integer ablacion = 0;

	/**
	 * This attribute maps to the column IDPACIENTE in the ARR_ESTUDIO table.
	 */
	protected Integer idpaciente;

	protected String coment_cateter;
	protected String coment_vias;
	protected String coment_periodos;

	protected String hllegada;
	protected String hllegadah;
	protected String hllegadam;
	protected String hpuncion;
	protected String hpuncionh;
	protected String hpuncionm;
	protected String hablacion;
	protected String hablacionh;
	protected String hablacionm;
	protected String hcateter;
	protected String hcateterh;
	protected String hcateterm;
	protected String hsalida;
	protected String hsalidah;
	protected String hsalidam;
	protected String tescopia;

	protected String nestudio;
	
	protected String episodio;
	
	protected String eefanterior;
	
	protected Integer tipoProcedimiento;

	protected Integer angiografia;
	protected Integer robot;
	protected ArrayList<ArrEstudioEnf> enfermeras;
	protected ArrayList<ArrEstudioPop> poperador;
	protected ArrayList<ArrEstudioSop> soperador;
	protected ArrayList<ArrEstudioAnest> anest;

	protected ArrEstudioComplicaciones complicacionesdto;
	protected ArrEstudioIntento intentodto;
	protected ArrEstudioAblacion ablaciondto;
	protected ArrayList<ArrEstudioAblacion> ablaciones;
	
	//protected ArrayList<ArrEstudioResultado> resultados;
	protected ArrEstudioConduccav conducciondto;
	protected ArrEstudioSinusal sinusaldto;
	protected ArrayList<ArrEstudioTaqui> lsttaquicardias;
	protected ArrEstudioTaqui taquicardidto;
	protected ArrEstudioEcg ecgdto;
	//protected ArrayList<ArrEstudioCateter> cateterdto;
	protected ArrayList<ArrEstudioVias> viasdto;
	protected GenericosDto localizacion;
	protected Integer filaLocalizacion;
	protected ArrayList<ArrEstudioPeriodo> periodosdto;
	protected ArrEstudioNproc nproc;

	//protected HtmlDataTable bincat;
	protected HtmlDataTable binvias;
	protected HtmlDataTable binpr;
	
	protected boolean ablb;
	
	protected ArrayList<Cateter> aux;
	protected ArrayList<ArrEstudioCatUso> listacats;

	protected String edadmin;
	protected String edadmax;
	
	protected String recomendaciones;
	protected Integer tipoDiag1;
	protected Integer tipoDiag2;
	
	/** 
	 * This attribute maps to the column DOSIS_ESCOPIA in the arr_estudio table.
	 */
	protected String dosisEscopia; 
	
	/**
	 * Method 'ArrEstudio'
	 * 
	 */
	public ArrEstudio() {
		this.enfermeras = new ArrayList<ArrEstudioEnf>();
		this.poperador = new ArrayList<ArrEstudioPop>();
		this.soperador = new ArrayList<ArrEstudioSop>();
		this.anest = new ArrayList<ArrEstudioAnest>();
		this.complicacionesdto = new ArrEstudioComplicaciones();
		this.intentodto = new ArrEstudioIntento();
		this.ablaciondto = new ArrEstudioAblacion();
		this.ablaciones = new ArrayList<ArrEstudioAblacion>();
		this.aux = new ArrayList<Cateter>();
		this.listacats = new ArrayList<ArrEstudioCatUso>();
		//this.resultadodto = new ArrEstudioResultado();
		//this.resultados = new ArrayList<ArrEstudioResultado>();
		this.conducciondto = new ArrEstudioConduccav();
		this.sinusaldto = new ArrEstudioSinusal();
		this.lsttaquicardias = new ArrayList<ArrEstudioTaqui>();
		this.taquicardidto = new ArrEstudioTaqui();
		this.ecgdto = new ArrEstudioEcg();
		//this.cateterdto = new ArrayList<ArrEstudioCateter>();
		this.viasdto = new ArrayList<ArrEstudioVias>();
		this.periodosdto = new ArrayList<ArrEstudioPeriodo>();
		this.localizacion = new GenericosDto();
		this.fecha = new Date();
		this.nproc = new ArrEstudioNproc();
		String a�o = "" + (this.fecha.getYear() + 1900);
		this.nestudio = a�o.substring(2);
		this.diagnostico = 0;
		this.hllegadah="0";
		this.hllegadam="0";
		this.hpuncionh="0";
		this.hpuncionm="0";
		this.hablacionh="0";
		this.hablacionm="0";
		this.hcateterh="0";
		this.hcateterm="0";
		this.hsalidah="0";
		this.hsalidam="0";
	}

	/**
	 * Method 'getIdestudio'
	 * 
	 * @return Integer
	 */
	public Integer getIdestudio() {
		return idestudio;
	}

	/**
	 * Method 'setIdestudio'
	 * 
	 * @param idestudio
	 */
	public void setIdestudio(Integer idestudio) {
		this.idestudio = idestudio;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha() {
		return fecha;
	}

	public String getFechastr() {
		if (this.fecha != null)
			return UtilFechas.dateToString(fecha);
		else
			return "";
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Method 'getMotivo'
	 * 
	 * @return String
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Method 'setMotivo'
	 * 
	 * @param motivo
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	/**
	 * Method 'getHallazgos'
	 * 
	 * @return String
	 */
	public String getHallazgos() {
		return hallazgos;
	}

	/**
	 * Method 'setHallazgos'
	 * 
	 * @param hallazgos
	 */
	public void setHallazgos(String hallazgos) {
		this.hallazgos = hallazgos;
	}

	/**
	 * Method 'getDiagnostico'
	 * 
	 * @return Integer
	 */
	public Integer getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Method 'setDiagnostico'
	 * 
	 * @param diagnostico
	 */
	public void setDiagnostico(Integer diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * Method 'getAnestesista'
	 * 
	 * @return Integer
	 */
	public Integer getAnestesista() {
		return anestesista;
	}

	/**
	 * Method 'setAnestesista'
	 * 
	 * @param anestesista
	 */
	public void setAnestesista(Integer anestesista) {
		this.anestesista = anestesista;
	}

	/**
	 * Method 'getInteres'
	 * 
	 * @return Integer
	 */
	public Integer getInteres() {
		return interes;
	}

	/**
	 * Method 'setInteres'
	 * 
	 * @param interes
	 */
	public void setInteres(Integer interes) {
		this.interes = interes;
	}

	/**
	 * Method 'getNavegador'
	 * 
	 * @return Integer
	 */
	public Integer getNavegador() {
		return navegador;
	}

	/**
	 * Method 'setNavegador'
	 * 
	 * @param navegador
	 */
	public void setNavegador(Integer navegador) {
		this.navegador = navegador;
	}

	/**
	 * Method 'getEscopia'
	 * 
	 * @return Integer
	 */
	public Integer getEscopia() {
		return escopia;
	}

	/**
	 * Method 'setEscopia'
	 * 
	 * @param escopia
	 */
	public void setEscopia(Integer escopia) {
		this.escopia = escopia;
	}

	/**
	 * Method 'getEcografia'
	 * 
	 * @return Integer
	 */
	public Integer getEcografia() {
		return ecografia;
	}

	/**
	 * Method 'setEcografia'
	 * 
	 * @param ecografia
	 */
	public void setEcografia(Integer ecografia) {
		this.ecografia = ecografia;
	}

	/**
	 * Method 'getEcg'
	 * 
	 * @return Integer
	 */
	public Integer getEcg() {
		return ecg;
	}

	public Boolean getEcgb() {
		if (ecg != null && ecg == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setEcg'
	 * 
	 * @param ecg
	 */
	public void setEcg(Integer ecg) {
		this.ecg = ecg;
	}

	public void setEcgb(Boolean ecg) {
		if (ecg != null && ecg)
			this.ecg = 1;
		else
			this.ecg = 0;
	}

	/**
	 * Method 'getCateteres'
	 * 
	 * @return Integer
	 */
	public Integer getCateteres() {
		return cateteres;
	}

	public Boolean getCateteresb() {
		if (cateteres != null && cateteres == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setCateteres'
	 * 
	 * @param cateteres
	 */
	public void setCateteres(Integer cateteres) {
		this.cateteres = cateteres;
	}

	public void setCateteresb(Boolean cateteres) {
		if (cateteres != null && cateteres)
			this.cateteres = 1;
		else
			this.cateteres = 0;
	}

	/**
	 * Method 'getSinusal'
	 * 
	 * @return Integer
	 */
	public Integer getSinusal() {
		return sinusal;
	}

	public Boolean getSinusalb() {
		if (sinusal != null && sinusal == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setSinusal'
	 * 
	 * @param sinusal
	 */
	public void setSinusal(Integer sinusal) {
		this.sinusal = sinusal;
	}

	public void setSinusalb(Boolean sinusal) {
		if (sinusal != null && sinusal)
			this.sinusal = 1;
		else
			this.sinusal = 0;
	}

	/**
	 * Method 'getTaquicardias'
	 * 
	 * @return Integer
	 */
	public Integer getTaquicardias() {
		return taquicardias;
	}

	public Boolean getTaquicardiasb() {
		if (taquicardias != null && taquicardias == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setTaquicardias'
	 * 
	 * @param taquicardias
	 */
	public void setTaquicardias(Integer taquicardias) {
		this.taquicardias = taquicardias;
	}

	public void setTaquicardiasb(Boolean taquicardias) {
		if (taquicardias != null && taquicardias)
			this.taquicardias = 1;
		else
			this.taquicardias = 0;
	}

	/**
	 * Method 'getConduccion'
	 * 
	 * @return Integer
	 */
	public Integer getConduccion() {
		return conduccion;
	}

	public Boolean getConduccionb() {
		if (conduccion != null && conduccion == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setConduccion'
	 * 
	 * @param conduccion
	 */
	public void setConduccion(Integer conduccion) {
		this.conduccion = conduccion;
	}

	public void setConduccionb(Boolean conduccion) {
		if (conduccion != null && conduccion)
			this.conduccion = 1;
		else
			this.conduccion = 0;
	}

	/**
	 * Method 'getVias'
	 * 
	 * @return Integer
	 */
	public Integer getVias() {
		return vias;
	}

	public Boolean getViasb() {
		if (vias != null && vias == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setVias'
	 * 
	 * @param vias
	 */
	public void setVias(Integer vias) {
		this.vias = vias;
	}

	public void setViasb(Boolean vias) {
		if (vias != null && vias)
			this.vias = 1;
		else
			this.vias = 0;
	}

	/**
	 * Method 'getPeriodos'
	 * 
	 * @return Integer
	 */
	public Integer getPeriodos() {
		return periodos;
	}

	public Boolean getPeriodosb() {
		if (periodos != null && periodos == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setPeriodos'
	 * 
	 * @param periodos
	 */
	public void setPeriodos(Integer periodos) {
		this.periodos = periodos;
	}

	public void setPeriodosb(Boolean periodos) {
		if (periodos != null && periodos)
			this.periodos = 1;
		else
			this.periodos = 0;
	}

	/**
	 * Method 'getComplicaciones'
	 * 
	 * @return Integer
	 */
	public Integer getComplicaciones() {
		return complicaciones;
	}

	public Boolean getComplicacionesb() {
		if (complicaciones != null && complicaciones == 1)
			return true;
		return false;
	}

	/**
	 * Method 'setComplicaciones'
	 * 
	 * @param complicaciones
	 */
	public void setComplicaciones(Integer complicaciones) {
		this.complicaciones = complicaciones;
	}

	public void setComplicacionesb(Boolean complicaciones) {
		if (complicaciones != null && complicaciones)
			this.complicaciones = 1;
		else
			this.complicaciones = 0;
	}

	/**
	 * Method 'getAblacion'
	 * 
	 * @return Integer
	 */
	public Integer getAblacion() {
		return ablacion;
	}

	/**
	 * Method 'setAblacion'
	 * 
	 * @param ablacion
	 */
	public void setAblacion(Integer ablacion) {
		if(ablacion != null)
			this.ablacion = ablacion;
	}

	/**
	 * Method 'getIdpaciente'
	 * 
	 * @return Integer
	 */
	public Integer getIdpaciente() {
		return idpaciente;
	}

	/**
	 * Method 'setIdpaciente'
	 * 
	 * @param idpaciente
	 */
	public void setIdpaciente(Integer idpaciente) {
		this.idpaciente = idpaciente;
	}

	public String getComent_cateter() {
		return coment_cateter;
	}

	public void setComent_cateter(String comentCateter) {
		coment_cateter = comentCateter;
	}

	public String getComent_vias() {
		return coment_vias;
	}

	public void setComent_vias(String comentVias) {
		coment_vias = comentVias;
	}

	public String getComent_periodos() {
		return coment_periodos;
	}

	public void setComent_periodos(String comentPeriodos) {
		coment_periodos = comentPeriodos;
	}

	public String getHllegada() {
		return hllegada;
	}

	public void setHllegada(String hllegada) {
		this.hllegada = hllegada;
		if (this.hllegada != null && this.hllegada.length() == 4) {
			this.hllegadah = this.hllegada.substring(0, 2);
			this.hllegadam = this.hllegada.substring(2);
		}
	}

	public String getHpuncion() {
		return hpuncion;
	}

	public void setHpuncion(String hpuncion) {
		this.hpuncion = hpuncion;
		if (this.hpuncion != null && this.hpuncion.length() == 4) {
			this.hpuncionh = this.hpuncion.substring(0, 2);
			this.hpuncionm = this.hpuncion.substring(2);
		}
	}

	public String getHablacion() {
		return hablacion;
	}

	public void setHablacion(String hablacion) {
		this.hablacion = hablacion;
		if (this.hablacion != null && this.hablacion.length() == 4) {
			this.hablacionh = this.hablacion.substring(0, 2);
			this.hablacionm = this.hablacion.substring(2);
		}
	}

	public String getHcateter() {
		return hcateter;
	}

	public void setHcateter(String hcateter) {
		this.hcateter = hcateter;
		if (this.hcateter != null && this.hcateter.length() == 4) {
			this.hcateterh = this.hcateter.substring(0, 2);
			this.hcateterm = this.hcateter.substring(2);
		}
	}

	public String getHsalida() {
		return hsalida;
	}

	public void setHsalida(String hsalida) {
		this.hsalida = hsalida;
		if (this.hsalida != null && this.hsalida.length() == 4) {
			this.hsalidah = this.hsalida.substring(0, 2);
			this.hsalidam = this.hsalida.substring(2);
		}
	}

	public String getTescopia() {
		return tescopia;
	}

	public void setTescopia(String tescopia) {
		this.tescopia = tescopia;
	}

	public ArrayList<ArrEstudioEnf> getEnfermeras() {
		return enfermeras;
	}

	public void setEnfermeras(ArrayList<ArrEstudioEnf> enfermeras) {
		this.enfermeras = enfermeras;
	}

	public ArrayList<ArrEstudioPop> getPoperador() {
		return poperador;
	}

	public void setPoperador(ArrayList<ArrEstudioPop> poperador) {
		this.poperador = poperador;
	}

	public ArrayList<ArrEstudioSop> getSoperador() {
		return soperador;
	}

	public void setSoperador(ArrayList<ArrEstudioSop> soperador) {
		this.soperador = soperador;
	}

	public ArrayList<ArrEstudioAnest> getAnest() {
		return anest;
	}

	public void setAnest(ArrayList<ArrEstudioAnest> anest) {
		this.anest = anest;
	}

	public ArrEstudioComplicaciones getComplicacionesdto() {
		return complicacionesdto;
	}

	public void setComplicacionesdto(ArrEstudioComplicaciones complicacionesdto) {
		this.complicacionesdto = complicacionesdto;
	}

	public ArrEstudioIntento getIntentodto() {
		return intentodto;
	}

	public void setIntentodto(ArrEstudioIntento intentodto) {
		this.intentodto = intentodto;
	}

	public ArrEstudioAblacion getAblaciondto() {
		return ablaciondto;
	}

	public void setAblaciondto(ArrEstudioAblacion ablaciondto) {
		this.ablaciondto = ablaciondto;
	}

	public ArrayList<ArrEstudioAblacion> getAblaciones() {
		return ablaciones;
	}

	public void setAblaciones(ArrayList<ArrEstudioAblacion> ablaciones) {
		this.ablaciones = ablaciones;
	}

	public ArrEstudioConduccav getConducciondto() {
		return conducciondto;
	}

	public void setConducciondto(ArrEstudioConduccav conducciondto) {
		this.conducciondto = conducciondto;
	}

	public ArrEstudioSinusal getSinusaldto() {
		return sinusaldto;
	}

	public void setSinusaldto(ArrEstudioSinusal sinusaldto) {
		this.sinusaldto = sinusaldto;
	}

	public ArrayList<ArrEstudioTaqui> getLsttaquicardias() {
		return lsttaquicardias;
	}

	public void setLsttaquicardias(ArrayList<ArrEstudioTaqui> lsttaquicardias) {
		this.lsttaquicardias = lsttaquicardias;
	}

	public ArrEstudioTaqui getTaquicardidto() {
		return taquicardidto;
	}

	public void setTaquicardidto(ArrEstudioTaqui taquicardidto) {
		this.taquicardidto = taquicardidto;
	}

	public ArrEstudioEcg getEcgdto() {
		return ecgdto;
	}

	public void setEcgdto(ArrEstudioEcg ecgdto) {
		this.ecgdto = ecgdto;
	}

	/*public ArrayList<ArrEstudioCateter> getCateterdto() {
		return cateterdto;
	}

	public void setCateterdto(ArrayList<ArrEstudioCateter> cateterdto) {
		this.cateterdto = cateterdto;
	}*/

	public ArrayList<ArrEstudioVias> getViasdto() {
		return viasdto;
	}

	public void setViasdto(ArrayList<ArrEstudioVias> viasdto) {
		this.viasdto = viasdto;
	}

	public ArrayList<ArrEstudioPeriodo> getPeriodosdto() {
		return periodosdto;
	}

	public void setPeriodosdto(ArrayList<ArrEstudioPeriodo> periodosdto) {
		this.periodosdto = periodosdto;
	}
	/**
	 * Method 'getAngiografia'
	 * 
	 * @return Integer
	 */
	public Integer getAngiografia()
	{
		return angiografia;
	}
	/**
	 * Method 'setAngiografia'
	 * 
	 * @param angiografia
	 */
	public void setAngiografia(Integer angiografia)
	{
		this.angiografia = angiografia;
	}
	/**
	 * Method 'getRobot'
	 * 
	 * @return Integer
	 */
	public Integer getRobot()
	{
		return robot;
	}

	/**
	 * Method 'setRobot'
	 * 
	 * @param robot
	 */
	public void setRobot(Integer robot)
	{
		this.robot = robot;
	}

	/**
	 * Method 'getTipoDiag1'
	 * 
	 * @return Integer
	 */
	public Integer getTipoDiag1() {
		return tipoDiag1;
	}

	/**
	 * Method 'setTipoDiag1'
	 * 
	 * @param robot
	 */
	public void setTipoDiag1(Integer tipoDiag1) {
		this.tipoDiag1 = tipoDiag1;
	}

	/**
	 * Method 'getTipoDiag2'
	 * 
	 * @return Integer
	 */
	public Integer getTipoDiag2() {
		return tipoDiag2;
	}

	/**
	 * Method 'setTipoDiag2'
	 * 
	 * @param robot
	 */
	public void setTipoDiag2(Integer tipoDiag2) {
		this.tipoDiag2 = tipoDiag2;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other) {
		if (_other == null) {
			return false;
		}

		if (_other == this) {
			return true;
		}

		if (!(_other instanceof ArrEstudio)) {
			return false;
		}

		final ArrEstudio _cast = (ArrEstudio) _other;
		if (idestudio == null ? _cast.idestudio != idestudio : !idestudio
				.equals(_cast.idestudio)) {
			return false;
		}

		if (fecha == null ? _cast.fecha != fecha : !fecha.equals(_cast.fecha)) {
			return false;
		}

		if (motivo == null ? _cast.motivo != motivo : !motivo
				.equals(_cast.motivo)) {
			return false;
		}

		if (hallazgos == null ? _cast.hallazgos != hallazgos : !hallazgos
				.equals(_cast.hallazgos)) {
			return false;
		}

		if (diagnostico == null ? _cast.diagnostico != diagnostico
				: !diagnostico.equals(_cast.diagnostico)) {
			return false;
		}

		if (anestesista == null ? _cast.anestesista != anestesista
				: !anestesista.equals(_cast.anestesista)) {
			return false;
		}

		if (interes == null ? _cast.interes != interes : !interes
				.equals(_cast.interes)) {
			return false;
		}

		if (navegador == null ? _cast.navegador != navegador : !navegador
				.equals(_cast.navegador)) {
			return false;
		}

		if (escopia == null ? _cast.escopia != escopia : !escopia
				.equals(_cast.escopia)) {
			return false;
		}

		if (ecografia == null ? _cast.ecografia != ecografia : !ecografia
				.equals(_cast.ecografia)) {
			return false;
		}

		if (ecg == null ? _cast.ecg != ecg : !ecg.equals(_cast.ecg)) {
			return false;
		}

		if (cateteres == null ? _cast.cateteres != cateteres : !cateteres
				.equals(_cast.cateteres)) {
			return false;
		}

		if (sinusal == null ? _cast.sinusal != sinusal : !sinusal
				.equals(_cast.sinusal)) {
			return false;
		}

		if (taquicardias == null ? _cast.taquicardias != taquicardias
				: !taquicardias.equals(_cast.taquicardias)) {
			return false;
		}

		if (conduccion == null ? _cast.conduccion != conduccion : !conduccion
				.equals(_cast.conduccion)) {
			return false;
		}

		if (vias == null ? _cast.vias != vias : !vias.equals(_cast.vias)) {
			return false;
		}

		if (periodos == null ? _cast.periodos != periodos : !periodos
				.equals(_cast.periodos)) {
			return false;
		}

		if (complicaciones == null ? _cast.complicaciones != complicaciones
				: !complicaciones.equals(_cast.complicaciones)) {
			return false;
		}

		if (ablacion == null ? _cast.ablacion != ablacion : !ablacion
				.equals(_cast.ablacion)) {
			return false;
		}

		if (idpaciente == null ? _cast.idpaciente != idpaciente : !idpaciente
				.equals(_cast.idpaciente)) {
			return false;
		}

		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode() {
		int _hashCode = 0;
		if (idestudio != null) {
			_hashCode = 29 * _hashCode + idestudio.hashCode();
		}

		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}

		if (motivo != null) {
			_hashCode = 29 * _hashCode + motivo.hashCode();
		}

		if (hallazgos != null) {
			_hashCode = 29 * _hashCode + hallazgos.hashCode();
		}

		if (diagnostico != null) {
			_hashCode = 29 * _hashCode + diagnostico.hashCode();
		}

		if (anestesista != null) {
			_hashCode = 29 * _hashCode + anestesista.hashCode();
		}

		if (interes != null) {
			_hashCode = 29 * _hashCode + interes.hashCode();
		}

		if (navegador != null) {
			_hashCode = 29 * _hashCode + navegador.hashCode();
		}

		if (escopia != null) {
			_hashCode = 29 * _hashCode + escopia.hashCode();
		}

		if (ecografia != null) {
			_hashCode = 29 * _hashCode + ecografia.hashCode();
		}

		if (ecg != null) {
			_hashCode = 29 * _hashCode + ecg.hashCode();
		}

		if (cateteres != null) {
			_hashCode = 29 * _hashCode + cateteres.hashCode();
		}

		if (sinusal != null) {
			_hashCode = 29 * _hashCode + sinusal.hashCode();
		}

		if (taquicardias != null) {
			_hashCode = 29 * _hashCode + taquicardias.hashCode();
		}

		if (conduccion != null) {
			_hashCode = 29 * _hashCode + conduccion.hashCode();
		}

		if (vias != null) {
			_hashCode = 29 * _hashCode + vias.hashCode();
		}

		if (periodos != null) {
			_hashCode = 29 * _hashCode + periodos.hashCode();
		}

		if (complicaciones != null) {
			_hashCode = 29 * _hashCode + complicaciones.hashCode();
		}

		if (ablacion != null) {
			_hashCode = 29 * _hashCode + ablacion.hashCode();
		}

		if (idpaciente != null) {
			_hashCode = 29 * _hashCode + idpaciente.hashCode();
		}

		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrEstudioPk
	 */
	public ArrEstudioPk createPk() {
		return new ArrEstudioPk(idestudio);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("com.sorin.idea.dto.ArrEstudio: ");
		ret.append("idestudio=" + idestudio);
		ret.append(", fecha=" + fecha);
		ret.append(", motivo=" + motivo);
		ret.append(", hallazgos=" + hallazgos);
		ret.append(", diagnostico=" + diagnostico);
		ret.append(", anestesista=" + anestesista);
		ret.append(", interes=" + interes);
		ret.append(", navegador=" + navegador);
		ret.append(", escopia=" + escopia);
		ret.append(", ecografia=" + ecografia);
		ret.append(", ecg=" + ecg);
		ret.append(", cateteres=" + cateteres);
		ret.append(", sinusal=" + sinusal);
		ret.append(", taquicardias=" + taquicardias);
		ret.append(", conduccion=" + conduccion);
		ret.append(", vias=" + vias);
		ret.append(", periodos=" + periodos);
		ret.append(", complicaciones=" + complicaciones);
		ret.append(", ablacion=" + ablacion);
		ret.append(", idpaciente=" + idpaciente);
		ret.append(", coment_cateter=" + coment_cateter);
		ret.append(", coment_vias=" + coment_vias);
		ret.append(", coment_periodos=" + coment_periodos);
		return ret.toString();
	}

	/*public void addCateter(ActionEvent e) {
		this.getCateterdto().add(new ArrEstudioCateter());
	}

	public void delCateter(ActionEvent e) {
		this.getCateterdto().remove(this.bincat.getRowIndex());
	}*/

	public void addVias(ActionEvent e) {
		this.getViasdto().add(new ArrEstudioVias());
	}

	public void delVias(ActionEvent e) {
		this.getViasdto().remove(this.binvias.getRowIndex());
	}

	public void obtenVia(ActionEvent e) {
		this.filaLocalizacion = this.binvias.getRowIndex();
		this.localizacion = this.getViasdto().get(this.filaLocalizacion)
				.getLocalizacion();
	}

	public void guardaLoc(ActionEvent e) {
		this.getViasdto().get(this.filaLocalizacion).setLocalizacion(
				this.localizacion);
		this.localizacion = new GenericosDto();
	}

	public void addPr(ActionEvent e) {
		this.getPeriodosdto().add(new ArrEstudioPeriodo());
	}

	public void delPr(ActionEvent e) {
		this.getPeriodosdto().remove(this.binpr.getRowIndex());
	}

/*	public HtmlDataTable getBincat() {
		return bincat;
	}

	public void setBincat(HtmlDataTable bincat) {
		this.bincat = bincat;
	}*/

	public HtmlDataTable getBinvias() {
		return binvias;
	}

	public void setBinvias(HtmlDataTable binvias) {
		this.binvias = binvias;
	}

	public HtmlDataTable getBinpr() {
		return binpr;
	}

	public void setBinpr(HtmlDataTable binpr) {
		this.binpr = binpr;
	}

	public GenericosDto getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(GenericosDto localizacion) {
		this.localizacion = localizacion;
	}

	public ArrEstudioNproc getNproc() {
		return nproc;
	}

	public void setNproc(ArrEstudioNproc nproc) {
		this.nproc = nproc;
	}

	public String getNestudio() {
		return nestudio;
	}

	public void setNestudio(String nestudio) {
		this.nestudio = nestudio;
	}
	
	

	public String getEpisodio() {
		return episodio;
	}

	public void setEpisodio(String episodio) {
		this.episodio = episodio;
	}

	public String getHllegadah() {
		return hllegadah;
	}

	public void setHllegadah(String hllegadah) {
		if(hllegadah.length() == 1)
			hllegadah = "0" + hllegadah;
		this.hllegadah = hllegadah;
	}

	public String getHllegadam() {
		return hllegadam;
	}

	public void setHllegadam(String hllegadam) {
		if(hllegadam.length() == 1)
			hllegadam = "0" + hllegadam;
		this.hllegadam = hllegadam;
	}

	public String getHpuncionh() {
		return hpuncionh;
	}

	public void setHpuncionh(String hpuncionh) {
		if(hpuncionh.length() == 1)
			hpuncionh = "0" + hpuncionh;
		this.hpuncionh = hpuncionh;
	}

	public String getHpuncionm() {
		return hpuncionm;
	}

	public void setHpuncionm(String hpuncionm) {
		if(hpuncionm.length() == 1)
			hpuncionm = "0" + hpuncionm;
		this.hpuncionm = hpuncionm;
	}

	public String getHablacionh() {
		return hablacionh;
	}

	public void setHablacionh(String hablacionh) {
		if(hablacionh.length() == 1)
			hablacionh = "0" + hablacionh;
		this.hablacionh = hablacionh;
	}

	public String getHablacionm() {
		return hablacionm;
	}

	public void setHablacionm(String hablacionm) {
		if(hablacionm.length() == 1)
			hablacionm = "0" + hablacionm;
		this.hablacionm = hablacionm;
	}

	public String getHcateterh() {
		return hcateterh;
	}

	public void setHcateterh(String hcateterh) {
		if(hcateterh.length() == 1)
			hcateterh = "0" + hcateterh;
		this.hcateterh = hcateterh;
	}

	public String getHcateterm() {
		return hcateterm;
	}

	public void setHcateterm(String hcateterm) {
		if(hcateterm.length() == 1)
			hcateterm = "0" + hcateterm;
		this.hcateterm = hcateterm;
	}

	public String getHsalidah() {
		return hsalidah;
	}

	public void setHsalidah(String hsalidah) {
		if(hsalidah.length() == 1)
			hsalidah = "0" + hsalidah;
		this.hsalidah = hsalidah;
	}

	public String getHsalidam() {
		return hsalidam;
	}

	public void setHsalidam(String hsalidam) {
		if(hsalidam.length() == 1)
			hsalidam = "0" + hsalidam;
		this.hsalidam = hsalidam;
	}

	/*
	 * public String getNestudio(){ String tmp = ""; if(this.getIdestudio() !=
	 * null && this.getFecha() != null){ String id =
	 * this.getIdestudio().toString(); while(id.length() < 3) id = "0" + id;
	 * String a�o = ""+(this.getFecha().getYear() + 1900); id = a�o.substring(2)
	 * + id; tmp = id; } return tmp; }
	 */

	public String getDuracion(){
		String duracion = "";
		if(this.hllegada != null && this.hllegada.length() > 0 &&
				this.hsalida != null && this.hsalida.length() > 0){
			Date ini = new Date(2011,1,1,new Integer(hllegadah), new Integer(hllegadam), 0);
			Date fin = new Date(2011,1,1,new Integer(hsalidah), new Integer(hsalidam), 0);
			duracion = UtilFechas.dateDiffms(fin, ini);
		}
		return duracion;
	}

	public String getEefanterior() {
		return eefanterior;
	}

	public void setEefanterior(String eefanterior) {
		this.eefanterior = eefanterior;
	}

	public Integer getTipoProcedimiento() {
		return tipoProcedimiento;
	}

	public void setTipoProcedimiento(Integer tipoProcedimiento) {
		this.tipoProcedimiento = tipoProcedimiento;
	}
	
	public boolean isIniciado(){
		if(this.diagnostico != null && this.diagnostico > 0)
			return true;
		else return false;
	}

	public boolean getAblb() {
		if (ablacion != null && ablacion!=0)
			return true;
		return false;
	}

	public void setAblb(boolean ablb) {
		this.ablb = ablb;
		// marca por defecto la opcion ablacion realizada
		if (ablb)
			this.ablacion = 2;
		else
			this.ablacion = 0;
	}

	public ArrayList<Cateter> getAux() {
		return aux;
	}

	public void setAux(ArrayList<Cateter> aux) {
		this.aux = aux;
	}

	public ArrayList<ArrEstudioCatUso> getListacats() {
		return listacats;
	}

	public void setListacats(ArrayList<ArrEstudioCatUso> listacats) {
		this.listacats = listacats;
	}

	public String getEdadmin() {
		return edadmin;
	}

	public void setEdadmin(String edadmin) {
		this.edadmin = edadmin;
	}

	public String getEdadmax() {
		return edadmax;
	}

	public void setEdadmax(String edadmax) {
		this.edadmax = edadmax;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}

	/**
	 * Method 'getDosisEscopia'
	 * 
	 * @return String
	 */
	public String getDosisEscopia()
	{
		return dosisEscopia;
	}

	/**
	 * Method 'setDosisEscopia'
	 * 
	 * @param dosisEscopia
	 */
	public void setDosisEscopia(String dosisEscopia)
	{
		this.dosisEscopia = dosisEscopia;
	}
	
}