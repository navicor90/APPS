/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanina
 */
public class DTOEstadoAcademico {
 //@SerializedName(" estadoacademicoSimple")
 private List<DTOCarrera> estadoacademicoSimple;

    public DTOEstadoAcademico(List<DTOCarrera> estasoAcademicoSimple) {
        this.estadoacademicoSimple = estasoAcademicoSimple;
    }

    public List<DTOCarrera> getEstadoacademicoSimple() {
        return estadoacademicoSimple;
    }

    public void setEstadoacademicoSimple(List<DTOCarrera> estadoacademicoSimple) {
        this.estadoacademicoSimple = estadoacademicoSimple;
    }
    
    
    

    
}
