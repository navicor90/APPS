/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Controlador.SistemaExterno.ConexionEstadoAcademicoDetallado;
import Controlador.SistemaExterno.ConexionEstadoAcademicoGeneral;
import Modelo.DTO.DTOMateria;
import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.Adaptador.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
/**
 *
 * @author yanina
 */
public class AdaptadorSistemaAcademico01 implements AdaptadorSistemaAcademico{
    

    @Override
    public List<DTOMateria> ObtenerEstadoAcademicoDetallado(String legajo) {
       List <DTOMateria> listasDtoMateria= new ArrayList<>();
       ConexionEstadoAcademicoDetallado conexionEstadoAcademicoDetallado =new ConexionEstadoAcademicoDetallado();
       String estadoAcademicoJson=conexionEstadoAcademicoDetallado.consultarEstadoAcademicoDetallado(String.class, legajo);
       Gson gson=new Gson();
       Type tipoEstadoAcademico = new TypeToken<List<DTOEstadoAcademicoDetallado>>(){}.getType();
        System.out.println("Detallado =  "+estadoAcademicoJson);
       List<DTOEstadoAcademicoDetallado> ListaDtoEstadoAcademicoDetallado = gson.fromJson(estadoAcademicoJson, tipoEstadoAcademico);
       for(DTOEstadoAcademicoDetallado dtoEstadoAcademicoDetallado: ListaDtoEstadoAcademicoDetallado){
           List<EstudianteMateriaSimple> ListaEstudianteMateriaSimple= dtoEstadoAcademicoDetallado.getEstudianteMateriaSimple();
           for(EstudianteMateriaSimple estudianteMateriaSimple:ListaEstudianteMateriaSimple){
               DTOMateria dTOMateria=new DTOMateria();
               dTOMateria.setLegajo(dtoEstadoAcademicoDetallado.getLegajo());
               dTOMateria.setNombreCarrera(dtoEstadoAcademicoDetallado.getCarreraSimple().getNombreCarrera());
               dTOMateria.setEstadoMateria(estudianteMateriaSimple.getEstado());
               dTOMateria.setNotaMateria(estudianteMateriaSimple.getNotaFinal());
               dTOMateria.setNombreMateria(estudianteMateriaSimple.getMateriaSimples().getNombre());
               listasDtoMateria.add(dTOMateria);
           }
        }
       return listasDtoMateria;
    }

    @Override
    public List<DTOEstadoAcademicoGeneral> obtenerEstadoAcademicoGeneral(String tipoDNI, long DNI) {
        List<DTOEstadoAcademicoGeneral> ListasDtoEaGenerale=new ArrayList<>();
        ConexionEstadoAcademicoGeneral conexionEstadoAcademicoGeneral=new ConexionEstadoAcademicoGeneral();
        String estadoAcademicoJson=conexionEstadoAcademicoGeneral.consultarEstadoAcademicoGeneral(String.class, String.valueOf(DNI), tipoDNI);
        System.out.println(estadoAcademicoJson);
        Gson gson = new Gson();
        Type tipoEstadoAcademico = new TypeToken<List<DTOEstadoAcademico>>(){}.getType();
        List<DTOEstadoAcademico> dtoEstadoAcademico = gson.fromJson(estadoAcademicoJson, tipoEstadoAcademico);
        for(DTOEstadoAcademico estadoAcademico:dtoEstadoAcademico){
            List<DTOCarrera> carreras=estadoAcademico.getEstadoacademicoSimple();
            for(DTOCarrera carrera:carreras){
                DTOEstadoAcademicoGeneral dtoEaGeneral=new DTOEstadoAcademicoGeneral();
                dtoEaGeneral.setEstadoAcademico(carrera.getEstadoAcademico());
                dtoEaGeneral.setFechaBaja(carrera.getFechaBaja());
                dtoEaGeneral.setFechaIngreso(carrera.getFechaIngreso());
                dtoEaGeneral.setLegajo(carrera.getLegajo());
                dtoEaGeneral.setNombreCarrera(carrera.getCarreraSimple().getNombreCarrera());
                ListasDtoEaGenerale.add(dtoEaGeneral);
           }
        }
        return ListasDtoEaGenerale;
    }
    
    
    }
