/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;
import java.util.List;
/**
 *
 * @author franco
 */
public class Cache {
    public static Cache instancia;
    public List<Object> deposita;
    public static Cache obtenerInstancia(){
        if(instancia == null) instancia = new Cache();
        return instancia;
    }
    public void depositar(List<Object> ob){
        deposita = ob;
    }
}
