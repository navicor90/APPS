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
 * @author yanina
 */
public interface Postulacion {

    public List<PostulacionProyectoCargo> getProyectoCargosList();

    public void setProyectoCargosList(List<PostulacionProyectoCargo> proyectoCargosList);

    public Date getFechaHoraAnulacionPostulacion();

    public void setFechaHoraAnulacionPostulacion(Date fechaHoraAnulacionPostulacion);

    public Date getFechaHoraPostulacion();

    public void setFechaHoraPostulacion(Date fechaHoraPostulacion);

    public int getNroPostulacion();

    public void setNroPostulacion(int nroPostulacion);

    public void addProyectoCargo(PostulacionProyectoCargo proyectoCargo);

    public Estudiante getEstudiante();

    public void setEstudiante(Estudiante estudiante);
}
