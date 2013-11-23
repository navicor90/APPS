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
        Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajo", "=", legajo);
        Estudiante estudiante = (Estudiante) FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
        AdaptadorSistemaAcademico adaptadorSA = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(codUniversidad);
        List<DTOEstadoAcademicoGeneral> estadoAcademicoGeneralList = adaptadorSA.obtenerEstadoAcademicoGeneral(estudiante.getTipoDni(), estudiante.getDni());
        Boolean esRegular = false;
        for (DTOEstadoAcademicoGeneral estadoAcademicoGeneral : estadoAcademicoGeneralList) {
            if (estadoAcademicoGeneral.getEstadoAcademico().contentEquals("esRegular")) {
                esRegular = true;
            }
        }
        if (esRegular) {
            Expresion expresionBusquedaProyectos = FabricaCriterio.getInstancia().crear("FechaInicio",">" ,new Date());
            List<Proyecto> ProyectosList = (List)(Proyecto)FachadaPersistencia.obtenerInstancia().buscar("Proyecto", expresionBusquedaProyectos);
            List<DTOProyecto> proyectoDTOList = new ArrayList<>();
            for (Proyecto proyecto: ProyectosList) {
                DTOProyecto proyectoDTO = new DTOProyecto();
                proyectoDTO.setDescripcion(proyecto.getDescripcion());
                proyectoDTO.setDuracion(proyecto.getDuracion());
                proyectoDTO.setFechaInicio(proyecto.getFechaInicio());
                proyectoDTO.setNomProyecto(proyecto.getNombreProyecto());
                proyectoDTOList.add(proyectoDTO);
            }            
            return proyectoDTOList;
        }
        return null;
        /*
         //codigo stub - interface ivan
         List<DTOProyecto> r = new ArrayList();
         DTOProyecto d = new DTOProyecto();
         d.setDescripcion("Esto es una descripcion");
         d.setNomProyecto("Baba de caracol");
         d.setDuracion(4);
         d.setFechaInicio(new Date());
         r.add(d);
         DTOProyecto a = new DTOProyecto();
         a.setDescripcion("Esto es una descripcion");
         a.setNomProyecto("Uno del closet secreto");
         a.setDuracion(4);
         a.setFechaInicio(new Date());
         r.add(a);
         DTOProyecto b = new DTOProyecto();
         b.setDescripcion("Esto es una descripcion");
         b.setNomProyecto("Uno de Massapequa");
         b.setDuracion(4);
         b.setFechaInicio(new Date());
         r.add(b);
         return r;
         */
    }

    public List<DTOProyectoCargo> listarProyectoCargos(String nombreProyecto) {
        //codigo stub - interface ivan
        List<DTOProyectoCargo> r = new ArrayList();
        for (int i = 0; i < 5; i++) {
            DTOProyectoCargo d = new DTOProyectoCargo();
            d.setDescripcion(Integer.toString(i));
            d.setNombreProyectoCargo(nombreProyecto + "--" + i);
            d.setHorasDedicadas(12d);
            r.add(d);
        }
        return r;
    }

    public Date obtenerFechaYHoraActuales() {
        return new Date();
    }

    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        return null;
    }
}
