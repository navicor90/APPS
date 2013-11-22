/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.ImplementacionProyectoCargoCarrera;
import Modelo.interfaces.*;
/**
 *
 * @author yanina
 */
public class AgenteProyectoCargoCarrera extends Agente implements ProyectoCargoCarrera{
    String oidProyectoCargo;
    String oidCarrera;
    boolean heBuscadoProyectoCargo;
    boolean heBuscadoCarrera;
    ImplementacionProyectoCargoCarrera implementacionProyectoCargoCarrera;

    public String getOidProyectoCargo() {
        return oidProyectoCargo;
    }

    public void setOidProyectoCargo(String oidProyectoCargo) {
        this.oidProyectoCargo = oidProyectoCargo;
    }

    public String getOidCarrera() {
        return oidCarrera;
    }

    public void setOidCarrera(String oidCarrera) {
        this.oidCarrera = oidCarrera;
    }

    public boolean isHeBuscadoProyectoCargo() {
        return heBuscadoProyectoCargo;
    }

    public void setHeBuscadoProyectoCargo(boolean heBuscadoProyectoCargo) {
        this.heBuscadoProyectoCargo = heBuscadoProyectoCargo;
    }

    public boolean isHeBuscadoCarrera() {
        return heBuscadoCarrera;
    }

    public void setHeBuscadoCarrera(boolean heBuscadoCarrera) {
        this.heBuscadoCarrera = heBuscadoCarrera;
    }

    public ImplementacionProyectoCargoCarrera getImplementacionProyectoCargoCarrera() {
        return implementacionProyectoCargoCarrera;
    }

    public void setImplementacionProyectoCargoCarrera(ImplementacionProyectoCargoCarrera implementacionProyectoCargoCarrera) {
        this.implementacionProyectoCargoCarrera = implementacionProyectoCargoCarrera;
    }
    
    
    @Override
    public int getCantidadMateriasRegulares() {
        return implementacionProyectoCargoCarrera.getCantidadMateriasRegulares();
    }

    @Override
    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares) {
        implementacionProyectoCargoCarrera.setCantidadMateriasRegulares(cantidadMateriasRegulares);
    }
    
    @Override
    public int getCantidadMateriasRendidas() {
        return implementacionProyectoCargoCarrera.getCantidadMateriasRegulares();
    }

    @Override
    public void setCantidadMateriasRendidas(int cantidadMateriasRendidas) {
        implementacionProyectoCargoCarrera.setCantidadMateriasRendidas(cantidadMateriasRendidas);
    }

    @Override
    public Carrera getCarrera() {
        return implementacionProyectoCargoCarrera.getCarrera();
    }

    @Override
    public void setCarrera(Carrera carrera) {
        implementacionProyectoCargoCarrera.setCarrera(carrera);
    }
    
}
