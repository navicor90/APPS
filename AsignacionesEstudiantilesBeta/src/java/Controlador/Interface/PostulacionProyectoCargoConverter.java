/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Modelo.DTO.DTOPostulacionProyectoCargo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author milton
 */
public class PostulacionProyectoCargoConverter implements Converter {
private static List<DTOPostulacionProyectoCargo> postulacionesDTO;

    static{
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
    }
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        if (submittedValue.trim().equals("")) {
            return null;
        } else {
            try {
                int prioridad = Integer.parseInt(submittedValue);
                System.out.println("prioridad           "+prioridad);
               for (DTOPostulacionProyectoCargo dtoppc : postulacionesDTO) {
                    if (dtoppc.getPrioridad() == prioridad) {
                        return dtoppc;
                    }
                }
                
            } catch(NumberFormatException exception) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid player"));
            }
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || value.equals("")) {
            return "";
        } else {
            DTOPostulacionProyectoCargo dto = ((DTOPostulacionProyectoCargo) value);
            return String.valueOf(dto.getPrioridad());
        }
    }

}
