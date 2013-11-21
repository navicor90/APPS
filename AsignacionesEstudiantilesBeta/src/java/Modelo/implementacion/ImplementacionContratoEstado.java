/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.implementacion.ImplementacionEstadoContrato;
import java.util.Date;

/**
 *
 * @author yanina
 */
public class ImplementacionContratoEstado {
    private Date fechaHoraCambioEstado;
    private ImplementacionEstadoContrato eC;

    public ImplementacionContratoEstado() {
    }
    
    
    public Date getFechaHoraCambioEstado() {
        return fechaHoraCambioEstado;
    }

    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) {
        this.fechaHoraCambioEstado = fechaHoraCambioEstado;
    }

    public ImplementacionEstadoContrato geteC() {
        return eC;
    }

    public void seteC(ImplementacionEstadoContrato eC) {
        this.eC = eC;
    }
    
    
}
