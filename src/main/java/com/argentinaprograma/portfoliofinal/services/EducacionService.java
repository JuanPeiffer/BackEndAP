/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.services;

import com.argentinaprograma.portfoliofinal.models.Educacion;
import com.argentinaprograma.portfoliofinal.models.Usuario;
import com.argentinaprograma.portfoliofinal.repository.EducacionRepo;
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
public class EducacionService {
    
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion agregarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
    public Educacion buscarEducacionPorId(Long id){
        return educacionRepo.findById(id).orElse(null);
    }
    
}