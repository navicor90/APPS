/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;

import java.io.Serializable;

/**
 *
 * @author yanina
 */
public class DTOPostulacionProyectoCargo implements Serializable {
    private String descripcionEstado;
    private int nroProyecto;
    private int nroProyectoCargo;
    private int prioridad;
    private String nomProyecto;
    private String nomProyectoCargo;

    public String getNomProyectoCargo() {
        return nomProyectoCargo;
    }

    public void setNomProyectoCargo(String nomProyectoCargo) {
        this.nomProyectoCargo = nomProyectoCargo;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }
    
    
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public int getNroProyecto() {
        return nroProyecto;
    }

    public void setNroProyecto(int nroProyecto) {
        this.nroProyecto = nroProyecto;
    }


    public int getNroProyectoCargo() {
        return nroProyectoCargo;
    }

    public void setNroProyectoCargo(int nroProyectoCargo) {
        this.nroProyectoCargo = nroProyectoCargo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
        @Override
        public boolean equals(Object obj) {
                if(obj == null)
                        return false;
                if(!(obj instanceof DTOPostulacionProyectoCargo))
                        return false;
                
                return ((DTOPostulacionProyectoCargo)obj).getPrioridad() == this.prioridad;
        }

        @Override
        public int hashCode() {
            int hash = 1;
            return hash * 31 + nomProyecto.hashCode();
        }

        @Override
        public String toString() {
                return nomProyecto;
        }
}
