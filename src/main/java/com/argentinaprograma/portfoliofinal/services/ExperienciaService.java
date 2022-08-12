/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.services;

import com.argentinaprograma.portfoliofinal.models.Experiencia;
import com.argentinaprograma.portfoliofinal.models.Usuario;
import com.argentinaprograma.portfoliofinal.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juamp
 */
@Service
@Transactional
public class ExperienciaService {
        private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    
    public Experiencia agregarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    public Experiencia buscarExperienciaPorId(Long id){
        return experienciaRepo.findById(id).orElse(null);
    }
    
}
