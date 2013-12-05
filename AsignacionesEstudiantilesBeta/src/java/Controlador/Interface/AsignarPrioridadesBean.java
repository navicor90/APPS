/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Controlador.ControladorAsignarPrioridadPostulacion;
import Controlador.ExceptionAPPS;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class AsignarPrioridadesBean {

    /**
     * Creates a new instance of AsignarPrioridadesBean
     */
    private List<DTOPostulacionProyectoCargo> postulacionesProyectoCargoDTO;
    private Controlador.ControladorAsignarPrioridadPostulacion controlador;
    private UserBean user;
    private String erroresMensajes;

    public String getErroresMensajes() {
        return erroresMensajes;
    }

    public void setErroresMensajes(String erroresMensajes) {
        this.erroresMensajes = erroresMensajes;
    }


    public AsignarPrioridadesBean() {
        controlador = new ControladorAsignarPrioridadPostulacion();
        postulacionesProyectoCargoDTO = new ArrayList<>();
    }

    public List<DTOPostulacionProyectoCargo> getPostulacionesProyectoCargoDTO() {
        if (postulacionesProyectoCargoDTO == null) {
            postulacionesProyectoCargoDTO = new ArrayList<>();
        }
        return postulacionesProyectoCargoDTO;
    }

    public String redirect(UserBean user) {
        this.user = user;
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        String pageToRedirect = "configurarPrioridades.xhtml?faces-redirect=true";
        try {
            this.setPostulacionesProyectoCargoDTO(controlador.listarPostulaciones(user.getLegajo(), URL));
            PostulacionProyectoCargoConverter.setPostulacionesDTO(postulacionesProyectoCargoDTO);
        } catch (ExceptionAPPS ex) {
            pageToRedirect = "mostrarMensajesAsignarPrioridades.xhtml?faces-redirect=true";
            erroresMensajes = ex.getMessage();
        }
        return pageToRedirect;
    }

    public void setPostulacionesProyectoCargoDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesProyectoCargoDTO = postulacionesDTO;
    }

    public String guardarCambios() {
        postulacionesProyectoCargoDTO = controlador.asignarPrioridades(postulacionesProyectoCargoDTO);
        return "terminarAsignarPrioridades.xhtml";
    }
     
    public void cancelarConfigurarPrioridades() {
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

}
