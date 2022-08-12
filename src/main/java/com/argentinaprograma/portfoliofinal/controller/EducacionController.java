/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.controller;

import com.argentinaprograma.portfoliofinal.models.Educacion;
import com.argentinaprograma.portfoliofinal.services.EducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Educacion>buscarEducacion(@PathVariable("id") Long id){
        Educacion educacion = educacionService.buscarEducacionPorId(id);
        return new ResponseEntity<>(educacion,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion editarEducacion = educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(editarEducacion,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List>buscarEducaciones(){
        List<Educacion> educacion = educacionService.buscarEducaciones();
        return new ResponseEntity<>(educacion,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionService.agregarEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <?> borrarEducacion(@PathVariable("id")Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
   
}
