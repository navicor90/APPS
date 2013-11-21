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
public class Expresion {

    public static String desarmarExpresion(Expresion expresion) {
        if (expresion.getClass() == CriterioCompuesto.class) {
            CriterioCompuesto criterioCompuesto = (CriterioCompuesto) expresion;
            Expresion expresionIzq = criterioCompuesto.getExpresionIzq();
            Expresion expresionDer = criterioCompuesto.getExpresionDer();
            String criterioIzqString = desarmarExpresion(expresionIzq);
            String criterioDerString = desarmarExpresion(expresionDer);
            return "(" + criterioIzqString + criterioCompuesto.getOperadorLogico() + " " + criterioDerString + ")";
        } else {
            Criterio criterio = (Criterio) expresion;
            String criterioString = criterio.getAtributo() + " ";
            criterioString += criterio.getOperador() + " ";
            criterioString += criterio.getValor() + " ";
            return criterioString;
        }

    }

}
