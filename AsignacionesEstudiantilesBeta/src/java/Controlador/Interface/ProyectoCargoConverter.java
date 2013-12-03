/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interface;

import Modelo.DTO.DTOPostulacionProyectoCargo;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/**
 *
 * @author milton
 */
public class ProyectoCargoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        if (submittedValue.trim().equals("")) {
            return null;
        } else {
            try {
                int prioridad = Integer.parseInt(submittedValue);
                System.out.println("prioridad           "+prioridad);
/*                for (Player p : playerDB) {
                    if (p.getNumber() == number) {
                        return p;
                    }
                }
*/                
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
            return dto.getNomProyecto()+dto.getNomProyectoCargo();
        }
    }

}
