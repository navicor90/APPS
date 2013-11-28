/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FachadaPersistencia;
import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.*;
import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOProyecto;
import Modelo.interfaces.Estudiante;
import Modelo.interfaces.Proyecto;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yanina
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Object m = new Mensajes();
        
        System.out.println(m.getClass().getName());
        System.out.println(m.getClass().getSimpleName());
        System.out.println(m.getClass().getCanonicalName());
        
        
        
        /*FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
         Expresion expresionBusquedaEstudiante = FabricaCriterio.getInstancia().crear("legajoEstudiante", "=", "34567");
         List<Estudiante> estudiantesList = (List)FachadaPersistencia.obtenerInstancia().buscar("Estudiante", expresionBusquedaEstudiante);
         Estudiante estudiante=null;
         if(estudiantesList!=null){
         estudiante = estudiantesList.get(0);
         }else{
         System.out.println("nullllllllll");
         }
         AdaptadorSistemaAcademico adaptadorSA = FabricaAdaptadorSistemaAcademico.getInstancia().obtenerAdaptadorSistemaAcademico(1);
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
         fechaActual+=fechaActualD.getYear()+"-";
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
         System.out.println(proyecto.getNombreProyecto());
         proyectoDTOList.add(proyectoDTO);
         }            
         System.out.println("lalalalalal... i winnnn");
         }
         System.out.println("i lost");
         */
    }

    public static Expresion generarExp() {
        Criterio e1 = new Criterio();
        e1.setAtributo("nombre");
        e1.setOperador("=");
        e1.setValor("ivan");
        Criterio e2 = new Criterio();
        e2.setAtributo("edad");
        e2.setOperador("<");
        e2.setValor("28");
        CriterioCompuesto e3 = new CriterioCompuesto();
        e3.setOperadorLogico("&&");
        e3.setExpresionIzq(e1);
        e3.setExpresionDer(e2);
        Criterio e4 = new Criterio();
        e4.setAtributo("dinero");
        e4.setOperador("<");
        e4.setValor("20");
        CriterioCompuesto e5 = new CriterioCompuesto();
        e5.setExpresionDer(e3);
        e5.setExpresionIzq(e4);
        e5.setOperadorLogico("&&");
        return e5;
    }

}
