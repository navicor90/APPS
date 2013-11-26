/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FachadaPersistencia;
import Modelo.*;
import Modelo.DTO.*;
import Modelo.interfaces.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {

    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad) {
        Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajoEstudiante", "=", legajo);
        List<Object> estudiantesList = (List)FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
        Estudiante estudiante=null;
        if(estudiantesList!=null){
            estudiante = (Estudiante) estudiantesList.get(0);
        }else{
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
            int año = fechaActualD.getYear()+1900;
            fechaActual+=año+"-";
            int mes = fechaActualD.getMonth()+1;
            fechaActual+=mes+"-";
            int dia = fechaActualD.getDate()+1;
            fechaActual+=dia;
            Expresion expresionBusquedaProyectos = FabricaCriterio.getInstancia().crear("FechaInicioProyecto",">" ,fechaActual);
            List<Proyecto> ProyectosList = (List)FachadaPersistencia.obtenerInstancia().buscar("Proyecto", expresionBusquedaProyectos);
            List<DTOProyecto> proyectoDTOList = new ArrayList<>();
            for (Proyecto proyecto: ProyectosList) {
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
        FabricaCriterio.getInstancia().crear("nombreProyecto","=", codigoProyecto);
        FachadaPersistencia.obtenerInstancia().buscar("Proyecto", null);
        
        return null;
        /*   //codigo stub - interface ivan
        List<DTOProyectoCargo> r = new ArrayList();
        for (int i = 0; i < 5; i++) {
            DTOProyectoCargo d = new DTOProyectoCargo();
            d.setDescripcion(Integer.toString(i));
            d.setNombreProyectoCargo(nombreProyecto + "--" + i);
            d.setHorasDedicadas(12d);
            r.add(d);
        }
        return r;
        */
    }

    public Date obtenerFechaYHoraActuales() {
        return new Date();
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        return null;
    }
}
