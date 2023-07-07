/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author irina
 */
public class DAOFamilia extends DAO{
    
    public Collection<Familia> selectFamilyByNum() throws Exception{
        DAOCasa daoC = new DAOCasa();
        try {
            
            String sql = "SELECT * FROM familias WHERE num_hijos < 3 AND edad_maxima < 10;";
            
            consultarBase(sql);
            
            Familia family = new Familia();
            Collection<Familia> familys = new ArrayList();
            
            while (resultado.next()) {
                family.setIdFamilia(resultado.getInt(1));
                family.setNombre(resultado.getString(2));
                family.setEdadMin(resultado.getInt(3));
                family.setEdadMax(resultado.getInt(4));
                family.setNomHijos(resultado.getInt(5));
                family.setEmail(resultado.getString(6));
                family.setCasaFamilia(daoC.selectHouseByID(resultado.getInt(7)));
                familys.add(family);
                
            }
            desconectarBase();
            return familys;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
