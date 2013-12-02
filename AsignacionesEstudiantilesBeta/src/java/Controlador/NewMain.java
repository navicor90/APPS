/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Persistencia.FabricaEntidades;
import Controlador.Persistencia.FachadaPersistenciaInterna;
import Modelo.*;
import Modelo.interfaces.Proyecto;
import Modelo.interfaces.ProyectoCargo;
import Modelo.interfaces.ProyectoCargoCarrera;
import java.util.Random;

/**
 *
 * @author yanina
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FachadaPersistenciaInterna.getInstancia().iniciarTransaccion();
        Proyecto proyecto = (Proyecto) FabricaEntidades.getInstancia().crearEntidad(Proyecto.class);
        ProyectoCargo proyectoCargo1 = (ProyectoCargo) FabricaEntidades.getInstancia().crearEntidad(ProyectoCargo.class);
        proyectoCargo1.setCantidadMinimaPostulacion(5);
        proyectoCargo1.setDescripcion("");
        proyectoCargo1.setHabilitado(true);
        proyectoCargo1.setHorasDedicadas(4);
        proyectoCargo1.setNroProyectoCargo(21116);
        ProyectoCargo proyectoCargo2 = (ProyectoCargo) FabricaEntidades.getInstancia().crearEntidad(ProyectoCargo.class);
        ProyectoCargoCarrera proyectoCargoCarrera = (ProyectoCargoCarrera) FabricaEntidades.getInstancia().crearEntidad(ProyectoCargoCarrera.class);

    }

    private static String getCadenaAlfanumAleatoria(int longitud) {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while (i < longitud){
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <='Z') ){
                cadenaAleatoria += c;
                i++;
            }
        }
        return cadenaAleatoria;
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
