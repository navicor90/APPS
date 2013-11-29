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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {

    Estudiante estudiante;
    int codUniversidad;

    public List<DTOProyecto> listarProyectos(Long legajo, int codUniversidad){
        this.codUniversidad = codUniversidad;
        Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajoEstudiante", "=", legajo.toString());
        List<Object> estudiantesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
        estudiante = null;
        if (estudiantesList != null) {
            estudiante = (Estudiante) estudiantesList.get(0);
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
            Date fechaActualD = new Date();
            String fechaActual = "";
            int año = fechaActualD.getYear() + 1900;
            fechaActual += año + "-";
            int mes = fechaActualD.getMonth() + 1;
            fechaActual += mes + "-";
            int dia = fechaActualD.getDate() + 1;
            fechaActual += dia;
            Expresion expresionBusquedaProyectos = FabricaCriterio.getInstancia().crear("FechaInicioProyecto", ">", fechaActual);
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
        return null;
    }

    public List<DTOProyectoCargo> listarProyectoCargos(Integer codigoProyecto){
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

    public Date obtenerFechaYHoraActuales() {
        return new Date();
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesProyectoCargoDTOList) {
        Expresion criterioBusquedaPostulaciones = FabricaCriterio.getInstancia().crear("estudiante", "=", estudiante);
        List<Postulacion> postulacionesList = (List) FachadaPersistencia.obtenerInstancia().buscar("Postulacion", criterioBusquedaPostulaciones);
        Postulacion postulacion = (Postulacion) FabricaEntidades.getInstancia().crearEntidad(Postulacion.class);
        for (DTOPostulacionProyectoCargo postulacionProyectoCargoDTO : postulacionesProyectoCargoDTOList) {
            PostulacionProyectoCargo postulacionProyectoCargo = (PostulacionProyectoCargo) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargo.class);
            //validamos que no se haya registrado una postulacion, en otra ocasion para el mismo proyectoCargo
            for (Postulacion postulacionAntigua : postulacionesList) {
                System.out.println(postulacionAntigua.getNroPostulacion()+"--------------------");
                for (PostulacionProyectoCargo postulacionProyectoCargoAntigua : postulacionAntigua.getProyectoCargosList()) {
                    if (postulacionProyectoCargoAntigua.getProyecto().getCodigo() == postulacionProyectoCargoDTO.getNroProyecto()) {
                        if (postulacionProyectoCargoAntigua.getProyectoCargo().getNroProyectoCargo() == postulacionProyectoCargoDTO.getNroProyectoCargo()) {
                            postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_ERROR_YA_SE_ENCUENTRA_POSTULADO_A_ESTE_CARGO);
                            postulacionProyectoCargo.setProyecto(postulacionProyectoCargoAntigua.getProyecto());
                            postulacionProyectoCargo.setProyectoCargo(postulacionProyectoCargoAntigua.getProyectoCargo());
                            Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Fallida");
                            List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                            TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                            PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = (PostulacionProyectoCargoEstado) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargoEstado.class);
                            postulacionProyectoCargoEstado.setFechaHoraCambio(new Date());
                            postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                            postulacionProyectoCargo.addPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
                        }
                    }
                }
            }
            //registramos las postulaciones a nuevos proyectoCargo
            System.out.println("registramos las postulaciones a nuevos proyectoCargo");
            if (postulacionProyectoCargoDTO.getDescripcionEstado() == null) {
                Expresion criterioBusquedaProyecto = FabricaCriterio.getInstancia().crear("codigoProyecto", "=", Integer.toString(postulacionProyectoCargoDTO.getNroProyecto()));
                List<Proyecto> proyectosList = (List) FachadaPersistencia.obtenerInstancia().buscar("Proyecto", criterioBusquedaProyecto);
                Proyecto proyecto = proyectosList.get(0);
                for (ProyectoCargo proyectoCargo : proyecto.getProyectoCargoList()) {
                    if (proyectoCargo.getNroProyectoCargo() == postulacionProyectoCargoDTO.getNroProyectoCargo()) {
                        postulacionProyectoCargo.setProyecto(proyecto);
                        postulacionProyectoCargo.setProyectoCargo(proyectoCargo);
                        List<DTOMateria> materiaDTO = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad).ObtenerEstadoAcademicoDetallado(estudiante.getLegajo());
                        int cantidadMateriasRendidasSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRendidas();
                        int cantidadMateriasRegularesSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRegulares();
                        int cantidadMateriasRendidas = contarMateriasAprobadas(materiaDTO);
                        int cantidadMateriasRegulares = contarMateriasRegulares(materiaDTO);
                        postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_ERROR_NO_CUMPLE_CONDICIONES);
                        if (cantidadMateriasRendidasSolicitadas <= cantidadMateriasRendidas) {
                            if ((cantidadMateriasRendidas - cantidadMateriasRendidasSolicitadas) >= cantidadMateriasRegularesSolicitadas) {
                                Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Efectiva");
                                List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = (PostulacionProyectoCargoEstado) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargoEstado.class);
                                postulacionProyectoCargoEstado.setFechaHoraCambio(new Date());
                                postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                                postulacionProyectoCargo.addPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
                                postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_EXITOSA);
                            } else {
                                if (cantidadMateriasRegulares >= cantidadMateriasRegularesSolicitadas) {
                                    Criterio criterioBusquedaEstadoPostulaciones = (Criterio) FabricaCriterio.getInstancia().crear("nombreTipoEstadoPostulacionProyectoCargo", "=", "Efectiva");
                                    List<TipoEstadoPostulacionProyectoCargo> tiposEstadoPostulacionProyectoCargoList = (List) FachadaPersistencia.obtenerInstancia().buscar("TipoEstadoPostulacionProyectoCargo", criterioBusquedaEstadoPostulaciones);
                                    TipoEstadoPostulacionProyectoCargo tipoEstadoPostulacionProyectoCargo = tiposEstadoPostulacionProyectoCargoList.get(0);
                                    PostulacionProyectoCargoEstado postulacionProyectoCargoEstado = (PostulacionProyectoCargoEstado) FabricaEntidades.getInstancia().crearEntidad(PostulacionProyectoCargoEstado.class);
                                    postulacionProyectoCargoEstado.setFechaHoraCambio(new Date());
                                    postulacionProyectoCargoEstado.setTipoEstadoPostulacionProyectoCargo(tipoEstadoPostulacionProyectoCargo);
                                    postulacionProyectoCargo.addPostulacionProyectoCargoEstado(postulacionProyectoCargoEstado);
                                    postulacionProyectoCargoDTO.setDescripcionEstado(Mensajes.POSTULACION_EXITOSA);
                                }
                            }
                        }
                    }
                }

            }
            postulacion.addProyectoCargo(postulacionProyectoCargo);
        }
        //FachadaPersistencia.obtenerInstancia().guardar(postulacion);
        return postulacionesProyectoCargoDTOList;
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
