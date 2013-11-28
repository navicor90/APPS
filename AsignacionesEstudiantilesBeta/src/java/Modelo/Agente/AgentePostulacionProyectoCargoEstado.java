/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgentePostulacionProyectoCargoEstado extends Agente implements PostulacionProyectoCargoEstado{
    String oidPostulacionProyectoCargo;
    String oidTipoEstadoPostulacionProyectoCargo;
    boolean heBuscadoPostulacionProyectoCargo;
    boolean   heBuscadoTipoEstadoPostulacionProyectoCargo;
    ImplementacionPostulacionProyectoCargoEstado implementacionPostulacionProyectoCargoEstado;

    public String getOidPostulacionProyectoCargo() {
        return oidPostulacionProyectoCargo;
    }

    public void setOidPostulacionProyectoCargo(String oidPostulacionproyectoCargo) {
        this.oidPostulacionProyectoCargo = oidPostulacionproyectoCargo;
    }

    public String getOidTipoEstadoPostulacionProyectoCargo() {
        return oidTipoEstadoPostulacionProyectoCargo;
    }

    public void setOidTipoEstadoPostulacionProyectoCargo(String oidTipoEstadoPostulacionProyectoCargo) {
        this.oidTipoEstadoPostulacionProyectoCargo = oidTipoEstadoPostulacionProyectoCargo;
    }

    public boolean isHeBuscadoPostulacionProyectoCargo() {
        return heBuscadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoPostulacionProyectoCargo(boolean heBuscadoPostulacionProyectoCargo) {
        this.heBuscadoPostulacionProyectoCargo = heBuscadoPostulacionProyectoCargo;
    }

    public boolean isHeBuscadoTipoEstadoPostulacionProyectoCargo() {
        return heBuscadoTipoEstadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoTipoEstadoPostulacionProyectoCargo(boolean heBuscadoTipoEstadoPostulacionProyectoCargo) {
        this.heBuscadoTipoEstadoPostulacionProyectoCargo = heBuscadoTipoEstadoPostulacionProyectoCargo;
    }

    public ImplementacionPostulacionProyectoCargoEstado getImplementacionPostulacionProyectoCargoEstado() {
        return implementacionPostulacionProyectoCargoEstado;
    }

    public void setImplementacionPostulacionProyectoCargoEstado(ImplementacionPostulacionProyectoCargoEstado implementacionPostulacionProyectoCargoEstado) {
        this.implementacionPostulacionProyectoCargoEstado = implementacionPostulacionProyectoCargoEstado;
    }
    
    @Override
    public Date getFechaHoraCambio() {
        return implementacionPostulacionProyectoCargoEstado.getFechaHoraCambio();
    }

    @Override
    public void setFechaHoraCambio(Date fechaHoraCambio) {
        implementacionPostulacionProyectoCargoEstado.setFechaHoraCambio(fechaHoraCambio);
    }

    @Override
    public TipoEstadoPostulacionProyectoCargo getTipoEstadoPostulacionProyectoCargo() {
        return implementacionPostulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo();
    }

    @Override
    public void setTipoEstadoPostulacionProyectoCargo(TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo) {
        implementacionPostulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
    }
    
}
