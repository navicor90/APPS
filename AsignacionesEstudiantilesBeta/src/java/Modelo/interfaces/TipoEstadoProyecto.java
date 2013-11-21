/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;
import Modelo.implementacion.*;

import Modelo.implementacion.ImplementacionTipoEstadoProyectoCargo;

/**
 *
 * @author yanina
 */
public interface TipoEstadoProyecto {
    
     public String getDescripcion();

    public void setDescripcion(String descripcion) ;

    public String getNombreTipoEstadoProyecto();

    public void setNombreTipoEstadoProyecto(String nombreTipoEstadoProyecto) ;
   
    
    
}
