/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author juamp
 */
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private String imagenSkill;
    private String porcentajeSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String imagenSkill, String porcentajeSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imagenSkill = imagenSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getImagenSkill() {
        return imagenSkill;
    }

    public void setImagenSkill(String imagenSkill) {
        this.imagenSkill = imagenSkill;
    }

    public String getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(String porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    
    
    
}
