/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class DTOCarrera {
    private  Long legajo;
    private  String estadoAcademico;
    @SerializedName("carreraSimple")
    private  CarreraSimple carreraSimple;
    private  Date fechaIngreso;
    private Date fechaBaja;

    public DTOCarrera(Long legajo, String estadoAcademico, CarreraSimple carreraSimple, Date fechaIngreso, Date fechaBaja) {
        this.legajo = legajo;
        this.estadoAcademico = estadoAcademico;
        this.carreraSimple = carreraSimple;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
    }

    public DTOCarrera() {
    }
    
    public DTOCarrera(CarreraSimple carreraSimple) {
        this.carreraSimple = carreraSimple;
    }
    
    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public void setCarreraSimple(CarreraSimple carreraSimple) {
        this.carreraSimple = carreraSimple;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    public Long getLegajo() {
        return legajo;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public CarreraSimple getCarreraSimple() {
        return carreraSimple;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }
    
}
