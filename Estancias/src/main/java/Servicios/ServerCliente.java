/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Persistencia.DAOCliente;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class ServerCliente extends Output {

    DAOCliente dao = new DAOCliente();

    public void showClients() throws Exception {
        try {
            
            ArrayList<Cliente> clients = dao.selectClient();
            

            String vID = "_ ID _", vNombre = "____ NOMBRE ____", vCalle = "__________ CALLE __________",
                    vNum = "_ # _", vCodP = "__ COD POSTAL __", vCiudad = "____ CIUDAD ____",
                    vPais = "____ PAIS ____", vEmail = "________ EMAIL ________";

            System.out.println("|----------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|                                              CLIENTES QUE HAN REALIZADO UNA ESTANCIA                                             |");
            System.out.println("|----------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|" + vID + "|" + vNombre + "|" + vCalle + "|" + vNum + "|" + vCodP + "|" + vCiudad + "|" + vPais + "|" + vEmail + "|");
            for (Cliente cli : clients) {
                imprimirCasilla(String.valueOf(cli.getIdCliente()), vID);
                imprimirCasilla(cli.getNombre(), vNombre);
                imprimirCasilla(cli.getCalle(), vCalle);
                imprimirCasilla(String.valueOf(cli.getNumero()), vNum);
                imprimirCasilla(cli.getCodigoPostal(), vCodP);
                imprimirCasilla(cli.getCiudad(), vCiudad);
                imprimirCasilla(cli.getPais(), vPais);
                imprimirCasilla(cli.getEmail(), vEmail);
                System.out.println("|");
            }
            System.out.println("|----------------------------------------------------------------------------------------------------------------------------------|");

        } catch (Exception e) {
            throw new Exception("ERROR EN EL SERVICE CLIENTE");
        }

    }

}
