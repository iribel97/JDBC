/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Casa;

/**
 *
 * @author irina
 */
public final class DAOCasa extends DAO {

    //PREPARAR LOS SCRIPTS
    /*INSERTAR VALORES EN LA BASE DE DATOS*/
    public void insertCasa(Casa house) throws Exception {
        
        try {
            if (house == null) {
                throw new Exception("DEBE INDICAR UN FABRICANTE");
            }
            //INSERT INTO casas VALUES(1, 'Cow Gate',3,'456789','Edinmburg','Reino Unido','2020-06-01','2021-06-01',2,20,50,'Casa');
            String sql = "INSERT INTO Casas (calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, tipo_vivienda) "
                    + "VALUES ( '" + house.getCalle() + "' , " + house.getNumero() + " , '" + house.getCodigoPostal() + "' , '"
                    + house.getCiudad() + "' , '" + house.getPais() + "' , '" + house.getFechaDesde() + "' , '"
                    + house.getFechaHasta() + "' , " + house.getTiempoMin() + " , " + house.getTiempoMax() + " , "
                    + house.getPrecioHabitacion() + " , '" + house.getTipoVivienda() + "');";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
