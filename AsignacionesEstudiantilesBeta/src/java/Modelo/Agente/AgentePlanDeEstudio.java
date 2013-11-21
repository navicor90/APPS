/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo.Agente;
import Modelo.implementacion.*;
import Modelo.interfaces.*;
import java.util.Date;
/**
 *
 * @author yanina
 */
public class AgentePlanDeEstudio extends Agente implements PlanDeEstudio{
    String oidCarrera;
    boolean heBuscadoCarrera;
    ImplementacionPlanDeEstudio implementacionPlanDeEstudio;

    public String getOidCarrera() {
        return oidCarrera;
    }

    public void setOidCarrera(String oidCarrera) {
        this.oidCarrera = oidCarrera;
    }

    public boolean isHeBuscadoCarrera() {
        return heBuscadoCarrera;
    }

    public void setHeBuscadoCarrera(boolean heBuscadoCarrera) {
        this.heBuscadoCarrera = heBuscadoCarrera;
    }

    public ImplementacionPlanDeEstudio getImplementacionPlanDeEstudio() {
        return implementacionPlanDeEstudio;
    }

    public void setImplementacionPlanDeEstudio(ImplementacionPlanDeEstudio implementacionPlanDeEstudio) {
        this.implementacionPlanDeEstudio = implementacionPlanDeEstudio;
    }
    
    
    @Override
    public int getCodigoPlanDeEstudion() {
        return implementacionPlanDeEstudio.getCodigoPlanDeEstudion();
    }

    @Override
    public void setCodigoPlanDeEstudion(int codigoPlanDeEstudion) {
        implementacionPlanDeEstudio.setCodigoPlanDeEstudion(codigoPlanDeEstudion);
    }

    @Override
    public Date getFechaFinVigencia() {
        return implementacionPlanDeEstudio.getFechaFinVigencia();
    }

    @Override
    public void setFechaFinVigencia(Date fechaFinVigencia) {
        implementacionPlanDeEstudio.setFechaFinVigencia(fechaFinVigencia);
    }

    @Override
    public String getNombrePlanDeEstudio() {
        return implementacionPlanDeEstudio.getNombrePlanDeEstudio();
    }

    @Override
    public void setNombrePlanDeEstudio(String nombrePlanDeEstudio) {
        implementacionPlanDeEstudio.setNombrePlanDeEstudio(nombrePlanDeEstudio);
    }

    @Override
    public Materia getMateria() {
        return implementacionPlanDeEstudio.getMateria();
    }

    @Override
    public void setMateria(Materia materia) {
        implementacionPlanDeEstudio.setMateria(materia);
    }
    
}
