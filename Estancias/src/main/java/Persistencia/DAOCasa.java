/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Casa;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author irina
 */
public final class DAOCasa extends DAO {

    //PREPARAR LOS SCRIPTS
    /*INSERTAR VALORES EN LA BASE DE DATOS*/
   
    
    public void insertarProducto(Casa house) throws SQLException, Exception {
        try {
            conectarBase(); 
            
           String sql = "INSERT INTO Casas (calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            // Crear un objeto PreparedStatement para ejecutar la consulta con parámetros
            PreparedStatement statementp = conection.prepareStatement(sql);
            
            // Establecer los valores de los parámetros en la consulta
            statementp.setString(1, house.getCalle());
            statementp.setInt(2, house.getNumero());
            statementp.setString(3, house.getCodigoPostal());
            statementp.setString(4, house.getCiudad());
            statementp.setString(5, house.getPais());
            statementp.setDate(6, java.sql.Date.valueOf(house.getFechaDesde()));
            statementp.setDate(7, java.sql.Date.valueOf(house.getFechaHasta()));
            statementp.setInt(8, house.getTiempoMin());
            statementp.setInt(9, house.getTiempoMax());
            statementp.setDouble(10, house.getPrecioHabitacion());
            statementp.setString(11, house.getTipoVivienda());
            
            // Ejecutar la consulta para insertar el producto en la base de datos
            statementp.executeUpdate();
            
            statementp.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase(); 
        }
    }
    
    /*DEVOLVER UNA CASA POR MEDIO DEL ID*/
    public Casa selectHouseByID(int id) throws Exception{
        
        try {
            
            if (id == 0) {
                throw new Exception("");
            }
            
            String sql = "SELECT * FROM Casa WHERE id_casa = " + id + ";";
            
            consultarBase(sql);
            
            Casa house = new Casa();
            
            while(resultado.next()){
                house.setIdCasa(resultado.getInt(1));
                house.setCalle(resultado.getString(2));
                house.setNumero(resultado.getInt(3));
                house.setCodigoPostal(resultado.getString("codigo_postal"));
                house.setCiudad(resultado.getString("ciudad"));
                house.setPais(resultado.getString("pais"));
                house.setFechaDesde(LocalDate.of(resultado.getDate("fecha_desde").getYear(), resultado.getDate("fecha_desde").getMonth(), resultado.getDate("fecha_desde").getDay()));
                house.setFechaHasta(LocalDate.of(resultado.getDate("fecha_hasta").getYear(), resultado.getDate("fecha_hasta").getMonth(), resultado.getDate("fecha_hasta").getDay()));
                house.setTiempoMin(resultado.getInt("tiempo_minimo"));
                house.setTiempoMax(resultado.getInt("tiempo_maximo"));
                house.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                house.setTipoVivienda(resultado.getString("tipo_vivienda"));
            }
            
            desconectarBase();
            return house;
            
        } catch (Exception e) {
            
            throw e;
            
        }
        
    }
    
    /*DEVOLVER TODOS LOS REGISTROS DE LA TABLA CASA*/
    public Collection<Casa> selectHouse(int id) throws Exception{
        
        try {
            
            if (id == 0) {
                throw new Exception("");
            }
            
            String sql = "SELECT * FROM Casa;";
            
            consultarBase(sql);
            
            Casa house = new Casa();
            Collection<Casa> houses = new ArrayList();
            
            while(resultado.next()){
                house.setIdCasa(resultado.getInt(1));
                house.setCalle(resultado.getString(2));
                house.setNumero(resultado.getInt(3));
                house.setCodigoPostal(resultado.getString("codigo_postal"));
                house.setCiudad(resultado.getString("ciudad"));
                house.setPais(resultado.getString("pais"));
                house.setFechaDesde(LocalDate.of(resultado.getDate("fecha_desde").getYear(), resultado.getDate("fecha_desde").getMonth(), resultado.getDate("fecha_desde").getDay()));
                house.setFechaHasta(LocalDate.of(resultado.getDate("fecha_hasta").getYear(), resultado.getDate("fecha_hasta").getMonth(), resultado.getDate("fecha_hasta").getDay()));
                house.setTiempoMin(resultado.getInt("tiempo_minimo"));
                house.setTiempoMax(resultado.getInt("tiempo_maximo"));
                house.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                house.setTipoVivienda(resultado.getString("tipo_vivienda"));
                
                houses.add(house);
            }
            
            desconectarBase();
            return houses;
            
        } catch (Exception e) {
            
            throw e;
            
        }
        
    }
    
}
