/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.interfaces.*;
import Controlador.Persistencia.*;
import Modelo.implementacion.ImplementacionProyectoEstado;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteProyectoEstado extends Agente implements ProyectoEstado{
    String oidProyecto;
    String oidTipoEstadoProyecto;
    boolean heBuscadoProyecto;
    boolean heBuscadoTipoEstadoProyecto;
    ImplementacionProyectoEstado ImplementacionProyectoEstado;

    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }

    public String getOidTipoEstadoProyecto() {
        return oidTipoEstadoProyecto;
    }

    public void setOidTipoEstadoProyecto(String oidTipoEstadoProyecto) {
        this.oidTipoEstadoProyecto = oidTipoEstadoProyecto;
    }

    public boolean isHeBuscadoProyecto() {
        return heBuscadoProyecto;
    }

    public void setHeBuscadoProyecto(boolean heBuscadoProyecto) {
        this.heBuscadoProyecto = heBuscadoProyecto;
    }

    public boolean isHeBuscadoTipoEstadoProyecto() {
        return heBuscadoTipoEstadoProyecto;
    }

    public void setHeBuscadoTipoEstadoProyecto(boolean heBuscadoTipoEstadoProyecto) {
        this.heBuscadoTipoEstadoProyecto = heBuscadoTipoEstadoProyecto;
    }

    public ImplementacionProyectoEstado getImplementacionProyectoEstado() {
        return ImplementacionProyectoEstado;
    }

    public void setImplementacionProyectoEstado(ImplementacionProyectoEstado ImplementacionProyectoEstado) {
        this.ImplementacionProyectoEstado = ImplementacionProyectoEstado;
    }
    
    @Override
    public Date getFechaHoraCambio() {
        return ImplementacionProyectoEstado.getFechaHoraCambio();
    }

    @Override
    public void setFechaHoraCambio(Date fechaHoraCambio) {
        ImplementacionProyectoEstado.setFechaHoraCambio(fechaHoraCambio);
    }

    @Override
    public TipoEstadoProyecto getTipoEstadoProyecto() {
        TipoEstadoProyecto tipoEstadoProyecto;
        if(heBuscadoTipoEstadoProyecto || this.esNuevo()){
            tipoEstadoProyecto = ImplementacionProyectoEstado.getTipoEstadoProyecto();
        }else{
            tipoEstadoProyecto = (TipoEstadoProyecto) FachadaPersistenciaInterna.getInstancia().buscar("TipoEstadoProyecto", this.getOidTipoEstadoProyecto());
            this.setHeBuscadoTipoEstadoProyecto(true);
        }
        return tipoEstadoProyecto;
    }

    @Override
    public void setTipoEstadoProyecto(TipoEstadoProyecto tipoEstadoProyecto) {
        ImplementacionProyectoEstado.setTipoEstadoProyecto(tipoEstadoProyecto);
        Agente agente = (Agente) tipoEstadoProyecto;
        this.setOidTipoEstadoProyecto(agente.getOid());
    }
    
}
