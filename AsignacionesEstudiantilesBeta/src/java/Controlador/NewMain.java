/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.*;
/**
 *
 * @author yanina
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expresion expresion = generarExp();
        String sql="SELECT * FROM Estudiantes WHERE "+ Expresion.desarmarExpresion(expresion);
        System.out.println(sql);
        
    }
    
    
    public static Expresion generarExp(){
        Criterio e1 = new Criterio();
        e1.setAtributo("nombre");
        e1.setOperador("=");
        e1.setValor("ivan");
        Criterio e2 = new Criterio();
        e2.setAtributo("edad");
        e2.setOperador("<");
        e2.setValor("28");
        CriterioCompuesto e3 = new CriterioCompuesto();
        e3.setOperadorLogico("&&");
        e3.setExpresionIzq(e1);
        e3.setExpresionDer(e2);
        Criterio e4 = new Criterio();
        e4.setAtributo("dinero");
        e4.setOperador("<");
        e4.setValor("20");
        CriterioCompuesto e5 = new CriterioCompuesto();
        e5.setExpresionDer(e3);
        e5.setExpresionIzq(e4);
        e5.setOperadorLogico("&&");
        return e5;
    }
    
    
}
