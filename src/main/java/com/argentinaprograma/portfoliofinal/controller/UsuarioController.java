/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.controller;

import com.argentinaprograma.portfoliofinal.models.Educacion;
import com.argentinaprograma.portfoliofinal.models.Usuario;
import com.argentinaprograma.portfoliofinal.services.UsuarioService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juamp
 */
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public ResponseEntity<List>buscarUsuarios(){
        List<Usuario> usuario = usuarioService.buscarUsuarios();
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario>buscarUsuarios(@PathVariable("id") Long id){
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario editarUsuario = usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(editarUsuario,HttpStatus.OK);
    }
    
    
    
}
