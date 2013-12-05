/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FachadaPersistencia;
import Modelo.DTO.*;
import Modelo.*;
import java.util.List;
import Modelo.interfaces.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author franco
 */
public class ExpertoAsignarPrioridadPostulacion {

    private Estudiante estudiante;
    private long codUniversidad;
    private String legajo;

    public ExpertoAsignarPrioridadPostulacion() {
    }

    public List<DTOPostulacionProyectoCargo> listarPostulaciones(String legajo, int codigo) throws ExceptionAPPS {
        this.codUniversidad = codigo;
        this.legajo = legajo;
        Expresion expresionBusquedaEstadoAcademico = FabricaCriterio.getInstancia().crear("legajo", "=", legajo.toString());
        List<EstadoAcademico> estadoAcademicoList = (List) FachadaPersistencia.obtenerInstancia().buscar("EstadoAcademico", expresionBusquedaEstadoAcademico);
        EstadoAcademico estadoAcademico = null;
        if (estadoAcademicoList.isEmpty()) {
            throw new ExceptionAPPS(Mensajes.LEGAJO_NO_ENCONTRADO);
        }
        for (EstadoAcademico ea : estadoAcademicoList) {
            if (ea.getCarrera().getUniversdad().getCodigo() == codUniversidad) {
                estadoAcademico = ea;
            }
        }
        if (estadoAcademico.getCarrera().getUniversdad().getFechaFinVigenciaUniversidad().before(new Date())) {
            throw new ExceptionAPPS(Mensajes.UNIVERSIDAD_INACTIVA);
        }
        Criterio criterioBusquedaEstudiante = (Criterio) FabricaCriterio.getInstancia().crear("estadoAcademico", "=", estadoAcademico);
        List<Estudiante> estudianteList = (List) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", criterioBusquedaEstudiante);
        estudiante = estudianteList.get(0);
        if (estudiante.getEstadoEstudiante().getNombreTipoEstadoEstudiante().contentEquals("Inactivo")) {
            throw new ExceptionAPPS(Mensajes.ESTUDIANTE_INACTIVO);
        }
        AdaptadorSistemaAcademico adaptadorSA = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad);
        List<DTOEstadoAcademicoGeneral> estadoAcademicoGeneralList = adaptadorSA.obtenerEstadoAcademicoGeneral(estudiante.getTipoDni(), estudiante.getDni());
        Boolean esRegular = false;
        for (DTOEstadoAcademicoGeneral estadoAcademicoGeneral : estadoAcademicoGeneralList) {
            if (estadoAcademico.getCarrera().getNombreCarrera().contentEquals(estadoAcademicoGeneral.getNombreCarrera())) {
                if (estadoAcademicoGeneral.getEstadoAcademico().contentEquals("regular")) {
                    esRegular = true;
                }
            }
        }
        List<DTOPostulacionProyectoCargo> dtoPostulacionProyectoCargoListArmada = new ArrayList<>();
        if (!esRegular) {
            throw new ExceptionAPPS(Mensajes.NO_REGULAR);
        }
        Expresion criterioBusquedaPostulaciones = FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
        List<Postulacion> postulacionesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulaciones);
        for (Postulacion postulacion : postulacionesList) {
            Expresion criterioBusquedaContrato = FabricaCriterio.getInstancia().crear("postulacion", "=", postulacion);
            List<Contrato> contratoList = (List) FachadaPersistencia.obtenerInstancia().buscar("Contrato", criterioBusquedaContrato);
            if (!contratoList.isEmpty()) {
                for (Contrato contrato : contratoList) {
                    List<ContratoEstado> contratoEstadoList = (List) contrato.getContratoEstadoList();
                    ContratoEstado ultimoContratoEstado = getUltimoContratoEstado(contratoEstadoList);
                    TipoEstadoContrato estadoContrato = ultimoContratoEstado.getTipoEstadoContrato();
                    if (estadoContrato.getNombreEstadoContrato().contentEquals("vigente")) {
                        throw new ExceptionAPPS(Mensajes.ASIGNARPRIORIDAD_ERROR_POSEE_CONTRATO_VIGENTE);
                    }
                }
            }
            List<PostulacionProyectoCargo> postulacionProyectoCargoList = (List) postulacion.getPostulacionProyectoCargosList();
            for (PostulacionProyectoCargo postulacionProyectoCargo : postulacionProyectoCargoList) {
                List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstadoList = (List) postulacionProyectoCargo.getPostulacionProyectoCargoEstadoList();
                PostulacionProyectoCargoEstado ultimoPostulacionProyectoCargoEstado = getUltimoEstadoPostulacionProyectoCargoEstado(postulacionProyectoCargoEstadoList);
                if (ultimoPostulacionProyectoCargoEstado.getTipoEstadoPostulacionProyectoCargo().getNombreEstado().contentEquals("Efectiva")) {
                    //verifico que el proyecto que ofrece el cargo para el cual se postulo este vigente o activo
                    ProyectoCargo proyectoCargo = postulacionProyectoCargo.getProyectoCargo();
                    Proyecto proyecto = postulacionProyectoCargo.getProyecto();
                    List<ProyectoEstado> proyectoEstadoList = proyecto.getProyectoEstado();
                    //busco el ultimo estado del proyecto
                    ProyectoEstado ultimoProyectoEstado = getUltimoEstadoProyectoEstado(proyectoEstadoList);
                    if (ultimoProyectoEstado.getTipoEstadoProyecto().getNombreTipoEstadoProyecto().contentEquals("Vigente")) {
                        String nomProyectoCargo = proyectoCargo.getTipoCargo().getNomTipoCargo();
                        String nomProyecto = proyecto.getNombreProyecto();
                        int nroProyecto = proyecto.getCodigo();
                        int nroProyectoCargo = proyectoCargo.getNroProyectoCargo();
                        int prioridad = postulacionProyectoCargo.getPrioridad();
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

        return dtoPostulacionProyectoCargoListArmada;
    }

    public List<DTOPostulacionProyectoCargo> asignarPrioridades(List<DTOPostulacionProyectoCargo> postulacionProyectoCargosDTOList) {
        Criterio criterioBusquedaPostulacionesHabilitadas = (Criterio) FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
        List<Postulacion> postulaciones = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulacionesHabilitadas);
        List<Postulacion> postulacionesHabilitadas = new ArrayList<>();
        for (Postulacion postulacion : postulaciones) {
            for (PostulacionProyectoCargo postulacionProyectoCargo : postulacion.getPostulacionProyectoCargosList()) {
                //if (postulacionProyectoCargo.getPostulacionProyectoCargoEstadoList()) {

                //}
            }

        }

        return null;
    }

    private PostulacionProyectoCargoEstado getUltimoEstadoPostulacionProyectoCargoEstado(List<PostulacionProyectoCargoEstado> postulacionProyectoCargoEstadosList) {
        PostulacionProyectoCargoEstado ppceUltimo = postulacionProyectoCargoEstadosList.get(0);
        for (int i = 1; i < postulacionProyectoCargoEstadosList.size(); i++) {
            PostulacionProyectoCargoEstado ppce = postulacionProyectoCargoEstadosList.get(i);
            if (ppce.getFechaHoraCambio().before(ppceUltimo.getFechaHoraCambio())) {
                ppceUltimo = ppce;
            }
        }
        return ppceUltimo;
    }

    private ContratoEstado getUltimoContratoEstado(List<ContratoEstado> contratoEstadosList) {
        ContratoEstado contratoEstadoUltimo = contratoEstadosList.get(0);
        for (int i = 1; i < contratoEstadosList.size(); i++) {
            ContratoEstado ce = contratoEstadosList.get(i);
            if (ce.getFechaHoraCambioEstado().before(contratoEstadoUltimo.getFechaHoraCambioEstado())) {
                contratoEstadoUltimo = ce;
            }
        }
        return contratoEstadoUltimo;
    }

    private ProyectoEstado getUltimoEstadoProyectoEstado(List<ProyectoEstado> proyectoEstados) {
        ProyectoEstado peUltimo = proyectoEstados.get(0);
        for (int i = 1; i < proyectoEstados.size(); i++) {
            ProyectoEstado pe = proyectoEstados.get(i);
            if (pe.getFechaHoraCambio().before(peUltimo.getFechaHoraCambio())) {
                peUltimo = pe;
            }
        }
        return peUltimo;
    }
}
