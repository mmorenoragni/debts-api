package com.example.debtsapi.controllers;

import com.example.debtsapi.entities.Deuda;
import com.example.debtsapi.service.DeudaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    DeudaService deudaService;

    //---------------------------------------------------------------------------------------------------------
    //                                          Crud Deuda
    //----------------------------------------------------------------------------------------------------------

    @PostMapping("/crearDeuda")
    public String crearCuenta(@RequestBody Deuda deuda){
       deudaService.crearDeuda(deuda.getMontoTotal(), deuda.getMontoRecuperado(),
               deuda.getEstado_deuda(),deuda.getIduser());
       return "deuda creada con exito";
    }


    @GetMapping("/buscarDeuda/{id}")
    public Optional<Deuda> buscarDeuda(@PathVariable Integer id){
     Optional<Deuda> deudaId=  deudaService.buscarDeuda(id);

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
