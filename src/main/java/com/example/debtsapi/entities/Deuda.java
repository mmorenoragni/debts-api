package com.example.debtsapi.entities;

import javax.persistence.*;

@Entity
@Table(name="Deuda")
public class Deuda {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idDeuda")
        Integer idDeuda;
        Integer montoTotal;
        Integer montoRecuperado;
        String estado_deuda;
        Integer iduser;


        public Integer getIdDeuda() {
            return idDeuda;
        }

        public void setIdDeuda(Integer idDeuda) {
            this.idDeuda = idDeuda;
        }

        public Integer getMontoTotal() {
            return montoTotal;
        }

        public void setMontoTotal(Integer montoTotal) {
            this.montoTotal = montoTotal;
        }

        public Integer getMontoRecuperado() {
            return montoRecuperado;
        }

        public void setMontoRecuperado(Integer montoRecuperado) {
            this.montoRecuperado = montoRecuperado;
        }

        public String getEstado_deuda() {
            return estado_deuda;
        }

        public void setEstado_deuda(String estado_deuda) {
            this.estado_deuda = estado_deuda;
        }

        public Integer getIduser() {
            return iduser;
        }

        public void setIduser(Integer iduser) {
            this.iduser = iduser;
        }
    }


