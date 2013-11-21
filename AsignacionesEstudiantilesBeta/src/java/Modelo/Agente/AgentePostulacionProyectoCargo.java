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
    String oidUniversidad;
    String oidProyectoCargo;
    String oidPostulacion;
    String oidProyecto;
    boolean heBuscadoUniversidad;
    boolean heBuscadoProyectoCargo;
    boolean heBuscadoPostulacion;
    boolean heBuscadoProyecto;
    ImplementacionPostulacionProyectoCargo implementacionPostulacionProyectoCargo;

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
    public String getPrioridad() {
        return implementacionPostulacionProyectoCargo.getPrioridad();
    }

    @Override
    public void setPrioridad(String prioridad) {
        implementacionPostulacionProyectoCargo.setPrioridad(prioridad);
    }

    @Override
    public int getCodPostulacionProyectoCargo() {
        return implementacionPostulacionProyectoCargo.getCodPostulacionProyectoCargo();
    }

    @Override
    public void setCodPostulacionProyectoCargo(int codPostulacionProyectoCargo) {
        implementacionPostulacionProyectoCargo.setCodPostulacionProyectoCargo(codPostulacionProyectoCargo);
    }

    @Override
    public List<PostulacionProyectoCargoEstado> getPostulacionProyectoCargoEstado() {
        return implementacionPostulacionProyectoCargo.getPostulacionProyectoCargoEstado();
    }

    @Override
    public void setPostulacionProyectoCargoEstado(List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstado) {
        implementacionPostulacionProyectoCargo.setPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
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
    
}
