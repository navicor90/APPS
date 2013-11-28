/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgentePostulacionProyectoCargo extends Agente implements PostulacionProyectoCargo{   
    private String oidUniversidad;
    private String oidProyectoCargo;
    private String oidPostulacion;
    private String oidProyecto;
    private boolean heBuscadoUniversidad;
    private boolean heBuscadoProyectoCargo;
    private boolean heBuscadoPostulacion;
    private boolean heBuscadoProyecto;
    private ImplementacionPostulacionProyectoCargo implementacionPostulacionProyectoCargo;

    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public String getOidProyectoCargo() {
        return oidProyectoCargo;
    }

    public void setOidProyectoCargo(String oidProyectoCargo) {
        this.oidProyectoCargo = oidProyectoCargo;
    }

    public String getOidPostulacion() {
        return oidPostulacion;
    }

    public void setOidPostulacion(String oidPostulacion) {
        this.oidPostulacion = oidPostulacion;
    }

    public String getOidProyecto() {
        return oidProyecto;
    }

    public void setOidProyecto(String oidProyecto) {
        this.oidProyecto = oidProyecto;
    }

    public boolean isHeBuscadoUniversidad() {
        return heBuscadoUniversidad;
    }

    public void setHeBuscadoUniversidad(boolean heBuscadoUniversidad) {
        this.heBuscadoUniversidad = heBuscadoUniversidad;
    }

    public boolean isHeBuscadoProyectoCargo() {
        return heBuscadoProyectoCargo;
    }

    public void setHeBuscadoProyectoCargo(boolean heBuscadoProyectoCargo) {
        this.heBuscadoProyectoCargo = heBuscadoProyectoCargo;
    }

    public boolean isHeBuscadoPostulacion() {
        return heBuscadoPostulacion;
    }

    public void setHeBuscadoPostulacion(boolean heBuscadoPostulacion) {
        this.heBuscadoPostulacion = heBuscadoPostulacion;
    }

    public boolean isHeBuscadoProyecto() {
        return heBuscadoProyecto;
    }

    public void setHeBuscadoProyecto(boolean heBuscadoProyecto) {
        this.heBuscadoProyecto = heBuscadoProyecto;
    }

    public ImplementacionPostulacionProyectoCargo getImplementacionPostulacionProyectoCargo() {
        return implementacionPostulacionProyectoCargo;
    }

    public void setImplementacionPostulacionProyectoCargo(ImplementacionPostulacionProyectoCargo implementacionPostulacionProyectoCargo) {
        this.implementacionPostulacionProyectoCargo = implementacionPostulacionProyectoCargo;
    }
    
    

    @Override
    public List<PostulacionProyectoCargoEstado> getPostulacionProyectoCargoEstadoList() {
        return implementacionPostulacionProyectoCargo.getPostulacionProyectoCargoEstadoList();
    }

    @Override
    public void setPostulacionProyectoCargoEstadoList(List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstado) {
        implementacionPostulacionProyectoCargo.setPostulacionProyectoCargoEstadoList(postulacionProyectoCargoEstado);
    }

    @Override
    public void addPostulacionProyectoCargoEstado(PostulacionProyectoCargoEstado postulacionProyectoCargoEstado) {
        implementacionPostulacionProyectoCargo.addPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
    }
    
    @Override
    public Proyecto getProyecto() {
        return implementacionPostulacionProyectoCargo.getProyecto();
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        implementacionPostulacionProyectoCargo.setProyecto(proyecto);
    }

    @Override
    public Universidad getUniversidad() {
        return implementacionPostulacionProyectoCargo.getUniversidad();
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        implementacionPostulacionProyectoCargo.setUniversidad(universidad);
    }

    @Override
    public ProyectoCargo getProyectoCargo() {
        return implementacionPostulacionProyectoCargo.getProyectoCargo();
    }

    @Override
    public void setProyectoCargo(ProyectoCargo proyectoCargo) {
        implementacionPostulacionProyectoCargo.setProyectoCargo(proyectoCargo);
    }

    @Override
    public int getPrioridad() {
        return implementacionPostulacionProyectoCargo.getPrioridad();
    }

    @Override
    public void setPrioridad(int prioridad) {
        implementacionPostulacionProyectoCargo.setPrioridad(prioridad);
    }

    @Override
    public int getCantidadMateriasAprobadasEstudiante() {
        return implementacionPostulacionProyectoCargo.getCantidadMateriasAprobadasEstudiante();
    }

    @Override
    public void setCantidadMateriasAprobadasEstudiante(int cantidadMateriasAprobadasEstudiante) {
        implementacionPostulacionProyectoCargo.setCantidadMateriasAprobadasEstudiante(cantidadMateriasAprobadasEstudiante);
    }

    @Override
    public int getCantidadMateriasRegulares() {
        return implementacionPostulacionProyectoCargo.getCantidadMateriasRegulares();
    }

    @Override
    public void setCantidadMateriasRegulares(int cantidadMateriasRegulares) {
        implementacionPostulacionProyectoCargo.setCantidadMateriasRegulares(cantidadMateriasRegulares);
    }
    
}
