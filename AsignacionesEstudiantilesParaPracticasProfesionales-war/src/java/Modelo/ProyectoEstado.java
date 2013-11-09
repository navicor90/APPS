/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author yanina
 */
class ProyectoEstado {
    private Date fechaHoraCambio;
    private tipoEstadoProyecto tipoEstProy;

    public Date getFechaHoraCambio() {
        return fechaHoraCambio;
    }

    public void setFechaHoraCambio(Date fechaHoraCambio) {
        this.fechaHoraCambio = fechaHoraCambio;
    }

    public tipoEstadoProyecto getTipoEstProy() {
        return tipoEstProy;
    }

    public void setTipoEstProy(tipoEstadoProyecto tipoEstProy) {
        this.tipoEstProy = tipoEstProy;
    }
    
    
    
}
