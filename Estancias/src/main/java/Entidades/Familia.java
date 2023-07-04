/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Familia {

    /*
    CREATE TABLE familias (
        id_familia INT UNSIGNED AUTO_INCREMENT NOT NULL,
        nombre VARCHAR(50) NOT NULL,
        edad_minima INT NOT NULL,
        edad_maxima INT NOT NULL,
        num_hijos INT NOT NULL,
        email VARCHAR(50) NOT NULL,
        id_casa_familia INT UNSIGNED NOT NULL,
        PRIMARY KEY (id_familia),
        FOREIGN KEY (id_casa_familia) REFERENCES casas (id_casa)
    )ENGINE=INNODB;
     */
    private int idFamilia;
    private String nombre;
    private int edadMin;
    private int edadMax;
    private int nomHijos;
    private String email;
    private Casa casaFamilia;

    public Familia() {
    }

    public Familia(int idFamilia, String nombre, int edadMin, int edadMax, int nomHijos, String email, Casa casaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.nomHijos = nomHijos;
        this.email = email;
        this.casaFamilia = casaFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public int getNomHijos() {
        return nomHijos;
    }

    public void setNomHijos(int nomHijos) {
        this.nomHijos = nomHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Casa getCasaFamilia() {
        return casaFamilia;
    }

    public void setCasaFamilia(Casa casaFamilia) {
        this.casaFamilia = casaFamilia;
    }

}
