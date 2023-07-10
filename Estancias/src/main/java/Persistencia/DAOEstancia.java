/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Estancia;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class DAOEstancia extends DAO {

    public ArrayList<Estancia> selectEstancias() throws Exception {

        try {
            DAOCliente daoCli = new DAOCliente();
            DAOCasa daoCas = new DAOCasa();

            String sql = "SELECT * FROM estancias;";

            consultarBase(sql);

            Estancia estan;
            ArrayList<Estancia> estancias = new ArrayList();

            while (resultado.next()) {
                estan = new Estancia();

                estan.setIdEstancia(resultado.getInt("id_estancia"));
                estan.setCliente(daoCli.selectClientByID(resultado.getInt("id_cliente")));
                estan.setCasa(daoCas.selectHouseByID(resultado.getInt("id_casa")));
                estan.setNombreHuesped(resultado.getString("nombre_huesped"));
                estan.setFechaDesde(resultado.getDate("fecha_desde").toLocalDate());
                estan.setFechaHasta(resultado.getDate("fecha_hasta").toLocalDate());
                estancias.add(estan);

            }
            desconectarBase();
            return estancias;

        } catch (Exception e) {
            throw new Exception("ERROR EN DAOESTANCIA METODO 1");
        }
    }

    public void insertEstancia(Estancia estancia) throws ClassNotFoundException, SQLException, Exception {
        try {
            conectarBase();

            String sql = "INSERT INTO Casas (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) "
                    + "VALUES (?, ?, ?, ?, ?)";

            // Crear un objeto PreparedStatement para ejecutar la consulta con parámetros
            PreparedStatement statementp = conection.prepareStatement(sql);

            // Establecer los valores de los parámetros en la consulta
            statementp.setInt(1, estancia.getCliente().getIdCliente());
            statementp.setInt(2, estancia.getCasa().getIdCasa());
            statementp.setString(3, estancia.getNombreHuesped());
            statementp.setDate(4, java.sql.Date.valueOf(estancia.getFechaDesde()));
            statementp.setDate(5, java.sql.Date.valueOf(estancia.getFechaHasta()));
            
             // Ejecutar la consulta para insertar el producto en la base de datos
            statementp.executeUpdate();

            statementp.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            desconectarBase();
        }

    }
}
