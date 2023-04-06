package com.example.debtsapi.controllers;

import com.example.debtsapi.entities.Deuda;
import com.example.debtsapi.entities.Usuario;
import com.example.debtsapi.service.DeudaService;
import com.example.debtsapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    DeudaService deudaService;

    @PostMapping("/crearUsuario")
    public void crearUsuario(@RequestBody Usuario usuario){
      usuarioService.crearUsuario(usuario.getNombre(), usuario.getApellido(), usuario.getEmail());
    }

    @PostMapping("/buscarUsuario")
    public Optional<Usuario> buscarUsuario(@RequestBody Usuario usuario){

        Optional<Usuario> userId= usuarioService.buscarUsuario(usuario.getIdUsuario());

        return userId;
    }

    @PostMapping("/modificarUsuario")
    public void actualizar(@RequestBody Usuario usuario){
        usuarioService.modificarUsuario(usuario.getNombre(), usuario.getApellido(), usuario.getEmail(), usuario.getIdUsuario());
    }

    @PostMapping("/borrarUsuario")
    public String borrar(@RequestBody Usuario usuario){
    usuarioService.borrarUsuario(usuario.getIdUsuario());
    return "Registro eliminado correctamente";
    }

    //---------------------------------------------------------------------------------------------------------
    //                                          Crud Deuda
    //----------------------------------------------------------------------------------------------------------

    @PostMapping("/crearDeuda")
    public void crearCuenta(@RequestBody Deuda deuda){
       deudaService.crearDeuda(deuda.getMontoTotal(), deuda.getMontoRecuperado(),
               deuda.getEstado_deuda(),deuda.getIduser());
    }


    @PostMapping("/buscarDeuda")
    public Optional<Deuda> buscarDeuda(@RequestBody Deuda deuda){

     Optional<Deuda> deudaId=  deudaService.buscarDeuda(deuda.getId());

     return deudaId;
    }

   @PostMapping("/actualizarDeuda")
    public void actualizarDeuda(@RequestBody Deuda deuda){
        deudaService.actualizarDeuda(deuda.getId(),deuda.getMontoTotal(), deuda.getMontoRecuperado(),
                deuda.getEstado_deuda(),deuda.getIduser());
   }

   @DeleteMapping("/borrarDeuda")
    public String borrarDeuda(@RequestBody Deuda deuda){
        deudaService.eliminarDeuda(deuda.getId());
        return "Operación realizada";
   }


}
