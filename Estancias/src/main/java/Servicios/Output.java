/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

/**
 *
 * @author irina
 */
public class Output {
    
    public void menuG(){
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|                               MENU DE OPCIONES                              |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.println("|   1.- FAMILIAS CON MENOS DE 3 HIJOS Y EDAD MAXIMA INFERIOR A 10             |");
        System.out.println("|   2.- CASAS DISPONIBLES ENTRE EL 1/AGO/2020 AL 31/AGO/2020 EN REINO UNIDO   |");
        System.out.println("|   3.- FAMILIAS CUYO MAIL SEA 'HOTMAIL'                                      |");
        System.out.println("|   4.- CASAS DISPONIBLES                                                     |");
        System.out.println("|   5.- CLIENTES QUE REALIZARON UNA ESTANCIA CON SU DESCRIPCION               |");
        System.out.println("|   6.- ESTANCIAS QUE HAN SIDO RESERVADAS                                     |");
        System.out.println("|   7.- CASAS DE REINO UNIDO QUE INCREMENTO UN 5%                             |");
        System.out.println("|   8.- NUMERO DE CASAS QUE EXISTEN EN CADA PAIS                              |");
        System.out.println("|   9.- CASAS QUE HAN COMENTADO QUE ESTAN LIMPIAS                             |");
        System.out.println("|  10.- INSERTAR DATOS EN LA TABLA ESTANCIAS                                  |");
        System.out.println("|  11.- SALIR                                                                 |");
        System.out.println("|-----------------------------------------------------------------------------|");
        System.out.print("    SELECCIONE UNA OPCION: ");
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
