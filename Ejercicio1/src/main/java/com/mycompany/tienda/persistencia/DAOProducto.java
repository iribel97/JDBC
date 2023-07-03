/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.persistencia;

import com.mycompany.tienda.entidades.Producto;

/**
 *
 * @author irina
 */
public final class DAOProducto extends DAO {

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
    public void deletProducto(Producto product) throws Exception{
        try {
            
            if (product == null) {
                throw new Exception("DEBE DE INDICAR EL PRODUCTO A ELIMINAR EN LA BASE DE DATOS");
            }
            
            String sql = "DELETE FROM Producto Where codigo = " + product.getCodigo();
            
        } catch (Exception e) {
            
            throw e;
            
        }finally{
            
            desconectarBase();
            
        }
    }
    
    /*
        PARA BUSCAR EN LA TABLA FABRICANTE
     */
    
}
