/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author franco
 */
public class FabricaCriterio {
    public static FabricaCriterio instancia;

    public static FabricaCriterio getInstancia() {
        return instancia;
    }
    
    public Expresion crear(String operador, String operando, Object valor){
        Expresion a = new Criterio(operador, operando, valor);
        return a;
    }
    public Expresion crear(){
        return new CriterioCompuesto();
    }
}
