/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franco
 */
public class Cache {

    public static Cache instancia;
    public List<Agente> objetosAgenteDepositados;

    public Cache() {
        objetosAgenteDepositados= new ArrayList<>();
    }
    
    
    public static Cache obtenerInstancia() {
        if (instancia == null) {
            instancia = new Cache();
        }
        return instancia;
    }

    public void depositar(Agente objetoAgente) {
        objetosAgenteDepositados.add(objetoAgente);
    }

    public Agente buscar(String oid) {
        Agente agenteEncontrado = null;
        
        for (Agente agente : objetosAgenteDepositados) {
            System.out.println(agente.getOid()+"ooooooiodddddd");
            System.out.println(oid+"laaaaaaaaaaaa oid");
            if (agente.getOid().contentEquals(oid)) {
                agenteEncontrado = agente;
            }
        }
        return agenteEncontrado;
    }
}
