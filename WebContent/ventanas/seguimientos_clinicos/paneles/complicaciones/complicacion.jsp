<?xml version="1.0" encoding="ISO-8859-1" ?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:t="http://myfaces.apache.org/tomahawk"
	xmlns:rich="http://richfaces.ajax4jsf.org/rich"
	xmlns:jenia="http://www.jenia.org/jsf/popup"
	xmlns:a4j="http://richfaces.org/a4j"
	xmlns:s="http://myfaces.apache.org/sandbox">

	<h:panelGrid width="100%" id="panComplicacionesPacienteSegClin">
		<h:panelGrid width="100%">
			<h:outputLabel value="#{ms.compli_proc_title }" style="font-weight: bold;"/>
			<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;" id="tablaComplicacionesSegClinProc" width="100%">
				<h:outputLabel value="#{ms.compli_msg_3}" rendered="#{empty controlSeguimientosClinicos.listacompl }"/>
				<t:dataTable styleClass="hor-minimalist-b" var="comp" rendered="#{not empty controlSeguimientosClinicos.listacompl }"
					width="100%" value="#{controlSeguimientosClinicos.listacompl }"
					binding="#{controlSeguimientosClinicos.bindingComplicacionesSegProc }" id="dataTableComplicacionesSegClinProc" rowIndexVar="rib">
					<t:column width="5%" headerstyleClass="left">
						<h:panelGrid columnClasses="alignTop">								
							<a4j:commandLink reRender="tablaComplicacionesSegClinProc,panEditItemComplicacionesPacSegClin,editItemComplicacionesPacSegClin"
								actionListener="#{controlSeguimientosClinicos.preEditarSegProc }">		
								<h:graphicImage value="/img/iconos/complicacion.png" width="16" rendered="#{comp.resuelta ne 1}"
									height="16" style="border:0;" title="#{ms.compli_title_edit}"/>
								<h:graphicImage value="/img/iconos/complicacionRes.png" width="16" rendered="#{comp.resuelta eq 1}"
									height="16" style="border:0;" title="#{ms.compli_title_edit}"/>
							</a4j:commandLink>
						</h:panelGrid>
					</t:column>
					<t:column width="20%" headerstyleClass="left">
						<f:facet name="header">
							<h:outputText value="#{ms.compli_table_title_1 }" />
						</f:facet>
						<h:panelGrid columnClasses="alignTop">								
							<h:selectOneMenu value="#{comp.complicacion }" disabled="true">
								<f:selectItems value="#{controlComplicaciones.complicacionesTodas }" />															
							</h:selectOneMenu>
							<h:selectOneMenu value="#{comp.complicacion1 }" disabled="true"
								rendered="#{comp.complicacion eq controlComplicaciones.idarritmias}">
								<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
								<f:selectItem itemValue="1" itemLabel="#{ms.compli_compl_arritmias_1 }"/>
								<f:selectItem itemValue="2" itemLabel="#{ms.compli_compl_arritmias_2 }"/>
								<f:selectItem itemValue="3" itemLabel="#{ms.compli_compl_arritmias_3 }"/>
								<f:selectItem itemValue="4" itemLabel="#{ms.compli_compl_arritmias_4 }"/>
								<f:selectItem itemValue="5" itemLabel="#{ms.compli_compl_arritmias_5 }"/>
								<f:selectItem itemValue="6" itemLabel="#{ms.compli_compl_arritmias_6 }"/>
							</h:selectOneMenu>
							<h:selectOneMenu value="#{comp.complicacion1 }" disabled="true"
								rendered="#{comp.complicacion eq controlComplicaciones.idhematoma}">
								<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
								<f:selectItem itemValue="1" itemLabel="#{ms.compli_compl_hematoma_1 }"/>
								<f:selectItem itemValue="2" itemLabel="#{ms.compli_compl_hematoma_2 }"/>
								<f:selectItem itemValue="3" itemLabel="#{ms.compli_compl_hematoma_3 }"/>
							</h:selectOneMenu>
							<h:inputText value="#{comp.complicacionOtra }" disabled="true" 
								rendered="#{comp.complicacion eq controlComplicaciones.idcompotra}"/>
						</h:panelGrid>
					</t:column>
					<t:column width="20%" headerstyleClass="left">
						<f:facet name="header">
							<h:outputText value="#{ms.compli_table_title_2 }" />
						</f:facet>
						<h:panelGrid columnClasses="alignTop">								
							<h:selectOneMenu value="#{comp.tipo }" disabled="true">
								<f:selectItem itemValue="1" itemLabel="#{ms.compli_tipo_1 }"/>
								<f:selectItem itemValue="2" itemLabel="#{ms.compli_tipo_2 }"/>
								<f:selectItem itemValue="3" itemLabel="#{ms.compli_tipo_3 }"/>
							</h:selectOneMenu>
						</h:panelGrid>
					</t:column>
					<t:column width="20%" headerstyleClass="left">
						<f:facet name="header">
							<h:outputText value="#{ms.compli_table_title_3 }" />
						</f:facet>
						<h:panelGrid columnClasses="alignTop">								
							<h:outputLabel value="#{comp.fechaini }" >
								<f:convertDateTime pattern="dd.MM.yyyy" timeZone="GMT+2"/>
							</h:outputLabel>
						</h:panelGrid>
					</t:column>
					<t:column headerstyleClass="left">
						<h:panelGrid columns="2">
							<a4j:commandLink reRender="tablaComplicacionesSegClinProc,dataTableComplicacionesSegClinProc,cabecerapaciente,panelContenidoGlobal"
								onclick="if (!confirm('#{ms.compli_msg_warn_borra}')) return false;javascript:Richfaces.showModalPanel('buscando');"
								oncomplete="javascript:Richfaces.hideModalPanel('buscando');"
								actionListener="#{controlSeguimientosClinicos.delItemComplicacion }">
								<h:graphicImage url="/img/iconos/minus.png" title="#{ms.compli_title_borra }" 
									width="16" height="16" style="border: 0px;"/>
							</a4j:commandLink>
						</h:panelGrid>
					</t:column>
				</t:dataTable>
			</h:panelGrid>
		</h:panelGrid>
		<h:panelGrid width="100%">
			<rich:simpleTogglePanel switchType="client" label="#{ms.insertar }" opened="false">
				<h:panelGrid width="100%">
					<h:outputLabel value="#{ms.compli_relacion_proc_title }" style="font-weight: bold;"/>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.idrelacion }">
							<f:selectItems value="#{controlComplicaciones.modulosDisponibles }" />
							<a4j:support event="onchange" reRender="panNuevaComplicacionPacSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
					</h:panelGrid>
				</h:panelGrid>
				<h:panelGrid id="panNuevaComplicacionPacSegClin" width="100%" columns="4" columnClasses="alignTop,alignTop,alignTop,alignTop">
					<h:outputLabel value="#{ms.compli_compl }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_tipo }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_fechaini }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_fechafin }" style="font-weight: bold;"/>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;" id="panNuevaComPacCompliSegClin">
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="false">
							<f:selectItems value="#{controlComplicaciones.complicacionesImpl }" />
							<a4j:support event="onchange" reRender="panNuevaComPacCompliSegClin" ajaxSingle="true" />						
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="#{controlSeguimientosClinicos.compac.idrelacion eq 0}">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="#{controlSeguimientosClinicos.compac.idrelacion eq 1}">
							<f:selectItems value="#{controlComplicaciones.complicacionesEefAbl }" />
							<a4j:support event="onchange" reRender="panNuevaComPacCompliSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="#{controlSeguimientosClinicos.compac.idrelacion eq 7}">
							<f:selectItems value="#{controlComplicaciones.complicacionesEefDiag }" />
							<a4j:support event="onchange" reRender="panNuevaComPacCompliSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="#{controlSeguimientosClinicos.compac.idrelacion eq 2 or controlSeguimientosClinicos.compac.idrelacion eq 3 or controlSeguimientosClinicos.compac.idrelacion eq 4 or controlSeguimientosClinicos.compac.idrelacion eq 5}">
							<f:selectItems value="#{controlComplicaciones.complicacionesImpl }" />
							<a4j:support event="onchange" reRender="panNuevaComPacCompliSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion }" rendered="#{controlSeguimientosClinicos.compac.idrelacion eq 6}">
							<f:selectItems value="#{controlComplicaciones.complicacionesCve }" />
							<a4j:support event="onchange" reRender="panNuevaComPacCompliSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion1 }" 
							rendered="#{controlSeguimientosClinicos.compac.complicacion eq controlComplicaciones.idarritmias or controlSeguimientosClinicos.compac.complicacion eq controlComplicaciones.idarritmiasCVE}">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="1" itemLabel="#{ms.compli_compl_arritmias_1 }"/>
							<f:selectItem itemValue="2" itemLabel="#{ms.compli_compl_arritmias_2 }"/>
							<f:selectItem itemValue="3" itemLabel="#{ms.compli_compl_arritmias_3 }"/>
							<f:selectItem itemValue="4" itemLabel="#{ms.compli_compl_arritmias_4 }"/>
							<f:selectItem itemValue="5" itemLabel="#{ms.compli_compl_arritmias_5 }"/>
							<f:selectItem itemValue="6" itemLabel="#{ms.compli_compl_arritmias_6 }"/>
						</h:selectOneMenu>
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.complicacion1 }" 
							rendered="#{controlSeguimientosClinicos.compac.complicacion eq controlComplicaciones.idhematoma or controlSeguimientosClinicos.compac.complicacion eq controlComplicaciones.idhematomaCVE}">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="1" itemLabel="#{ms.compli_compl_hematoma_1 }"/>
							<f:selectItem itemValue="2" itemLabel="#{ms.compli_compl_hematoma_2 }"/>
							<f:selectItem itemValue="3" itemLabel="#{ms.compli_compl_hematoma_3 }"/>
						</h:selectOneMenu>
						<h:inputText value="#{controlSeguimientosClinicos.compac.complicacionOtra }" 
							rendered="#{controlSeguimientosClinicos.compac.complicacion eq  controlComplicaciones.idcompotra}"/>
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">								
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.tipo }">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="2" itemLabel="#{ms.compli_tipo_2 }"/>
							<f:selectItem itemValue="3" itemLabel="#{ms.compli_tipo_3 }"/>
						</h:selectOneMenu>
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">
						<rich:calendar datePattern="dd/MM/yyyy" inputSize="12"
							showWeeksBar="false" direction="bottom-left" 
							value="#{controlSeguimientosClinicos.compac.fechaini }" />
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">
						<rich:calendar datePattern="dd/MM/yyyy" inputSize="12"
							showWeeksBar="false" direction="bottom-left" 
							value="#{controlSeguimientosClinicos.compac.fechafin }" />
					</h:panelGrid>
					<h:outputLabel value="#{ms.compli_resuelta }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_tratamiento }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_ingreso }" style="font-weight: bold;"/>
					<h:outputLabel value="#{ms.compli_descripcion }" style="font-weight: bold;"/>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">								
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.resuelta }">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="0" itemLabel="#{ms.compli_resuelta_0 }"/>
							<f:selectItem itemValue="1" itemLabel="#{ms.compli_resuelta_1 }"/>
							<f:selectItem itemValue="2" itemLabel="#{ms.compli_resuelta_2 }"/>
						</h:selectOneMenu>
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;" id="panNuevaComPacTratSegClin">								
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.tratamiento }">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="0" itemLabel="#{ms.compli_tratamiento_0 }"/>
							<f:selectItem itemValue="1" itemLabel="#{ms.compli_tratamiento_1 }"/>
							<a4j:support event="onchange" reRender="panNuevaComPacTratSegClin" ajaxSingle="true" />
						</h:selectOneMenu>
						<h:inputText value="#{controlSeguimientosClinicos.compac.tratamientoDescr }" 
							rendered="#{controlSeguimientosClinicos.compac.tratamiento eq 1}"/>
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">								
						<h:selectOneMenu value="#{controlSeguimientosClinicos.compac.ingreso }">
							<f:selectItem itemLabel="#{ms.seleccione_opcion }" itemValue="-1" />
							<f:selectItem itemValue="0" itemLabel="#{ms.compli_ingreso_0 }"/>
							<f:selectItem itemValue="1" itemLabel="#{ms.compli_ingreso_1 }"/>
						</h:selectOneMenu>
					</h:panelGrid>
					<h:panelGrid columnClasses="alignTop" style="border-top: solid 1px;border-color: black;">
						<h:inputTextarea cols="40" rows="4" value="#{controlSeguimientosClinicos.compac.descripcion }" id="descNuevaComPacSegClin">
							<f:validateLength maximum="1000" />
						</h:inputTextarea>	
						<h:message for="descNuevaComPacSegClin" style="color:red" />
					</h:panelGrid>
				</h:panelGrid>
				<h:panelGrid>
					<h:outputLabel value="#{ms.compli_msg_warn_guarda_proc }" rendered="#{controlSeguimientosClinicos.proc.idprocedimiento eq null }"
						style="font-weight: bold; color:#E17009;font-style: italic;font-size: 12px;"/>
				</h:panelGrid>
				<hr/>
				<h:panelGrid columns="2" columnClasses="alignTop,alignTop">
					<h:panelGrid columns="2" columnClasses="alignTop,alignTop">
						<a4j:commandLink actionListener="#{controlSeguimientosClinicos.guardaComplicacion}"
							reRender="tablaComplicacionesSegClinProc,dataTableComplicacionesSegClinProc,panNuevaComplicacionPacSegClin,cabecerapaciente,panelContenidoGlobal"
							onclick="javascript:Richfaces.showModalPanel('buscando');"
							oncomplete="javascript:Richfaces.hideModalPanel('buscando');"
							rendered="#{controlSeguimientosClinicos.seg.idsegclin ne null }">
							<h:graphicImage style="border: 0px;" value="/img/iconos/guarda.png"
								width="24" height="24" title="#{ms.guardar }"/>
						</a4j:commandLink>
					</h:panelGrid>
					<h:panelGrid columns="2" columnClasses="alignTop,alignTop">
						<a4j:commandLink actionListener="#{controlSeguimientosClinicos.limpiarComp }"
							reRender="tablaComplicacionesSegClinProc,panNuevaComplicacionPacSegClin"
							onclick="javascript:Richfaces.showModalPanel('buscando');"
							oncomplete="javascript:Richfaces.hideModalPanel('buscando');">
							<h:graphicImage value="/img/iconos/limpia.png"
								style="border:0;cursor:pointer;" 
								width="24" height="24" title="#{ms.limpiar }" />
						</a4j:commandLink>
					</h:panelGrid>
				</h:panelGrid>
			</rich:simpleTogglePanel>
		</h:panelGrid>
	</h:panelGrid>
	
	<rich:modalPanel id="editItemComplicacionesPacSegClin" autosized="true" zindex="500" minWidth="550" showWhenRendered="#{controlSeguimientosClinicos.editableSegProc}">
		<f:facet name="header">
			<h:panelGrid styleClass="center" border="0" columns="2" width="90%">
				<h:outputText value="#{ms.compli_edit_title }"
					styleClass="textoBlancoNegrita" />
			</h:panelGrid>
		</f:facet>
		<f:facet name="controls">
			<h:panelGrid columns="3">
				<a4j:commandLink actionListener="#{controlSeguimientosClinicos.actualizaItemComplicacion }"
					reRender="dataTableComplicacionesSegClinProc,cabecerapaciente,tablaComplicacionesSegClinProc,panelContenidoGlobal"
					onclick="javascript:Richfaces.hideModalPanel('editItemComplicacionesPacSegClin');">
					<h:graphicImage style="border: 0px;" value="/img/iconos/guarda.png"
						width="16px" height="16px" title="#{ms.guardar }"/>
				</a4j:commandLink>
				<a4j:commandLink actionListener="#{controlSeguimientosClinicos.cancelarItemComplicacion }"
					reRender="panEditItemComplicacionesPacSegClin,tablaComplicacionesSegClinProc,dataTableComplicacionesSegClinProc"
					onclick="javascript:Richfaces.hideModalPanel('editItemComplicacionesPacSegClin');">
					<h:graphicImage value="/img/aplicacion/icoCancelar.png"
						style="border:0;cursor:pointer;"
						onclick="javascript:Richfaces.hideModalPanel('editItemComplicacionesPacSegClin')"
						title="#{ms.cerrar }" />
				</a4j:commandLink>				
			</h:panelGrid>
		</f:facet>
		<h:panelGrid id="paneditcompacsegclin" width="100%">
			<ui:include src="/ventanas/seguimientos_clinicos/paneles/complicaciones/editcomplicacion.jsp" />
		</h:panelGrid>
	</rich:modalPanel>
	
</ui:composition>