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
    ServerCliente servCli = new ServerCliente();
    ServerEstancia servEst = new ServerEstancia();
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
        } while (opc > 11);

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
                try {
                servFam.showFamiliesByEmail();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 3");
            }

            break;
            case 4:
                try {
                scan.nextLine();
                System.out.println("|-----------------------------------------------------------|");
                System.out.println("|      AVERIGUEMOS QUE CASAS SE ENCUENTRAN DISPONIBLES      |");
                System.out.println("|-----------------------------------------------------------|");
                System.out.print(" - INGRESE UNA FECHA (yyyy-mm-dd): ");
                String fechaI = scan.nextLine();
                System.out.print(" - CANTIDAD DE DIAS QUE DESEA ESTAR: ");
                int cantidad = scan.nextInt();
                servCas.showHousesByDateUser(fechaI, cantidad);
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 4", e);
            }
            break;
            case 5:
                try {
                servCli.showClients();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 5: ", e);
            }
            break;
            case 6:
                try {
                servEst.showEstancias();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 6 SERVER: ", e);
            }
            break;
            case 7:
                try {
                servCas.showHousesPrice();
            } catch (Exception e) {
                throw new Exception("ERROR OPCION 6 SERVER: ", e);
            }

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
