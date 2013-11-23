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
public class AgenteTipoSeleccion extends Agente implements TipoSeleccion{
    ImplementacionTipoSeleccion implementacionTipoSeleccion;

    public ImplementacionTipoSeleccion getImplementacionTipoSeleccion() {
        return implementacionTipoSeleccion;
    }

    public void setImplementacionTipoSeleccion(ImplementacionTipoSeleccion implementacionTipoSeleccion) {
        this.implementacionTipoSeleccion = implementacionTipoSeleccion;
    }
    
    @Override
    public String getNomTipoSeleccion() {
        return implementacionTipoSeleccion.getNomTipoSeleccion();
    }

    @Override
    public void setNomTipoSeleccion(String nomTipoSeleccion) {
        implementacionTipoSeleccion.setNomTipoSeleccion(nomTipoSeleccion);
    }
    
}
