/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import Vista.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class ControladorUsers {
    Login lg;
    
    
    //Con esto consulto todo lo que haya en la BD
 
    
    public Login getVista()
    {
        return lg;
    }
    public void setVista(Login lg)
    {
        this.lg= lg;
    }
}
