/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author yanina
 */
public class CarreraSimple {
    @SerializedName("nombre")
    private final String nombreCarrera;

    public CarreraSimple(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }
    
}
