/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.services;

import com.argentinaprograma.portfoliofinal.models.Experiencia;
import com.argentinaprograma.portfoliofinal.models.Skills;
import com.argentinaprograma.portfoliofinal.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.argentinaprograma.portfoliofinal.repository.SkillsRepo;

/**
 *
 * @author juamp
 */
@Service
@Transactional
public class SkillsService {
        private final SkillsRepo skillRepo;

    @Autowired
    public SkillsService(SkillsRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
    
    public Skills agregarSkill(Skills skill){
        return skillRepo.save(skill);
    }
    public List<Skills> buscarSkills(){
        return skillRepo.findAll();
    }
    public Skills editarSkill(Skills skill){
        return skillRepo.save(skill);
    }
    public void borrarSkill(Long id){
        skillRepo.deleteById(id);
    }
    public Skills buscarSkillPorId(Long id){
        return skillRepo.findById(id).orElse(null);
    }
    
}
