/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.*;
import Controlador.Persistencia.*;
import Modelo.Criterio;
import Modelo.FabricaCriterio;
import Modelo.interfaces.Universidad;
import java.util.Date;
import java.util.List;
/**
 *
 * @author milton
 */
public class ControladorRegistrarPostulacion {
    private ExpertoRegistrarPostulacion experto;

    public ControladorRegistrarPostulacion() {
        this.experto = (ExpertoRegistrarPostulacion) FabricaExperto.getInstancia().obtenerExperto("registrarPostulacion");
    }
    
    public List<DTOProyecto> listarProyectos(long legajo, String url){
        Criterio criterio = (Criterio) FabricaCriterio.getInstancia().crear("direccionServidorWebUniversidad", "=", url);
        Universidad universidad =(Universidad) FachadaPersistenciaInterna.getInstancia().buscar("Universidad", criterio);
        return experto.listarProyectos(legajo, universidad.getCodigo());
    }
    
    public List<DTOProyectoCargo> listarProyectoCargos(Integer codigoProyecto){
        return experto.listarProyectoCargos(codigoProyecto);
    }
    
    public Date obtenerFechaYHoraActuales(){
        return experto.obtenerFechaYHoraActuales();
    }
    
    public List<DTOPostulacionProyectoCargo> realizarPostulacion(List<DTOPostulacionProyectoCargo> postulacionesDTO){
        return experto.realizarPostulacion(postulacionesDTO);
    }
    
    
}
