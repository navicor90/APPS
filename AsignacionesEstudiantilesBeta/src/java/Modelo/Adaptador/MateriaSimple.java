/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;

/**
 *
 * @author yanina
 */
public class MateriaSimple {
    private String nombre;

    public MateriaSimple(String nombre) {
        this.nombre = nombre;
    }

    public MateriaSimple() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
