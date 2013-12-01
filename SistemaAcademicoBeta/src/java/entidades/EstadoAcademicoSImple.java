/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class EstadoAcademicoSImple {
    private String legajo;
    private String  estadoAcademico;
    private CarreraSimple carreraSimple;
    private List<EstudianteMateriaSimple> estudianteMateriaSimple;
    private Date fechaIngreso;
    private Date fechaBaja;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public CarreraSimple getCarreraSimple() {
        return carreraSimple;
    }

    public void setCarreraSimple(CarreraSimple carreraSimple) {
        this.carreraSimple = carreraSimple;
    }
    

    public List<EstudianteMateriaSimple> getEstudianteMateriaSimple() {
        return estudianteMateriaSimple;
    }

    public void setEstudianteMateriaSimple(List<EstudianteMateriaSimple> estudianteMateriaSimple) {
        this.estudianteMateriaSimple = estudianteMateriaSimple;
    }
    
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
}
