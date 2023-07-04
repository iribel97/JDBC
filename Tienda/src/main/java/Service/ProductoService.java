/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import Entidades.Producto;
import Persistencia.DAOFabricante;
import Persistencia.DAOProducto;
import java.util.Collection;

/**
 *
 * @author irina
 */
public class ProductoService extends Imprimir{
    
    DAOProducto dao;

    public ProductoService() {
        this.dao = new DAOProducto(new FabricanteService(new DAOFabricante()));
    }
    
    public ProductoService(DAOProducto dao) {
        this.dao = dao;
    }
    
    public Collection<Producto> devolverProducto() throws Exception{
        try {
            Collection<Producto> productos = dao.selectProduct();
            
            return productos;
        } catch (Exception e) {
            throw new Exception("ERROR");
        }
    }
    
    public void mostrarNombreProduct() throws Exception{
        
        
        try {
            String vNombre = "_______________________ NOMBRE _____________________";
            Collection<Producto> productos = devolverProducto();
            System.out.println("|----------------------------------------------------|");
            System.out.println("|              LISTADO DE LOS PRODUCTOS              |");
            System.out.println("|----------------------------------------------------|");
            System.out.println("|"+vNombre+"|");
            for(Producto aux : productos){
                imprimirCasilla(aux.getNombre(), vNombre);
                System.out.println("|");
            }
            System.out.println("|----------------------------------------------------|");
        } catch (Exception e) {
            
            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");
            
        }

    }
    
    public void mostrarNombrePrecioProduct() throws Exception{
        
        
        try {
            String vNombre = "_______________________ NOMBRE _____________________", 
                    vPrecio ="_____ PRECIO _____";
            Collection<Producto> productos = devolverProducto();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                        LISTADO DE LOS PRODUCTOS                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|"+vNombre+"|"+ vPrecio + "|");
            for(Producto aux : productos){
                imprimirCasilla(aux.getNombre(), vNombre);
                imprimirCasilla(String.valueOf(aux.getPrecio()), vPrecio);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {
            
            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");
            
        }

    }
    
    
}
