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
            
            Familia family;
            Collection<Familia> familys = new ArrayList();
            
            while (resultado.next()) {
                family = new Familia();
                family.setIdFamilia(resultado.getInt("id_familia"));
                family.setNombre(resultado.getString("nombre"));
                family.setEdadMin(resultado.getInt("edad_minima"));
                family.setEdadMax(resultado.getInt("edad_maxima"));
                family.setNomHijos(resultado.getInt("num_hijos"));
                family.setEmail(resultado.getString("email"));
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
