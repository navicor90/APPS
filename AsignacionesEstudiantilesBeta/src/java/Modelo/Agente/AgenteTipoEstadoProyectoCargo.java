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
public class AgenteTipoEstadoProyectoCargo extends Agente implements TipoEstadoProyectoCargo{
    ImplementacionTipoEstadoProyectoCargo implementacionTipoEstadoProyectoCargo;

    public ImplementacionTipoEstadoProyectoCargo getImplementacionTipoEstadoProyectoCargo() {
        return implementacionTipoEstadoProyectoCargo;
    }

    public void setImplementacionTipoEstadoProyectoCargo(ImplementacionTipoEstadoProyectoCargo implementacionTipoEstadoProyectoCargo) {
        this.implementacionTipoEstadoProyectoCargo = implementacionTipoEstadoProyectoCargo;
    }
    
    @Override
    public String getNombreEstadoProyectoCargo() {
        return implementacionTipoEstadoProyectoCargo.getNombreEstadoProyectoCargo();
    }

    @Override
    public void setNombreEstadoProyectoCargo(String nombreEstadoProyectoCargo) {
        implementacionTipoEstadoProyectoCargo.setNombreEstadoProyectoCargo(nombreEstadoProyectoCargo);
    }
    
}
