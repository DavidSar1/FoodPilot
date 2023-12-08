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
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public void verificacion() throws SQLException 
    {
        String sql = "SELECT * FROM Usuarios";
        Conexion c = new Conexion();
        ResultSet rs = c.ejecutarConsulta(sql);
        String usuarioIngresado = lg.getUsuario().getText();
        String contraseñaIngresada = lg.getContraseña().getText();

        while (rs.next()) 
        {
            String nombreUsuarioBD = rs.getString("Nombres");
            String contraseñaBD = rs.getString("Contraseña");

            if (usuarioIngresado.equals(nombreUsuarioBD) && contraseñaIngresada.equals(contraseñaBD)) 
            {
                // Usuario y contraseña coinciden con un registro en la base de datos
                // Aquí puedes realizar las acciones correspondientes
                System.out.println("Hola");
            } 
            else 
            {
                // Usuario y/o contraseña no coinciden
                // Puedes realizar acciones adicionales si es necesario
            }
        }
    }
    
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
