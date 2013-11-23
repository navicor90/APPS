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
public class AgenteTipoEstadoSeleccionPostulacionProyectoCargo extends Agente implements TipoEstadoSeleccionPostulacionProyectoCargo{
    ImplementacionTipoEstadoSeleccionPostulacionProyectoCargo implementacionTipoEstadoSeleccionPostulacionProyectoCargo;

    public ImplementacionTipoEstadoSeleccionPostulacionProyectoCargo getImplementacionTipoEstadoSeleccionPostulacionProyectoCargo() {
        return implementacionTipoEstadoSeleccionPostulacionProyectoCargo;
    }

    public void setImplementacionTipoEstadoSeleccionPostulacionProyectoCargo(ImplementacionTipoEstadoSeleccionPostulacionProyectoCargo implementacionTipoEstadoSeleccionPostulacionProyectoCargo) {
        this.implementacionTipoEstadoSeleccionPostulacionProyectoCargo = implementacionTipoEstadoSeleccionPostulacionProyectoCargo;
    }
    
    @Override
    public int getCodigoSeleccionProyectoCargo() {
        return implementacionTipoEstadoSeleccionPostulacionProyectoCargo.getCodigoSeleccionProyectoCargo();
    }

    @Override
    public void setCodigoSeleccionProyectoCargo(int codigoSeleccionProyectoCargo) {
        implementacionTipoEstadoSeleccionPostulacionProyectoCargo.setCodigoSeleccionProyectoCargo(codigoSeleccionProyectoCargo);
    }

    @Override
    public String getNombreSeleccionProyectoCargo() {
        return implementacionTipoEstadoSeleccionPostulacionProyectoCargo.getNombreSeleccionProyectoCargo();
    }

    @Override
    public void setNombreSeleccionProyectoCargo(String nombreSeleccionProyectoCargo) {
        implementacionTipoEstadoSeleccionPostulacionProyectoCargo.setNombreSeleccionProyectoCargo(nombreSeleccionProyectoCargo);
            
    }
    
}
