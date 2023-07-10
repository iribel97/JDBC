/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Estancia;
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
}
