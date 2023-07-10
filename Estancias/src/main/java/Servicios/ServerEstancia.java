/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.*;
import Persistencia.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServerEstancia extends Output{
    DAOEstancia dao = new DAOEstancia();
    DAOCliente daoCli = new DAOCliente();
    Scanner scaner = new Scanner(System.in);
    
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
    
     
    public void insertEstancia() throws Exception{
        try {
            int idUsu;
            
            //PEDIR DATOS PRIMERO DE USUARIO
            System.out.println("|--------------------------------------------------------|");
            System.out.print("   INGRESE SU #: ");
            idUsu = scaner.nextInt();
            
            if (!verificUser(idUsu)) {
                
            }
            
        } catch (Exception e) {
            
            throw new Exception("ERROR EN SERVER ESTANCIA METODO 2");
        }
    }
    
    //VERIFICAR QUE EL USUARIO EXISTA
    private boolean verificUser(int idUsu) throws Exception{
        ArrayList<Cliente> client = daoCli.selectClient();
        
        for(Cliente cli : client){
            if (cli.getIdCliente() == idUsu) {
                return true;
            }
        }
        
        return false;
    }
}
