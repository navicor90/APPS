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
public class AgenteTipoEstadoPostulacionProyectoCargo extends Agente implements TipoEstadoPostulacionProyectoCargo{
    ImplementacionTipoEstadoPostulacionProyectoCargo implementacionTipoEstadoPostulacionProyectoCargo;

    public ImplementacionTipoEstadoPostulacionProyectoCargo getImplementacionTipoEstadoPostulacionProyectoCargo() {
        return implementacionTipoEstadoPostulacionProyectoCargo;
    }

    public void setImplementacionTipoEstadoPostulacionProyectoCargo(ImplementacionTipoEstadoPostulacionProyectoCargo implementacionTipoEstadoPostulacionProyectoCargo) {
        this.implementacionTipoEstadoPostulacionProyectoCargo = implementacionTipoEstadoPostulacionProyectoCargo;
    }
    
    
    @Override
    public String getNombreEstado() {
        return implementacionTipoEstadoPostulacionProyectoCargo.getNombreEstado();
    }

    @Override
    public void setNombreEstado(String nombreEstado) {
        implementacionTipoEstadoPostulacionProyectoCargo.setNombreEstado(nombreEstado);
    }

    @Override
    public String getDescripcion() {
        return implementacionTipoEstadoPostulacionProyectoCargo.getDescripcion();
    }

    @Override
    public void setDescripcion(String descripcion) {
        implementacionTipoEstadoPostulacionProyectoCargo.setDescripcion(descripcion);
    }
    
}
