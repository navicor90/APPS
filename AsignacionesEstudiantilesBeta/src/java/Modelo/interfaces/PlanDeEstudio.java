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
public interface PlanDeEstudio {
    public int getCodigoPlanDeEstudion();

    public void setCodigoPlanDeEstudion(int codigoPlanDeEstudion);

    public Date getFechaFinVigencia();

    public void setFechaFinVigencia(Date fechaFinVigencia);

    public String getNombrePlanDeEstudio();

    public void setNombrePlanDeEstudio(String nombrePlanDeEstudio);

    public Materia getMateria();

    public void setMateria(Materia materia);
}
