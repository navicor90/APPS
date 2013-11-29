/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.interfaces;

import java.util.List;

/**
 *
 * @author yanina
 */
public interface PostulacionProyectoCargo {

    public int getPrioridad();

    public void setPrioridad(int prioridad);

    public int getCantidadMateriasAprobadasEstudiante();

    public void setCantidadMateriasAprobadasEstudiante(int cantidadMateriasAprobadasEstudiante);

    public int getCantidadMateriasRegulares();

    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares);

    public List<PostulacionProyectoCargoEstado> getPostulacionProyectoCargoEstadoList() ;

    public void setPostulacionProyectoCargoEstadoList(List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstado);

    public void addPostulacionProyectoCargoEstado(PostulacionProyectoCargoEstado postulacionProyectoCargoEstado);

    public Proyecto getProyecto() ;

    public void setProyecto(Proyecto proyecto);

    public Universidad getUniversidad();

    public void setUniversidad(Universidad universidad);

    public ProyectoCargo getProyectoCargo();

    public void setProyectoCargo(ProyectoCargo proyectoCargo);
}
