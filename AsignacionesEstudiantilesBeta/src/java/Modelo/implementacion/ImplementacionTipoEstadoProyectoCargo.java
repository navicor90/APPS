/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class ImplementacionTipoEstadoProyectoCargo implements TipoEstadoProyectoCargo{
    private String nombreEstadoProyectoCargo;

    @Override
    public String getNombreEstadoProyectoCargo() {
        return nombreEstadoProyectoCargo;
    }

    @Override
    public void setNombreEstadoProyectoCargo(String nombreEstadoProyectoCargo) {
        this.nombreEstadoProyectoCargo = nombreEstadoProyectoCargo;
    }
    
    
}
