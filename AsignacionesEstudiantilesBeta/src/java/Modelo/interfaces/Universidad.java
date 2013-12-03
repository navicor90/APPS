/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import java.util.Date;

/**
 *
 * @author yanina
 */
public interface Universidad {
    public String getNombreUniversidad();

    public void setNombreUniversidad(String nombreUniversidad);

    public Long getCodigo();

    public void setCodigo(Long codigo);
    public Date getFechaInicioVigenciaUniversidad() ;

    public void setFechaInicioVigenciaUniversidad(Date fechaInicioVigenciaUniversidad);

    public Date getFechaFinVigenciaUniversidad() ;

    public void setFechaFinVigenciaUniversidad(Date fechaFinVigenciaUniversidad) ;

    public String getDireccionServidorWebUniversidad() ;

    public void setDireccionServidorWebUniversidad(String direccionServidorWebUniversidad) ;
}
