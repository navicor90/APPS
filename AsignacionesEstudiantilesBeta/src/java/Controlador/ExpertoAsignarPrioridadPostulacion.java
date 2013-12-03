/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Controlador.Persistencia.FachadaPersistencia;
import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOPostulacionProyectoCargo;
import Modelo.Expresion;
import Modelo.FabricaCriterio;
import Modelo.interfaces.Estudiante;
import Modelo.interfaces.Postulacion;
import java.util.List;
import Modelo.interfaces.Contrato;
/**
 *
 * @author franco
 */
public class ExpertoAsignarPrioridadPostulacion {
    
    Estudiante estudiante;
    int codUniversidad;
    
    public ExpertoAsignarPrioridadPostulacion() {
    }
    
    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, int codigo){
        this.codUniversidad = codigo;
        Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajoEstudiante", "=", legajo.toString());
        List<Estudiante> estudiantesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
        estudiante = null;
        if (estudiantesList != null) {
            for (Estudiante e : estudiantesList) {
                if(e.getUniversidad().getCodigo() == codUniversidad){
                    estudiante = e;
                }
            }
        } else {
            return null;
        }
        AdaptadorSistemaAcademico adaptadorSA = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad);
        List<DTOEstadoAcademicoGeneral> estadoAcademicoGeneralList = adaptadorSA.obtenerEstadoAcademicoGeneral(estudiante.getTipoDni(), estudiante.getDni());
        Boolean esRegular = false;
        for (DTOEstadoAcademicoGeneral estadoAcademicoGeneral : estadoAcademicoGeneralList) {
            if (estadoAcademicoGeneral.getEstadoAcademico().contentEquals("esRegular")) {
                esRegular = true;
            }
        }
        if(esRegular){
            Expresion criterioBusquedaPostulaciones = FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
            List<Postulacion> postulacionesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulaciones);
                    for (Postulacion postulacion : postulacionesList) {
                       Expresion criterioBusquedaContrato = FabricaCriterio.getInstancia().crear("postulacion", "=", postulacion);
                       List<Contrato> contratoList = (List) FachadaPersistencia.obtenerInstancia().buscar("Contrato", criterioBusquedaContrato);//puedo manejarlo como un contrato solo o tengo que hacer lstaDeContrato.get(0)??
                       Contrato contrato = contratoList.get(0);
                       if(contrato != null){
                            //Expresion criterioBusquedaContratoEstado = FabricaCriterio.getInstancia().crear("contrato", "=", contrato);
                            //List<ContratoEstado> contratoEstadoList = (List) contrato.g;
                                for (ContratoEstado contratoEstado : contratoEstadoList) {
                                    Expresion criterioBusquedaEstadoContrato = FabricaCriterio.getInstancia().crear("contratoEstado", "=", contratoEstado);
                                    EstadoContrato estadoContratoList = (List) FachadaPersistencia.obtenerInstancia().buscar("EstadoContrato", criterioBusquedaEstadoContrato);
                            }
                            
                        }
        }                  
    }
    
}
