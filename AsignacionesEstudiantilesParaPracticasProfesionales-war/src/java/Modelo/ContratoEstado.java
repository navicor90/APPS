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
public class ContratoEstado {
    private Date fechaHoraCambioEstado;
    private EstadoContrato eC;

    public ContratoEstado() {
    }
    
    
    public Date getFechaHoraCambioEstado() {
        return fechaHoraCambioEstado;
    }

    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) {
        this.fechaHoraCambioEstado = fechaHoraCambioEstado;
    }

    public EstadoContrato geteC() {
        return eC;
    }

    public void seteC(EstadoContrato eC) {
        this.eC = eC;
    }
    
    
}
