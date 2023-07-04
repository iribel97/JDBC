/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

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
    
    // CASILLAS TABLA --------------------------------------------------------------------
    public void imprimirCasilla(String nombre, String variable) {
        int tamanio;
        String vAux;
        System.out.print("|");

        vAux = nombre;
        tamanio = vAux.length();

        if (tamanio % 2 == 0) {
            for (int i = 0; i < (variable.length() - tamanio) / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(vAux);
            for (int i = 0; i < (variable.length() - tamanio) / 2; i++) {
                System.out.print(" ");
            }
        } else {
            tamanio--;
            for (int i = 0; i < (variable.length() - tamanio) / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(vAux);
            for (int i = 0; i < (variable.length() - tamanio - 2) / 2; i++) {
                System.out.print(" ");
            }
        }
    }
}
