/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;
import java.util.Date;

/**
 *
 * @author milton
 */
public class ImplementacionUniversidad implements Universidad{
    private String nombreUniversidad;
    private Long codigo;
    private Date fechaInicioVigenciaUniversidad;
    private Date fechaFinVigenciaUniversidad;
    private String direccionServidorWebUniversidad;

    @Override
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    @Override
    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    @Override
    public Long getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getFechaInicioVigenciaUniversidad() {
        return fechaInicioVigenciaUniversidad;
    }

    public void setFechaInicioVigenciaUniversidad(Date fechaInicioVigenciaUniversidad) {
        this.fechaInicioVigenciaUniversidad = fechaInicioVigenciaUniversidad;
    }

    public Date getFechaFinVigenciaUniversidad() {
        return fechaFinVigenciaUniversidad;
    }

    public void setFechaFinVigenciaUniversidad(Date fechaFinVigenciaUniversidad) {
        this.fechaFinVigenciaUniversidad = fechaFinVigenciaUniversidad;
    }

    public String getDireccionServidorWebUniversidad() {
        return direccionServidorWebUniversidad;
    }

    public void setDireccionServidorWebUniversidad(String direccionServidorWebUniversidad) {
        this.direccionServidorWebUniversidad = direccionServidorWebUniversidad;
    }
    
    
    
}
