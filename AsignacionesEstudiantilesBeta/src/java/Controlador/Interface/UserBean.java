/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Controlador.ControladorRegistrarPostulacion;
import Modelo.DTO.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class UserBean {

    private long legajo;
    private ControladorRegistrarPostulacion controlador;
    private List<DTOPostulacionProyectoCargo> postulacionesDTO;
    private List<DTOProyectoCargo> proyectoCargosList;
    private DTOProyecto proyectoActual;
    
    
    public UserBean() {
        controlador = new ControladorRegistrarPostulacion();
        postulacionesDTO = new ArrayList<DTOPostulacionProyectoCargo>();
    
    }

    public String agregarProyectosCargo(){
        for (DTOProyectoCargo proyectoCargoDTO : proyectoCargosList) {
            if(proyectoCargoDTO.isSelected()){
                DTOPostulacionProyectoCargo postulacionDTO  = new DTOPostulacionProyectoCargo();
                postulacionDTO.setNroProyecto(proyectoActual.getCodigo());
                postulacionDTO.setNomProyecto(proyectoActual.getNomProyecto());
                postulacionDTO.setNroProyectoCargo(proyectoCargoDTO.getNroProyectoCargo());
                postulacionDTO.setNomProyectoCargo(proyectoCargoDTO.getNombreProyectoCargo());
                postulacionesDTO.add(postulacionDTO);
            }
        }
        return "seleccionarProyecto.xhtml";
    }
    
    
    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String validar() {
        String pagina = "seleccionarProyecto.xhtml";
        return pagina;
    }

    public List<DTOPostulacionProyectoCargo> getPostulacionesDTO() {
        return postulacionesDTO;
    }

    public void setPostulacionesDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesDTO = postulacionesDTO;
    }
    
    
    public List<DTOProyecto> getListaProyecto() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        System.out.println("legajo ="+legajo);
        System.out.println("url = "+URL);
        List<DTOProyecto> proyectosList = controlador.listarProyectos(legajo, URL);
        return proyectosList;
    }
    
    
    public List<DTOProyectoCargo> getListaProyectoCargo() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        Integer codigoProyecto=null;
        String nomProyecto=null;
        try{
        codigoProyecto = Integer.parseInt(origRequest.getParameter("codigoProyecto"));
        nomProyecto = origRequest.getParameter("nombreProyecto").toString();
        proyectoActual = new DTOProyecto();
        proyectoActual.setNomProyecto(nomProyecto);
        proyectoActual.setCodigo(codigoProyecto);
        proyectoCargosList = controlador.listarProyectoCargos(codigoProyecto);
        }catch(NumberFormatException e){
        }
        return proyectoCargosList;
    }
    
    public void setListaProyectoCargo(List<DTOProyectoCargo> proyectoCargosList) {
        this.proyectoCargosList = proyectoCargosList;
    }

}
