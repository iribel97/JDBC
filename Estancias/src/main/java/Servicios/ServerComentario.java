/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Comentario;
import Persistencia.DAOComentario;
import java.util.ArrayList;

/**
 *
 * @author irina
 */
public class ServerComentario extends Output{
    DAOComentario dao = new DAOComentario();
    
    public void showComentsWhereClean() throws Exception{
        
        String vNum = "_ # _", vNumCasa = "_ CASA _",
                vComent = "_____________________________ COMENTARIO ____________________________";
        ArrayList<Comentario> coments = dao.selectComentWhereClean();
        
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.println("|                      CASAS QUE HAN COMENTADO QUE ESTAN LIMPIAS                     |");
        System.out.println("|------------------------------------------------------------------------------------|");
        System.out.println("|"+vNum+"|"+vNumCasa+"|"+vComent+"|");
        
        for(Comentario com : coments){
            imprimirCasilla(String.valueOf(com.getIdComentario()), vNum);
            imprimirCasilla(String.valueOf(com.getCasa().getIdCasa()), vNumCasa);
            imprimirCasilla(com.getComentario(), vComent);
            System.out.println("|");
        }
        System.out.println("|------------------------------------------------------------------------------------|");
    }
}
