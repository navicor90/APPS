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
    private String oid;
    private boolean esNuevo;
    private boolean modificado;

    public Agente() {
        esNuevo = false;
        modificado = false;
    }
    
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

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
    
}
