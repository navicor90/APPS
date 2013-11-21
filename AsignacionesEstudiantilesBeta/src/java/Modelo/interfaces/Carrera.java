/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

import Modelo.*;
import java.util.Date;

/**
 *
 * @author yanina
 */
public interface Carrera {
    public Date getFechaFinVigencia() ;

    public void setFechaFinVigencia(Date fechaFinVigencia) ;

    public String getNombreCarrera() ;

    public void setNombreCarrera(String nombreCarrera) ;

    public Universidad getUniversdad() ;

    public void setUniversdad(Universidad universdad) ;

    public TipoEstadoCarrera getEstadoCarrerra();

    public void setEstadoCarrerra(TipoEstadoCarrera estadoCarrerra) ;

    public PlanDeEstudio getPlanDeEstudio() ;

    public void setPlanDeEstudio(PlanDeEstudio planDeEstudio) ;
}
