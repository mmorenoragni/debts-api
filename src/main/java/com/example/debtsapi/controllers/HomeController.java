package com.example.debtsapi.controllers;

import com.example.debtsapi.entities.Usuario;
import com.example.debtsapi.interfaces.UsuarioRepository;
import com.example.debtsapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/crearUsuario")
    public void crearusuario(@RequestBody Usuario usuario){
      usuarioService.crearUsuario(usuario.getNombre(), usuario.getApellido(), usuario.getEmail());
    }

    @PostMapping("/buscarUsuario")
    public Optional<Usuario> buscarusuario(@RequestBody Usuario usuario){

        Optional<Usuario> userId= usuarioService.buscarUsuario(usuario.getIdUsuario());

        return userId;

    }


}
