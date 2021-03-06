/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Controlador.ControladorRegistrarPostulacion;
import Controlador.ExceptionAPPS;
import Modelo.DTO.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author milton
 */
@ManagedBean
@SessionScoped
public class RegistrarPostulacionBean {

    private ControladorRegistrarPostulacion controlador;
    private List<DTOProyecto> proyectosList;
    private List<DTOPostulacionProyectoCargo> postulacionesDTO;
    private List<DTOProyectoCargo> proyectoCargosList;
    private DTOProyecto proyectoActual;
    private String erroresMensajes;
    private UserBean user;

    public RegistrarPostulacionBean() {
        controlador = new ControladorRegistrarPostulacion();
        postulacionesDTO = new ArrayList<>();

    }

    public String getErroresMensajes() {
        return erroresMensajes;
    }

    public void setErroresMensajes(String erroresMensajes) {
        this.erroresMensajes = erroresMensajes;
    }

    public String agregarProyectosCargo() {
        for (DTOProyectoCargo proyectoCargoDTO : proyectoCargosList) {
            if (proyectoCargoDTO.isSelected()) {
                DTOPostulacionProyectoCargo postulacionDTO = new DTOPostulacionProyectoCargo();
                postulacionDTO.setNroProyecto(proyectoActual.getCodigo());
                postulacionDTO.setNomProyecto(proyectoActual.getNomProyecto());
                postulacionDTO.setNroProyectoCargo(proyectoCargoDTO.getNroProyectoCargo());
                postulacionDTO.setNomProyectoCargo(proyectoCargoDTO.getNombreProyectoCargo());
                postulacionesDTO.add(postulacionDTO);
            }
        }
        return "seleccionarProyecto.xhtml";
    }

    public List<DTOProyectoCargo> getListaProyectoCargo() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        Integer codigoProyecto = null;
        String nomProyecto = null;
        try {
            codigoProyecto = Integer.parseInt(origRequest.getParameter("codigoProyecto"));
            nomProyecto = origRequest.getParameter("nombreProyecto").toString();
            proyectoActual = new DTOProyecto();
            proyectoActual.setNomProyecto(nomProyecto);
            proyectoActual.setCodigo(codigoProyecto);
            proyectoCargosList = controlador.listarProyectoCargos(codigoProyecto);
        } catch (NumberFormatException e) {
        }
        return proyectoCargosList;
    }

    public void setListaProyectoCargo(List<DTOProyectoCargo> proyectoCargosList) {
        this.proyectoCargosList = proyectoCargosList;
    }

    public void terminarPostulacion() {
        String pageToRedirect = "terminarPostulacion.xhtml";
        try {
            try {
                postulacionesDTO = controlador.realizarPostulacion(postulacionesDTO);
            } catch (ExceptionAPPS ex) {
                erroresMensajes = ex.getMessage();
                pageToRedirect = "mostrarMensajesRegistrarPostulacion.xhtml";
            }
            ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
            String ctxPath = ((ServletContext) ctx.getContext()).getContextPath();
            ctx.redirect(ctxPath + "/faces/"+pageToRedirect);
        } catch (IOException ex) {
            Logger.getLogger(RegistrarPostulacionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cancelarPostulacion() {
        ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
        String ctxPath = ((ServletContext) ctx.getContext()).getContextPath();
        try {
            // Usar el contexto de JSF para invalidar la sesión,
            // NO EL DE SERVLETS (nada de HttpServletRequest)
            ((HttpSession) ctx.getSession(false)).invalidate();
            // Redirección de nuevo con el contexto de JSF,
            // si se usa una HttpServletResponse fallará.
            // Sin embargo, como ya está fuera del ciclo de vida 
            // de JSF se debe usar la ruta completa -_-U
            ctx.redirect(ctxPath + "/faces/index.xhtml");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String validateRedirect(UserBean user) {
        this.user = user;
        String pageToRedirect = "seleccionarProyecto.xhtml?faces-redirect=true";
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        proyectosList = null;
        try {
            proyectosList = controlador.listarProyectos(user.getLegajo(), URL);
        } catch (ExceptionAPPS ex) {
            erroresMensajes = ex.getMessage();
            pageToRedirect = "mostrarMensajesRegistrarPostulacion.xhtml?faces-redirect=true";

        }
        return pageToRedirect;
    }

    public List<DTOPostulacionProyectoCargo> getPostulacionesProyectoCargoDTO() {
        return postulacionesDTO;
    }

    public void setPostulacionesProyectoCargoDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesDTO = postulacionesDTO;
    }

    public List<DTOProyecto> getListaProyecto() {
        return proyectosList;
    }

}
