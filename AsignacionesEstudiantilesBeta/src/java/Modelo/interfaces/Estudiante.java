/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.interfaces;

/**
 *
 * @author yanina
 */
public interface Estudiante {
    public String getLegajo();

    public void setLegajo(String legajo);

    public String getNombre();

    public void setNombre(String nombre);

    public String getApellido();

    public void setApellido(String apellido);

    public String getEmail();

    public void setEmail(String email);

    public Long getDni();

    public void setDni(Long dni);

    public String getTipoDni();

    public void setTipoDni(String tipoDni);

    public Long getTelefono();

    public void setTelefono(Long telefono);

    public Universidad getUniversidad();

    public void setUniversidad(Universidad universidad);

    public EstadoEstudiante getEstadoEstudiante();

    public void setEstadoEstudiante(EstadoEstudiante estadoEstudiante);
}
