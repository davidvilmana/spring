package com.vilmana.springboot.webapp.demo.controllers.model;

public class User {
    private String nombre = "david";
    private String apellido = "vilcabana";
    
    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "User [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

 


    
}
