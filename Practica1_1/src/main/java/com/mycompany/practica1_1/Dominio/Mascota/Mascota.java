/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1_1.Dominio.Mascota;

import com.mycompany.practica1_1.Dominio.Usuario.Usuario;

/**
 *
 * @author irina
 */
public class Mascota {
    private int id;
    private String raza, apodo;
    private Usuario usuario;

    public Mascota() {
    }

    public Mascota(int id, String raza, String apodo, Usuario usuario) {
        this.id = id;
        this.raza = raza;
        this.apodo = apodo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
