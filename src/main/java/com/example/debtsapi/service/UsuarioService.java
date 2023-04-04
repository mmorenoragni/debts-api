package com.example.debtsapi.service;

import com.example.debtsapi.entities.Usuario;
import com.example.debtsapi.interfaces.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {



    @Autowired
    private UsuarioRepository repoUsuarioService;

    //Crud Jpa

    public void crearUsuario(String nombre,String apellido,String email){

        Usuario user=new Usuario();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setEmail(email);
        repoUsuarioService.save(user);
    }


    public Optional<Usuario> buscarUsuario(Integer id){

        Usuario user=new Usuario();
        Optional<Usuario> usuarioJpa= repoUsuarioService.findById(id);
        return usuarioJpa;

    }


}
