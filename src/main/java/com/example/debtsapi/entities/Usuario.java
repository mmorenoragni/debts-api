package com.example.debtsapi.entities;

public class Usuario {

    Integer idUsuario;
    String nombre;
    String apellidoi;
    String email;


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoi() {
        return apellidoi;
    }

    public void setApellidoi(String apellidoi) {
        this.apellidoi = apellidoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
