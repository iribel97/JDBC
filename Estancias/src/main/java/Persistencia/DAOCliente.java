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
            String sql = "SELECT * FROM clientes WHERE id_cliente = " + id + ";";
            
            consultarBase(sql);
            
            Cliente client = new Cliente();
            
            while (resultado.next()) {
                
                client.setIdCliente(resultado.getInt("id_cliente"));
                client.setNombre(resultado.getString("nombre"));
                client.setCalle(resultado.getString("calle"));
                client.setNumero(resultado.getInt("numero"));
                client.setCodigoPostal(resultado.getString("codigo_postal"));
                client.setCiudad(resultado.getString("ciudad"));
                client.setPais(resultado.getString("pais"));
                client.setEmail(resultado.getString("email"));
            }
            desconectarBase();
            return client;
        } catch (Exception e) {
            throw new Exception("PROBLEMAS EN EL DAO CLIENTE, METODO 1");
        }
    }
    
    //DEVOLEVER TODOS LOS CLIENTES
    public ArrayList<Cliente> selectClient() throws Exception{
        try {
            String sql = "SELECT * FROM clientes;";
            
            consultarBase(sql);
            
            Cliente client;
            
            ArrayList<Cliente> clients = new ArrayList();
            
            while (resultado.next()) {
                client = new Cliente();
                client.setIdCliente(resultado.getInt("id_cliente"));
                client.setNombre(resultado.getString("nombre"));
                client.setCalle(resultado.getString("calle"));
                client.setNumero(resultado.getInt("numero"));
                client.setCodigoPostal(resultado.getString("codigo_postal"));
                client.setCiudad(resultado.getString("ciudad"));
                client.setPais(resultado.getString("pais"));
                client.setEmail(resultado.getString("email"));
                clients.add(client);
            }
            desconectarBase();
            return clients;
        } catch (Exception e) {
            throw new Exception("PROBLEMAS EN EL DAO CLIENTE, METODO 1");
        }
    }
}
