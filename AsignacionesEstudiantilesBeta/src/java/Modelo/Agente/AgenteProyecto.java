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
public class AgenteProyecto extends Agente implements Proyecto{
    String oidEmpresa;
    String oidUniversidad;
    boolean heBuscadoEmpresa;
    boolean heBuscadoUniversidad;
    ImplementacionProyecto implementacionProyecto;

    public String getOidEmpresa() {
        return oidEmpresa;
    }

    public void setOidEmpresa(String oidEmpresa) {
        this.oidEmpresa = oidEmpresa;
    }

    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public boolean isHeBuscadoEmpresa() {
        return heBuscadoEmpresa;
    }

    public void setHeBuscadoEmpresa(boolean heBuscadoEmpresa) {
        this.heBuscadoEmpresa = heBuscadoEmpresa;
    }

    public boolean isHeBuscadoUniversidad() {
        return heBuscadoUniversidad;
    }

    public void setHeBuscadoUniversidad(boolean heBuscadoUniversidad) {
        this.heBuscadoUniversidad = heBuscadoUniversidad;
    }

    public ImplementacionProyecto getImplementacionProyecto() {
        return implementacionProyecto;
    }

    public void setImplementacionProyecto(ImplementacionProyecto implementacionProyecto) {
        this.implementacionProyecto = implementacionProyecto;
    }
    
    
    @Override
    public String getDescripcion() {
        return implementacionProyecto.getDescripcion();
    }

    @Override
    public void setDescripcion(String descripcion) {
        implementacionProyecto.setDescripcion(descripcion);
    }

    @Override
    public int getDuracion() {
        return implementacionProyecto.getDuracion();
    }

    @Override
    public void setDuracion(int duracion) {
        implementacionProyecto.setDuracion(duracion);
    }

    @Override
    public Date getFechaInicio() {
        return implementacionProyecto.getFechaInicio();
    }

    @Override
    public void setFechaInicio(Date fechaInicio) {
        implementacionProyecto.setFechaInicio(fechaInicio);
    }

    @Override
    public Date getFechaFinPostulacion() {
        return implementacionProyecto.getFechaFinPostulacion();
    }

    @Override
    public void setFechaFinPostulacion(Date fechaFinPostulacion) {
        implementacionProyecto.setFechaFinPostulacion(fechaFinPostulacion);
    }

    @Override
    public String getNombreProyecto() {
        return implementacionProyecto.getNombreProyecto();
    }

    @Override
    public void setNombreProyecto(String nombreProyecto) {
        implementacionProyecto.setNombreProyecto(nombreProyecto);
    }

    @Override
    public Empresa getEmpresa() {
        return implementacionProyecto.getEmpresa();
    }

    @Override
    public void setEmpresa(Empresa empresa) {
        implementacionProyecto.setEmpresa(empresa);
    }

    @Override
    public ProyectoCargo getProyectoCargo() {
        return implementacionProyecto.getProyectoCargo();
    }

    @Override
    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        implementacionProyecto.setProyectoCargo(proyectoCargo);
    }

    @Override
    public Universidad getUniversidad() {
        return implementacionProyecto.getUniversidad();
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        implementacionProyecto.setUniversidad(universidad);
    }

    @Override
    public List<ProyectoEstado> getProyectoEstado() {
        return implementacionProyecto.getProyectoEstado();
    }

    @Override
    public void setProyectoEstado(List<ProyectoEstado> proyectoEstado) {
        implementacionProyecto.setProyectoEstado(proyectoEstado);
    }

    @Override
    public TipoSeleccion getTipoSeleccion() {
        return implementacionProyecto.getTipoSeleccion();
    }

    @Override
    public void setTipoSeleccion(TipoSeleccion tipoSeleccion) {
        implementacionProyecto.setTipoSeleccion(tipoSeleccion);
    }
    
}
