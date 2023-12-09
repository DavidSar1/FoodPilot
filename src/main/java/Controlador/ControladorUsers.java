/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
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
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public void verificacion()     
    {
        
       //ml.verificacion(this.lg.getUsuario().getText(), this.lg.getContraseña().getText());
    }
    
    //Con esto consulto todo lo que haya en la BD
 
    
    public GestionLogin getVista()
    {
        return lg;
    }
    public void setVista(GestionLogin lg)
    {
        this.lg= lg;
    }
}
