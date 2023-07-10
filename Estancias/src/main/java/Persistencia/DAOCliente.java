/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class DAOCliente extends DAO{
    
    //DEVOLVER UN SOLO CLIENTE POR MEDIO DEL ID
    public Cliente selectClientByID(int id) throws Exception{
        try {
            String sql = "SELECT * FORM clientes WHERE id_cliente = " + id;
            
            consultarBase(sql);
            
            Cliente client = new Cliente();
            
            while (resultado.next()) {
                
                client.setIdCliente(resultado.getInt(1));
                client.setNombre(resultado.getString(2));
                client.setCalle(resultado.getString(3));
                client.setNumero(resultado.getInt(4));
                client.setCodigoPostal(resultado.getString(5));
                client.setCiudad(resultado.getString(6));
                client.setPais(resultado.getString(7));
                client.setEmail(resultado.getString(8));
            }
            return client;
        } catch (Exception e) {
            throw new Exception("PROBLEMAS EN EL DAO CLIENTE, METODO 1");
        }
    }
    
    //DEVOLEVER TODOS LOS CLIENTES
    public ArrayList<Cliente> selectClient() throws Exception{
        try {
            String sql = "SELECT * FORM clientes";
            
            consultarBase(sql);
            
            Cliente client;
            
            ArrayList<Cliente> clients = new ArrayList();
            
            while (resultado.next()) {
                client = new Cliente();
                client.setIdCliente(resultado.getInt(1));
                client.setNombre(resultado.getString(2));
                client.setCalle(resultado.getString(3));
                client.setNumero(resultado.getInt(4));
                client.setCodigoPostal(resultado.getString(5));
                client.setCiudad(resultado.getString(6));
                client.setPais(resultado.getString(7));
                client.setEmail(resultado.getString(8));
                clients.add(client);
            }
            return clients;
        } catch (Exception e) {
            throw new Exception("PROBLEMAS EN EL DAO CLIENTE, METODO 1");
        }
    }
}
