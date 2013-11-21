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
public class AgenteContratoEstado extends Agente implements ContratoEstado{
    ImplementacionContratoEstado implementacionContratoEstado;

    public ImplementacionContratoEstado getImplementacionContratoEstado() {
        return implementacionContratoEstado;
    }

    public void setImplementacionContratoEstado(ImplementacionContratoEstado implementacionContratoEstado) {
        this.implementacionContratoEstado = implementacionContratoEstado;
    }
    
        
    @Override
    public Date getFechaHoraCambioEstado() {
        return implementacionContratoEstado.getFechaHoraCambioEstado();
    }

    @Override
    public void setFechaHoraCambioEstado(Date fechaHoraCambioEstado) {
        implementacionContratoEstado.setFechaHoraCambioEstado(fechaHoraCambioEstado);
    }

    @Override
    public TipoEstadoContrato getTipoEstadoContrato() {
        return  implementacionContratoEstado.getTipoEstadoContrato();
    }

    @Override
    public void setTipoEstadoContrato(TipoEstadoContrato tipoEstadoContrato) {
        implementacionContratoEstado.setTipoEstadoContrato(tipoEstadoContrato);
    }
    
}
