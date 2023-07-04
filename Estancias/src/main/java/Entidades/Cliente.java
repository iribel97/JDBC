/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Cliente {

    /*
    CREATE TABLE clientes (
        id_cliente INT UNSIGNED AUTO_INCREMENT NOT NULL,
        nombre VARCHAR(50) NOT NULL,
        calle VARCHAR(50) DEFAULT NULL,
        numero INT NOT NULL,
        codigo_postal VARCHAR(10) DEFAULT NULL,
        ciudad VARCHAR(50) NOT NULL,
        pais VARCHAR(50) NOT NULL,
        email VARCHAR(50) DEFAULT NULL,
        PRIMARY KEY (id_cliente)
    )ENGINE=INNODB;  
     */
    private int idCliente;
    private String nombre;
    private String calle;
    private int numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String calle, int numero, String codigoPostal, String ciudad, String pais, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
