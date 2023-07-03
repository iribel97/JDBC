/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1_1;

import com.mycompany.practica1_1.Dominio.Mascota.MascotaService;
import com.mycompany.practica1_1.Dominio.Usuario.Usuario;
import com.mycompany.practica1_1.Dominio.Usuario.UsuarioService;

/**
 *
 * @author irina
 */
public class Practica1_1 {

    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        MascotaService mascotaService = new MascotaService();

        
        try {
            //Creamos  usuarios
            usuarioService.crearUsuario("fiorde@hotmail.com", "fiorde14");
            usuarioService.crearUsuario("tincho@hotmail.com", "eggprogramacion");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Modificamos un usuario
            usuarioService.modificarClaveUsuario("fiorde@hotmail.com", "fiorde14", "fiorde15");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Eliminamos un usuario
            usuarioService.eliminarUsuario("fiorde@hotmail.com");
            usuarioService.imprimirUsuarios();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
        try {
            //Buscamos el Usuario por correo
            Usuario usuario = usuarioService.buscarUsuarioPorCorreoElectronico("tincho@hotmail.com");
            //Creamos Mascota con el Usuario anterior
            mascotaService.crearMascota("Chiquito", "Beagle", usuario);

            //Mostramos Mascota con su Usuario
            mascotaService.imprimirMascotas();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
    }
}
