/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.ImplementacionProyectoCargoCarrera;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteProyectoCargoEstado extends Agente implements ProyectoCargoEstado{
    String oidproyectoCargo;
    String oidTipoEstadoProyectoCargo;
    boolean heBuscadoProyectoCargo;
    boolean heBuscadoTipoEstadoProyectoCargo;
    ImplementacionProyectoCargoCarrera implementacionProyectoCargoCarrera;
    @Override
    public Date getFechahoraCambioEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFechahoraCambioEstado(Date fechahoraCambioEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoEstadoProyectoCargo getTipoEstadoProyectoCargo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoEstadoProyectoCargo(TipoEstadoProyectoCargo tipoEstadoProyectoCargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
