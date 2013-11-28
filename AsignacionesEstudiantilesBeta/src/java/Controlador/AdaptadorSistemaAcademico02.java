/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOMateria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author yanina
 */
public class AdaptadorSistemaAcademico02 implements AdaptadorSistemaAcademico{

    @Override
    public List<DTOMateria> ObtenerEstadoAcademicoDetallado(String legajo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DTOEstadoAcademicoGeneral> obtenerEstadoAcademicoGeneral(String tipoDni, long dni) {
        List<DTOEstadoAcademicoGeneral> estadosAcademicosGeneral = new ArrayList<>();
        DTOEstadoAcademicoGeneral estadoAcademicoGeneral = new DTOEstadoAcademicoGeneral();
        estadoAcademicoGeneral.setCarrera("Sistemas");
        estadoAcademicoGeneral.setEstadoAcademico("esRegular");
        Date fechaIngreso = new Date();
        fechaIngreso.setDate(10);
        fechaIngreso.setMonth(01);
        fechaIngreso.setYear(2010);
        estadoAcademicoGeneral.setFechaDeIngreso(fechaIngreso);
        estadosAcademicosGeneral.add(estadoAcademicoGeneral);
        return estadosAcademicosGeneral;
    }
    
    
}
