/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;

import Service.Service;

/**
 *
 * @author irina
 */
public class Tienda {

    public static void main(String[] args) throws Exception {
        Service serv = new Service();
        
        try {
            serv.menu();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
    }
}
