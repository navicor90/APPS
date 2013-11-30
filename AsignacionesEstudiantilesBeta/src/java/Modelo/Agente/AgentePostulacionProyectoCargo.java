/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.sql.SQLException;
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
    private boolean heBuscadoPostulacionProyectoCargoEstadoList;
    private ImplementacionPostulacionProyectoCargo implementacionPostulacionProyectoCargo;

    public boolean isHeBuscadoPostulacionProyectoCargoEstadoList() {
        return heBuscadoPostulacionProyectoCargoEstadoList;
    }

    public void setHeBuscadoPostulacionProyectoCargoEstadoList(boolean heBuscadoPostulacionProyectoCargoEstadoList) {
        this.heBuscadoPostulacionProyectoCargoEstadoList = heBuscadoPostulacionProyectoCargoEstadoList;
    }
    
    
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
        List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstados;
        System.out.println("PREVIO getPostulacionProyectoCargoEstadoList "+this.esNuevo());
        if(heBuscadoPostulacionProyectoCargoEstadoList || this.esNuevo()){
            postulacionProyectoCargoEstados = implementacionPostulacionProyectoCargo.getPostulacionProyectoCargoEstadoList();
        }else{
            Criterio criterioBusquedaPostulacionPCE = (Criterio) FabricaCriterio.getInstancia().crear("PostulacionProyectoCargo", "=", this);
            postulacionProyectoCargoEstados = (List)FachadaPersistenciaInterna.getInstancia().buscar("PostulacionProyectoCargoEstado", criterioBusquedaPostulacionPCE);
        }
        System.out.println("previo for");
        for (PostulacionProyectoCargoEstado postulacionProyectoCargoEstado : postulacionProyectoCargoEstados) {
            System.out.println("postpcestado"+postulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo().getNombreEstado());
        }
        return postulacionProyectoCargoEstados;
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
    public Proyecto getProyecto(){
        Proyecto proyecto = null;
        if(heBuscadoProyecto || this.esNuevo()){
            proyecto = implementacionPostulacionProyectoCargo.getProyecto();
        }else{
            proyecto = (Proyecto) FachadaPersistenciaInterna.getInstancia().buscar("Proyecto", oidProyecto);
        }
        return proyecto;
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
        ProyectoCargo proyectoCargo;
        if(heBuscadoProyectoCargo || this.esNuevo()){
            proyectoCargo = implementacionPostulacionProyectoCargo.getProyectoCargo();
        }else{
            proyectoCargo = (ProyectoCargo) FachadaPersistenciaInterna.getInstancia().buscar("ProyectoCargo", oidProyectoCargo);
        }
        return proyectoCargo;
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
