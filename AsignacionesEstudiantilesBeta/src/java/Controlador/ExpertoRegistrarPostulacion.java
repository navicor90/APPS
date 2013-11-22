/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DTO.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author milton
 */
public class ExpertoRegistrarPostulacion {

    public List<DTOProyecto> listarProyectos(long legajo, int codUniversidad) {
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
    }

    public List<DTOProyectoCargo> listarProyectoCargos(String nombreProyecto) {
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
