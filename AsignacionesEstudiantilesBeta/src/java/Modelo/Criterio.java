/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author franco
 */
public class Criterio extends Expresion{
    private String atributo;
    private String operador;
    private Object valor;

    public Criterio() {
    }

    public Criterio(String atributo, String operador, Object valor) {
        this.atributo = atributo;
        this.operador = operador;
        this.valor = valor;
    }
    
    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    
}
