/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author milton
 */
public class ImplementacionUniversidad implements Universidad{
    private String nombreUniversidad;
    private Long codigo;

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
    
    
    
}
