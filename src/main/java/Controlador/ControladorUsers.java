/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import Vista.GestionAdministrador;
import Vista.GestionLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class ControladorUsers {
    GestionLogin lg;
    GestionAdministrador ga;
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    
    public ControladorUsers()
    {
        
    }
    
    public ControladorUsers(GestionAdministrador ga)
    {
        this.ga = ga;
    }
    
    public void verificacion()     
    {
        Usuario us = new Usuario();
        us.verificacion(lg.getUsuario().getText(), lg.getContraseña().getText(), lg.getBox());
        if(!us.pasa())
        {
            lg.dispose();
            ga.setVisible(true);
        }
    }
    
    //Con esto consulto todo lo que haya en la BD
 
    public void setView(GestionAdministrador ga)
    {
        this.ga = ga;
    }
    public GestionLogin getVista()
    {
        return lg;
    }
    public void setVista(GestionLogin lg)
    {
        this.lg= lg;
    }
}
