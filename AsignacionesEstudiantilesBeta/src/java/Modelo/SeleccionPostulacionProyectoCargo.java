/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author yanina
 */
public class SeleccionPostulacionProyectoCargo {
    private int estado;
    private int ordenMerito;
    private EstadoSeleccionPostulacionProyectoCargo estadoSelecPC;
    private PostulacionProyectoCargo postulacionPC;
    private ProyectoCargo proyectoCargo;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getOrdenMerito() {
        return ordenMerito;
    }

    public void setOrdenMerito(int ordenMerito) {
        this.ordenMerito = ordenMerito;
    }

    public EstadoSeleccionPostulacionProyectoCargo getEstadoSelecPC() {
        return estadoSelecPC;
    }

    public void setEstadoSelecPC(EstadoSeleccionPostulacionProyectoCargo estadoSelecPC) {
        this.estadoSelecPC = estadoSelecPC;
    }

    public PostulacionProyectoCargo getPostulacionPC() {
        return postulacionPC;
    }

    public void setPostulacionPC(PostulacionProyectoCargo postulacionPC) {
        this.postulacionPC = postulacionPC;
    }

    public ProyectoCargo getProyectoCargo() {
        return proyectoCargo;
    }

    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        this.proyectoCargo = proyectoCargo;
    }
    
    
    
}
