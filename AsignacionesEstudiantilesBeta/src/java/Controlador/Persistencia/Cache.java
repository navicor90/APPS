/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

/**
 *
 * @author franco
 */
public class Cache {
    public static Cache instancia;
    public Agente deposita;
    public static Cache obtenerInstancia(){
        if(instancia == null) instancia = new Cache();
        return instancia;
    }
    public void depositar(Agente ag){
        deposita = ag;
    }
}
