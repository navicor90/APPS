/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Controlador.ControladorRegistrarPostulacion;
import Modelo.DTO.*;
import java.util.ArrayList;
import java.util.Date;
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
    private ControladorRegistrarPostulacion controlador = new ControladorRegistrarPostulacion();

    public long getLegajo() {
        return legajo;
    }

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
        String pagina = "index.html";
        Long constante = 1234L;
        if (legajo == constante) {
            pagina = "home.xhtml";
        }
        return pagina;
    }

    public List<DTOProyecto> getListaProyecto() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String URL = origRequest.getRequestURI();
        List<DTOProyecto> proyectosList = controlador.listarProyectos(legajo, URL);
        return proyectosList;
    }

    public List<DTOProyectoCargo> getListaProyectoCargo() {
        HttpServletRequest origRequest = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        String nombreProyecto = origRequest.getParameter("nombreProyecto");
        List<DTOProyectoCargo> proyectoCargosList = controlador.listarProyectoCargos(nombreProyecto);
        return proyectoCargosList;
    }

}
