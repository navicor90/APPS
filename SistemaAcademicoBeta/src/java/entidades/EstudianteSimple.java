/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.List;

/**
 *
 * @author yanina
 */
public class EstudianteSimple {
        private String tipoDni;
    private Long dni;
    private String nombre;
    private Universidad universidad; 
    private List<EstadoAcademicoSImple> estadoacademicoSimple;

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public List<EstadoAcademicoSImple> getEstadoacademicoSimple() {
        return estadoacademicoSimple;
    }

    public void setEstadoacademicoSimple(List<EstadoAcademicoSImple> estadoacademicoSimple) {
        this.estadoacademicoSimple = estadoacademicoSimple;
    }
    
}
