<?xml version="1.0" encoding="ISO-8859-1" ?>
<ui:composition xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:rich="http://richfaces.ajax4jsf.org/rich"
	xmlns:t="http://myfaces.apache.org/tomahawk"
	xmlns:a4j="http://richfaces.org/a4j"
	xmlns:f="http://java.sun.com/jsf/core" template="/pl/plBase.jsp">	
	<ui:define name="contenido">
		<h:form id="inicioSeguimientos">
			<a4j:poll reRender="cabpaci,nuevoseguimentointegrado" interval="15000"/>
			<h:panelGrid cellpadding="0" cellspacing="0" columns="1" width="98%"
				style="margin-top: 15px;" id="panSeguimientos">
				<rich:messages errorClass="hvn_msjError" infoClass="hvn_msjInfo"
					warnClass="hvn_msjAviso" />
				<rich:panel
					style="background-color: #ffffff;
                     background-repeat: no-repeat;
                     background-position:right bottom;">
                     <f:facet name="header">
                     	<h:panelGrid columns="8" width="100%" columnClasses="left,right"
							cellpadding="0" cellspacing="0" id="panicoseg">
							<h:outputLabel value="#{ms.seg_disp_title }"
								style="color: white;" />
							<h:panelGrid columns="2" columnClasses="right">
								<h:outputLabel value="#{ms.seg_disp_fecha }" style="color: white;" />
								<rich:calendar datePattern="dd/MM/yyyy" inputSize="12"
									showWeeksBar="false" direction="bottom-left"
									value="#{controlSeguimientos.seg.fecha}" 
									rendered="#{controlSeguimientos.actualizacion eq false}">
									<a4j:support event="onchanged" reRender="panSeguimientos,panNuevaComplicacionPacSeg" actionListener="#{controlSeguimientos.compruebaFechas }"/>
								</rich:calendar>						
								<rich:calendar datePattern="dd/MM/yyyy" inputSize="12"
									showWeeksBar="false" direction="bottom-left"
									value="#{controlSeguimientos.seg.fecha}" rendered="#{controlSeguimientos.actualizacion eq true}"
									onclick="if (!confirm('#{ms.war_guarda_fecha}')) return false;"/>
							</h:panelGrid>
							<h:panelGrid columns="4" id="panelSeg" width="20%">
	                     		<h:outputLabel value="#{ms.seg_disp_tipo_seg }"
	                     			style="font-weight: bold;color: white;"/>
	                     		<h:selectOneMenu value="#{controlSeguimientos.seg.tiposeguimiento}">
									<f:selectItem itemValue="0" itemLabel="#{ms.seg_disp_tipo_seg_op0 }" />
									<f:selectItem itemValue="1" itemLabel="#{ms.seg_disp_tipo_seg_op1 }" />
									<a4j:support event="onchange" reRender="panelSeg" ajaxSingle="true"/>					
								</h:selectOneMenu>
								<h:outputLabel value="#{ms.seg_disp_tipo_seg_motivo }" rendered="#{controlSeguimientos.seg.tiposeguimiento eq 1}"
									style="font-weight: bold;color: white;"/>
		                     	<h:selectOneMenu value="#{controlSeguimientos.seg.motivonoprog}" 
		                     		rendered="#{controlSeguimientos.seg.tiposeguimiento eq 1}">
									<f:selectItem itemValue="0" itemLabel="#{ms.seleccione_opcion }" />
									<f:selectItem itemValue="1" itemLabel="#{ms.seg_disp_tipo_seg_motivo_op1 }" />
									<f:selectItem itemValue="2" itemLabel="#{ms.seg_disp_tipo_seg_motivo_op2 }" />	
									<f:selectItem itemValue="3" itemLabel="#{ms.seg_disp_tipo_seg_motivo_op3 }" />		
									<f:selectItem itemValue="4" itemLabel="#{ms.seg_disp_tipo_seg_motivo_op4 }" />		
								</h:selectOneMenu>		
	                 		</h:panelGrid>
	                 		<h:panelGrid columns="2">
	                 			<h:outputLabel value="#{ms.seg_disp_tipo_seg_remoto }"
	                     			style="font-weight: bold;color: white;"/>
	                     		<h:selectBooleanCheckbox value="#{controlSeguimientos.seg.segrem}">
	                     			<a4j:support event="onclick" ajaxSingle="true"
	                     				actionListener="#{controlSeguimientos.seguimientoRemoto }"/>
	                     		</h:selectBooleanCheckbox>								
	                 		</h:panelGrid>
	                 		<a4j:commandLink style="text-align: right;" reRender="panSeguimientos,tablaPacientesBdu,panicoseg" 
	                 			onclick="if (!confirm('#{ms.warn_guarda}')) return false;javascript:Richfaces.showModalPanel('episodios');" 
	                 			actionListener="#{controlSeguimientos.preguarda }" rendered="#{controlSeguimientos.proc.idepisodio eq null and controlSeguimientos.editable}">
								<h:graphicImage url="/img/iconos/guardar.png" style="border:0px;" title="#{ms.guardar }"/>
							</a4j:commandLink>
	                 		<a4j:commandLink style="text-align: right;" reRender="panSeguimientos,panicoseg"
								actionListener="#{controlSeguimientos.guarda }"
								oncomplete="if(#{controlSeguimientos.reintervencion }){javascript:Richfaces.showModalPanel('reintervencion')}else if(#{controlSeguimientos.sist.eol eq 1 || controlSeguimientos.sist.eri eq 1}){javascript:Richfaces.showModalPanel('reintervencionEOLERI')}else{};"
								rendered="#{controlSeguimientos.actualizacion eq false and controlSeguimientos.proc.idepisodio ne null and controlSeguimientos.editable}">
								<h:graphicImage url="/img/iconos/guardar.png" style="border:0px;"
									title="#{ms.guardar }" />
							</a4j:commandLink>
							<a4j:commandLink style="text-align: right;" reRender="panSeguimientos,panicoseg"
								onclick="if (!confirm('#{ms.war_guarda_impl}')) return false;javascript:Richfaces.showModalPanel('buscando');"
								oncomplete="javascript:Richfaces.hideModalPanel('buscando');"
								actionListener="#{controlSeguimientos.guarda }"
								rendered="#{controlSeguimientos.actualizacion eq true and controlSeguimientos.proc.idepisodio ne null and controlSeguimientos.editable}">
								<h:graphicImage url="/img/iconos/guardar.png" style="border:0px;"
									title="#{ms.guardar }" />
							</a4j:commandLink>
							<a4j:commandLink style="text-align: right;" reRender="panSeguimientos,panicoseg"
									onclick="if (!confirm('#{ms.warn_borra}')) return false;javascript:Richfaces.showModalPanel('buscando');"
									oncomplete="javascript:Richfaces.hideModalPanel('buscando');"
									actionListener="#{controlSeguimientos.eliminarSeguimiento }" action="menuprincipal"
									rendered="#{controlSeguimientos.actualizacion eq true and loginForm.acceso.privs.borrado eq 1}">
									<h:graphicImage url="/img/iconos/borra.png" style="border:0px;" width="24" height="24"
										title="#{ms.eliminar }" />
							</a4j:commandLink>
							<h:commandLink
								actionListener="#{controlSeguimientos.imprimeInforme}"
								rendered="#{(controlSeguimientos.actualizacion eq true || controlSeguimientos.completado)}"
								target="_blank">
								<h:graphicImage value="/img/iconos/informe_especial.png"
									width="22" height="22"
									style="border:none;" title="#{ms.imprimir_informe }" />
							</h:commandLink>														
						</h:panelGrid>
                     </f:facet>
                     <h:panelGrid>
                     	<h:panelGrid columns="2" rendered="#{controlSeguimientos.seg.idseg ne null }">
                     		<h:commandLink
								actionListener="#{controlSeguimientos.descargar}"
								rendered="#{controlSeguimientos.seg.informeadj eq true }"
								target="_blank">
								<h:graphicImage value="/img/iconos/Sorin.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 1 }"
									width="48" height="16"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/Biotronik.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 2 }"
									width="22" height="22"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/Boston.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 3 }"
									width="25" height="25"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/St_Jude.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 4 }"
									width="25" height="25"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/Medtronic.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 5 }"
									width="25" height="25"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/vitatron.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 6 }"
									width="30" height="30"
									style="border:none;" title="#{ms.ver_informe }" />
								<h:graphicImage value="/img/iconos/informe.png"
									rendered="#{controlSeguimientos.seg.fabricante eq 0 }"
									width="24" height="24"
									style="border:none;" title="#{ms.ver_informe }" />
							</h:commandLink>
							<h:outputLabel value="#{ms.ver_informe_fab }" rendered="#{controlSeguimientos.seg.informeadj eq true }"/>
                     	</h:panelGrid>
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_datos_sistema }" opened="true">
                     		<a4j:include viewId="paneles/sistema.jsp"/>
                     	</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_sitclin }" opened="false">
                     		<a4j:include viewId="paneles/situacionclinica.jsp"/>
                     	</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
						<rich:simpleTogglePanel switchType="ajax" label="#{ms.seg_disp_tab_med }" opened="false" reRender="medicacionSeguimientos">
							<h:panelGrid id="medicacionSeguimientos" width="80%">
								<a4j:include viewId="/ventanas/seguimientos/paneles/medicacion/medicacion.jsp" />
							</h:panelGrid>
						</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_obs_clin }" opened="false">
                     		<a4j:include viewId="paneles/observaciones.jsp"/>                		
                     	</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_compl }" opened="false">
                     		<a4j:include viewId="paneles/complicaciones/complicacion.jsp"/>
                     	</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_prog }" opened="false">
                     		<a4j:include viewId="paneles/programacion.jsp"/>
                     	</rich:simpleTogglePanel>
                     	<rich:spacer width="20" />
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_prox_seg }" opened="false">
                     		<a4j:include viewId="paneles/proximo.jsp"/>
                     	</rich:simpleTogglePanel>                   	
                     </h:panelGrid>
                     <h:panelGrid>
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_notas }" opened="true">
                     		<h:panelGrid width="100%">
                     			<h:outputLabel value="#{ms.seg_disp_tab_notas_sin_notas }" rendered="#{empty controlSeguimientos.notasprevias }"/>
                     			<t:dataTable styleClass="hor-minimalist-b" var="notprev" rendered="#{not empty controlSeguimientos.notasprevias }"
									width="100%" value="#{controlSeguimientos.notasprevias }" rows="2"
									binding="#{controlSeguimientos.bindingNotasPrevias }" id="dataTableNotasPrevias" rowIndexVar="np">
									<t:column width="5%" headerstyleClass="left">
										<f:facet name="header">
											<h:outputText value="#{ms.seg_disp_tab_notas_fecha }" />
										</f:facet>
										<h:outputLabel value="#{notprev.fecha }">
											<f:convertDateTime pattern="dd.MM.yyyy" timeZone="CET"/>
										</h:outputLabel>
									</t:column>
									<t:column width="5%" headerstyleClass="left">
										<f:facet name="header">
											<h:outputText value="#{ms.seg_disp_tab_notas_proc }" />
										</f:facet>
										<h:panelGrid columnClasses="center">
											<h:graphicImage value="/img/iconos/Skalpell.png" style="border: 0px;" title="#{notprev.tipoprocstr }"
												width="22" height="22" rendered="#{notprev.tipoproc eq 957 || notprev.tipoproc eq 1085 || notprev.tipoproc eq 1086 || notprev.tipoproc eq 1147 }"/>
											<h:graphicImage value="/img/iconos/dispositivo.png" style="border: 0px;" title="#{notprev.tipoprocstr }"
												width="22" height="22" rendered="#{notprev.tipoproc eq 956 || notprev.tipoproc eq 1059 || notprev.tipoproc eq 1060 || notprev.tipoproc eq 993 || notprev.tipoproc eq 1090 }"/>
											<h:graphicImage value="/img/iconos/LastThreeMonths.png" style="border: 0px;" title="#{notprev.tipoprocstr }"
												width="22" height="22" rendered="#{notprev.tipoproc eq 983 }"/>
										</h:panelGrid>										
									</t:column>
									<t:column width="90%" headerstyleClass="left">
										<f:facet name="header">
											<h:outputText value="#{ms.seg_disp_tab_notas_com }" />
										</f:facet>
										<h:inputTextarea cols="175" rows="5" value="#{notprev.comentarios }"/>
									</t:column>
									<f:facet name="footer">
										<rich:datascroller align="center" for="dataTableNotasPrevias"
											renderIfSinglePage="true" fastStep="2"
											page="#{controlSeguimientos.pagina_inicial }">
											<f:facet name="first">
												<h:graphicImage url="/img/genericos/navegacion/first.png" />
											</f:facet>
											<f:facet name="last">
												<h:graphicImage url="/img/genericos/navegacion/last.png" />
											</f:facet>
											<f:facet name="fastrewind">
												<h:graphicImage url="/img/genericos/navegacion/frwd.png" />
											</f:facet>
											<f:facet name="fastforward">
												<h:graphicImage url="/img/genericos/navegacion/ffwd.png" />
											</f:facet>
											<f:facet name="previous">
												<h:graphicImage url="/img/genericos/navegacion/rwd.png" />
											</f:facet>
											<f:facet name="next">
												<h:graphicImage url="/img/genericos/navegacion/fwd.png" />
											</f:facet>
											<f:facet name="first_disabled">
												<h:graphicImage url="/img/genericos/navegacion/first.png" />
											</f:facet>
											<f:facet name="last_disabled">
												<h:graphicImage url="/img/genericos/navegacion/last.png" />
											</f:facet>
											<f:facet name="fastrewind_disabled">
												<h:graphicImage url="/img/genericos/navegacion/frwd.png" />
											</f:facet>
											<f:facet name="fastforward_disabled">
												<h:graphicImage url="/img/genericos/navegacion/ffwd.png" />
											</f:facet>
											<f:facet name="previous_disabled">
												<h:graphicImage url="/img/genericos/navegacion/rwd.png" />
											</f:facet>
											<f:facet name="next_disabled">
												<h:graphicImage url="/img/genericos/navegacion/fwd.png" />
											</f:facet>
										</rich:datascroller>
									</f:facet>
								</t:dataTable>
                     		</h:panelGrid>
                     	</rich:simpleTogglePanel>
                     </h:panelGrid>
                     <h:panelGrid>
                     	<rich:simpleTogglePanel switchType="client" label="#{ms.seg_disp_tab_comentarios }" opened="true">
                     		<h:panelGrid>
								<h:outputLabel value="#{ms.seg_disp_tab_comentarios_gen }" style="font-weight: bold;"/>
								<h:inputTextarea cols="206" rows="5" value="#{controlSeguimientos.sist.comentarios }" id="comentariosSeg">
									<f:validateLength maximum="2000" />
								</h:inputTextarea>	
								<h:message for="comentariosSeg" style="color:red" />	
							</h:panelGrid>
							<h:panelGrid>
								<h:outputLabel value="#{ms.seg_disp_tab_comentarios_inter }" style="font-weight: bold;" title="#{ms.seg_disp_tab_comentarios_inter_info }"/>
								<h:inputTextarea cols="206" rows="5" value="#{controlSeguimientos.seg.comentarios }" id="comentariosSegInternos">
									<f:validateLength maximum="2000" />
								</h:inputTextarea>	
								<h:message for="comentariosSegInternos" style="color:red" />	
							</h:panelGrid>
                     	</rich:simpleTogglePanel>
                     </h:panelGrid>
                </rich:panel>
			</h:panelGrid>
			<rich:modalPanel id="reintervencion" autosized="true" minHeight="150" minWidth="250" zindex="2000">
				<f:facet name="header">
					<h:panelGrid align="center" border="0" columns="2" width="90%">
						<h:outputText value="#{ms.seg_disp_modal_reintervencion }" styleClass="textoBlancoNegrita"/>
					</h:panelGrid>
				</f:facet>
				<h:panelGrid>
					<h:outputLabel style="font-weight: bold;" 
						value="#{ms.seg_disp_modal_reintervencion_compl }"/>
					<h:panelGrid columns="2">
						<a4j:commandLink action="irImplantes" value="#{ms.seg_disp_modal_reintervencion_si }" actionListener="#{controlImplantes.iniciaImplantes2 }"/>
						<a4j:commandLink value="#{ms.seg_disp_modal_reintervencion_no }" onclick="javascript:Richfaces.hideModalPanel('reintervencion')"/>
					</h:panelGrid>
				</h:panelGrid>
			</rich:modalPanel>
			<rich:modalPanel id="reintervencionEOLERI" autosized="true" minHeight="150" minWidth="250" zindex="2000">
				<f:facet name="header">
					<h:panelGrid align="center" border="0" columns="2" width="90%">
						<h:outputText value="#{ms.seg_disp_modal_reintervencion }" styleClass="textoBlancoNegrita"/>
					</h:panelGrid>
				</f:facet>
				<h:panelGrid>
					<h:outputLabel style="font-weight: bold;"
						value="#{ms.seg_disp_modal_reintervencion_eri }"/>
					<h:panelGrid columns="2">
						<a4j:commandLink action="irImplantes" value="#{ms.seg_disp_modal_reintervencion_si }" actionListener="#{controlImplantes.iniciaImplantes2 }"/>
						<a4j:commandLink value="#{ms.seg_disp_modal_reintervencion_no }" onclick="javascript:Richfaces.hideModalPanel('reintervencionEOLERI')"/>
					</h:panelGrid>
				</h:panelGrid>
			</rich:modalPanel>
			<rich:modalPanel id="episodios" autosized="true" minHeight="350" minWidth="600" zindex="2000">
				<f:facet name="header">
					<h:panelGrid align="center" border="0" columns="2" width="90%">
						<h:outputText value="#{ms.seg_disp_modal_episodios }"
							styleClass="textoBlancoNegrita" />
					</h:panelGrid>
				</f:facet>
				<f:facet name="controls">
					<h:panelGrid>
						<f:attribute name="align" value="right" />
						<h:graphicImage url="/img/aplicacion/icoCancelar.png"
							style="cursor:pointer"
							onclick="javascript: Richfaces.hideModalPanel('episodios');" />
					</h:panelGrid>
				</f:facet>
				<ui:include src="/ventanas/seguimientos/episodios.jsp" />
			</rich:modalPanel>			
			<rich:modalPanel id="nuevoseguimentointegrado" autosized="true" 
				showWhenRendered="#{controlSeguimientos.muestraModalNuevoSeg }">
				<f:facet name="header">
					<h:panelGrid align="center" border="0" columns="2" width="100%">
						<h:outputText value="#{ms.seg_disp_modal_intseg_notif }"
							styleClass="textoBlancoNegrita" />
					</h:panelGrid>
				</f:facet>
				<f:facet name="controls">
					<h:panelGrid>
						<f:attribute name="align" value="right" />
						<h:graphicImage url="/img/aplicacion/icoCancelar.png"
							style="cursor:pointer"
							onclick="javascript: Richfaces.hideModalPanel('nuevoseguimentointegrado');" />
					</h:panelGrid>
				</f:facet>
				<h:panelGrid>
					<h:outputLabel style="font-weight: bold;" 
						value="#{ms.seg_disp_modal_intseg_notif_acceso }"/>
					<h:outputLabel style="font-weight: bold;" rendered="#{empty controlSeguimientos.listanuevosseg}"
						value="#{ms.seg_disp_modal_intseg_notif_noreg }"/>
					<t:dataTable styleClass="hor-minimalist-b" var="seg" width="100%" value="#{controlSeguimientos.listanuevosseg }"
						binding="#{controlSeguimientos.bindingNuevosSeg }" id="dataTableNuevoSegs" 
						rendered="#{not empty controlSeguimientos.listanuevosseg}">
						<t:column width="10%" headerstyleClass="left">
							<f:facet name="header">
								<h:outputText value="" />
							</f:facet>
							<h:panelGrid columns="2" columnClasses="alignTop">								
								<h:graphicImage style="align:right;border:none;"
									styleClass="hvn_enlImagen" title="Ver"
									width="24" height="24" url="/img/iconos/LastThreeMonths.png"/>
							</h:panelGrid>
						</t:column>
						<t:column width="90%" headerstyleClass="left">
							<f:facet name="header">
								<h:outputText value="#{ms.seg_disp_modal_intseg_notif_fecha }" />
							</f:facet>
							<h:panelGrid columns="2" columnClasses="alignTop">								
								<a4j:commandLink action="irSeguimientos"								
									actionListener="#{controlSeguimientos.cargaNuevoSeguimiento }"
									onclick="javascript:Richfaces.showModalPanel('buscando');"
									oncomplete="javascript:Richfaces.hideModalPanel('buscando');javascript:Richfaces.hideModalPanel('nuevoseguimentointegrado');">
									<h:outputLabel value="#{seg.fecha }">
										<f:convertDateTime pattern="dd.MM.yyyy" timeZone="GMT+2"/>
									</h:outputLabel>
								</a4j:commandLink>
							</h:panelGrid>
						</t:column>
					</t:dataTable>
				</h:panelGrid>
			</rich:modalPanel>
		</h:form>
		
	</ui:define>
</ui:composition>
