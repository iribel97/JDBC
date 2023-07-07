/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estancias;

import Servicios.Server;

/**
 *
 * @author irina
 */
public class Estancias {

    public static void main(String[] args) throws Exception {
        Server serv = new Server();
        boolean bandera;
        do {
            bandera = serv.menu();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while (bandera);
        
        
    }
}
