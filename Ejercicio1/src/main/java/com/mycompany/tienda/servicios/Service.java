/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.servicios;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Service {
    
    Imprimir imp;
    
    public void menu(){
        Scanner scaner = new Scanner(System.in);
        int opc;
        
        do {
            
            try {
                
                imp.menuGeneral();
                opc = scaner.nextInt();
                
            } catch (Exception e) {
                imp.mensajeE1();
                opc = 9;
            }
            
        } while (opc > 8);
        
        switch (opc) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        
        
    }
    
    
}
