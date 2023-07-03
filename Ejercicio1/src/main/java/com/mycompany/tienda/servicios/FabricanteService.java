/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.servicios;

import com.mycompany.tienda.entidades.Fabricante;
import com.mycompany.tienda.persistencia.DAOFabricante;

/**
 *
 * @author irina
 */
public class FabricanteService {
    
    private DAOFabricante dao;

    public FabricanteService(DAOFabricante dao) {
        this.dao = dao;
    }

    public void crearFab(String nombre) throws Exception{
        try {
            
            if (nombre.length() > 100) {
                throw new Exception("EL NOMBRE DEL FABRICANTE NO DEBE DE EXCEDER LOS 100 CARACTERES");
            }
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("DEBE INDICAR EL NOMBRE DEL FABRICANTE");
            }
            
            if(dao.buscarFab(nombre) != null){
                throw new Exception("YA EXISTE UN FABRICANTE CON EL MISMO NOMBRE");
            }
            
            //CREAR FABRICANTE
            Fabricante fab = new Fabricante();
            
            //SETEAMOS LOS VALORES
            fab.setNombre(nombre);
            
            //LLAMAMOS A LA FUNCION DEL DAO QUE AGG EN LA BD
            dao.insertFab(fab);
            
        } catch (Exception e) {
            
            throw e;
            
        }
    }
    
    
}
