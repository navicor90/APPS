/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Controlador.ControladorAsignarPrioridadPostulacion;
import Controlador.ExceptionAPPS;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

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
    private List<String> erroresMensajes;
    private boolean hayErrores;

    public AsignarPrioridadesBean() {
        controlador = new ControladorAsignarPrioridadPostulacion();
        hayErrores = false;
        postulacionesProyectoCargoDTO = new ArrayList<>();
    }

    public List<DTOPostulacionProyectoCargo> getPostulacionesProyectoCargoDTO() {
        if(postulacionesProyectoCargoDTO==null)postulacionesProyectoCargoDTO=new ArrayList<>();
        return postulacionesProyectoCargoDTO;
    }

    public String redirect(UserBean user) {
        this.user = user;
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        String pageToRedirect;
        try {
            this.setPostulacionesProyectoCargoDTO(controlador.listarPostulaciones(user.getLegajo(), URL));
            PostulacionProyectoCargoConverter.setPostulacionesDTO(postulacionesProyectoCargoDTO);
        } catch (ExceptionAPPS ex) {
            hayErrores = true;
            erroresMensajes.add(ex.getMessage());
        }
        if (hayErrores) {
            pageToRedirect = "MostrarMensajes.xhtml?faces-redirect=true";
        } else {
            pageToRedirect = "configurarPrioridades.xhtml?faces-redirect=true";
        }
        hayErrores = false;
        return pageToRedirect;
    }

    public void setPostulacionesProyectoCargoDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesProyectoCargoDTO = postulacionesDTO;
    }

    public String guardarCambios() {
        return "index.xhtml";
    }

}
