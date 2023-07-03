/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda.persistencia;

import com.mycompany.tienda.entidades.Fabricante;

/**
 *
 * @author irina
 */
public final class DAOFabricante extends DAO {

    //PREPARAMOS LOS SCRIPTS
    /*
        PARA INSERTAR EN LA TABLA FABRICANTE
     */
    public void insertFab(Fabricante fab) throws Exception {

        try {

            if (fab == null) {
                throw new Exception("DEBE INDICAR UN FABRICANTE");
            }

            //INSERT INTO fabricante VALUES(1, 'Asus');
            /*
                El codigo no se lo especifica en el insert porque es auto increment
             */
            String sql = "INSERT INTO Fabricante (nombre) VALUES ( '" + fab.getNombre() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    /*
        PARA MODIFICAR EN LA TABLA FABRICANTE
     */
    public void updateFab(Fabricante fab) {
        try {

        } catch (Exception e) {

            throw e;

        }
    }
}
