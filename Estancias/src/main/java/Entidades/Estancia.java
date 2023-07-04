/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author irina
 */
public class Estancia {

    /*
    CREATE TABLE estancias (
        id_estancia  INT UNSIGNED AUTO_INCREMENT NOT NULL,
        id_cliente INT UNSIGNED NOT NULL,
        id_casa INT UNSIGNED NOT NULL,
        nombre_huesped VARCHAR(70) NOT NULL,
        fecha_desde date NOT NULL,
        fecha_hasta date NOT NULL,
        PRIMARY KEY (id_estancia),
        FOREIGN KEY (id_cliente) REFERENCES clientes (id_cliente),
        FOREIGN KEY (id_casa) REFERENCES casas (id_casa)
    )ENGINE=INNODB;
     */
    private int idEstancia;
    private Cliente cliente;
    private Casa casa;
    private String nombreHuesped;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;

    public Estancia() {
    }

    public Estancia(int idEstancia, Cliente cliente, Casa casa, String nombreHuesped, LocalDate fechaDesde, LocalDate fechaHasta) {
        this.idEstancia = idEstancia;
        this.cliente = cliente;
        this.casa = casa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

}
