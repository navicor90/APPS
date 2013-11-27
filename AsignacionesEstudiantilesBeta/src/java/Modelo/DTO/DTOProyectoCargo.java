/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;

import java.util.Date;

/**
 *
 * @author yanina
 */
public class DTOProyectoCargo {
    private String descripcion;
    private double horasDedicadas;
    private int nroProyectoCargo;
    private String nombreProyectoCargo;
    private boolean Selected;

    public boolean isSelected() {
        return Selected;
    }

    public void setSelected(boolean Selected) {
        this.Selected = Selected;
    }

    public String getNombreProyectoCargo() {
        return nombreProyectoCargo;
    }

    public void setNombreProyectoCargo(String nombreProyectoCargo) {
        this.nombreProyectoCargo = nombreProyectoCargo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getHorasDedicadas() {
        return horasDedicadas;
    }

    public void setHorasDedicadas(double horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    public int getNroProyectoCargo() {
        return nroProyectoCargo;
    }

    public void setNroProyectoCargo(int nroProyectoCargo) {
        this.nroProyectoCargo = nroProyectoCargo;
    }
    
}
