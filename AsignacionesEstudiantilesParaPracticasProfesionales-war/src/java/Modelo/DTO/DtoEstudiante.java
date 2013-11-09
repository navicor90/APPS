/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DTO;

/**
 *
 * @author yanina
 */
public class DtoEstudiante {
    private String legajo;
    private String nombre;
    private String apellido;
    private String email;
    private Long dni;
    private String tipoDni;
    private Long telefono;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    
}
