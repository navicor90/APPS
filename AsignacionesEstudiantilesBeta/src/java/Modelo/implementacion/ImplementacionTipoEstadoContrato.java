package Modelo.implementacion;

import Modelo.interfaces.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yanina
 */
public class ImplementacionTipoEstadoContrato implements TipoEstadoContrato{
    private int codigoEstadoContrato;
    private String nombreEstadoContrato;

    @Override
    public int getCodigoEstadoContrato() {
        return codigoEstadoContrato;
    }

    @Override
    public void setCodigoEstadoContrato(int codigoEstadoContrato) {
        this.codigoEstadoContrato = codigoEstadoContrato;
    }

    @Override
    public String getNombreEstadoContrato() {
        return nombreEstadoContrato;
    }

    @Override
    public void setNombreEstadoContrato(String nombreEstadoContrato) {
        this.nombreEstadoContrato = nombreEstadoContrato;
    }
    
    
}
