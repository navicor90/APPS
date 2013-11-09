package Modelo;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yanina
 */
public class PostulacionProyectoCargo {
    private String prioridad;
    private List<PostulacionProyectoCargoEstado> postProyecCargoEstado;
    private Proyecto proyecto;
    private Universidad universidad;
    private ProyectoCargo proyectoCargo;
    

    public PostulacionProyectoCargo(List<PostulacionProyectoCargoEstado> postProyecCargoEstado) {
        this.postProyecCargoEstado = postProyecCargoEstado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public List<PostulacionProyectoCargoEstado> getPostProyecCargoEstado() {
        return postProyecCargoEstado;
    }

    public void setPostProyecCargoEstado(List<PostulacionProyectoCargoEstado> postProyecCargoEstado) {
        this.postProyecCargoEstado = postProyecCargoEstado;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public ProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }
    
    
    
    
}
