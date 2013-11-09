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
class DTOProyectoCargo {
    private String descripcion;
    private Date horasDedicadas;
    private int nroProyectoCargo;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getHorasDedicadas() {
        return horasDedicadas;
    }

    public void setHorasDedicadas(Date horasDedicadas) {
        this.horasDedicadas = horasDedicadas;
    }

    public int getNroProyectoCargo() {
        return nroProyectoCargo;
    }

    public void setNroProyectoCargo(int nroProyectoCargo) {
        this.nroProyectoCargo = nroProyectoCargo;
    }
    
}
