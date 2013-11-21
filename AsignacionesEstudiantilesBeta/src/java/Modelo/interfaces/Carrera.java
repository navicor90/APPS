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
    public Date getFechaFinVigencia();

    public void setFechaFinVigencia(Date fechaFinVigencia);

    public String getNomCarrera();

    public void setNomCarrera(String nomCarrera);

    public Universidad getUniver() ;

    public void setUniver(Universidad univer);

    public EstadoCarrera getEstadoCarr();

    public void setEstadoCarr(EstadoCarrera estadoCarr) ;

    public PlanDeEstudio getPlanEstudio() ;

    public void setPlanEstudio(PlanDeEstudio planEstudio);
}
