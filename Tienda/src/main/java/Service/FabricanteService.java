/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Fabricante;
import Persistencia.DAOFabricante;
import java.util.Collection;

/**
 *
 * @author irina
 */
public class FabricanteService extends Imprimir{
    private DAOFabricante dao;

    public FabricanteService() {
        this.dao = new DAOFabricante();
    }
    

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
    
    //DEVOLVER UN USUARIO
    public Fabricante selectFab(int id) throws Exception{
        
        try {
            
            if (id == 0) {
                throw new Exception("DEBE DE INDICAR EL ID");
            }
            
           Fabricante fab = dao.buscarFabID(id);
           
           return fab;
            
        } catch (Exception e) {
            
            throw e;
        }
        
    }
    
    public void mostrarFabricante() throws Exception{
        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vCodigo = "_____ CODIGO _____";
            Collection<Fabricante> fabricantes = dao.listarFab();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                         LISTADO DE FABRICANTES                        |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|" + vCodigo + "|" + vNombre + "|");
            for(Fabricante aux : fabricantes){
                imprimirCasilla(String.valueOf(aux.getCodigo()), vCodigo);
                imprimirCasilla(aux.getNombre(), vNombre);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {
            
            throw e;
            
        }
    }
}
