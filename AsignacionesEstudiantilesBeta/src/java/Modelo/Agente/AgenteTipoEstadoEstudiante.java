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
public class AgenteTipoEstadoEstudiante extends Agente implements TipoEstadoEstudiante{
    ImplementacionTipoEstadoEstudiante implementacionTipoEstadoEstudiante;

    public ImplementacionTipoEstadoEstudiante getImplementacionTipoEstadoEstudiante() {
        return implementacionTipoEstadoEstudiante;
    }

    public void setImplementacionTipoEstadoEstudiante(ImplementacionTipoEstadoEstudiante implementacionTipoEstadoEstudiante) {
        this.implementacionTipoEstadoEstudiante = implementacionTipoEstadoEstudiante;
    }
    
    @Override
    public String getNombreTipoEstadoEstudiante() {
        return implementacionTipoEstadoEstudiante.getNombreTipoEstadoEstudiante();
    }

    @Override
    public void setNombreTipoEstadoEstudiante(String nombreTipoEstadoEstudiante) {
        implementacionTipoEstadoEstudiante.setNombreTipoEstadoEstudiante(nombreTipoEstadoEstudiante);
    }
    
}
