/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1_1.Persistencia;

import com.mycompany.practica1_1.Dominio.Usuario.Usuario;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author irina
 */
public class UsuarioDAO extends DAO{
    public void guardarUsuario(Usuario user) throws Exception {
        try {
            if (user == null) {
                throw new Exception("DEBE INDICAR UN USUARIO");
            }
            String sql = "INSERT INTO Usuario (correoElectronico, clave)"
                    + " VALUES ('" + user.getCorreoElectronico() + "' , '"
                    + user.getClave() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }
    }

    public void modificarUsuario(Usuario user) throws Exception {
        try {
            if (user == null) {
                throw new Exception("DEBE INDICAR UN USUARIO A MODIFICAR");
            }
            String sql = "UPDATE Usuario SET "
                    + "clave = '" + user.getClave() + "' WHERE correoElectronico = '"
                    + user.getCorreoElectronico() + "';";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }
    }
    
    public void eliminarUsuario(String email) throws Exception{
        try{
            String sql = "DELETE FROM Usuario WHERE correoElectronico = '" + email + "';";
            insertarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }
    
    public Usuario buscarUsuarioPorEmail(String email) throws Exception{
        try{
            
            String sql = "SELECT * "
                    + "FROM Usuario "
                    + "WHERE correoElectronico = '" + email + "';";
            consultarBase(sql);
            
            Usuario user = null;
            
            while (resultado.next()) {
                user = new Usuario();
                user.setId(resultado.getInt(1));
                user.setCorreoElectronico(resultado.getString(2));
                user.setClave(resultado.getString(3));
            }
            desconectarBase();
            return user;
            
        }catch(Exception e){
            desconectarBase();
            throw e;
        }

    }
    
    //CASO PARA VARIOS USUARIOS
    public Collection<Usuario> listarUsuarios() throws Exception{
        try {
            String sql = "SELECT * "
                    + "FROM USUARIO";
            
            consultarBase(sql);
            
            Usuario user = null;
            Collection<Usuario> users = new ArrayList();
            while (resultado.next()) {
                user = new Usuario();
                user.setId(resultado.getInt("id"));
                user.setCorreoElectronico(resultado.getString(2));
                user.setClave(resultado.getString(3));
                
                users.add(user);
            }
            desconectarBase();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("ERROR DE SISTEMA");
        }
    }
    
    public Usuario buscarUsuarioPorId(Integer id) throws Exception {
        try {

            String sql = "SELECT * FROM Usuario "
                    + " WHERE id = '" + id + "'";

            consultarBase(sql);

            Usuario usuario = null;
            while (resultado.next()) {
                usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
