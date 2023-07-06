/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Producto;
import Persistencia.DAOFabricante;
import Persistencia.DAOProducto;
import java.util.Collection;
import java.util.Scanner;


/**
 *
 * @author irina
 */
public class ProductoService extends Imprimir {

    DAOProducto dao;
    FabricanteService fabServ = new FabricanteService(new DAOFabricante());
    Scanner scanP = new Scanner(System.in);

    public ProductoService() {
        this.dao = new DAOProducto(new FabricanteService(new DAOFabricante()));
    }

    public ProductoService(DAOProducto dao) {
        this.dao = dao;
    }
    
    public void ingresarProducto() throws Exception{
        String nombreProduct;
        double precio;
        try {
            Producto product = new Producto();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|              INGRESEMOS LOS DATOS DEL PRODUCTO A AGREGAR              |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.print("     NOMBRE: ");
            product.setNombre(scanP.nextLine());
            scanP.nextLine();
            System.out.print("     PRECIO: ");
            product.setPrecio(scanP.nextDouble());
            fabServ.mostrarFabricante();
            System.out.print("   SELECCIONE CODIGO DEL FABRICANTE: ");
            product.setFabricante(fabServ.selectFab(scanP.nextInt()));
            dao.insertProducto(product);
            
        } catch (Exception e) {
            throw new Exception("ERROR INGRESANDO PRODUCTO");
        }
    }


    public void mostrarNombreProduct() throws Exception {

        try {
            String vNombre = "_______________________ NOMBRE _____________________";
            Collection<Producto> productos = dao.selectProduct();
            System.out.println("|----------------------------------------------------|");
            System.out.println("|              LISTADO DE LOS PRODUCTOS              |");
            System.out.println("|----------------------------------------------------|");
            System.out.println("|" + vNombre + "|");
            for (Producto aux : productos) {
                imprimirCasilla(aux.getNombre(), vNombre);
                System.out.println("|");
            }
            System.out.println("|----------------------------------------------------|");
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }

    }

    public void mostrarNombrePrecioProduct() throws Exception {

        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vPrecio = "_____ PRECIO _____";
            Collection<Producto> productos = dao.selectProduct();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                        LISTADO DE LOS PRODUCTOS                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|" + vNombre + "|" + vPrecio + "|");
            for (Producto aux : productos) {
                imprimirCasilla(aux.getNombre(), vNombre);
                imprimirCasilla(String.valueOf(aux.getPrecio()), vPrecio);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }

    }

    public void mostrarPrecioEntreProduct() throws Exception {

        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vPrecio = "_____ PRECIO _____";
            Collection<Producto> productos = dao.productoByPrice();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                        LISTADO DE LOS PRODUCTOS                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|" + vNombre + "|" + vPrecio + "|");
            for (Producto aux : productos) {
                imprimirCasilla(aux.getNombre(), vNombre);
                imprimirCasilla(String.valueOf(aux.getPrecio()), vPrecio);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }

    }

    public void mostrarProductPortatil() throws Exception {

        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vPrecio = "_____ PRECIO _____";
            Collection<Producto> productos = dao.productoByPortatil();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                        LISTADO DE LOS PRODUCTOS                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|" + vNombre + "|" + vPrecio + "|");
            for (Producto aux : productos) {
                imprimirCasilla(aux.getNombre(), vNombre);
                imprimirCasilla(String.valueOf(aux.getPrecio()), vPrecio);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }

    }

    public void mostrarProductBarato() throws Exception {

        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vPrecio = "_____ PRECIO _____";
            Producto producto = dao.productBarato();
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|                        LISTADO DE LOS PRODUCTOS                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|" + vNombre + "|" + vPrecio + "|");

            imprimirCasilla(producto.getNombre(), vNombre);
            imprimirCasilla(String.valueOf(producto.getPrecio()), vPrecio);
            System.out.println("|");

            System.out.println("|-----------------------------------------------------------------------|");
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }

    }
    
    public void mostrarTodosLosProductos() throws Exception{
        
        try {
            String vNombre = "_______________________ NOMBRE _____________________",
                    vPrecio = "_____ PRECIO _____", vCodigo = "_ CODIGO _", vFabricante = "___ FABRICANTE ___";
            Collection<Producto> productos = dao.selectProduct();
            System.out.println("|-----------------------------------------------------------------------------------------------------|");
            System.out.println("|                                       LISTADO DE LOS PRODUCTOS                                      |");
            System.out.println("|-----------------------------------------------------------------------------------------------------|");
            System.out.println("|_ CODIGO _|_______________________ NOMBRE _____________________|_____ PRECIO _____|___ FABRICANTE ___|");
            for (Producto aux : productos) {
                imprimirCasilla(String.valueOf(aux.getCodigo()), vCodigo);
                imprimirCasilla(aux.getNombre(), vNombre);
                imprimirCasilla(String.valueOf(aux.getPrecio()), vPrecio);
                imprimirCasilla(aux.getFabricante().getNombre(), vFabricante);
                System.out.println("|");
            }
            System.out.println("|-----------------------------------------------------------------------------------------------------|");
            System.out.print("   INGRESE CODIGO DE PRODUCTO A MODIFICAR: ");
            Producto product = dao.selectProductId(scanP.nextInt());
            
            menuModifProduct();
            int opc = scanP.nextInt();
            switch (opc) {
                case 1:
                    scanP.nextLine();
                    System.out.println("|-------------------------------------|");
                    System.out.print("   NUEVO NOMBRE: ");
                    product.setNombre(scanP.nextLine());
                    dao.updateProduct(product, opc);
                    
                    break;
                case 2:
                    System.out.println("|-------------------------------------|");
                    System.out.print("   NUEVO PRECIO: ");
                    product.setPrecio(scanP.nextDouble());
                    dao.updateProduct(product, opc);
                    break;
                case 3:
                    fabServ.mostrarFabricante();
                    System.out.print("   SELECCIONE EL ID DEL FABRICANTE: ");
                    product.setFabricante(fabServ.selectFab(scanP.nextInt()));
                    dao.updateProduct(product, opc);
                    break;
            }
        } catch (Exception e) {

            throw new Exception("ERROR MOSTRANDO NOMBRE DE PRODUCTOS");

        }
        
    }

}
