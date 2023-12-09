/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.GestionLogin;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Administrador {
    GestionLogin lg;
    
    
    public void crearAdmin()
    {
        Usuario user = new Usuario();
        ArrayList<Usuario> userAdmins = new ArrayList();
        
        user.setNombre(this.lg.getUsuario().getText());
        user.setContraseña(this.lg.getContraseña().getText());
        
        userAdmins.add(user);
    }
    
}
