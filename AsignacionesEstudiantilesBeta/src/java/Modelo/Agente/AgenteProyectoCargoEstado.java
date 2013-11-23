/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.ImplementacionProyectoCargoCarrera;
import Modelo.implementacion.ImplementacionProyectoCargoEstado;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteProyectoCargoEstado extends Agente implements ProyectoCargoEstado{
    String oidproyectoCargo;
    String oidTipoEstadoProyectoCargo;
    boolean heBuscadoProyectoCargo;
    boolean heBuscadoTipoEstadoProyectoCargo;
    ImplementacionProyectoCargoEstado implementacionProyectoCargoEstado;

    public String getOidproyectoCargo() {
        return oidproyectoCargo;
    }

    public void setOidproyectoCargo(String oidproyectoCargo) {
        this.oidproyectoCargo = oidproyectoCargo;
    }

    public String getOidTipoEstadoProyectoCargo() {
        return oidTipoEstadoProyectoCargo;
    }

    public void setOidTipoEstadoProyectoCargo(String oidTipoEstadoProyectoCargo) {
        this.oidTipoEstadoProyectoCargo = oidTipoEstadoProyectoCargo;
    }

    public boolean isHeBuscadoProyectoCargo() {
        return heBuscadoProyectoCargo;
    }

    public void setHeBuscadoProyectoCargo(boolean heBuscadoProyectoCargo) {
        this.heBuscadoProyectoCargo = heBuscadoProyectoCargo;
    }

    public boolean isHeBuscadoTipoEstadoProyectoCargo() {
        return heBuscadoTipoEstadoProyectoCargo;
    }

    public void setHeBuscadoTipoEstadoProyectoCargo(boolean heBuscadoTipoEstadoProyectoCargo) {
        this.heBuscadoTipoEstadoProyectoCargo = heBuscadoTipoEstadoProyectoCargo;
    }

    public ImplementacionProyectoCargoEstado getImplementacionProyectoCargoEstado() {
        return implementacionProyectoCargoEstado;
    }

    public void setImplementacionProyectoCargoEstado(ImplementacionProyectoCargoEstado implementacionProyectoCargoEstado) {
        this.implementacionProyectoCargoEstado = implementacionProyectoCargoEstado;
    }
    
    
    @Override
    public Date getFechahoraCambioEstado() {
        return implementacionProyectoCargoEstado.getFechahoraCambioEstado();
    }

    @Override
    public void setFechahoraCambioEstado(Date fechahoraCambioEstado) {
        implementacionProyectoCargoEstado.setFechahoraCambioEstado(fechahoraCambioEstado);
    }

    @Override
    public TipoEstadoProyectoCargo getTipoEstadoProyectoCargo() {
        return implementacionProyectoCargoEstado.getTipoEstadoProyectoCargo();
    }

    @Override
    public void setTipoEstadoProyectoCargo(TipoEstadoProyectoCargo tipoEstadoProyectoCargo) {
        implementacionProyectoCargoEstado.setTipoEstadoProyectoCargo(tipoEstadoProyectoCargo);
    }
    
}
