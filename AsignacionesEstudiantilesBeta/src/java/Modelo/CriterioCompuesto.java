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
public class CriterioCompuesto extends Expresion{
    private String operadorLogico;
    private Expresion expresionIzq;
    private Expresion expresionDer;

    public CriterioCompuesto() {
    }

    public String getOperadorLogico() {
        return operadorLogico;
    }

    public void setOperadorLogico(String operadorLogico) {
        this.operadorLogico = operadorLogico;
    }

    public Expresion getExpresionIzq() {
        return expresionIzq;
    }

    public void setExpresionIzq(Expresion expresionIzq) {
        this.expresionIzq = expresionIzq;
    }

    public Expresion getExpresionDer() {
        return expresionDer;
    }

    public void setExpresionDer(Expresion expresionDer) {
        this.expresionDer = expresionDer;
    }
   
}
