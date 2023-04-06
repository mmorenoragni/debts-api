package com.example.debtsapi.service;

import com.example.debtsapi.entities.Deuda;
import com.example.debtsapi.interfaces.DeudaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeudaService {

    @Autowired
    private DeudaRepository repositorioDeuda;

    public void crearDeuda(Integer montoTotal, Integer montoRecuperado,String deuda_estado ,Integer user_id) {

        Deuda deuda=new Deuda();
        deuda.setMontoTotal(montoTotal);
        deuda.setMontoRecuperado(montoRecuperado);
        deuda.setEstado_deuda(deuda_estado);
        deuda.setIduser(user_id);
        repositorioDeuda.save(deuda);
    }

    public Optional<Deuda> buscarDeuda(Integer id){

        Optional<Deuda> deudaJpa=  repositorioDeuda.findById(id);

        return deudaJpa;
    }

    public void actualizarDeuda (Integer id_Deuda, Integer monto_Total, Integer monto_Recuperado,
            String estado_Deuda, Integer id_User){
        buscarDeuda(id_Deuda);
        Optional<Deuda> deudaJpa= repositorioDeuda.findById(id_Deuda);
        if(deudaJpa.isPresent()){
            Deuda deuda= deudaJpa.get();
            deuda.setId(id_Deuda);
            deuda.setMontoTotal(monto_Total);
            deuda.setMontoRecuperado(monto_Recuperado);
            deuda.setEstado_deuda(estado_Deuda);
            deuda.setIduser(id_User);
            repositorioDeuda.save(deuda);
        }
    }

    public void eliminarDeuda(Integer id){
            buscarDeuda(id);
            repositorioDeuda.deleteById(id);
    }
}
