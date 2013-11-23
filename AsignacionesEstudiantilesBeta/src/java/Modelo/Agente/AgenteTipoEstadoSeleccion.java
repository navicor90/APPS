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
public class AgenteTipoEstadoSeleccion extends Agente implements TipoEstadoSeleccion{
    ImplementacionTipoEstadoSeleccion implementacionTipoEstadoSeleccion;
    @Override
    public String getTipoNombreEstadoSeleccion() {
        return implementacionTipoEstadoSeleccion.getTipoNombreEstadoSeleccion();
    }

    @Override
    public void setTipoNombreEstadoSeleccion(String tipoNombreEstadoSeleccion) {
        implementacionTipoEstadoSeleccion.setTipoNombreEstadoSeleccion(tipoNombreEstadoSeleccion);
    }
    
}
