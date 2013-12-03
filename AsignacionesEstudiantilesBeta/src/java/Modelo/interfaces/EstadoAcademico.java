/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.interfaces;

import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public interface EstadoAcademico {

    public List<EstudianteMateria> getEstudianteMateriaList();

    public void setEstudianteMateriaList(List<EstudianteMateria> estudianteMateriaList);

    public Date getFechaIngreso();

    public void setFechaIngreso(Date fechaIngreso);

    public Date getFechaFinHabilitacion();

    public void setFechaFinHabilitacion(Date fechaFinHabilitacion);

    public Carrera getCarrera();

    public void setCarrera(Carrera carrera);

    public String getLegajo();

    public void setLegajo(String legajo);

    public TipoEstadoAcademico getTipoEstadoAcademico();

    public void setTipoEstadoAcademico(TipoEstadoAcademico tipoEstadoAcademico);
}
