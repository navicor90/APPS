package Modelo.implementacion;

import Modelo.implementacion.ImplementacionPostulacionProyectoCargoEstado;
import Modelo.implementacion.ImplementacionProyectoCargo;
import Modelo.implementacion.ImplementacionImplementacionProyecto;
import Modelo.implementacion.ImplementacionUniversidad;
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
public class ImplementacionPostulacionProyectoCargo {
    private String prioridad;
    private int codPostulacionProyectoCargo;
    private List<ImplementacionPostulacionProyectoCargoEstado> postProyecCargoEstado;
    private ImplementacionImplementacionProyecto proyecto;
    private ImplementacionUniversidad universidad;
    private ImplementacionProyectoCargo proyectoCargo;
    

    public ImplementacionPostulacionProyectoCargo(List<ImplementacionPostulacionProyectoCargoEstado> postProyecCargoEstado) {
        this.postProyecCargoEstado = postProyecCargoEstado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public List<ImplementacionPostulacionProyectoCargoEstado> getPostProyecCargoEstado() {
        return postProyecCargoEstado;
    }

    public void setPostProyecCargoEstado(List<ImplementacionPostulacionProyectoCargoEstado> postProyecCargoEstado) {
        this.postProyecCargoEstado = postProyecCargoEstado;
    }

    public ImplementacionImplementacionProyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(ImplementacionImplementacionProyecto proyecto) {
        this.proyecto = proyecto;
    }

    public ImplementacionUniversidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(ImplementacionUniversidad universidad) {
        this.universidad = universidad;
    }

    public ImplementacionProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(ImplementacionProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }

    public int getCodPostulacionProyectoCargo() {
        return codPostulacionProyectoCargo;
    }

    public void setCodPostulacionProyectoCargo(int codPostulacionProyectoCargo) {
        this.codPostulacionProyectoCargo = codPostulacionProyectoCargo;
    }
    
    
    
    
    
    
}
