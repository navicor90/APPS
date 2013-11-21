/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;

import Modelo.interfaces.*;
import Modelo.implementacion.*;
import Controlador.Persistencia.*;
/**
 *
 * @author yanina
 */
public class AgenteEstudiante extends Agente implements Estudiante{
    String oidUniversidad;
    boolean heBuscadoUniversdad;
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
    public String getLegajo() {
        return implementacionEstudiante.getLegajo();
    }

    @Override
    public void setLegajo(String legajo) {
        implementacionEstudiante.setLegajo(legajo);
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
        return implementacionEstudiante.getUniversidad();
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        implementacionEstudiante.setUniversidad(universidad);
    }

    @Override
    public TipoEstadoEstudiante getEstadoEstudiante() {
        return implementacionEstudiante.getEstadoEstudiante();
    }

    @Override
    public void setEstadoEstudiante(TipoEstadoEstudiante estadoEstudiante) {
        implementacionEstudiante.setEstadoEstudiante(estadoEstudiante);
    }
    
    
}
