/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Casa;
import Persistencia.DAOCasa;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServerCasa extends Output{
    
    DAOCasa dao = new DAOCasa();
    
    //Casa(int idCasa, String calle, int numero, 
    //String codigoPostal, String ciudad, String pais, 
    //LocalDate fechaDesde, LocalDate fechaHasta, int tiempoMin, 
    //int tiempoMax, double precioHabitacion, String tipoVivienda) {
    
    public void showHousesByAugustMonth() throws Exception{
        try {
            String vID = "_ ID _", vCalle = "_____ CALLE _____", vNum = "_ # _",
                    vCiudad = "___ CIUDAD ___", vDesde = "__ FECHA DESDE __",
                    vHasta = "__ FECHA HASTA __", vPrecio = "__ PRECIO __",
                    vTipoV = "__ TIPO VIVIENDA __";
            ArrayList<Casa> houses = dao.selectHouseByDate();
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|                        CASAS DISPONIBLES ENTRE EL 1/AGO/2020 AL 31/AGO/2020 EN REINO UNIDO                       |");
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|"+vID+"|"+vCalle+"|"+vNum+"|"+vCiudad+"|"+vDesde+"|"+vHasta+"|"+vPrecio+"|"+vTipoV+"|");
            for(Casa cas : houses){
                imprimirCasilla(String.valueOf(cas.getIdCasa()), vID);
                imprimirCasilla(cas.getCalle(), vCalle);
                imprimirCasilla(String.valueOf(cas.getNumero()), vNum);
                imprimirCasilla(cas.getCiudad(), vCiudad);
                imprimirCasilla(String.valueOf(cas.getFechaDesde()), vDesde);
                imprimirCasilla(String.valueOf(cas.getFechaHasta()), vHasta);
                imprimirCasilla(String.valueOf(cas.getPrecioHabitacion()), vPrecio);
                imprimirCasilla(cas.getTipoVivienda(), vTipoV);
                System.out.println("|");
                
            }
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
        } catch (Exception e) {
            throw new Exception("ERROR EN EL METODO SERVICES");
        }
        
    }
    
    public void showHousesByDateUser(String fechaI, int cantidad) throws Exception{
        
        
        try {
            String vID = "_ ID _", vCalle = "_____ CALLE _____", vNum = "_ # _",
                    vCiudad = "___ CIUDAD ___", vDesde = "__ FECHA DESDE __",
                    vHasta = "__ FECHA HASTA __", vPrecio = "__ PRECIO __",
                    vTipoV = "__ TIPO VIVIENDA __";
            
            
            ArrayList<Casa> houses = dao.selectHouseByUser(fechaI, cantidad);
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|                                                 CASAS DISPONIBLES                                                |");
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|"+vID+"|"+vCalle+"|"+vNum+"|"+vCiudad+"|"+vDesde+"|"+vHasta+"|"+vPrecio+"|"+vTipoV+"|");
            for(Casa cas : houses){
                imprimirCasilla(String.valueOf(cas.getIdCasa()), vID);
                imprimirCasilla(cas.getCalle(), vCalle);
                imprimirCasilla(String.valueOf(cas.getNumero()), vNum);
                imprimirCasilla(cas.getCiudad(), vCiudad);
                imprimirCasilla(String.valueOf(cas.getFechaDesde()), vDesde);
                imprimirCasilla(String.valueOf(cas.getFechaHasta()), vHasta);
                imprimirCasilla(String.valueOf(cas.getPrecioHabitacion()), vPrecio);
                imprimirCasilla(cas.getTipoVivienda(), vTipoV);
                System.out.println("|");
                
            }
            System.out.println("|------------------------------------------------------------------------------------------------------------------|");
            
            
        } catch (Exception e) {
            throw new Exception("ERROR EN EL METODO SERVICES PARA MOSTRAR CASAS DURANTE UN TIEMPO DETERMINADO");
        }
    }
    
}
