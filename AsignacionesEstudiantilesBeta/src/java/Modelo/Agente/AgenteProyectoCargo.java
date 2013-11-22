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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNroProyectoCargo(int nroProyectoCargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ImplementacionProyectoCargoEstado> getProyectoCargoEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProyectoCargoEstado(List<ImplementacionProyectoCargoEstado> proyectoCargoEstado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoCargo getTipoCargo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoCargo(TipoCargo tipoCargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proyecto getProyecto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectoCargoCarrera getProyectoCargoCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProyectoCargoCarrera(ProyectoCargoCarrera proyectoCargoCarrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
