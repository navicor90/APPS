/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Controlador.SistemaExterno.EstadoAcademicoGeneral;
import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOMateria;
import java.util.ArrayList;
import java.util.List;
import Modelo.DTO.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import java.lang.reflect.Type;
/**
 *
 * @author yanina
 */
public class AdaptadorSistemaAcademico01 implements AdaptadorSistemaAcademico{
    

    @Override
    public List<DTOMateria> ObtenerEstadoAcademicoDetallado(String legajo) {
       List <DTOMateria> selec= new ArrayList<>();
       return selec;
    }

    @Override
    public List<DTOEstadoAcademicoGeneral> obtenerEstadoAcademicoGeneral(String tipoDNI, long DNI) {
        List<DTOEstadoAcademicoGeneral> dt=new ArrayList<>();
        EstadoAcademicoGeneral estadoAcademicoGeneral=new EstadoAcademicoGeneral();
        //String estadoAcademicoJson=estadoAcademicoGeneral.consultarEstadoAcademicoGeneral(String.class, String.valueOf(DNI), tipoDNI);
        String estadoAcademicoJson="[{\"estadoacademicoSimple\":[{\"legajo\":\"1231\",\"estadoAcademico\":\"regular\"},{\"legajo\":\"1233\",\"estadoAcademico\":\"libre\"}]}]";
        System.out.println("json"+estadoAcademicoJson);
        final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        System.out.println("hola1");
        final Type tipoEstadoAcademico = new TypeToken<List<DTOEstadoAcademico>>(){}.getType();
        final List<DTOEstadoAcademico> dtoEstadoAcademico = gson.fromJson(estadoAcademicoJson, tipoEstadoAcademico);
        System.out.println("json pasado");
        for(DTOEstadoAcademico ea:dtoEstadoAcademico){
            List<DTOCarrera> carreras=ea.getDtoCarrera();
            System.out.println("voy bien");
            System.out.println(carreras);
            ea.getDtoCarrera();
            
            for(DTOCarrera carrera:carreras){
                System.out.println("ok");
                System.out.println(carrera.getLegajo()+"legajo");
                DTOEstadoAcademicoGeneral eg=new DTOEstadoAcademicoGeneral();
                eg.setEstadoAcademico(carrera.getEstadoAcademico());
                eg.setFechaBaja(carrera.getFechaBaja());
                eg.setFechaIngreso(carrera.getFechaIngreso());
                eg.setLegajo(carrera.getLegajo());
                eg.setNombreCarrera(carrera.getCarreraSimple().getNombreCarrera());
                dt.add(eg);
        }
                    
        }
        return dt;
    }
    
    
}
