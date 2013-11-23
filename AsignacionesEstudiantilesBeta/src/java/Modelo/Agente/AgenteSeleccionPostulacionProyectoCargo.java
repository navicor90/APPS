/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.interfaces.*;
import Modelo.implementacion.*;
/**
 *
 * @author yanina
 */
public class AgenteSeleccionPostulacionProyectoCargo extends Agente implements SeleccionPostulacionProyectoCargo{
    String oidPostulacionProyectoCargo;
    String oidProyectoCargo;
    String oidSeleccion;
    boolean heBuscadoPostulacionProyectoCargo;
    boolean heBuscadoProyectoCargo;
    boolean heBuscadoSeleccion;
    ImplementacionSeleccionPostulacionProyectoCargo implementacionSeleccionPostulacionProyectoCargo;

    public String getOidPostulacionProyectoCargo() {
        return oidPostulacionProyectoCargo;
    }

    public void setOidPostulacionProyectoCargo(String oidPostulacionProyectoCargo) {
        this.oidPostulacionProyectoCargo = oidPostulacionProyectoCargo;
    }

    public String getOidProyectoCargo() {
        return oidProyectoCargo;
    }

    public void setOidProyectoCargo(String oidProyectoCargo) {
        this.oidProyectoCargo = oidProyectoCargo;
    }

    public String getOidSeleccion() {
        return oidSeleccion;
    }

    public void setOidSeleccion(String oidSeleccion) {
        this.oidSeleccion = oidSeleccion;
    }

    public boolean isHeBuscadoPostulacionProyectoCargo() {
        return heBuscadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoPostulacionProyectoCargo(boolean heBuscadoPostulacionProyectoCargo) {
        this.heBuscadoPostulacionProyectoCargo = heBuscadoPostulacionProyectoCargo;
    }

    public boolean isHeBuscadoProyectoCargo() {
        return heBuscadoProyectoCargo;
    }

    public void setHeBuscadoProyectoCargo(boolean heBuscadoProyectoCargo) {
        this.heBuscadoProyectoCargo = heBuscadoProyectoCargo;
    }

    public boolean isHeBuscadoSeleccion() {
        return heBuscadoSeleccion;
    }

    public void setHeBuscadoSeleccion(boolean heBuscadoSeleccion) {
        this.heBuscadoSeleccion = heBuscadoSeleccion;
    }

    public ImplementacionSeleccionPostulacionProyectoCargo getImplementacionSeleccionPostulacionProyectoCargo() {
        return implementacionSeleccionPostulacionProyectoCargo;
    }

    public void setImplementacionSeleccionPostulacionProyectoCargo(ImplementacionSeleccionPostulacionProyectoCargo implementacionSeleccionPostulacionProyectoCargo) {
        this.implementacionSeleccionPostulacionProyectoCargo = implementacionSeleccionPostulacionProyectoCargo;
    }
    
    
    @Override
    public int getEstado() {
        return implementacionSeleccionPostulacionProyectoCargo.getEstado();
    }

    @Override
    public void setEstado(int estado) {
        implementacionSeleccionPostulacionProyectoCargo.setEstado(estado);
    }

    @Override
    public int getOrdenMerito() {
        return implementacionSeleccionPostulacionProyectoCargo.getOrdenMerito();
    }

    @Override
    public void setOrdenMerito(int ordenMerito) {
        implementacionSeleccionPostulacionProyectoCargo.setOrdenMerito(ordenMerito);
    }

    @Override
    public TipoEstadoSeleccionPostulacionProyectoCargo getTipoEstadoSelecccionProyectoCargo() {
        return implementacionSeleccionPostulacionProyectoCargo.getTipoEstadoSelecccionProyectoCargo();
    }

    @Override
    public void setTipoEstadoSelecccionProyectoCargo(TipoEstadoSeleccionPostulacionProyectoCargo tipoEstadoSelecccionProyectoCargo) {
        implementacionSeleccionPostulacionProyectoCargo.setTipoEstadoSelecccionProyectoCargo(tipoEstadoSelecccionProyectoCargo);
    }

    @Override
    public PostulacionProyectoCargo getPostulacionProyectoCargo() {
        return implementacionSeleccionPostulacionProyectoCargo.getPostulacionProyectoCargo();
    }

    @Override
    public void setPostulacionProyectoCargo(PostulacionProyectoCargo postulacionProyectoCargo) {
        implementacionSeleccionPostulacionProyectoCargo.setPostulacionProyectoCargo(postulacionProyectoCargo);
    }

    @Override
    public ProyectoCargo getProyectoCargo() {
        return implementacionSeleccionPostulacionProyectoCargo.getProyectoCargo();
    }

    @Override
    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        implementacionSeleccionPostulacionProyectoCargo.setProyectoCargo(proyectoCargo);
    }
    
    
}
