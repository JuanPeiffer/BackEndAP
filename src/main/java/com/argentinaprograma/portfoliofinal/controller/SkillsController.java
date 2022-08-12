/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.controller;

import com.argentinaprograma.portfoliofinal.models.Skills;
import com.argentinaprograma.portfoliofinal.services.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juamp
 */
@RestController
@RequestMapping("/api/skill")
public class SkillsController {
    private final SkillsService skillService;

    public SkillsController(SkillsService skillService) {
        this.skillService = skillService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Skills>buscarSkills(@PathVariable("id") Long id){
        Skills skill = skillService.buscarSkillPorId(id);
        return new ResponseEntity<>(skill,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skill){
        Skills editarSkills = skillService.editarSkill(skill);
        return new ResponseEntity<>(editarSkills,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List>buscarSkills(){
        List<Skills> skill = skillService.buscarSkills();
        return new ResponseEntity<>(skill,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skill){
        Skills nuevaSkills = skillService.agregarSkill(skill);
        return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <?> borrarSkills(@PathVariable("id")Long id){
        skillService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
