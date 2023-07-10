/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Comentario;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class DAOComentario extends DAO{
    
    /*
    Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
    que están ‘limpias’.
    */
    public ArrayList<Comentario> selectComentWhereClean() throws Exception{
        try {
            DAOCasa daoCas = new DAOCasa();
            String sql = "Select com.id_comentario, com.id_casa, com.comentario " + 
                    "FROM comentarios com " +
                    "JOIN casas cas ON cas.id_casa = com.id_casa " +
                    "WHERE cas.pais = 'Reino Unido' AND com.comentario LIKE '%limpia%';";
            
            consultarBase(sql);
            
            Comentario coment;
            ArrayList<Comentario> coments = new ArrayList();
            
            while (resultado.next()) {
                coment = new Comentario(resultado.getInt(1), 
                                daoCas.selectHouseByID(resultado.getInt(2)),
                                resultado.getString(3));
                coments.add(coment);
            }
            desconectarBase();
            return coments;
            
        } catch (Exception e) {
            throw new Exception("ERROR EN DAOCOMENTARIO");
        }
    }
}
