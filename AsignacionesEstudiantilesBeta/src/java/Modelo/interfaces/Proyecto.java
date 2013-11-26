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
public interface Proyecto {
    public String getDescripcion();
    
    public int getCodigo() ;

    public void setCodigo(int codigo) ;
    
    public void setDescripcion(String descripcion);

    public int getDuracion();

    public void setDuracion(int duracion);

    public Date getFechaInicio();

    public void setFechaInicio(Date fechaInicio);

    public Date getFechaFinPostulacion();

    public void setFechaFinPostulacion(Date fechaFinPostulacion);

    public String getNombreProyecto();

    public void setNombreProyecto(String nombreProyecto);

    public Empresa getEmpresa();

    public void setEmpresa(Empresa empresa);

    public List<ProyectoCargo> getProyectoCargoList() ;

    public void setProyectoCargoList(List<ProyectoCargo> proyectoCargoList);

    public void addProyectoCargo(ProyectoCargo proyectoCargo);

    public Universidad getUniversidad();

    public void setUniversidad(Universidad universidad);

    public List<ProyectoEstado> getProyectoEstado();

    public void setProyectoEstado(List<ProyectoEstado> proyectoEstado);

    public TipoSeleccion getTipoSeleccion();

    public void setTipoSeleccion(TipoSeleccion tipoSeleccion);
}
