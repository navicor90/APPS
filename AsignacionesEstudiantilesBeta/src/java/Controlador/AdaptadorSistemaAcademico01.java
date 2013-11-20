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
//http://franciscocoenda.blogspot.com.ar/2013/09/leer-un-xml-con-java.html
//http://es.softuses.com/139147
//http://expertoj2ee.blogspot.com.ar/2011/03/como-leer-un-fichero-xml-en-java-y-su.html
//http://apuntes.delibertad.com/java/leer-archivo-xml-desde-java/
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
        //Lo convierte en un objeto java manipulable
        Document doc= docBuilder.parse(new File("src/java/Controlador/xml/EstadoAcademico.xml"));
        //prepara el archivo xml para obtener los datos
        doc.getDocumentElement().normalize();
        //obtiene todos los nodos con la etiqueta Alumno
        NodeList nodosEstadoAcademicoAlumno =doc.getElementsByTagName("Alumno");
        //por cada nodo que se obtuvo se obtendra los datos
        // y se guardaran en un DTO estadoAcademico
       
            System.out.println("Informacion del "+ doc.getDocumentElement().getNodeName()+"...."+ nodosEstadoAcademicoAlumno.item(0).getChildNodes().getLength());
            // itera po la cantidad de personas
            for (int i = 0; i < nodosEstadoAcademicoAlumno.getLength(); i++) {
                Node alumno = nodosEstadoAcademicoAlumno.item(i);
                //valido que tenga atributo
                if (alumno.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList nodoCarreraAlumno=nodosEstadoAcademicoAlumno.item(i).getChildNodes();
                    System.out.println("carrera"+ nodoCarreraAlumno.item(1)); 
                    NodeList ListaCarrera = nodoCarreraAlumno.item(3).getChildNodes();
                    for(int j = 0; j  <ListaCarrera.getLength(); j++){
                        Node carrera = ListaCarrera.item(j);
                        if (carrera.getNodeType()==Node.ELEMENT_NODE) {
                            System.out.println("if"+nodoCarreraAlumno.item(1).getTextContent());
                            if ("DNI".equals(nodoCarreraAlumno.item(1).getTextContent())) {
                                System.out.println("entro");
                            
                                Element unElement=(Element) carrera;
                                DTOEstadoAcademicoGeneral dTOEstadoAcademicoGeneral = new DTOEstadoAcademicoGeneral();
                                System.out.println("nombre carrera "+obtenerNodoValor("nombre", unElement));
                                dTOEstadoAcademicoGeneral.setCarrera(obtenerNodoValor("nombre", unElement));
                                dTOEstadoAcademicoGeneral.setEstadoAcademico(obtenerNodoValor("estado", unElement));
                                System.out.println("estado carrera "+obtenerNodoValor("estado", unElement));
                                System.out.println("fin carrerra");
                            };
                        }
                    }
                    System.out.println("fin carrera alumno");
                    
                }
                System.out.println("fin alumno");
                
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
     //le damos la etiqueta y el elemento ( la carrera )
    // y este nos devuelve el valor que se encuentra dentro de las etiquetas <tag> VALOR </tag>
    private static String obtenerNodoValor(String atributo, Element carrera){
        Node nValor =(Node)carrera.getElementsByTagName(atributo).item(0).getFirstChild();
        return nValor.getNodeValue();
    }
    
    
}
