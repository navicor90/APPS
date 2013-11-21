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
public class ImplementacionTipoEstadoProyecto implements TipoEstadoProyecto{
    private String descripcion;
    private String nombreTipoEstadoProyecto;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreTipoEstadoProyecto() {
        return nombreTipoEstadoProyecto;
    }

    public void setNombreTipoEstadoProyecto(String nombreTipoEstadoProyecto) {
        this.nombreTipoEstadoProyecto = nombreTipoEstadoProyecto;
    }
    
}
