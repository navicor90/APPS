/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class DTOCarrera {
    private final Long legajo;
    private final String estadoAcademico;
    @SerializedName("carreraSimple")
    private final CarreraSimple carreraSimple;
    private final Date fechaIngreso;
    private  final Date fechaBaja;

    public DTOCarrera(Long legajo, String estadoAcademico, CarreraSimple carreraSimple, Date fechaIngreso, Date fechaBaja) {
        this.legajo = legajo;
        this.estadoAcademico = estadoAcademico;
        this.carreraSimple = carreraSimple;
        this.fechaIngreso = fechaIngreso;
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
