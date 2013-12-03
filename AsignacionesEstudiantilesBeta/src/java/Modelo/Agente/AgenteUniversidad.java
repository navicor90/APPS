/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.interfaces.*;
import Modelo.implementacion.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgenteUniversidad extends Agente implements Universidad{
    String oidEstadoUniversidad;
    boolean heBuscadoEstadoUniversidad;
    ImplementacionUniversidad implementacionUniversidad;

    public String getOidEstadoUniversidad() {
        return oidEstadoUniversidad;
    }

    public void setOidEstadoUniversidad(String oidEstadoUniversidad) {
        this.oidEstadoUniversidad = oidEstadoUniversidad;
    }

    public boolean isHeBuscadoEstadoUniversidad() {
        return heBuscadoEstadoUniversidad;
    }

    public void setHeBuscadoEstadoUniversidad(boolean heBuscadoEstadoUniversidad) {
        this.heBuscadoEstadoUniversidad = heBuscadoEstadoUniversidad;
    }

    public ImplementacionUniversidad getImplementacionUniversidad() {
        return implementacionUniversidad;
    }

    public void setImplementacionUniversidad(ImplementacionUniversidad implementacionUniversidad) {
        this.implementacionUniversidad = implementacionUniversidad;
    }
    
    @Override
    public String getNombreUniversidad() {
        return implementacionUniversidad.getNombreUniversidad();
    }

    @Override
    public void setNombreUniversidad(String nombreUniversidad) {
        implementacionUniversidad.setNombreUniversidad(nombreUniversidad);
    }

    @Override
    public Long getCodigo() {
        return implementacionUniversidad.getCodigo();
    }

    @Override
    public void setCodigo(Long codigo) {
        implementacionUniversidad.setCodigo(codigo);
    }

    @Override
    public Date getFechaInicioVigenciaUniversidad() {
        return implementacionUniversidad.getFechaInicioVigenciaUniversidad();
    }

    @Override
    public void setFechaInicioVigenciaUniversidad(Date fechaInicioVigenciaUniversidad) {
        implementacionUniversidad.setFechaInicioVigenciaUniversidad(fechaInicioVigenciaUniversidad);
    }

    @Override
    public Date getFechaFinVigenciaUniversidad() {
        return implementacionUniversidad.getFechaFinVigenciaUniversidad();
    }

    @Override
    public void setFechaFinVigenciaUniversidad(Date fechaFinVigenciaUniversidad) {
        implementacionUniversidad.setFechaFinVigenciaUniversidad(fechaFinVigenciaUniversidad);
    }

    @Override
    public String getDireccionServidorWebUniversidad() {
        return implementacionUniversidad.getDireccionServidorWebUniversidad();
    }

    @Override
    public void setDireccionServidorWebUniversidad(String direccionServidorWebUniversidad) {
        implementacionUniversidad.setDireccionServidorWebUniversidad(direccionServidorWebUniversidad);
    }
    
}
