/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.controller;

import com.argentinaprograma.portfoliofinal.models.Experiencia;
import com.argentinaprograma.portfoliofinal.services.ExperienciaService;
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
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Experiencia>buscarExperiencia(@PathVariable("id") Long id){
        Experiencia experiencia = experienciaService.buscarExperienciaPorId(id);
        return new ResponseEntity<>(experiencia,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia editarExperiencia = experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(editarExperiencia,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List>buscarExperiencias(){
        List<Experiencia> experiencia = experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencia,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia = experienciaService.agregarExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <?> borrarExperiencia(@PathVariable("id")Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
    
}
