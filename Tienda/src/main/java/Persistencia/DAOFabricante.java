/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Fabricante;
import java.util.ArrayList;
import java.util.Collection;

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
    public void updateFab(Fabricante fab) throws Exception {
        try {

            if (fab == null) {
                throw new Exception("DEBE INDICAR UN FABRICANTE A MODIFICAR");
            }

            String sql = "UPDATE Fabricante SET nombre = '" + fab.getNombre() + "' WHERE codigo = " + fab.getCodigo() + ";";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }
    }

    /*
        PARA ELIMINAR EN LA TABLA FABRICANTE
     */
    public void deleteFab(String nombre) throws Exception {

        try {

            String sql = "DELETE FROM Fabricante WHERE nombre = '" + nombre + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    /*
        PARA DEVOLVER TODOS LOS REGISTROS DE LA TABLA FABRICANTE
     */
    public Collection<Fabricante> listarFab() throws Exception {

        try {

            String sql = "SELECT * FROM Fabricante";

            consultarBase(sql);

            Fabricante fab = null;
            Collection<Fabricante> listFab = new ArrayList();

            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));

                listFab.add(fab);

            }
            desconectarBase();
            return listFab;

        } catch (Exception e) {
            desconectarBase();
            throw new Exception("ERROR DE SISTEMA");
        }

    }
    
    /*
        PARA DEVOLVER SOLO UN REGISTRO DE LA TABLA FABRICANTE
     */
    public Fabricante buscarFab(String nombre) throws Exception{
        try {
            String sql = "SELECT * FROM Fabricante WHERE nombre = '" + nombre + "';";
            consultarBase(sql);
            
            Fabricante fab = null;
            
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
            }
            
            desconectarBase();
            return fab;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
    }
    
    public Fabricante buscarFabID(int id) throws Exception{
        try {
            String sql = "SELECT * FROM Fabricante WHERE codigo = " + id + ";";
            consultarBase(sql);
            
            Fabricante fab = null;
            
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
            }
            
            desconectarBase();
            return fab;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
    }
}
