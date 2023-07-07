/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Server extends Output {

    ServerFamilia servFam = new ServerFamilia();
    ServerCasa servCas = new ServerCasa();
    Scanner scan = new Scanner(System.in);

    public boolean menu() throws Exception {
        int opc;
        do {
            try {
                menuG();
                opc = scan.nextInt();
            } catch (Exception e) {
                opc = 12;
                throw new Exception("ERROR EN MENU PRINCIPAL");
                
            }
        } while (opc>11);
        switch (opc) {
            case 1:
                try {
                servFam.showFamiliesConditionKids();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 1");
            }
                break;
            case 2:
                try {
                servCas.showHousesByAugustMonth();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 2");
            }
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
            case 9:
                
                break;
            case 10:
                
                break;
            case 11:
                
                break;
            
        }
        return opc < 11;
    }
}
