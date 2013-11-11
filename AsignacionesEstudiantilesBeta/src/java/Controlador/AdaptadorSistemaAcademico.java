/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOMateria;
import java.util.List;

/**
 *
 * @author yanina
 */
public interface AdaptadorSistemaAcademico {
    public List<DTOMateria> ObtenerDatosEstadoAcademico(int dni);
    public List<DTOEstadoAcademicoGeneral> VerificarRegularidadEstudiante(String tipoLegajo, int legajo);
    
}
