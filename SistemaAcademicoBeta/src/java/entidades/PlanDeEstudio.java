/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author yanina
 */
@Entity
public class PlanDeEstudio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private int codPlanEstudio;
    private String nombrePlanEstudio;
    @ManyToOne
    private Carrera  carrera;

    public int getCodPlanEstudio() {
        return codPlanEstudio;
    }

    public void setCodPlanEstudio(int codPlanEstudio) {
        this.codPlanEstudio = codPlanEstudio;
    }

    public String getNombrePlanEstudio() {
        return nombrePlanEstudio;
    }

    public void setNombrePlanEstudio(String nombrePlanEstudio) {
        this.nombrePlanEstudio = nombrePlanEstudio;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanDeEstudio)) {
            return false;
        }
        PlanDeEstudio other = (PlanDeEstudio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PlanDeEstudio[ id=" + id + " ]";
    }
    
}