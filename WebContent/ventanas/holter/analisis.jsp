<?xml version="1.0" encoding="ISO-8859-1" ?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:rich="http://richfaces.ajax4jsf.org/rich"
	xmlns:t="http://myfaces.apache.org/tomahawk"
	xmlns:a4j="http://richfaces.org/a4j"
	xmlns:f="http://java.sun.com/jsf/core">
	
	<h:panelGrid>
		<h:panelGrid columns="2" columnClasses="alignTop,alignTop">
			<h:panelGrid columns="2" columnClasses="alignTop,alignTop">
				<h:panelGrid>
					<h:outputLabel value="#{ms.holter24h_tab3_ana_fecha }" style="font-weight: bold;" />
					<h:panelGrid style="border-top: solid 1px;border-color: black;">
						<rich:calendar datePattern="dd/MM/yyyy" inputSize="12"
							showWeeksBar="false" direction="bottom-left"
							value="#{controlHolter.holter.fechanalisis }" />
					</h:panelGrid>
				</h:panelGrid>
				<h:panelGrid columns="2" columnClasses="alignTop,alignTop" id="diagFinHolter">
					<h:panelGrid>
						<h:outputLabel value="#{ms.holter24h_tab3_ana_diag_fin }" style="font-weight: bold;" />
						<h:panelGrid style="border-top: solid 1px;border-color: black;" columns="2">
							<h:selectOneMenu value="#{controlHolter.holter.diagnosticofin }">
								<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="0" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op1 }" itemValue="1" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op2 }" itemValue="2" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op3 }" itemValue="3" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op5 }" itemValue="5" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op6 }" itemValue="6" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op7 }" itemValue="7" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op8 }" itemValue="8" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op9 }" itemValue="9" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op10 }" itemValue="10" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op11 }" itemValue="11" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op12 }" itemValue="12" />
								<f:selectItem itemLabel="#{ms.holter24h_tab2_ana_diag_fin_op4 }" itemValue="4" />
								<a4j:support event="onchange" reRender="diagFinHolter" ajaxSingle="true"/>										
							</h:selectOneMenu>
							<h:inputText value="#{controlHolter.holter.diagfinotro }"
								rendered="#{controlHolter.holter.diagnosticofin eq 4}"/>
						</h:panelGrid>
					</h:panelGrid>
				</h:panelGrid>
			</h:panelGrid>
			<h:panelGrid columns="3" id="panAnalisisHolterControl">
				<h:commandLink actionListener="#{controlHolter.descargar}"
					rendered="#{controlHolter.holter.estado eq 3 }" target="_blank">
					<h:graphicImage value="/img/iconos/informe.png"
						width="48" height="48" style="border:none;" title="#{ms.ver }" />
				</h:commandLink>
				<a4j:commandLink style="border:0;font-size:12px;" reRender="panHolter"
					onclick="javascript:Richfaces.showModalPanel('buscando');"
					oncomplete="javascript:Richfaces.hideModalPanel('buscando');"
					rendered="#{controlHolter.DIR_ESCUCHA_ANALISIS_CLIENTE ne null }"
					actionListener="#{controlHolter.analisisHolter}" >						
					<h:graphicImage value="/img/iconos/ViewResults.png" 
			         	title="#{ms.holter24h_tab2_ana_msg_1 }" styleClass="centerStyle" width="48" height="48"/>
				</a4j:commandLink>
				<h:outputLabel value="#{ms.holter24h_tab2_ana_msg_2 }" 
					rendered="#{controlHolter.DIR_ESCUCHA_ANALISIS_CLIENTE ne null }"
					style="font-weight: bold;font-style: italic;color: #E57F27;" />
			</h:panelGrid>
		</h:panelGrid>
		<h:panelGrid width="90%" columnClasses="left,left">
			<h:outputLabel value="#{ms.holter24h_tab2_ana_med }" style="font-weight: bold;" title="#{ms.holter24h_tab2_ana_med_title }"/>
			<h:panelGrid style="border-top: solid 1px;border-color: black;">
				<h:selectOneMenu value="#{controlHolter.holter.analisisMed }">
					<f:selectItems value="#{controlEef.primerOperador}" />
				</h:selectOneMenu>
			</h:panelGrid>
			<rich:spacer width="10" />				
		</h:panelGrid>
		<h:panelGrid>
			<h:outputLabel value="#{ms.holter24h_tab2_ana_coment }" style="font-weight: bold;" />
			<h:panelGrid style="border-top: solid 1px;border-color: black;">
				<h:inputTextarea value="#{controlHolter.holter.comentariosAna }" rows="4" cols="205" id="comentariosHolterRet">
					<f:validateLength maximum="2000" />
				</h:inputTextarea>
				<h:message for="comentariosHolterRet" style="color:red" />	
			</h:panelGrid>
		</h:panelGrid>
	</h:panelGrid>
</ui:composition>