/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;

import Modelo.Agente.Agente;
import java.util.List;

/**
 *
 * @author franco
 */
public class Cache {

    public static Cache instancia;
    public List<Agente> objetosAgenteDepositados;

    public static Cache obtenerInstancia() {
        if (instancia == null) {
            instancia = new Cache();
        }
        return instancia;
    }

    public void depositar(Object objetoAgente) {
        objetosAgenteDepositados.add((Agente) objetoAgente);
    }

    public Agente buscar(String oid) {
        Agente agenteEncontrado = null;
        for (Agente agente : objetosAgenteDepositados) {
            if (agente.getOid().contentEquals(oid)) {
                agenteEncontrado = agente;
            }
        }
        return agenteEncontrado;
    }
}
