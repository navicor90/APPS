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
import Modelo.interfaces.ContratoEstado;
import Modelo.interfaces.PostulacionProyectoCargo;
import Modelo.interfaces.PostulacionProyectoCargoEstado;
import Modelo.interfaces.Proyecto;
import Modelo.interfaces.ProyectoCargo;
import Modelo.interfaces.ProyectoEstado;
import Modelo.interfaces.TipoEstadoContrato;
import Modelo.interfaces.TipoEstadoPostulacionProyectoCargo;
import Modelo.interfaces.TipoEstadoProyecto;
import java.util.ArrayList;

/**
 *
 * @author franco
 */
public class ExpertoAsignarPrioridadPostulacion {

    private Estudiante estudiante;
    private long codUniversidad;

    public ExpertoAsignarPrioridadPostulacion() {
    }

    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, int codigo) throws Exception {
        List<DTOPostulacionProyectoCargo> dtoPostulacionProyectoCargoListArmada = new ArrayList<>();
        this.codUniversidad = codigo;
        Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajoEstudiante", "=", legajo.toString());
        List<Estudiante> estudiantesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
        estudiante = null;
        if (estudiantesList != null) {
            for (Estudiante e : estudiantesList) {
                if (e.getUniversidad().getCodigo() == codUniversidad) {
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
        if (esRegular) {
            Expresion criterioBusquedaPostulaciones = FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
            List<Postulacion> postulacionesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulaciones);
            for (Postulacion postulacion : postulacionesList) {
                Expresion criterioBusquedaContrato = FabricaCriterio.getInstancia().crear("postulacion", "=", postulacion);
                List<Contrato> contratoList = (List) FachadaPersistencia.obtenerInstancia().buscar("Contrato", criterioBusquedaContrato);
                Contrato contrato = contratoList.get(0);
                if (contrato != null) {
                    List<ContratoEstado> contratoEstadoList = (List) contrato.getContratoEstadoList();
                    ContratoEstado ultimoContratoEstado = contratoEstadoList.get(0);
                    for (int i = 1; i < contratoEstadoList.size(); i++) {
                        ContratoEstado contratoEstado = contratoEstadoList.get(i);
                        if (contratoEstado.getFechaHoraCambioEstado().after(ultimoContratoEstado.getFechaHoraCambioEstado())) {
                            ultimoContratoEstado = contratoEstado;
                        }
                    }
                    TipoEstadoContrato estadoContrato = ultimoContratoEstado.getTipoEstadoContrato();
                    if (estadoContrato.getNombreEstadoContrato().contentEquals("vigente")) {
                        throw new Exception(Mensajes.ASIGNARPRIORIDAD_ERROR_POSEE_CONTRATO_VIGENTE);
                    }
                }

                List<PostulacionProyectoCargo> postulacionProyectoCargoList = (List) postulacion.getPostulacionProyectoCargosList();
                for (PostulacionProyectoCargo postulacionProyectoCargo : postulacionProyectoCargoList) {
                    List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstadoList = (List) postulacionProyectoCargo.getPostulacionProyectoCargoEstadoList();
                    PostulacionProyectoCargoEstado ultimoPostulacionProyectoCargoEstado = postulacionProyectoCargoEstadoList.get(0);
                    // bucle para encontrar el estado de la postulacionProyectoCargo mas reciente
                    for (int i = 1; i < postulacionProyectoCargoEstadoList.size(); i++) {
                        PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = postulacionProyectoCargoEstadoList.get(i);
                        if (postulacionProyectoCargoEstado.getFechaHoraCambio().after(ultimoPostulacionProyectoCargoEstado.getFechaHoraCambio())) {
                            ultimoPostulacionProyectoCargoEstado = postulacionProyectoCargoEstado;
                        }
                    }
                    TipoEstadoPostulacionProyectoCargo estadoPostulacionProyectoCargo = ultimoPostulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo();
                        if (estadoPostulacionProyectoCargo.getNombreEstado().contentEquals("Efectiva")) {
                            //verifico que el proyecto que ofrece el cargo para el cual se postulo este vigente o activo
                            ProyectoCargo proyectoCargo = postulacionProyectoCargo.getProyectoCargo();
                            Expresion criterioBusquedaProyecto = FabricaCriterio.getInstancia().crear("proyectoCargo", "=", proyectoCargo);
                            List<Proyecto> proyectosList = (List) FachadaPersistencia.obtenerInstancia().buscar("Proyecto", criterioBusquedaProyecto);
                            Proyecto proyecto = proyectosList.get(0);
                            List<ProyectoEstado> proyectoEstadoList = proyecto.getProyectoEstado();
                            //busco el ultimo estado del proyecto
                            ProyectoEstado ultimoProyectoEstado = proyectoEstadoList.get(0);
                            for (int j = 1; j < proyectoEstadoList.size(); j++) {
                                ProyectoEstado proyectoEstado = proyectoEstadoList.get(j);
                                if (proyectoEstado.getFechaHoraCambio().after(ultimoProyectoEstado.getFechaHoraCambio())) {
                                    ultimoProyectoEstado = proyectoEstado;
                                }
                            }
                            TipoEstadoProyecto estadoProyecto = ultimoProyectoEstado.getTipoEstadoProyecto();
                            if(estadoProyecto.getNombreTipoEstadoProyecto().contentEquals("Vigente")){
                                int nroProyecto = proyecto.getCodigo();
                                String nomProyectoCargo = proyectoCargo.getTipoCargo().getNomTipoCargo();
                                String nomProyecto = proyecto.getNombreProyecto();
                                int prioridad = postulacionProyectoCargo.getPrioridad();
                                int nroProyectoCargo = proyectoCargo.getNroProyectoCargo();               
                                DTOPostulacionProyectoCargo dtoPostulacionProyectoCargo = new DTOPostulacionProyectoCargo();                       
                                dtoPostulacionProyectoCargo.setNroProyecto(nroProyecto);
                                dtoPostulacionProyectoCargo.setPrioridad(prioridad);
                                dtoPostulacionProyectoCargo.setNomProyecto(nomProyecto);
                                dtoPostulacionProyectoCargo.setNroProyectoCargo(nroProyectoCargo);
                                dtoPostulacionProyectoCargo.setNomProyectoCargo(nomProyectoCargo);
                                dtoPostulacionProyectoCargoListArmada.add(dtoPostulacionProyectoCargo);
                            }
                        }                    
                }
            }
        }
        return dtoPostulacionProyectoCargoListArmada;
    }
}
