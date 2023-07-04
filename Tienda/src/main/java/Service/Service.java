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

    public boolean menu() throws Exception {
        Scanner scaner = new Scanner(System.in);
        int opc;

        do {

            try {

                menuGeneral();
                opc = scaner.nextInt();

            } catch (Exception e) {
                mensajeE1();
                opc = 10;
            }

        } while (opc > 10);

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
                try {
                proServ.mostrarPrecioEntreProduct();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 4:
                try {
                proServ.mostrarProductPortatil();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 5:
                try {
                proServ.mostrarProductBarato();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 6:
                try {
                proServ.ingresarProducto();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
            break;
            case 7:
                try {
                scaner.nextLine();
                System.out.print("  INGRESE NOMBRE DEL FABRICANTE: ");
                fabServ.crearFab(scaner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }

            break;
            case 8:
                try {
               proServ.mostrarTodosLosProductos();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error del sistema por \n" + e.getMessage());
            }
                break;
            case 9:
                break;
        }
        return opc == 9;
    }

}
