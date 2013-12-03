/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public interface ContratoEstado {
    
    public Date getFechaHoraCambioEstado();

    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) ;

    public TipoEstadoContrato getTipoEstadoContrato() ;

    public void setTipoEstadoContrato(TipoEstadoContrato tipoEstadoContrato);

}
