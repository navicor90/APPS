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
    String oid;
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

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }
    
}
