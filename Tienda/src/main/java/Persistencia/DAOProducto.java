/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Fabricante;
import Entidades.Producto;
import Service.FabricanteService;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author irina
 */
public final class DAOProducto extends DAO {

    FabricanteService fabServ;

    public DAOProducto(FabricanteService fabServ) {
        this.fabServ = fabServ;
    }

    //PREPARAMOS LOS SCRIPTS
    /*
        PARA INSERTAR EN LA TABLA FABRICANTE
     */
    public void insertProducto(Producto product) throws Exception {
        try {

            if (product == null) {
                throw new Exception("DEBE DE INDICAR EL PRODUCTO A INSERTAR EN LA BASE DE DATOS");
            }

            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + product.getNombre() + "' , "
                    + product.getPrecio() + " , "
                    + product.getFabricante().getCodigo() + ");";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();

        }
    }

    /*
        PARA ELIMINAR EN LA TABLA FABRICANTE
     */
    public void deletProducto(Producto product) throws Exception {
        try {

            if (product == null) {
                throw new Exception("DEBE DE INDICAR EL PRODUCTO A ELIMINAR EN LA BASE DE DATOS");
            }

            String sql = "DELETE FROM Producto Where codigo = " + product.getCodigo();

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();

        }
    }
    
    /*
        EDITAR PRODUCTO
    */
    
    public void updateProduct(Producto product, int opc) throws Exception{
        try {
            String sql;
            switch (opc) {
                case 1:
                    sql = "UPDATE Producto SET nombre = '" + product.getNombre() + "' WHERE codigo = " + product.getCodigo() + ";";
                    break;
                case 2:
                    sql = "UPDATE Producto SET precio = " + product.getPrecio() + " WHERE codigo = " + product.getCodigo() + ";";
                    break;
                case 3:
                    sql = "UPDATE Producto SET coigo_fabricante = " + product.getFabricante().getCodigo() + " WHERE codigo = " + product.getCodigo() + ";";
                    break;
                default:
                    throw new AssertionError();
            }
            
            insertarModificarEliminar(sql);
            
            
        } catch (Exception e) {
            throw e;
        }
    }

    /*
        PARA BUSCAR EN LA TABLA FABRICANTE
     */
    //Para retornar todos los productos
    public Collection<Producto> selectProduct() throws Exception {

        try {

            String sql = "SELECT * FROM Producto";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = fabServ.selectFab(idFab);
                product.setFabricante(fab);

                products.add(product);
                
            }
            
            desconectarBase();
            return products;

        } catch (Exception e) {

            throw e;

        }

    }
    
    public Collection<String> selectProductByName() throws Exception {

        try {

            String sql = "SELECT DISTINCT nombre FROM Producto ";

            consultarBase(sql);

            Producto product = null;
            Collection<String> products = new ArrayList();

            while (resultado.next()) {

               

                products.add(resultado.getString("nombre"));
                
            }
            
            desconectarBase();
            return products;

        } catch (Exception e) {

            throw e;

        }

    }
    
    public Collection<Producto> productoByPrice() throws Exception{
        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 AND 202; ";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = fabServ.selectFab(idFab);
                product.setFabricante(fab);

                products.add(product);
                
            }
            desconectarBase();
            return products;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Producto> productoByPortatil() throws Exception{
        try {
            String sql = "SELECT * FROM Producto WHERE nombre like 'Port%'; ";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = fabServ.selectFab(idFab);
                product.setFabricante(fab);

                products.add(product);
                
            }
            desconectarBase();
            return products;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto productBarato() throws Exception{
        try {
            String sql = "SELECT * FROM Producto ORDER BY precio ASC LIMIT 1";

            consultarBase(sql);

            Producto product = null;
            

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = fabServ.selectFab(idFab);
                product.setFabricante(fab);

                
                
            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Producto selectProductId(int id) throws Exception{
        try {
            String sql = "SELECT * FROM Producto where codigo = " + id;

            consultarBase(sql);

            Producto product = null;
            

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = fabServ.selectFab(idFab);
                product.setFabricante(fab);

                
                
            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            throw e;
        }
    }

}
