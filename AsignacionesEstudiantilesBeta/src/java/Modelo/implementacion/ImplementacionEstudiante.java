/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.implementacion;

import Modelo.interfaces.*;

/**
 *
 * @author milton
 */
public class ImplementacionEstudiante implements Estudiante {

    private int codigo;
    private String legajo;
    private String nombre;
    private String apellido;
    private String email;
    private Long dni;
    private String tipoDni;
    private Long telefono;
    private Universidad universidad;
    private TipoEstadoEstudiante estadoEstudiante;

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getLegajo() {
        return legajo;
    }

    @Override
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Long getDni() {
        return dni;
    }

    @Override
    public void setDni(Long dni) {
        this.dni = dni;
    }

    @Override
    public String getTipoDni() {
        return tipoDni;
    }

    @Override
    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    @Override
    public Long getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Universidad getUniversidad() {
        return universidad;
    }

    @Override
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public TipoEstadoEstudiante getEstadoEstudiante() {
        return estadoEstudiante;
    }

    @Override
    public void setEstadoEstudiante(TipoEstadoEstudiante estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

}
