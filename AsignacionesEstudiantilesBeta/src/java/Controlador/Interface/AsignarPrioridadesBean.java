/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.ArrayList;
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

    public AsignarPrioridadesBean() {
        postulacionesDTO = new ArrayList<>();
        DTOPostulacionProyectoCargo dto = new DTOPostulacionProyectoCargo();
        dto.setNomProyecto("proy1");
        dto.setNomProyectoCargo("proycargo1");
        dto.setPrioridad(1);
        postulacionesDTO.add(dto);
        DTOPostulacionProyectoCargo dto1 = new DTOPostulacionProyectoCargo();
        dto1.setNomProyecto("proy2");
        dto1.setNomProyectoCargo("proycargo2");
        dto1.setPrioridad(2);
        postulacionesDTO.add(dto1);
        DTOPostulacionProyectoCargo dto3 = new DTOPostulacionProyectoCargo();
        dto3.setNomProyecto("proy3");
        dto3.setNomProyectoCargo("proycargo3");
        dto3.setPrioridad(3);
        postulacionesDTO.add(dto3);
        PostulacionProyectoCargoConverter.setPostulacionesDTO(postulacionesDTO);
    }
    
    
    
    public List<DTOPostulacionProyectoCargo> getPostulacionesProyectoCargoDTO() {
        return postulacionesDTO;
    }

    public void setPostulacionesProyectoCargoDTO(List<DTOPostulacionProyectoCargo> postulacionesDTO) {
        this.postulacionesDTO = postulacionesDTO;
    }
    public String guardarCambios(){
        return "index.xhtml";
    }

}
