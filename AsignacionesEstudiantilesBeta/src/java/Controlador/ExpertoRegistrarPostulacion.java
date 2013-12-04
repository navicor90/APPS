/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FabricaEntidades;
import Controlador.Persistencia.FachadaPersistencia;
import Modelo.*;
import Modelo.DTO.*;
import Modelo.interfaces.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {

    Estudiante estudiante;
    Long codUniversidad;
    String legajo;

    public List<DTOProyecto> listarProyectos(String legajo, Long codUniversidad) throws Exception {
        this.codUniversidad = codUniversidad;
        this.legajo = legajo;
        Expresion expresionBusquedaEstadoAcademico = FabricaCriterio.getInstancia().crear("legajo", "=", legajo.toString());
        List<EstadoAcademico> estadoAcademicoList = (List) FachadaPersistencia.obtenerInstancia().buscar("EstadoAcademico", expresionBusquedaEstadoAcademico);
        EstadoAcademico estadoAcademico = null;
        if (estadoAcademicoList.isEmpty()) {
            throw new Exception(Mensajes.LEGAJO_NO_ENCONTRADO);
        }
        for (EstadoAcademico ea : estadoAcademicoList) {
            if (ea.getCarrera().getUniversdad().getCodigo() == codUniversidad) {
                estadoAcademico = ea;
            }
        }
        if (estadoAcademico.getCarrera().getUniversdad().getFechaFinVigenciaUniversidad().before(new Date())) {
            throw new Exception(Mensajes.UNIVERSIDAD_INACTIVA);
        }
        Criterio criterioBusquedaEstudiante = (Criterio) FabricaCriterio.getInstancia().crear("estadoAcademico", "=", estadoAcademico);
        List<Estudiante> estudianteList = (List) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", criterioBusquedaEstudiante);
        estudiante = estudianteList.get(0);
        if (estudiante.getEstadoEstudiante().getNombreTipoEstadoEstudiante().contentEquals("Inactivo")) {
            throw new Exception(Mensajes.ESTUDIANTE_INACTIVO);
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
        if (esRegular) {
            DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fechaActualConvertida = fechaHora.format(new Date());
            Expresion expresionBusquedaProyectos = FabricaCriterio.getInstancia().crear("FechaInicioProyecto", ">", fechaActualConvertida);
            List<Proyecto> ProyectosList = (List) FachadaPersistencia.obtenerInstancia().buscar("Proyecto", expresionBusquedaProyectos);
            List<DTOProyecto> proyectoDTOList = new ArrayList<>();
            for (Proyecto proyecto : ProyectosList) {
                DTOProyecto proyectoDTO = new DTOProyecto();
                proyectoDTO.setDescripcion(proyecto.getDescripcion());
                proyectoDTO.setDuracion(proyecto.getDuracion());
                proyectoDTO.setFechaInicio(proyecto.getFechaInicio());
                proyectoDTO.setNomProyecto(proyecto.getNombreProyecto());
                proyectoDTO.setCodigo(proyecto.getCodigo());
                proyectoDTOList.add(proyectoDTO);
            }
            return proyectoDTOList;
        }
        throw new Exception(Mensajes.NO_REGULAR);
    }

    public List<DTOProyectoCargo> listarProyectoCargos(Integer codigoProyecto) {
        Criterio criterioBusquedaProyecto = (Criterio) FabricaCriterio.getInstancia().crear("codigoProyecto", "=", codigoProyecto.toString());
        List<Proyecto> proyectosList = (List) FachadaPersistencia.obtenerInstancia().buscar("Proyecto", criterioBusquedaProyecto);
        Proyecto proyecto = proyectosList.get(0);
        List<ProyectoCargo> proyectoCargosList = proyecto.getProyectoCargoList();
        List<DTOProyectoCargo> proyectoCargosDTOList = new ArrayList<>();
        for (ProyectoCargo proyectoCargo : proyectoCargosList) {
            DTOProyectoCargo proyectoCargoDTO = new DTOProyectoCargo();
            proyectoCargoDTO.setNroProyectoCargo(proyectoCargo.getNroProyectoCargo());
            proyectoCargoDTO.setNombreProyectoCargo(proyectoCargo.getTipoCargo().getNomTipoCargo());
            proyectoCargoDTO.setDescripcion(proyectoCargo.getDescripcion());
            proyectoCargoDTO.setHorasDedicadas(proyectoCargo.getHorasDedicadas());
            proyectoCargosDTOList.add(proyectoCargoDTO);
        }
        return proyectoCargosDTOList;
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesProyectoCargoDTOList) {
        Postulacion postulacion = (Postulacion) FabricaEntidades.getInstancia().crearEntidad(Postulacion.class);
        postulacion.setFechaHoraPostulacion(new Date());
        //Asignar el numero de postulacion
        postulacion.setNroPostulacion(this.AsignarNroPostulacion());
        List<DTOEstadoAcademicoGeneral> estadoAcademicoGeneralList = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad).obtenerEstadoAcademicoGeneral(estudiante.getTipoDni(), estudiante.getDni());
        List<DTOMateria> materiaDTO = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad).ObtenerEstadoAcademicoDetallado(legajo);
        int cantidadMateriasRendidas = contarMateriasAprobadas(materiaDTO);
        int cantidadMateriasRegulares = contarMateriasRegulares(materiaDTO);
        postulacion.setEstudiante(estudiante);
        for (DTOPostulacionProyectoCargo postulacionProyectoCargoDTO : postulacionesProyectoCargoDTOList) {
            PostulacionProyectoCargo postulacionProyectoCargo = (PostulacionProyectoCargo) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargo.class);
            Expresion criterioBusquedaProyecto = FabricaCriterio.getInstancia().crear("codigoProyecto", "=", Integer.toString(postulacionProyectoCargoDTO.getNroProyecto()));
            List<Proyecto> proyectosList = (List) FachadaPersistencia.obtenerInstancia().buscar("Proyecto", criterioBusquedaProyecto);
            Proyecto proyecto = proyectosList.get(0);
            for (ProyectoCargo proyectoCargo : proyecto.getProyectoCargoList()) {
                if (proyectoCargo.getNroProyectoCargo() == postulacionProyectoCargoDTO.getNroProyectoCargo()) {
                    postulacionProyectoCargo.setProyecto(proyecto);
                    postulacionProyectoCargo.setProyectoCargo(proyectoCargo);
                    int cantidadMateriasRendidasSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRendidas();
                    int cantidadMateriasRegularesSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRegulares();
                    postulacionProyectoCargo.setCantidadMateriasAprobadasEstudiante(cantidadMateriasRendidas);
                    postulacionProyectoCargo.setCantidadMateriasRegulares(cantidadMateriasRegulares);
                    postulacionProyectoCargo.setPrioridad(0);
                    PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = (PostulacionProyectoCargoEstado) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargoEstado.class);
                    postulacionProyectoCargoEstado.setFechaHoraCambio(new Date());
                    //validamos que no se haya registrado una postulacion, en otra ocasion para el mismo proyectoCargo
                    Expresion criterioBusquedaPostulaciones = FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
                    List<Postulacion> postulacionesAntiguasList = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulaciones);

                    for (Postulacion postulacionAntigua : postulacionesAntiguasList) {
                        for (PostulacionProyectoCargo postulacionProyectoCargoAntigua : postulacionAntigua.getPostulacionProyectoCargosList()) {
                            if (postulacionProyectoCargoAntigua.getProyecto().getCodigo() == postulacionProyectoCargoDTO.getNroProyecto()) {
                                if (postulacionProyectoCargoAntigua.getProyectoCargo().getNroProyectoCargo() == postulacionProyectoCargoDTO.getNroProyectoCargo()) {
                                    postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_ERROR_YA_SE_ENCUENTRA_POSTULADO_A_ESTE_CARGO);
                                    Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Fallida");
                                    List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                    TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                    postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                                }
                            }
                        }
                    }
                    //registramos las postulaciones a nuevos proyectoCargo
                    if (postulacionProyectoCargoDTO.getDescripcionEstado() == null) {

                        if (cantidadMateriasRendidasSolicitadas <= cantidadMateriasRendidas) {
                            if ((cantidadMateriasRendidas - cantidadMateriasRendidasSolicitadas) >= cantidadMateriasRegularesSolicitadas) {
                                postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_EXITOSA);
                                Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Efectiva");
                                List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);

                            } else {
                                if (cantidadMateriasRegulares >= cantidadMateriasRegularesSolicitadas) {
                                    postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_EXITOSA);
                                    Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Efectiva");
                                    List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                    TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                    postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                                } else {
                                    postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_ERROR_NO_CUMPLE_CONDICIONES);
                                    Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Fallida");
                                    List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                    TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                    postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                                }
                            }
                        } else {
                            postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_ERROR_NO_CUMPLE_CONDICIONES);
                            Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Fallida");
                            List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                            TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                            postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                        }
                    }
                    postulacionProyectoCargo.addPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
                }

            }
            postulacion.addPostulacionProyectoCargo(postulacionProyectoCargo);
        }
        FachadaPersistencia.obtenerInstancia().guardar("Postulacion", postulacion);

        return postulacionesProyectoCargoDTOList;
    }

    private int AsignarNroPostulacion() {
        int nroPostulacion = 0;
        Criterio c = (Criterio) FabricaCriterio.getInstancia().crear("codigoPostulacion", ">", "0");
        List<Postulacion> postuluaciones = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", c);
        Iterator iteratorPost = postuluaciones.iterator();
        nroPostulacion = 0;
        for (int i = 0; i < postuluaciones.size(); i++) {
            Postulacion postulacion = postuluaciones.get(i);
            if (nroPostulacion <= postulacion.getNroPostulacion()) {
                nroPostulacion = postulacion.getNroPostulacion() + 1;
            }
        }
        return nroPostulacion;
    }

    private int contarMateriasRegulares(List<DTOMateria> materiasList) {
        int contador = 0;
        for (DTOMateria materiaDTO : materiasList) {
            if ("esRegular".equals(materiaDTO.getEstadoMateria())) {
                contador++;
            }
        }
        return contador;
    }

    private int contarMateriasAprobadas(List<DTOMateria> materiasList) {
        int contador = 0;
        for (DTOMateria materiaDTO : materiasList) {
            if ("esAprobada".equals(materiaDTO.getEstadoMateria())) {
                contador++;
            }
        }
        return contador;
    }
}
