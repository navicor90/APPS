/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Agente;

/**
 *
 * @author franco
 */
public class Agente {
    boolean esNuevo;
    boolean modificado;

    public boolean seHaModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    
    public boolean esNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    
}
