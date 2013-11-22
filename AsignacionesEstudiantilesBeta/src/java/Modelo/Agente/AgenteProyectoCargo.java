/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class AgenteProyectoCargo extends Agente implements ProyectoCargo{
    String oidProyecto;
    String oidTipoCargo;
    boolean heBuscadoProyecto;
    boolean heBuscadoTipoCargo;
    ImplementacionProyectoCargo implementacionProyectoCargo;

    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }

    public String getOidTipoCargo() {
        return oidTipoCargo;
    }

    public void setOidTipoCargo(String oidTipoCargo) {
        this.oidTipoCargo = oidTipoCargo;
    }

    public boolean isHeBuscadoProyecto() {
        return heBuscadoProyecto;
    }

    public void setHeBuscadoProyecto(boolean heBuscadoProyecto) {
        this.heBuscadoProyecto = heBuscadoProyecto;
    }

    public boolean isHeBuscadoTipoCargo() {
        return heBuscadoTipoCargo;
    }

    public void setHeBuscadoTipoCargo(boolean heBuscadoTipoCargo) {
        this.heBuscadoTipoCargo = heBuscadoTipoCargo;
    }

    public ImplementacionProyectoCargo getImplementacionProyectoCargo() {
        return implementacionProyectoCargo;
    }

    public void setImplementacionProyectoCargo(ImplementacionProyectoCargo implementacionProyectoCargo) {
        this.implementacionProyectoCargo = implementacionProyectoCargo;
    }
    
    
    @Override
    public int getCantidadMinimaPostulacion() {
        return implementacionProyectoCargo.getCantidadMinimaPostulacion();
    }

    @Override
    public void setCantidadMinimaPostulacion(int cantidadMinimaPostulacion) {
        implementacionProyectoCargo.setCantidadMinimaPostulacion(cantidadMinimaPostulacion);
    }

    @Override
    public String getDescripcion() {
        return implementacionProyectoCargo.getDescripcion();
    }

    @Override
    public void setDescripcion(String descripcion) {
        implementacionProyectoCargo.setDescripcion(descripcion);
    }

    @Override
    public Boolean isHabilitado() {
        return implementacionProyectoCargo.isHabilitado();
    }

    @Override
    public void setHabilitado(Boolean habilitado) {
        implementacionProyectoCargo.setHabilitado(habilitado);
    }

    @Override
    public Date getHorasDedicadas() {
        return implementacionProyectoCargo.getHorasDedicadas();
    }

    @Override
    public void setHorasDedicadas(Date horasDedicadas) {
        implementacionProyectoCargo.setHorasDedicadas(horasDedicadas);
    }

    @Override
    public int getNroProyectoCargo() {
        return implementacionProyectoCargo.getNroProyectoCargo();
    }

    @Override
    public void setNroProyectoCargo(int nroProyectoCargo) {
        implementacionProyectoCargo.setNroProyectoCargo(nroProyectoCargo);
    }

    @Override
    public List<ImplementacionProyectoCargoEstado> getProyectoCargoEstado() {
        return implementacionProyectoCargo.getProyectoCargoEstado();
    }

    @Override
    public void setProyectoCargoEstado(List<ImplementacionProyectoCargoEstado> proyectoCargoEstado) {
        implementacionProyectoCargo.setProyectoCargoEstado(proyectoCargoEstado);
    }

    @Override
    public TipoCargo getTipoCargo() {
        return implementacionProyectoCargo.getTipoCargo();
    }

    @Override
    public void setTipoCargo(TipoCargo tipoCargo) {
        implementacionProyectoCargo.setTipoCargo(tipoCargo);
    }

    @Override
    public Proyecto getProyecto() {
        return implementacionProyectoCargo.getProyecto();
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        implementacionProyectoCargo.setProyecto(proyecto);
    }

    @Override
    public ProyectoCargoCarrera getProyectoCargoCarrera() {
        return implementacionProyectoCargo.getProyectoCargoCarrera();
    }

    @Override
    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera) {
        implementacionProyectoCargo.setProyectoCargoCarrera(proyectoCargoCarrera);
    }
    
    
}
