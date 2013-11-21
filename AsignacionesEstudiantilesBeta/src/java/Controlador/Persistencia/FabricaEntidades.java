/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Persistencia;


/**
 *
 * @author franco
 */
public class FabricaEntidades {
    static private FabricaEntidades instancia;

    public static FabricaEntidades getInstancia() {
        if(instancia == null){
            instancia = new FabricaEntidades();
        }
        return instancia;
    }
    
    public Object crearEntidad(Class clase){
        //if(clase == Estudiante)
        return null;
    }
    
}
