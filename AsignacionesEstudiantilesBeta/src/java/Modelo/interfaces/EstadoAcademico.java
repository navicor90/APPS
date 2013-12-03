/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

/**
 *
 * @author milton
 */
public interface EstadoAcademico {
    
    public Carrera getCarrera() ;

    public void setCarrera(Carrera carrera) ;
    
    public String getLegajo() ;

    public void setLegajo(String legajo) ;

    public TipoEstadoAcademico getTipoEstadoAcademico() ;

    public void setTipoEstadoAcademico(TipoEstadoAcademico tipoEstadoAcademico) ;
}
