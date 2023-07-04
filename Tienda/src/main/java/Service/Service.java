/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Service extends Imprimir {

    FabricanteService fabServ = new FabricanteService();
    ProductoService proServ = new ProductoService();

    public void menu() throws Exception {
        Scanner scaner = new Scanner(System.in);
        int opc;

        do {

            try {

                menuGeneral();
                opc = scaner.nextInt();

            } catch (Exception e) {
                mensajeE1();
                opc = 9;
            }

        } while (opc > 8);

        switch (opc) {
            case 1:
                try {
                    proServ.mostrarNombreProduct();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error del sistema por \n" + e.getMessage());
                }

            break;
            case 2:
                try {
                    proServ.mostrarNombrePrecioProduct();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error del sistema por \n" + e.getMessage());
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
                System.out.print("  INGRESE NOMBRE DEL FABRICANTE: ");
                fabServ.crearFab(scaner.nextLine());
                break;
            case 8:
                break;
        }

    }

}
