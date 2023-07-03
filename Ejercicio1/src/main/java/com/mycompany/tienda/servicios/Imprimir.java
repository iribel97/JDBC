/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.servicios;

/**
 *
 * @author irina
 */
public class Imprimir {
    
    public void menuGeneral(){
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|                 MENU DE OPCIONES                    |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("| 1.- MOSTRAR NOMBRE DE TODOS LOS PRODUCTOS           |");
        System.out.println("| 2.- MOSTRAR NOMBRE Y PRECIO DE TODOS LOS PRODUCTO   |");
        System.out.println("| 3.- MOSTRAR PRODUCTOS CON PRECIO ENTRE 120 Y 202    |");
        System.out.println("| 4.- MOSTRAR PORTATILES                              |");
        System.out.println("| 5.- PRODUCTO MAS BARATO                             |");
        System.out.println("| 6.- INGRESAR PRODUCTO                               |");
        System.out.println("| 7.- INGRESAR FABRICANTE                             |");
        System.out.println("| 8.- EDITAR PRODUCTO                                 |");
        System.out.println("|-----------------------------------------------------|");
        System.out.print("    SELECCIONE UNA OPCION: ");
    }
    
    
    // ERRORES -----------------------------------------------
    
    public void mensajeE1(){
        System.out.println("OPCION NO ES UN NUMERO, INTENTELO DE NUEVO");
    }
    
}
