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
        String sql = "select * from producto";
        Conexion c = new Conexion();
        ResultSet rs= c.ejecutarConsulta(sql);
        String users = lg.getUsuario().getText();
        String contraseña = lg.getContraseña().getText();
        for(int i =0; i < consultar().size();i++)
        {
            //if(user.equals(rs.getString("Nombres")) && contraseña.equals(rs.getString("Contraseña"))) )
            //if(users.equals(user.getNombre().get(i)))
            {
                
            }
        }
    }
    
    //Con esto consulto todo lo que haya en la BD
    public ArrayList<Usuario> consultar()
    {
        String sql = "select * from producto";
        ArrayList<Usuario> user = new ArrayList();
        Conexion c = new Conexion();
        ResultSet rs= c.ejecutarConsulta(sql);
        try{
        while(rs.next()){
            Usuario u = new Usuario();
             u.setNombre(rs.getString("Nombres"));
             u.setContraseña(rs.getString("Contraseña"));
             
             user.add(u);
        }
        }catch(java.sql.SQLException e){

        }
        return user; 

    }
    
    public Login getVista()
    {
        return lg;
    }
    public void setVista(Login lg)
    {
        this.lg= lg;
    }
}
