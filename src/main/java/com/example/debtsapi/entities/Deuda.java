package com.example.debtsapi.entities;

public class Deuda {

        Integer idDeuda;
        Integer montoTotal;
        Integer montoRecuperado;
        String estadoDeDeuda;
        Integer userId;

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

        public String getEstadoDeDeuda() {
            return estadoDeDeuda;
        }

        public void setEstadoDeDeuda(String estadoDeDeuda) {
            this.estadoDeDeuda = estadoDeDeuda;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }
    }


