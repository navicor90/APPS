/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;
import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionProyectoEstado implements ProyectoEstado{
    private Date fechaHoraCambio;
    private TipoEstadoProyecto tipoEstadoProyecto;

    @Override
    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    @Override
    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    @Override
    public TipoEstadoProyecto getTipoEstadoProyecto() {
        return tipoEstadoProyecto;
    }
    
    @Override
    public void setTipoEstadoProyecto(TipoEstadoProyecto tipoEstadoProyecto) {
        this.tipoEstadoProyecto = tipoEstadoProyecto;
    }

    
}
