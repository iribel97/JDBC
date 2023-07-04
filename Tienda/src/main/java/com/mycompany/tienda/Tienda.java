/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;

import Service.Service;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Tienda {

    public static void main(String[] args) throws Exception {
        Service serv = new Service();
        Scanner scan = new Scanner(System.in);
        boolean opc;
        
        try {
            do {
               opc = serv.menu();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            } while (!opc);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
    }
}
