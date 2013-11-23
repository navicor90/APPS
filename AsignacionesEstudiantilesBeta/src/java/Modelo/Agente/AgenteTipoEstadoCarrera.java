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
public class AgenteTipoEstadoCarrera extends Agente implements TipoEstadoCarrera{
    ImplementacionTipoEstadoCarrera implementacionTipoEstadoCarrera;
    
    @Override
    public String getNombreTipoEstadoCarrera() {
        return implementacionTipoEstadoCarrera.getNombreTipoEstadoCarrera();
    }

    @Override
    public void setNombreTipoEstadoCarrera(String nombreTipoEstadoCarrera) {
        implementacionTipoEstadoCarrera.setNombreTipoEstadoCarrera(nombreTipoEstadoCarrera);
    }
    
}
