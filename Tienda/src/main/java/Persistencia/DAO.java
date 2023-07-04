/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author irina
 */
public abstract class DAO {
    protected Connection conection = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(DRIVER);
            String urlBD = "jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false&serverTimezone=America/Los_Angeles";
            conection = DriverManager.getConnection(urlBD, USER, PASSWORD);
        } catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    protected void desconectarBase() throws Exception{
        try{
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conection != null) {
                conection.close();
            }
        }catch(Exception e){
            throw e; 
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception {
        try{
            conectarBase();
            sentencia = conection.createStatement();
            sentencia.executeUpdate(sql);
        }catch(ClassNotFoundException | SQLException ex){
            //conection.rollback();
            /*
                Descomentar la línea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en workbench
            
                SET autocommit=1;
                COMMIT;
                
                ** Sin rollback igual anda
            */
            
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conection.createStatement();
            resultado = sentencia.executeQuery(sql);
        }catch(Exception ex){
            throw ex;
        }
    }
}
