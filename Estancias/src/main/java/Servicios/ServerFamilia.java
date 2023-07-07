/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Familia;
import Persistencia.DAOFamilia;

import java.util.Collection;

/**
 *
 * @author irina
 */
public class ServerFamilia extends Output{
    private DAOFamilia dao = new DAOFamilia();
    
    public void showFamiliesConditionKids() throws Exception{
        try {
            String vFam = "___________ FAMILIA __________",vEdadMin = "__ EDAD MIN __",
                    vNum = "__ # HIJOS _";
            Collection<Familia> families = dao.selectFamilyByNum();
            
            System.out.println("|----------------------------------------------------------|");
            System.out.println("| FAMILIAS CON MENOS DE 3 HIJOS Y EDAD MAXIMA INFERIOR A 10|");
            System.out.println("|----------------------------------------------------------|");
            System.out.println("|"+vFam+"|"+vEdadMin+"|"+vNum+"|");
            
            for(Familia fam : families){
                imprimirCasilla(fam.getNombre(), vFam);
                imprimirCasilla(String.valueOf(fam.getEdadMin()), vEdadMin);
                imprimirCasilla(String.valueOf(fam.getNomHijos()), vNum);
                System.out.println("|");
            }
            System.out.println("|----------------------------------------------------------|");
        } catch (Exception e) {
            throw e;
        }
        
    }
}
