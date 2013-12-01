/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Adaptador;

import Modelo.Adaptador.CarreraSimple;
import java.util.List;

/**
 *
 * @author yanina
 */
public class DTOEstadoAcademicoDetallado {
    private String legajo;
    private CarreraSimple carreraSimple;
    private List<EstudianteMateriaSimple> estudianteMateriaSimple;

    public DTOEstadoAcademicoDetallado() {
    }

    public DTOEstadoAcademicoDetallado(String legajo, CarreraSimple carreraSimple, List<EstudianteMateriaSimple> estudianteMateriaSimple) {
        this.legajo = legajo;
        this.carreraSimple = carreraSimple;
        this.estudianteMateriaSimple = estudianteMateriaSimple;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
    public CarreraSimple getCarreraSimple() {
        return carreraSimple;
    }

    public void setCarreraSimple(CarreraSimple carreraSimple) {
        this.carreraSimple = carreraSimple;
    }

    public List<EstudianteMateriaSimple> getEstudianteMateriaSimple() {
        return estudianteMateriaSimple;
    }

    public void setEstudianteMateriaSimple(List<EstudianteMateriaSimple> estudianteMateriaSimple) {
        this.estudianteMateriaSimple = estudianteMateriaSimple;
    }
    
}
