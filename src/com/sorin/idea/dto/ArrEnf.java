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

import javax.faces.event.ActionEvent;

import org.apache.myfaces.component.html.ext.HtmlDataTable;

import com.sorin.idea.dao.*;
import com.sorin.idea.exceptions.*;
import com.sorin.idea.factory.*;
import com.sorin.idea.jdbc.ArrEstudioDaoImpl;
import com.sorin.idea.util.UtilFechas;

public class ArrEnf implements Serializable
{
	/** 
	 * This attribute maps to the column ID_PACIENTE in the ARR_ENF table.
	 */
	protected Integer idPaciente;

	/** 
	 * This attribute maps to the column ID_REGISTRO in the ARR_ENF table.
	 */
	protected Integer idRegistro;

	/** 
	 * This attribute maps to the column PESO in the ARR_ENF table.
	 */
	protected String peso;

	/** 
	 * This attribute maps to the column TALLA in the ARR_ENF table.
	 */
	protected String talla;

	/** 
	 * This attribute maps to the column TALLEG1 in the ARR_ENF table.
	 */
	protected String talleg1;

	/** 
	 * This attribute maps to the column TALLEG2 in the ARR_ENF table.
	 */
	protected String talleg2;

	/** 
	 * This attribute maps to the column FCLLEG in the ARR_ENF table.
	 */
	protected String fclleg;

	/** 
	 * This attribute maps to the column TAFIN1 in the ARR_ENF table.
	 */
	protected String tafin1;

	/** 
	 * This attribute maps to the column TAFIN2 in the ARR_ENF table.
	 */
	protected String tafin2;

	/** 
	 * This attribute maps to the column FCFIN in the ARR_ENF table.
	 */
	protected String fcfin;

	/** 
	 * This attribute maps to the column TATAQ1 in the ARR_ENF table.
	 */
	protected String tataq1;

	/** 
	 * This attribute maps to the column TATAQ2 in the ARR_ENF table.
	 */
	protected String tataq2;

	/** 
	 * This attribute maps to the column FCTAQ in the ARR_ENF table.
	 */
	protected String fctaq;

	/** 
	 * This attribute maps to the column CALIBRE1 in the ARR_ENF table.
	 */
	protected String calibre1;

	/** 
	 * This attribute maps to the column MIEMBRO in the ARR_ENF table.
	 */
	protected String miembro;

	/** 
	 * This attribute maps to the column PLANTA in the ARR_ENF table.
	 */
	protected Integer planta;

	/** 
	 * This attribute maps to the column NUMERO in the ARR_ENF table.
	 */
	protected String numero;

	/** 
	 * This attribute maps to the column CALIBRE2 in the ARR_ENF table.
	 */
	protected String calibre2;

	/** 
	 * This attribute maps to the column DIAGNOS in the ARR_ENF table.
	 */
	protected String diagnos;

	/** 
	 * This attribute maps to the column ABLACION in the ARR_ENF table.
	 */
	protected String ablacion;

	/** 
	 * This attribute maps to the column PUNCION in the ARR_ENF table.
	 */
	protected Integer puncion;

	/** 
	 * This attribute maps to the column MATERIAL in the ARR_ENF table.
	 */
	protected String material;

	/** 
	 * This attribute maps to the column VESICAL in the ARR_ENF table.
	 */
	protected String vesical;
	protected String diuresis;

	/** 
	 * This attribute maps to the column OTROS in the ARR_ENF table.
	 */
	protected String otros;

	/** 
	 * This attribute maps to the column VASCULAR in the ARR_ENF table.
	 */
	protected String vascular;
	protected Boolean vascular1;
	protected Boolean vascular2;
	protected Boolean vascular3;
	protected Boolean vascular4;
	protected Boolean vascular5;
	protected Boolean vascular6;
	protected Boolean vascular7;
	protected Boolean vascular8;

	/** 
	 * This attribute maps to the column HEMOSTASIA in the ARR_ENF table.
	 */
	protected Integer hemostasia;
	protected String hemostr;
	
	protected Integer hemostasiav;
	protected String hemostrv;

	/** 
	 * This attribute maps to the column VENDAJE in the ARR_ENF table.
	 */
	protected Integer vendaje;

	/** 
	 * This attribute maps to the column ZONA in the ARR_ENF table.
	 */
	protected Integer zona;

	/** 
	 * This attribute maps to the column SUERO in the ARR_ENF table.
	 */
	protected String suero;

	/** 
	 * This attribute maps to the column HEPARINA in the ARR_ENF table.
	 */
	protected String heparina;

	/** 
	 * This attribute maps to the column SEDACION in the ARR_ENF table.
	 */
	protected String sedacion;
	protected Boolean sedacion1;
	protected Boolean sedacion2;
	protected Boolean sedacion3;
	

	/** 
	 * This attribute maps to the column FARMACOS in the ARR_ENF table.
	 */
	protected String farmacos;

	/** 
	 * This attribute maps to the column CV in the ARR_ENF table.
	 */
	protected Integer cv;

	/** 
	 * This attribute maps to the column CV1 in the ARR_ENF table.
	 */
	protected String cv1;

	/** 
	 * This attribute maps to the column CV2 in the ARR_ENF table.
	 */
	protected String cv2;

	/** 
	 * This attribute maps to the column CV3 in the ARR_ENF table.
	 */
	protected String cv3;

	/** 
	 * This attribute maps to the column CV4 in the ARR_ENF table.
	 */
	protected String cv4;

	/** 
	 * This attribute maps to the column MOTIVO in the ARR_ENF table.
	 */
	protected Integer motivo;

	/** 
	 * This attribute maps to the column EXITO in the ARR_ENF table.
	 */
	protected Integer exito;

	/** 
	 * This attribute maps to the column OBSERV in the ARR_ENF table.
	 */
	protected String observ;

	/** 
	 * This attribute maps to the column DESTINO in the ARR_ENF table.
	 */
	protected String destino;

	/** 
	 * This attribute maps to the column FECHA in the ARR_ENF table.
	 */
	protected Date fecha = new Date();
	
	protected Integer ideef;
	
	protected String cuidados;
	
	protected String inr;
	
	protected ArrayList<ArrEnfIntroductores> introductores;
	
	protected ArrayList<ArrEnfAct> acts;

	protected HtmlDataTable binintr;
	
	protected HtmlDataTable binact;
	
	protected HtmlDataTable bincat;
	
	protected ArrayList<ArrEstudioCateter> cats;
	/**
	 * Method 'ArrEnf'
	 * 
	 */
	public ArrEnf()
	{
		this.introductores = new ArrayList<ArrEnfIntroductores>();
		this.acts = new ArrayList<ArrEnfAct>();
		this.cats = new ArrayList<ArrEstudioCateter>();
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
	 * Method 'getIdRegistro'
	 * 
	 * @return Integer
	 */
	public Integer getIdRegistro()
	{
		return idRegistro;
	}

	/**
	 * Method 'setIdRegistro'
	 * 
	 * @param idRegistro
	 */
	public void setIdRegistro(Integer idRegistro)
	{
		this.idRegistro = idRegistro;
	}

	/**
	 * Method 'getPeso'
	 * 
	 * @return String
	 */
	public String getPeso()
	{
		return peso;
	}

	/**
	 * Method 'setPeso'
	 * 
	 * @param peso
	 */
	public void setPeso(String peso)
	{
		this.peso = peso;
	}

	/**
	 * Method 'getTalla'
	 * 
	 * @return String
	 */
	public String getTalla()
	{
		return talla;
	}

	/**
	 * Method 'setTalla'
	 * 
	 * @param talla
	 */
	public void setTalla(String talla)
	{
		this.talla = talla;
	}

	/**
	 * Method 'getTalleg1'
	 * 
	 * @return String
	 */
	public String getTalleg1()
	{
		return talleg1;
	}

	/**
	 * Method 'setTalleg1'
	 * 
	 * @param talleg1
	 */
	public void setTalleg1(String talleg1)
	{
		this.talleg1 = talleg1;
	}

	/**
	 * Method 'getTalleg2'
	 * 
	 * @return String
	 */
	public String getTalleg2()
	{
		return talleg2;
	}

	/**
	 * Method 'setTalleg2'
	 * 
	 * @param talleg2
	 */
	public void setTalleg2(String talleg2)
	{
		this.talleg2 = talleg2;
	}

	/**
	 * Method 'getFclleg'
	 * 
	 * @return String
	 */
	public String getFclleg()
	{
		return fclleg;
	}

	/**
	 * Method 'setFclleg'
	 * 
	 * @param fclleg
	 */
	public void setFclleg(String fclleg)
	{
		this.fclleg = fclleg;
	}

	/**
	 * Method 'getTafin1'
	 * 
	 * @return String
	 */
	public String getTafin1()
	{
		return tafin1;
	}

	/**
	 * Method 'setTafin1'
	 * 
	 * @param tafin1
	 */
	public void setTafin1(String tafin1)
	{
		this.tafin1 = tafin1;
	}

	/**
	 * Method 'getTafin2'
	 * 
	 * @return String
	 */
	public String getTafin2()
	{
		return tafin2;
	}

	/**
	 * Method 'setTafin2'
	 * 
	 * @param tafin2
	 */
	public void setTafin2(String tafin2)
	{
		this.tafin2 = tafin2;
	}

	/**
	 * Method 'getFcfin'
	 * 
	 * @return String
	 */
	public String getFcfin()
	{
		return fcfin;
	}

	/**
	 * Method 'setFcfin'
	 * 
	 * @param fcfin
	 */
	public void setFcfin(String fcfin)
	{
		this.fcfin = fcfin;
	}

	/**
	 * Method 'getTataq1'
	 * 
	 * @return String
	 */
	public String getTataq1()
	{
		return tataq1;
	}

	/**
	 * Method 'setTataq1'
	 * 
	 * @param tataq1
	 */
	public void setTataq1(String tataq1)
	{
		this.tataq1 = tataq1;
	}

	/**
	 * Method 'getTataq2'
	 * 
	 * @return String
	 */
	public String getTataq2()
	{
		return tataq2;
	}

	/**
	 * Method 'setTataq2'
	 * 
	 * @param tataq2
	 */
	public void setTataq2(String tataq2)
	{
		this.tataq2 = tataq2;
	}

	/**
	 * Method 'getFctaq'
	 * 
	 * @return String
	 */
	public String getFctaq()
	{
		return fctaq;
	}

	/**
	 * Method 'setFctaq'
	 * 
	 * @param fctaq
	 */
	public void setFctaq(String fctaq)
	{
		this.fctaq = fctaq;
	}

	/**
	 * Method 'getCalibre1'
	 * 
	 * @return String
	 */
	public String getCalibre1()
	{
		return calibre1;
	}

	/**
	 * Method 'setCalibre1'
	 * 
	 * @param calibre1
	 */
	public void setCalibre1(String calibre1)
	{
		this.calibre1 = calibre1;
	}

	/**
	 * Method 'getMiembro'
	 * 
	 * @return String
	 */
	public String getMiembro()
	{
		return miembro;
	}

	/**
	 * Method 'setMiembro'
	 * 
	 * @param miembro
	 */
	public void setMiembro(String miembro)
	{
		this.miembro = miembro;
	}

	/**
	 * Method 'getPlanta'
	 * 
	 * @return Integer
	 */
	public Integer getPlanta()
	{
		return planta;
	}

	/**
	 * Method 'setPlanta'
	 * 
	 * @param planta
	 */
	public void setPlanta(Integer planta)
	{
		this.planta = planta;
	}

	/**
	 * Method 'getNumero'
	 * 
	 * @return String
	 */
	public String getNumero()
	{
		return numero;
	}

	/**
	 * Method 'setNumero'
	 * 
	 * @param numero
	 */
	public void setNumero(String numero)
	{
		this.numero = numero;
	}

	/**
	 * Method 'getCalibre2'
	 * 
	 * @return String
	 */
	public String getCalibre2()
	{
		return calibre2;
	}

	/**
	 * Method 'setCalibre2'
	 * 
	 * @param calibre2
	 */
	public void setCalibre2(String calibre2)
	{
		this.calibre2 = calibre2;
	}

	/**
	 * Method 'getDiagnos'
	 * 
	 * @return String
	 */
	public String getDiagnos()
	{
		return diagnos;
	}

	/**
	 * Method 'setDiagnos'
	 * 
	 * @param diagnos
	 */
	public void setDiagnos(String diagnos)
	{
		this.diagnos = diagnos;
	}

	/**
	 * Method 'getPuncion'
	 * 
	 * @return Integer
	 */
	public Integer getPuncion()
	{
		return puncion;
	}

	/**
	 * Method 'setPuncion'
	 * 
	 * @param puncion
	 */
	public void setPuncion(Integer puncion)
	{
		this.puncion = puncion;
	}

	/**
	 * Method 'getMaterial'
	 * 
	 * @return String
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * Method 'setMaterial'
	 * 
	 * @param material
	 */
	public void setMaterial(String material)
	{
		this.material = material;
	}

	/**
	 * Method 'getVesical'
	 * 
	 * @return String
	 */
	public String getVesical()
	{
		return vesical;
	}

	/**
	 * Method 'setVesical'
	 * 
	 * @param vesical
	 */
	public void setVesical(String vesical)
	{
		this.vesical = vesical;
	}

	/**
	 * Method 'getOtros'
	 * 
	 * @return String
	 */
	public String getOtros()
	{
		return otros;
	}

	/**
	 * Method 'setOtros'
	 * 
	 * @param otros
	 */
	public void setOtros(String otros)
	{
		this.otros = otros;
	}

	/**
	 * Method 'getVascular'
	 * 
	 * @return Integer
	 */
	public String getVascular()
	{
		this.vascular = "";
		if(vascular1) this.vascular += "1";
		else this.vascular += "0";
		if(vascular2) this.vascular += "1";
		else this.vascular += "0";
		if(vascular3) this.vascular += "1";
		else this.vascular += "0";
		if(vascular4) this.vascular += "1";
		else this.vascular += "0";
		if(vascular5) this.vascular += "1";
		else this.vascular += "0";
		if(vascular6) this.vascular += "1";
		else this.vascular += "0";
		if(vascular7) this.vascular += "1";
		else this.vascular += "0";
		if(vascular8) this.vascular += "1";
		else this.vascular += "0";
		return vascular;
	}

	/**
	 * Method 'setVascular'
	 * 
	 * @param vascular
	 */
	public void setVascular(String vascular)
	{
		this.vascular = vascular;
		if(vascular != null){
			if(vascular.charAt(0) == '0')
				this.vascular1 = false;
			else
				this.vascular1 = true;
			if(vascular.charAt(1) == '0')
				this.vascular2 = false;
			else
				this.vascular2 = true;
			if(vascular.charAt(2) == '0')
				this.vascular3 = false;
			else
				this.vascular3 = true;
			if(vascular.charAt(3) == '0')
				this.vascular4 = false;
			else
				this.vascular4 = true;
			if(vascular.charAt(4) == '0')
				this.vascular5 = false;
			else
				this.vascular5 = true;
			if(vascular.charAt(5) == '0')
				this.vascular6 = false;
			else
				this.vascular6 = true;
			// guanya para evitar update de todos los registros de enfermeria previos
			// habria que incluir los 00 ultimos por defecto
			if(vascular.length()<=6 || vascular.charAt(6) == '0')
				this.vascular7 = false;
			else
				this.vascular7 = true;
			if(vascular.length()<=6 || vascular.charAt(7) == '0')
				this.vascular8 = false;
			else
				this.vascular8 = true;
		}
	}
	
	public Boolean getVascular1() {
		return vascular1;
	}

	public void setVascular1(Boolean vascular1) {
		this.vascular1 = vascular1;
	}

	public Boolean getVascular2() {
		return vascular2;
	}

	public void setVascular2(Boolean vascular2) {
		this.vascular2 = vascular2;
	}

	public Boolean getVascular3() {
		return vascular3;
	}

	public void setVascular3(Boolean vascular3) {
		this.vascular3 = vascular3;
	}

	public Boolean getVascular4() {
		return vascular4;
	}

	public void setVascular4(Boolean vascular4) {
		this.vascular4 = vascular4;
	}

	public Boolean getVascular5() {
		return vascular5;
	}

	public void setVascular5(Boolean vascular5) {
		this.vascular5 = vascular5;
	}

	public Boolean getVascular6() {
		return vascular6;
	}

	public void setVascular6(Boolean vascular6) {
		this.vascular6 = vascular6;
	}
	
	public Boolean getVascular7() {
		return vascular7;
	}

	public void setVascular7(Boolean vascular7) {
		this.vascular7 = vascular7;
	}
	
	public Boolean getVascular8() {
		return vascular8;
	}

	public void setVascular8(Boolean vascular8) {
		this.vascular8 = vascular8;
	}

	/**
	 * Method 'getHemostasia'
	 * 
	 * @return Integer
	 */
	public Integer getHemostasia()
	{
		return hemostasia;
	}
	
	

	public Integer getHemostasiav() {
		return hemostasiav;
	}

	public void setHemostasiav(Integer hemostasiav) {
		this.hemostasiav = hemostasiav;
	}

	public String getHemostrv() {
		return hemostrv;
	}

	public void setHemostrv(String hemostrv) {
		this.hemostrv = hemostrv;
	}

	/**
	 * Method 'setHemostasia'
	 * 
	 * @param hemostasia
	 */
	public void setHemostasia(Integer hemostasia)
	{
		this.hemostasia = hemostasia;
	}

	/**
	 * Method 'getVendaje'
	 * 
	 * @return Integer
	 */
	public Integer getVendaje()
	{
		return vendaje;
	}

	/**
	 * Method 'setVendaje'
	 * 
	 * @param vendaje
	 */
	public void setVendaje(Integer vendaje)
	{
		this.vendaje = vendaje;
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
	 * Method 'getSuero'
	 * 
	 * @return String
	 */
	public String getSuero()
	{
		return suero;
	}

	/**
	 * Method 'setSuero'
	 * 
	 * @param suero
	 */
	public void setSuero(String suero)
	{
		this.suero = suero;
	}

	/**
	 * Method 'getHeparina'
	 * 
	 * @return String
	 */
	public String getHeparina()
	{
		return heparina;
	}

	/**
	 * Method 'setHeparina'
	 * 
	 * @param heparina
	 */
	public void setHeparina(String heparina)
	{
		this.heparina = heparina;
	}

	/**
	 * Method 'getSedacion'
	 * 
	 * @return Integer
	 */
	public String getSedacion()
	{
		this.sedacion = "";
		if(sedacion1) this.sedacion += "1";
		else this.sedacion += "0";
		if(sedacion2) this.sedacion += "1";
		else this.sedacion += "0";
		if(sedacion3) this.sedacion += "1";
		else this.sedacion += "0";
		return sedacion;
	}

	/**
	 * Method 'setSedacion'
	 * 
	 * @param sedacion
	 */
	public void setSedacion(String sedacion)
	{
		this.sedacion = sedacion;
		if(sedacion != null && sedacion.length() == 3){
			if(sedacion.charAt(0) == '0')
				this.sedacion1 = false;
			else
				this.sedacion1 = true;
			if(sedacion.charAt(1) == '0')
				this.sedacion2 = false;
			else
				this.sedacion2 = true;
			if(sedacion.charAt(2) == '0')
				this.sedacion3 = false;
			else
				this.sedacion3 = true;
		}
	}
	
	public Boolean getSedacion1() {
		return sedacion1;
	}

	public void setSedacion1(Boolean sedacion1) {
		this.sedacion1 = sedacion1;
	}

	public Boolean getSedacion2() {
		return sedacion2;
	}

	public void setSedacion2(Boolean sedacion2) {
		this.sedacion2 = sedacion2;
	}

	public Boolean getSedacion3() {
		return sedacion3;
	}

	public void setSedacion3(Boolean sedacion3) {
		this.sedacion3 = sedacion3;
	}

	/**
	 * Method 'getFarmacos'
	 * 
	 * @return String
	 */
	public String getFarmacos()
	{
		return farmacos;
	}

	/**
	 * Method 'setFarmacos'
	 * 
	 * @param farmacos
	 */
	public void setFarmacos(String farmacos)
	{
		this.farmacos = farmacos;
	}

	/**
	 * Method 'getCv'
	 * 
	 * @return Integer
	 */
	public Integer getCv()
	{
		return cv;
	}

	/**
	 * Method 'setCv'
	 * 
	 * @param cv
	 */
	public void setCv(Integer cv)
	{
		this.cv = cv;
	}

	/**
	 * Method 'getCv1'
	 * 
	 * @return String
	 */
	public String getCv1()
	{
		return cv1;
	}

	/**
	 * Method 'setCv1'
	 * 
	 * @param cv1
	 */
	public void setCv1(String cv1)
	{
		this.cv1 = cv1;
	}

	/**
	 * Method 'getCv2'
	 * 
	 * @return String
	 */
	public String getCv2()
	{
		return cv2;
	}

	/**
	 * Method 'setCv2'
	 * 
	 * @param cv2
	 */
	public void setCv2(String cv2)
	{
		this.cv2 = cv2;
	}

	/**
	 * Method 'getCv3'
	 * 
	 * @return String
	 */
	public String getCv3()
	{
		return cv3;
	}

	/**
	 * Method 'setCv3'
	 * 
	 * @param cv3
	 */
	public void setCv3(String cv3)
	{
		this.cv3 = cv3;
	}

	/**
	 * Method 'getCv4'
	 * 
	 * @return String
	 */
	public String getCv4()
	{
		return cv4;
	}

	/**
	 * Method 'setCv4'
	 * 
	 * @param cv4
	 */
	public void setCv4(String cv4)
	{
		this.cv4 = cv4;
	}

	/**
	 * Method 'getMotivo'
	 * 
	 * @return Integer
	 */
	public Integer getMotivo()
	{
		return motivo;
	}

	/**
	 * Method 'setMotivo'
	 * 
	 * @param motivo
	 */
	public void setMotivo(Integer motivo)
	{
		this.motivo = motivo;
	}

	/**
	 * Method 'getExito'
	 * 
	 * @return Integer
	 */
	public Integer getExito()
	{
		return exito;
	}

	/**
	 * Method 'setExito'
	 * 
	 * @param exito
	 */
	public void setExito(Integer exito)
	{
		this.exito = exito;
	}

	/**
	 * Method 'getObserv'
	 * 
	 * @return String
	 */
	public String getObserv()
	{
		return observ;
	}

	/**
	 * Method 'setObserv'
	 * 
	 * @param observ
	 */
	public void setObserv(String observ)
	{
		this.observ = observ;
	}

	/**
	 * Method 'getDestino'
	 * 
	 * @return String
	 */
	public String getDestino()
	{
		return destino;
	}

	/**
	 * Method 'setDestino'
	 * 
	 * @param destino
	 */
	public void setDestino(String destino)
	{
		this.destino = destino;
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
	public String getFechastr()
	{
		if(this.fecha != null)
			return UtilFechas.dateToString(fecha);
		else
			return "";
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
	
	public String getHemostr() {
		return hemostr;
	}

	public void setHemostr(String hemostr) {
		this.hemostr = hemostr;
	}

	public Integer getIdeef() {
		return ideef;
	}

	public void setIdeef(Integer ideef) {
		this.ideef = ideef;
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
		
		if (!(_other instanceof ArrEnf)) {
			return false;
		}
		
		final ArrEnf _cast = (ArrEnf) _other;
		if (idPaciente == null ? _cast.idPaciente != idPaciente : !idPaciente.equals( _cast.idPaciente )) {
			return false;
		}
		
		if (idRegistro == null ? _cast.idRegistro != idRegistro : !idRegistro.equals( _cast.idRegistro )) {
			return false;
		}
		
		if (peso == null ? _cast.peso != peso : !peso.equals( _cast.peso )) {
			return false;
		}
		
		if (talla == null ? _cast.talla != talla : !talla.equals( _cast.talla )) {
			return false;
		}
		
		if (talleg1 == null ? _cast.talleg1 != talleg1 : !talleg1.equals( _cast.talleg1 )) {
			return false;
		}
		
		if (talleg2 == null ? _cast.talleg2 != talleg2 : !talleg2.equals( _cast.talleg2 )) {
			return false;
		}
		
		if (fclleg == null ? _cast.fclleg != fclleg : !fclleg.equals( _cast.fclleg )) {
			return false;
		}
		
		if (tafin1 == null ? _cast.tafin1 != tafin1 : !tafin1.equals( _cast.tafin1 )) {
			return false;
		}
		
		if (tafin2 == null ? _cast.tafin2 != tafin2 : !tafin2.equals( _cast.tafin2 )) {
			return false;
		}
		
		if (fcfin == null ? _cast.fcfin != fcfin : !fcfin.equals( _cast.fcfin )) {
			return false;
		}
		
		if (tataq1 == null ? _cast.tataq1 != tataq1 : !tataq1.equals( _cast.tataq1 )) {
			return false;
		}
		
		if (tataq2 == null ? _cast.tataq2 != tataq2 : !tataq2.equals( _cast.tataq2 )) {
			return false;
		}
		
		if (fctaq == null ? _cast.fctaq != fctaq : !fctaq.equals( _cast.fctaq )) {
			return false;
		}
		
		if (calibre1 == null ? _cast.calibre1 != calibre1 : !calibre1.equals( _cast.calibre1 )) {
			return false;
		}
		
		if (miembro == null ? _cast.miembro != miembro : !miembro.equals( _cast.miembro )) {
			return false;
		}
		
		if (planta == null ? _cast.planta != planta : !planta.equals( _cast.planta )) {
			return false;
		}
		
		if (numero == null ? _cast.numero != numero : !numero.equals( _cast.numero )) {
			return false;
		}
		
		if (calibre2 == null ? _cast.calibre2 != calibre2 : !calibre2.equals( _cast.calibre2 )) {
			return false;
		}
		
		if (diagnos == null ? _cast.diagnos != diagnos : !diagnos.equals( _cast.diagnos )) {
			return false;
		}
		
		if (ablacion == null ? _cast.ablacion != ablacion : !ablacion.equals( _cast.ablacion )) {
			return false;
		}
		
		if (puncion == null ? _cast.puncion != puncion : !puncion.equals( _cast.puncion )) {
			return false;
		}
		
		if (material == null ? _cast.material != material : !material.equals( _cast.material )) {
			return false;
		}
		
		if (vesical == null ? _cast.vesical != vesical : !vesical.equals( _cast.vesical )) {
			return false;
		}
		
		if (otros == null ? _cast.otros != otros : !otros.equals( _cast.otros )) {
			return false;
		}
		
		if (vascular == null ? _cast.vascular != vascular : !vascular.equals( _cast.vascular )) {
			return false;
		}
		
		if (hemostasia == null ? _cast.hemostasia != hemostasia : !hemostasia.equals( _cast.hemostasia )) {
			return false;
		}
		
		if (vendaje == null ? _cast.vendaje != vendaje : !vendaje.equals( _cast.vendaje )) {
			return false;
		}
		
		if (zona == null ? _cast.zona != zona : !zona.equals( _cast.zona )) {
			return false;
		}
		
		if (suero == null ? _cast.suero != suero : !suero.equals( _cast.suero )) {
			return false;
		}
		
		if (heparina == null ? _cast.heparina != heparina : !heparina.equals( _cast.heparina )) {
			return false;
		}
		
		if (sedacion == null ? _cast.sedacion != sedacion : !sedacion.equals( _cast.sedacion )) {
			return false;
		}
		
		if (farmacos == null ? _cast.farmacos != farmacos : !farmacos.equals( _cast.farmacos )) {
			return false;
		}
		
		if (cv == null ? _cast.cv != cv : !cv.equals( _cast.cv )) {
			return false;
		}
		
		if (cv1 == null ? _cast.cv1 != cv1 : !cv1.equals( _cast.cv1 )) {
			return false;
		}
		
		if (cv2 == null ? _cast.cv2 != cv2 : !cv2.equals( _cast.cv2 )) {
			return false;
		}
		
		if (cv3 == null ? _cast.cv3 != cv3 : !cv3.equals( _cast.cv3 )) {
			return false;
		}
		
		if (cv4 == null ? _cast.cv4 != cv4 : !cv4.equals( _cast.cv4 )) {
			return false;
		}
		
		if (motivo == null ? _cast.motivo != motivo : !motivo.equals( _cast.motivo )) {
			return false;
		}
		
		if (exito == null ? _cast.exito != exito : !exito.equals( _cast.exito )) {
			return false;
		}
		
		if (observ == null ? _cast.observ != observ : !observ.equals( _cast.observ )) {
			return false;
		}
		
		if (destino == null ? _cast.destino != destino : !destino.equals( _cast.destino )) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
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
		
		if (idRegistro != null) {
			_hashCode = 29 * _hashCode + idRegistro.hashCode();
		}
		
		if (peso != null) {
			_hashCode = 29 * _hashCode + peso.hashCode();
		}
		
		if (talla != null) {
			_hashCode = 29 * _hashCode + talla.hashCode();
		}
		
		if (talleg1 != null) {
			_hashCode = 29 * _hashCode + talleg1.hashCode();
		}
		
		if (talleg2 != null) {
			_hashCode = 29 * _hashCode + talleg2.hashCode();
		}
		
		if (fclleg != null) {
			_hashCode = 29 * _hashCode + fclleg.hashCode();
		}
		
		if (tafin1 != null) {
			_hashCode = 29 * _hashCode + tafin1.hashCode();
		}
		
		if (tafin2 != null) {
			_hashCode = 29 * _hashCode + tafin2.hashCode();
		}
		
		if (fcfin != null) {
			_hashCode = 29 * _hashCode + fcfin.hashCode();
		}
		
		if (tataq1 != null) {
			_hashCode = 29 * _hashCode + tataq1.hashCode();
		}
		
		if (tataq2 != null) {
			_hashCode = 29 * _hashCode + tataq2.hashCode();
		}
		
		if (fctaq != null) {
			_hashCode = 29 * _hashCode + fctaq.hashCode();
		}
		
		if (calibre1 != null) {
			_hashCode = 29 * _hashCode + calibre1.hashCode();
		}
		
		if (miembro != null) {
			_hashCode = 29 * _hashCode + miembro.hashCode();
		}
		
		if (planta != null) {
			_hashCode = 29 * _hashCode + planta.hashCode();
		}
		
		if (numero != null) {
			_hashCode = 29 * _hashCode + numero.hashCode();
		}
		
		if (calibre2 != null) {
			_hashCode = 29 * _hashCode + calibre2.hashCode();
		}
		
		if (diagnos != null) {
			_hashCode = 29 * _hashCode + diagnos.hashCode();
		}
		
		if (ablacion != null) {
			_hashCode = 29 * _hashCode + ablacion.hashCode();
		}
		
		if (puncion != null) {
			_hashCode = 29 * _hashCode + puncion.hashCode();
		}
		
		if (material != null) {
			_hashCode = 29 * _hashCode + material.hashCode();
		}
		
		if (vesical != null) {
			_hashCode = 29 * _hashCode + vesical.hashCode();
		}
		
		if (otros != null) {
			_hashCode = 29 * _hashCode + otros.hashCode();
		}
		
		if (vascular != null) {
			_hashCode = 29 * _hashCode + vascular.hashCode();
		}
		
		if (hemostasia != null) {
			_hashCode = 29 * _hashCode + hemostasia.hashCode();
		}
		
		if (vendaje != null) {
			_hashCode = 29 * _hashCode + vendaje.hashCode();
		}
		
		if (zona != null) {
			_hashCode = 29 * _hashCode + zona.hashCode();
		}
		
		if (suero != null) {
			_hashCode = 29 * _hashCode + suero.hashCode();
		}
		
		if (heparina != null) {
			_hashCode = 29 * _hashCode + heparina.hashCode();
		}
		
		if (sedacion != null) {
			_hashCode = 29 * _hashCode + sedacion.hashCode();
		}
		
		if (farmacos != null) {
			_hashCode = 29 * _hashCode + farmacos.hashCode();
		}
		
		if (cv != null) {
			_hashCode = 29 * _hashCode + cv.hashCode();
		}
		
		if (cv1 != null) {
			_hashCode = 29 * _hashCode + cv1.hashCode();
		}
		
		if (cv2 != null) {
			_hashCode = 29 * _hashCode + cv2.hashCode();
		}
		
		if (cv3 != null) {
			_hashCode = 29 * _hashCode + cv3.hashCode();
		}
		
		if (cv4 != null) {
			_hashCode = 29 * _hashCode + cv4.hashCode();
		}
		
		if (motivo != null) {
			_hashCode = 29 * _hashCode + motivo.hashCode();
		}
		
		if (exito != null) {
			_hashCode = 29 * _hashCode + exito.hashCode();
		}
		
		if (observ != null) {
			_hashCode = 29 * _hashCode + observ.hashCode();
		}
		
		if (destino != null) {
			_hashCode = 29 * _hashCode + destino.hashCode();
		}
		
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ArrEnfPk
	 */
	public ArrEnfPk createPk()
	{
		return new ArrEnfPk(idPaciente, idRegistro);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "hvn.apl.jProyecto2011.dto.ArrEnf: " );
		ret.append( "idPaciente=" + idPaciente );
		ret.append( ", idRegistro=" + idRegistro );
		ret.append( ", peso=" + peso );
		ret.append( ", talla=" + talla );
		ret.append( ", talleg1=" + talleg1 );
		ret.append( ", talleg2=" + talleg2 );
		ret.append( ", fclleg=" + fclleg );
		ret.append( ", tafin1=" + tafin1 );
		ret.append( ", tafin2=" + tafin2 );
		ret.append( ", fcfin=" + fcfin );
		ret.append( ", tataq1=" + tataq1 );
		ret.append( ", tataq2=" + tataq2 );
		ret.append( ", fctaq=" + fctaq );
		ret.append( ", calibre1=" + calibre1 );
		ret.append( ", miembro=" + miembro );
		ret.append( ", planta=" + planta );
		ret.append( ", numero=" + numero );
		ret.append( ", calibre2=" + calibre2 );
		ret.append( ", diagnos=" + diagnos );
		ret.append( ", ablacion=" + ablacion );
		ret.append( ", puncion=" + puncion );
		ret.append( ", material=" + material );
		ret.append( ", vesical=" + vesical );
		ret.append( ", otros=" + otros );
		ret.append( ", vascular=" + vascular );
		ret.append( ", hemostasia=" + hemostasia );
		ret.append( ", vendaje=" + vendaje );
		ret.append( ", zona=" + zona );
		ret.append( ", suero=" + suero );
		ret.append( ", heparina=" + heparina );
		ret.append( ", sedacion=" + sedacion );
		ret.append( ", farmacos=" + farmacos );
		ret.append( ", cv=" + cv );
		ret.append( ", cv1=" + cv1 );
		ret.append( ", cv2=" + cv2 );
		ret.append( ", cv3=" + cv3 );
		ret.append( ", cv4=" + cv4 );
		ret.append( ", motivo=" + motivo );
		ret.append( ", exito=" + exito );
		ret.append( ", observ=" + observ );
		ret.append( ", destino=" + destino );
		ret.append( ", fecha=" + fecha );
		return ret.toString();
	}

	public String getNeef(){
		String tmp = "";
		if(this.getIdeef() != null && this.getFecha() != null){
			try {
				ArrEstudioDao estdao = new ArrEstudioDaoImpl("gen");
				ArrEstudio est = estdao.findByPrimaryKey(this.getIdeef());
				tmp = est.getNestudio();
			} catch (ArrEstudioDaoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tmp;
	}
	
	public String getImc(){
		String imc = "";
		if(this.peso != null && this.peso.length() > 0 && this.talla != null && this.talla.length() > 0){
			Double peso = new Double(this.peso.replace(",", "."));
			Double talla = new Double(new Double(this.talla)/100);
			Double imcd = peso / (talla * talla);
			DecimalFormat df = new DecimalFormat("#.##");
			imc = df.format(imcd);
		}
		return imc;
	}
	public void setImc(String imc){	}

	public String getDiuresis() {
		return diuresis;
	}

	public void setDiuresis(String diuresis) {
		this.diuresis = diuresis;
	}

	public String getCuidados() {
		return cuidados;
	}

	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}

	public String getInr() {
		return inr;
	}

	public void setInr(String inr) {
		this.inr = inr;
	}

	public ArrayList<ArrEnfIntroductores> getIntroductores() {
		return introductores;
	}

	public void setIntroductores(ArrayList<ArrEnfIntroductores> introductores) {
		this.introductores = introductores;
	}
	
	public void addIntroductores(ActionEvent e) {
		this.getIntroductores().add(new ArrEnfIntroductores());
	}
	
	public void delIntroductores(ActionEvent e) {
		this.getIntroductores().remove(this.binintr.getRowIndex());
	}
	
	public void addAct(ActionEvent e) {
		this.getActs().add(new ArrEnfAct());
	}
	
	public void delAct(ActionEvent e) {
		this.getActs().remove(this.binact.getRowIndex());
	}

	public ArrayList<ArrEnfAct> getActs() {
		return acts;
	}

	public void setActs(ArrayList<ArrEnfAct> acts) {
		this.acts = acts;
	}

	public HtmlDataTable getBinact() {
		return binact;
	}

	public void setBinact(HtmlDataTable binact) {
		this.binact = binact;
	}

	public HtmlDataTable getBinintr() {
		return binintr;
	}

	public void setBinintr(HtmlDataTable binintr) {
		this.binintr = binintr;
	}
	
	public void addCat(ActionEvent e) {
		this.getCats().add(new ArrEstudioCateter());
	}

	public void delCat(ActionEvent e) {
		this.getCats().remove(this.bincat.getRowIndex());
	}
	
	public ArrayList<ArrEstudioCateter> getCats() {
		return cats;
	}

	public void setCats(ArrayList<ArrEstudioCateter> cats) {
		this.cats = cats;
	}

	public HtmlDataTable getBincat() {
		return bincat;
	}

	public void setBincat(HtmlDataTable bincat) {
		this.bincat = bincat;
	}
}
