package Modelo.implementacion;

import Modelo.interfaces.*;
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
public class ImplementacionPostulacionProyectoCargo implements PostulacionProyectoCargo{
    private String prioridad;
    private int codPostulacionProyectoCargo;
    private List<ImplementacionPostulacionProyectoCargoEstado> postulacionProyectoCargoEstado;
    private Proyecto proyecto;
    private Universidad universidad;
    private ProyectoCargo proyectoCargo;

    @Override
    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int getCodPostulacionProyectoCargo() {
        return codPostulacionProyectoCargo;
    }

    @Override
    public void setCodPostulacionProyectoCargo(int codPostulacionProyectoCargo) {
        this.codPostulacionProyectoCargo = codPostulacionProyectoCargo;
    }

    @Override
    public List<ImplementacionPostulacionProyectoCargoEstado> getPostulacionProyectoCargoEstado() {
        return postulacionProyectoCargoEstado;
    }

    @Override
    public void setPostulacionProyectoCargoEstado(List<ImplementacionPostulacionProyectoCargoEstado> postulacionProyectoCargoEstado) {
        this.postulacionProyectoCargoEstado = postulacionProyectoCargoEstado;
    }

    @Override
    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public Universidad getUniversidad() {
        return universidad;
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public ProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    @Override
    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }
       
    
}
