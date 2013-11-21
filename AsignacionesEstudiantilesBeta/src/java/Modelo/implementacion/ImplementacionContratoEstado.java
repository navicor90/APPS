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
public class ImplementacionContratoEstado {
    private Date fechaHoraCambioEstado;
    private TipoEstadoContrato tipoEstadoContrato;

    public Date getFechaHoraCambioEstado() {
        return fechaHoraCambioEstado;
    }

    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) {
        this.fechaHoraCambioEstado = fechaHoraCambioEstado;
    }

    public TipoEstadoContrato getTipoEstadoContrato() {
        return tipoEstadoContrato;
    }

    public void setTipoEstadoContrato(TipoEstadoContrato tipoEstadoContrato) {
        this.tipoEstadoContrato = tipoEstadoContrato;
    }
    
    
    
    
    
    
}
