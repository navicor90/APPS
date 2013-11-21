
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
public class ImplementacionTipoEstadoPostulacionProyectoCargo implements TipoEstadoPostulacionProyectoCargo{
    private String nombreEstado;
    private String descripcion;

    @Override
    public String getNombreEstado() {
        return nombreEstado;
    }

    @Override
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
