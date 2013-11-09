/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorInterface;

import Controlador.ControladorRegistrarPostulacion;
import Modelo.DTO.DTOProyecto;
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
public class UserBean {
    
        private long legajo;
        private String nombre = "ivan";
        private String apellido = "terreno";
        private String mail = "ivan@celeste.com.ar";
        private ControladorRegistrarPostulacion controlador;

    /**
     * Get the value of legajo
     *
     * @return the value of legajo
     */
    public long getLegajo() {
        return legajo;
    }

    /**
     * Set the value of legajo
     *
     * @param legajo new value of legajo
     */
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
    public String validar() {
        String pagina="index.html";
        Long constante=1234L;
        if(legajo == constante){
            pagina = "home.xhtml";
        }
        return pagina;
    }
    
    public List<DTOProyecto> listarProyectos(){
        HttpServletRequest origRequest = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        return controlador.listarProyectos(legajo,URL);
    }
}
