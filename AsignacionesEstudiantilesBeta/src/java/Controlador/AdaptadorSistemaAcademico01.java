/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.DTO.DTOEstadoAcademicoGeneral;
import Modelo.DTO.DTOMateria;
import Modelo.SeleccionPostulacionProyectoCargo;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.swing.JOptionPane;
import static javax.ws.rs.client.Entity.xml;

/**
 *
 * @author yanina
 */
public class AdaptadorSistemaAcademico01 implements AdaptadorSistemaAcademico{
    

    @Override
    public List<DTOMateria> ObtenerDatosEstadoAcademico(int dni) {
       List <DTOMateria> selec= new ArrayList<>();
       return selec;
    }

    @Override
    public List<DTOEstadoAcademicoGeneral> VerificarRegularidadEstudiante(String tipoLegajo, int legajo) {
        List <DTOEstadoAcademicoGeneral> estadoAcademicoGeneral=new ArrayList<>();
        
        try{
        DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder=docFactory.newDocumentBuilder();
        Document doc= docBuilder.parse(new File("xml/EstadoAcademico.xml"));
        //prepara el archivo xml para obtener los datos
        doc.getDocumentElement().normalize();
        //obtiene todos los nodos con la etiqueta estado academico
        NodeList nodosEstadoAcademico =doc.getElementsByTagName("EstadoAcademico");
        //por cada nodo que se obtuvo se obtendra los datos
        // y se guardaran en un DTO estadoAcademico
            for (int i = 0; i < nodosEstadoAcademico.getLength(); i++) {
                Node estadoAcademico = nodosEstadoAcademico.item(i);
                if (estadoAcademico.getNodeType() == Node.ELEMENT_NODE) {
                    Element unElement=(Element) estadoAcademico;
                    DTOEstadoAcademicoGeneral dTOEstadoAcademicoGeneral = new DTOEstadoAcademicoGeneral();
                    dTOEstadoAcademicoGeneral.setCarrera(obtenerNodoValor("carrera", unElement));
                    dTOEstadoAcademicoGeneral.setEstadoAcademico(obtenerNodoValor("estadoAcademico", unElement));
                    System.out.println(obtenerNodoValor("carrera", unElement));
                    
                }
                
            }
            
        
        } catch (ParserConfigurationException parseE){
            JOptionPane.showMessageDialog(null, parseE.getMessage(),""+"Error",JOptionPane.ERROR_MESSAGE);
        }catch (SAXException saxE){
            JOptionPane.showMessageDialog(null, saxE.getMessage(),""+"Error",JOptionPane.ERROR_MESSAGE);
        }catch (IOException ioE){
            JOptionPane.showMessageDialog(null, ioE.getMessage(),""+"Error",JOptionPane.ERROR_MESSAGE);
        }
        return estadoAcademicoGeneral;
    }
    private static String obtenerNodoValor(String atributo, Element estadoAcademico){
        Node nValor =(Node)estadoAcademico.getElementsByTagName(atributo).item(0).getFirstChild();
        return nValor.getNodeValue();
    }
    
    
}
