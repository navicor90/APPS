/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgentePostulacionProyectoCargoEstado extends Agente implements PostulacionProyectoCargoEstado{
    String oidTipoEstadoPostulacionProyectoCargo;
    String oidPostulacionProyectoCargo;
    boolean   heBuscadoTipoEstadoPostulacionProyectoCargo;
    boolean   heBuscadoPostulacionProyectoCargo;
    ImplementacionPostulacionProyectoCargoEstado implementacionPostulacionProyectoCargoEstado;

    public String getOidTipoEstadoPostulacionProyectoCargo() {
        return oidTipoEstadoPostulacionProyectoCargo;
    }

    public void setOidTipoEstadoPostulacionProyectoCargo(String oidTipoEstadoPostulacionProyectoCargo) {
        this.oidTipoEstadoPostulacionProyectoCargo = oidTipoEstadoPostulacionProyectoCargo;
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
        TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo;
        if(heBuscadoTipoEstadoPostulacionProyectoCargo || this.esNuevo()){
            tipoEstadoPostulacionProyectoCargo = implementacionPostulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo();
        }else{
            tipoEstadoPostulacionProyectoCargo = (TipoEstadoPostulacionProyectoCargo) FachadaPersistenciaInterna.getInstancia().buscar("TipoEstadoPostulacionProyectoCargo", oidTipoEstadoPostulacionProyectoCargo);
            implementacionPostulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
            this.setHeBuscadoTipoEstadoPostulacionProyectoCargo(true);
        }
        return tipoEstadoPostulacionProyectoCargo;
    }
    
    @Override
    public void setTipoEstadoPostulacionProyectoCargo(TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo) {
        implementacionPostulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
        AgenteTipoEstadoPostulacionProyectoCargo agenteTipoEstadoPostulacionProyectoCargo = (AgenteTipoEstadoPostulacionProyectoCargo) tipoEstadoPostulacionProyectoCargo;
        this.setOidTipoEstadoPostulacionProyectoCargo(agenteTipoEstadoPostulacionProyectoCargo.getOid());
    }

    public String getOidPostulacionProyectoCargo() {
        return oidPostulacionProyectoCargo;
    }

    public void setOidPostulacionProyectoCargo(String oidPostulacionProyectoCargo) {
        this.oidPostulacionProyectoCargo = oidPostulacionProyectoCargo;
    }

    public boolean isHeBuscadoPostulacionProyectoCargo() {
        return heBuscadoPostulacionProyectoCargo;
    }

    public void setHeBuscadoPostulacionProyectoCargo(boolean heBuscadoPostulacionProyectoCargo) {
        this.heBuscadoPostulacionProyectoCargo = heBuscadoPostulacionProyectoCargo;
    }
    
    
}
