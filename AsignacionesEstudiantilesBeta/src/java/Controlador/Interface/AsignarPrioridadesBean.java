/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author milton
 */
@ManagedBean
@RequestScoped
public class AsignarPrioridadesBean {

    /**
     * Creates a new instance of AsignarPrioridadesBean
     */
    private List<DTOPostulacionProyectoCargo> postulacionesDTO;

    public List<DTOPostulacionProyectoCargo> getPostulacionesProyectoCargoDTO() {
        return postulacionesDTO;
    }

    public void setPostulacionesProyectoCargoDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesDTO = postulacionesDTO;
    }

}
