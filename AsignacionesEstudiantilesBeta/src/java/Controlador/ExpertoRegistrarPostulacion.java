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
import java.util.List;

/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {

    Estudiante estudiante;
    int codUniversidad;

    public List<DTOProyecto> listarProyectos(Long legajo, int codUniversidad) {
        this.codUniversidad = codUniversidad;
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
        return null;
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

    public Date obtenerFechaYHoraActuales() {
        return new Date();
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesProyectoCargoDTOList) {
        Postulacion postulacion = (Postulacion) FabricaEntidades.getInstancia().crearEntidad(Postulacion.class);
        postulacion.setFechaHoraPostulacion(new Date());
        //postulacion.setNroPostulacion(11723);
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
                    List<DTOMateria> materiaDTO = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad).ObtenerEstadoAcademicoDetallado(estudiante.getLegajo());
                    int cantidadMateriasRendidasSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRendidas();
                    int cantidadMateriasRegularesSolicitadas = proyectoCargo.getProyectoCargoCarrera().getCantidadMateriasRegulares();
                    int cantidadMateriasRendidas = contarMateriasAprobadas(materiaDTO);
                    int cantidadMateriasRegulares = contarMateriasRegulares(materiaDTO);
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
