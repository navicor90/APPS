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
    public String getEstadoPostulacion();

    public void setEstadoPostulacion(String estadoPostulacion);

    public Date getFechaHoraPostulacion();

    public void setFechaHoraPostulacion(Date fechaHoraPostulacion);

    public int getNroPostulacion();

    public void setNroPostulacion(int nroPostulacion);

    public List<PostulacionProyectoCargo> getProyectoCargo();

    public void setProyectoCargo(List<PostulacionProyectoCargo> proyectoCargo);

    public Estudiante getEstudiante();
    public void setEstudiante(Estudiante estudiante);
}
