/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.portfoliofinal.services;

import com.argentinaprograma.portfoliofinal.models.Usuario;
import com.argentinaprograma.portfoliofinal.repository.UsuarioRepo;
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
public class UsuarioService {
        
    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
    
    public Usuario agregarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuarios(){
        return usuarioRepo.findAll();
    }
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElse(null);
    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
}