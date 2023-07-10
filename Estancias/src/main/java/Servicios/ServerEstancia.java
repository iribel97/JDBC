/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Estancia;
import Persistencia.DAOEstancia;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class ServerEstancia extends Output{
    DAOEstancia dao = new DAOEstancia();
    
     public void showEstancias() throws Exception {
        try {
            String vID = "_ ID _", vIdCasa = "_ ID CASA _", vDesde = "____ DESDE ____",
                    vHasta = "____ HASTA ____";
            ArrayList<Estancia> estancias = dao.selectEstancias();
            System.out.println("HOLA");
            

            System.out.println("|--------------------------------------------------|");
            System.out.println("|        ESTANCIAS QUE HAN SIDO RESERVADAS         |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|" + vID + "|" + vIdCasa + "|" + vDesde + "|" + vHasta + "|");

            for (Estancia est : estancias) {
                imprimirCasilla(String.valueOf(est.getIdEstancia()), vID);
                imprimirCasilla(String.valueOf(est.getCasa().getIdCasa()), vIdCasa);
                imprimirCasilla(String.valueOf(est.getFechaDesde()), vDesde);
                imprimirCasilla(String.valueOf(est.getFechaHasta()), vHasta);

                System.out.println("|");
            }

            System.out.println("|--------------------------------------------------|");

        } catch (Exception e) {
            throw new Exception("ERROR EN SERVERESTANCIA METODO 1");
        }
    }

}
