<?xml version="1.0" encoding="UTF-8" ?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:rich="http://richfaces.ajax4jsf.org/rich"
	xmlns:t="http://myfaces.apache.org/tomahawk"
	xmlns:a4j="http://richfaces.org/a4j"
	xmlns:f="http://java.sun.com/jsf/core">

	<h:panelGrid width="100%">
		<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_title }" style="font-weight: bold;" />
		<h:panelGrid style="border-top: solid 1px;border-color: black;" columns="2">
			<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_npat_taq_proc }" style="font-weight: bold;" />
			<h:panelGrid columns="5" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo1 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo2 }" />
			</h:panelGrid>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_npatproc_exito }" style="font-weight: bold;" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo3 }" />
			<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_nproc_adai }" style="font-weight: bold;" />
			<h:panelGrid columns="3" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo22 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo23 }" />
			</h:panelGrid>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_nproc_adai_exito }" style="font-weight: bold;" />
			<h:panelGrid columns="3" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo24 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo25 }" />
			</h:panelGrid>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_tipo_sust_1 }" style="font-weight: bold;" />
			<h:panelGrid columns="8" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo26 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo27 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo28 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo29 }" />
				<h:outputLabel value="#{ms.abl_anual_tab_abls_fta_tipo_sust_2 }" style="font-style: italic;"/>
			</h:panelGrid>
		</h:panelGrid>
		<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est }" style="font-weight: bold;" />
		<h:panelGrid columns="3">
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_4mm }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo35 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_8mm }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo4 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_irri_est }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo5 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_crio }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo6 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_irri_cont }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo36 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_cateter_no_est_otro }" />
			<h:panelGrid columns="3" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo7 }" />
				<h:outputLabel value="/" />
				<h:inputText size="30" maxlength="40" value="#{controlEstadisticas.anual.fta.campo8 }" />
			</h:panelGrid>
		</h:panelGrid>
		<h:outputLabel value="#{ms.abl_anual_tab_abls_compl }" style="font-weight: bold;" />
		<h:panelGrid columns="3">
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_bav_mp }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo9 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_vascular }" />
			<h:panelGrid columns="3" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo10 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo11 }" />
			</h:panelGrid>
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_derrame }" />
			<h:panelGrid columns="3" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo12 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo13 }" />
			</h:panelGrid>
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_embolismo }" />
			<h:panelGrid columns="5" cellpadding="0" cellspacing="0">
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo14 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo15 }" />
				<h:outputLabel value="/" />
				<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo16 }" />
			</h:panelGrid>
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_iam }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo17 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_icc }" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo18 }" />
			<rich:spacer width="20px"/>
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_otra }" />
			<h:inputText size="30" maxlength="40" value="#{controlEstadisticas.anual.fta.campo19 }" />
		</h:panelGrid>
		<h:panelGrid columns="2">
			<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_muerte }" style="font-weight: bold;" />
			<h:panelGrid columns="4" cellpadding="0" cellspacing="0">
				<h:inputText size="20" maxlength="20" value="#{controlEstadisticas.anual.fta.campo20 }" />
				<rich:spacer width="20px"/>
				<h:outputLabel value="#{ms.abl_anual_tab_abls_compl_merte_compprev }" />
				<h:inputText size="20" maxlength="20" value="#{controlEstadisticas.anual.fta.campo21 }" />
			</h:panelGrid>		
		</h:panelGrid>
		<h:panelGrid columns="2">
			<h:outputLabel value="#{ms.abl_anual_tab_abls_casos_ped }" style="font-weight: bold;" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo37 }" />
			<h:outputLabel value="#{ms.abl_anual_tab_abls_casos_nav }" style="font-weight: bold;" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo38 }" />
			<h:outputLabel value="#{ms.abl_anual_tab_abls_casos_fluo }" style="font-weight: bold;" />
			<h:inputText size="6" maxlength="4" value="#{controlEstadisticas.anual.fta.campo39 }" />
		</h:panelGrid>
		<h:panelGrid columns="2">
			<h:outputLabel value="#{ms.abl_anual_tab_abls_comentarios }" style="font-weight: bold;" />
			<h:inputTextarea cols="120" rows="2" value="#{controlEstadisticas.anual.fta.campo34 }" />
		</h:panelGrid>
	</h:panelGrid>
</ui:composition>