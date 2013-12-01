/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author yanina
 */
public class CarreraSimple {
    @SerializedName("nombre")
    private String nombreCarrera;

    public CarreraSimple() {
    }

    public CarreraSimple(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    public String getNombreCarrera() {
        return nombreCarrera;
    }
    
}
