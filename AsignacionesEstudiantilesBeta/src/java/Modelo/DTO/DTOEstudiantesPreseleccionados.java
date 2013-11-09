/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;

/**
 *
 * @author yanina
 */
public class DTOEstudiantesPreseleccionados {
    private int codUniversidad;
    private Void fechaHoraPostulacion;
    private int legajo;
    private int dni;
    private String tipoDni;

    public int getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(int codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public Void getFechaHoraPostulacion() {
        return fechaHoraPostulacion;
    }

    public void setFechaHoraPostulacion(Void fechaHoraPostulacion) {
        this.fechaHoraPostulacion = fechaHoraPostulacion;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }
    
    
    
}
