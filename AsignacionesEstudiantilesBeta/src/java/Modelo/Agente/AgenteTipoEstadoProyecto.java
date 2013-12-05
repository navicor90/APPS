/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.implementacion.*;
import Modelo.interfaces.*;

/**
 *
 * @author yanina
 */
public class AgenteTipoEstadoProyecto extends Agente implements TipoEstadoProyecto{
    ImplementacionTipoEstadoProyecto implementacionTipoEstadoProyecto;          

    public ImplementacionTipoEstadoProyecto getImplementacionTipoEstadoProyecto() {
        return implementacionTipoEstadoProyecto;
    }

    public void setImplementacionTipoEstadoProyecto(ImplementacionTipoEstadoProyecto implementacionTipoEstadoProyecto) {
        this.implementacionTipoEstadoProyecto = implementacionTipoEstadoProyecto;
    }
    
    @Override
    public String getDescripcion() {
        return implementacionTipoEstadoProyecto.getDescripcion();
    }

    @Override
    public void setDescripcion(String descripcion) {
        implementacionTipoEstadoProyecto.setDescripcion(descripcion);
    }

    @Override
    public String getNombreTipoEstadoProyecto() {
        return implementacionTipoEstadoProyecto.getNombreTipoEstadoProyecto();
    }

    @Override
    public void setNombreTipoEstadoProyecto(String nombreTipoEstadoProyecto) {
        implementacionTipoEstadoProyecto.setNombreTipoEstadoProyecto(nombreTipoEstadoProyecto);
    }
    
}
