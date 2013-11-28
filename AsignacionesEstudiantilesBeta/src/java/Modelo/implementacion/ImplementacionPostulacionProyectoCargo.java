package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.ArrayList;
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
public class ImplementacionPostulacionProyectoCargo implements PostulacionProyectoCargo {

    private int prioridad;
    private List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstadoList;
    int cantidadMateriasAprobadasEstudiante;
    int cantidadMateriasRegulares;
    private Proyecto proyecto;
    private Universidad universidad;
    private ProyectoCargo proyectoCargo;

    public ImplementacionPostulacionProyectoCargo() {
        postulacionProyectoCargoEstadoList = new ArrayList<>();
    }

    
    @Override
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int getCantidadMateriasAprobadasEstudiante() {
        return cantidadMateriasAprobadasEstudiante;
    }

    @Override
    public void setCantidadMateriasAprobadasEstudiante(int cantidadMateriasAprobadasEstudiante) {
        this.cantidadMateriasAprobadasEstudiante = cantidadMateriasAprobadasEstudiante;
    }

    @Override
    public int getCantidadMateriasRegulares() {
        return cantidadMateriasRegulares;
    }

    @Override
    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares) {
        this.cantidadMateriasRegulares = cantidadMateriasRegulares;
    }

    @Override
    public List<PostulacionProyectoCargoEstado> getPostulacionProyectoCargoEstadoList() {
        return postulacionProyectoCargoEstadoList;
    }

    @Override
    public void setPostulacionProyectoCargoEstadoList(List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstadoList) {
        this.postulacionProyectoCargoEstadoList = postulacionProyectoCargoEstadoList;
    }

    @Override
    public void addPostulacionProyectoCargoEstado(PostulacionProyectoCargoEstado postulacionProyectoCargoEstado) {
        postulacionProyectoCargoEstadoList.add(postulacionProyectoCargoEstado);
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
