/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Modelo.implementacion.*;
import Controlador.Persistencia.*;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AgenteEstudiante extends Agente implements Estudiante{

    String oidUniversidad;
    boolean heBuscadoUniversdad;
    boolean heBuscadoEstadoAcademico;
    ImplementacionEstudiante implementacionEstudiante;
    
    public String getOidUniversidad() {
        return oidUniversidad;
    }

    public void setOidUniversidad(String oidUniversidad) {
        this.oidUniversidad = oidUniversidad;
    }

    public boolean isHeBuscadoUniversdad() {
        return heBuscadoUniversdad;
    }

    public void setHeBuscadoUniversdad(boolean heBuscadoUniversdad) {
        this.heBuscadoUniversdad = heBuscadoUniversdad;
    }
    
    
    
    public ImplementacionEstudiante getImplementacionEstudiante() {
        return implementacionEstudiante;
    }

    public void setImplementacionEstudiante(ImplementacionEstudiante implementacionEstudiante) {
        this.implementacionEstudiante = implementacionEstudiante;
    }

    @Override
    public String getNombre() {
        return implementacionEstudiante.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        implementacionEstudiante.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return implementacionEstudiante.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        implementacionEstudiante.setApellido(apellido);
    }

    @Override
    public String getEmail() {
        return implementacionEstudiante.getEmail();
    }

    @Override
    public void setEmail(String email) {
        implementacionEstudiante.setEmail(email);
    }

    @Override
    public Long getDni() {
        return implementacionEstudiante.getDni();
    }

    @Override
    public void setDni(Long dni) {
        implementacionEstudiante.setDni(dni);
    }

    @Override
    public String getTipoDni() {
        return implementacionEstudiante.getTipoDni();
    }

    @Override
    public void setTipoDni(String tipoDni) {
        implementacionEstudiante.setTipoDni(tipoDni);
    }

    @Override
    public Long getTelefono() {
        return implementacionEstudiante.getTelefono();
    }

    @Override
    public void setTelefono(Long telefono) {
        implementacionEstudiante.setTelefono(telefono);
    }

    @Override
    public Universidad getUniversidad() {
        Universidad universidad;
        if(heBuscadoUniversdad || this.esNuevo()){
            universidad = implementacionEstudiante.getUniversidad();
        }else{
            universidad = (Universidad) FachadaPersistenciaInterna.getInstancia().buscar("Universidad",this.getOidUniversidad());
        }
        return universidad;
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        implementacionEstudiante.setUniversidad(universidad);
        Agente agente = (Agente) universidad;
        this.setOidUniversidad(agente.getOid());
    }

    @Override
    public TipoEstadoEstudiante getEstadoEstudiante() {
        return implementacionEstudiante.getEstadoEstudiante();
    }

    @Override
    public void setEstadoEstudiante(TipoEstadoEstudiante estadoEstudiante) {
        implementacionEstudiante.setEstadoEstudiante(estadoEstudiante);
    }

    @Override
    public int getCodigo() {
        return implementacionEstudiante.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        implementacionEstudiante.setCodigo(codigo);
    }
    @Override
    public List<EstadoAcademico> getEstadoAcademicoList() {
        List<EstadoAcademico> estadoAcademicoList;
        if(this.heBuscadoEstadoAcademico || this.esNuevo()){
            estadoAcademicoList = (List) this.getImplementacionEstudiante().getEstadoAcademicoList();
        }else{
            Criterio c = (Criterio) FabricaCriterio.getInstancia().crear("estudiante", "=", this);
            estadoAcademicoList = (List) FachadaPersistenciaInterna.getInstancia().buscar("EstadoAcademico", c);
            this.setHeBuscadoUniversdad(true);
            this.setEstadoAcademicoList(estadoAcademicoList);
        }
        return estadoAcademicoList;
    }

    @Override
    public void setEstadoAcademicoList(List<EstadoAcademico> estadoAcademicoList) {
        for (EstadoAcademico estadoAcademico : estadoAcademicoList) {
            AgenteEstadoAcademico agenteEstadoAcademico = (AgenteEstadoAcademico) estadoAcademico;
            agenteEstadoAcademico.setOIDEstudiante(this.getOid());
        }
        this.getImplementacionEstudiante().setEstadoAcademicoList(estadoAcademicoList);
    }
    
}
