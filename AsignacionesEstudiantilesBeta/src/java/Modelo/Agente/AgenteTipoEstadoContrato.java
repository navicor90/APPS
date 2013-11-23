/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Modelo.implementacion.*;

/**
 *
 * @author yanina
 */
public class AgenteTipoEstadoContrato extends Agente implements TipoEstadoContrato{
    ImplementacionTipoEstadoContrato implementacionTipoEstadoContrato;

    public ImplementacionTipoEstadoContrato getImplementacionTipoEstadoContrato() {
        return implementacionTipoEstadoContrato;
    }

    public void setImplementacionTipoEstadoContrato(ImplementacionTipoEstadoContrato implementacionTipoEstadoContrato) {
        this.implementacionTipoEstadoContrato = implementacionTipoEstadoContrato;
    }
    

    @Override
    public int getCodigoEstadoContrato() {
        return implementacionTipoEstadoContrato.getCodigoEstadoContrato();
    }

    @Override
    public void setCodigoEstadoContrato(int codigoEstadoContrato) {
        implementacionTipoEstadoContrato.setCodigoEstadoContrato(codigoEstadoContrato);
    }

    @Override
    public String getNombreEstadoContrato() {
        return implementacionTipoEstadoContrato.getNombreEstadoContrato();
    }

    @Override
    public void setNombreEstadoContrato(String nombreEstadoContrato) {
        implementacionTipoEstadoContrato.setNombreEstadoContrato(nombreEstadoContrato);
    }
    
}
