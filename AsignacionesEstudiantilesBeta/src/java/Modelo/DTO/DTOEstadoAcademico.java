/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.DTO;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class DTOEstadoAcademico {
 @SerializedName("stadoacademicoSimple")
 private final List<DTOCarrera> dtoCarrera;


    public DTOEstadoAcademico(List<DTOCarrera> dtoCarrera) {
        System.out.println("hola2");
        this.dtoCarrera = dtoCarrera;
    }

    public List<DTOCarrera> getDtoCarrera() {
        return dtoCarrera;
    }
    
    
}
