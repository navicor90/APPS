/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class ImplementacionSeleccionPostulacionProyectoCargo implements SeleccionPostulacionProyectoCargo {

    private int estado;
    private int ordenMerito;
    private TipoEstadoSeleccionPostulacionProyectoCargo tipoEstadoSelecccionProyectoCargo;
    private PostulacionProyectoCargo postulacionProyectoCargo;
    private ProyectoCargo proyectoCargo;

    @Override
    public int getEstado() {
        return estado;
    }

    @Override
    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int getOrdenMerito() {
        return ordenMerito;
    }

    @Override
    public void setOrdenMerito(int ordenMerito) {
        this.ordenMerito = ordenMerito;
    }

    public TipoEstadoSeleccionPostulacionProyectoCargo getTipoEstadoSelecccionProyectoCargo() {
        return tipoEstadoSelecccionProyectoCargo;
    }

    public void setTipoEstadoSelecccionProyectoCargo(TipoEstadoSeleccionPostulacionProyectoCargo tipoEstadoSelecccionProyectoCargo) {
        this.tipoEstadoSelecccionProyectoCargo = tipoEstadoSelecccionProyectoCargo;
    }

    @Override
    public PostulacionProyectoCargo getPostulacionProyectoCargo() {
        return postulacionProyectoCargo;
    }

    @Override
    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo) {
        this.postulacionProyectoCargo = postulacionProyectoCargo;
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
