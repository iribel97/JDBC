/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Comentario {
    /*
    CREATE TABLE comentarios (
        id_comentario INT UNSIGNED AUTO_INCREMENT NOT NULL,
        id_casa INT UNSIGNED NOT NULL,
        comentario VARCHAR(255) DEFAULT NULL,
        PRIMARY KEY (id_comentario),
        FOREIGN KEY (id_casa) REFERENCES casas (id_casa)
    )ENGINE=INNODB;
     */
    
    private int idComentario;
    private Casa casa;
    private String comentario;

    public Comentario() {
    }

    public Comentario(int idComentario, Casa casa, String comentario) {
        this.idComentario = idComentario;
        this.casa = casa;
        this.comentario = comentario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
