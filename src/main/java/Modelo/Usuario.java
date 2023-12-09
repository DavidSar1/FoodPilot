/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Myke
 */
public class Usuario {
    Login lg;
    String nombre;
    String contraseña; 

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    //Con esto consulto todo lo que haya en la BD
    public ArrayList<Usuario> consultar()
    {
        String sql = "select * from Usuarios";
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
    
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public  void verificacion(String user, String psw) 
    {
        String sql = "select * from Usuarios";
        Conexion c = new Conexion();
        ResultSet rs= c.ejecutarConsulta(sql);
        
        String usuarioIngresado = user;
        String contraseñaIngresada = psw;
        try
        {
            while (rs.next()) 
            {
                String nombreUsuarioBD = rs.getString("Nombres");
                String contraseñaBD = rs.getString("Contraseña");
                System.out.println(nombreUsuarioBD);
                System.out.println(contraseñaBD);

                if (usuarioIngresado.equals(nombreUsuarioBD) && contraseñaIngresada.equals(contraseñaBD)) 
                {
                    System.out.println("hola");
                } 
                else 
                {
                    // Usuario y/o contraseña no coinciden
                    // Puedes realizar acciones adicionales si es necesario
                }
            }
        }
        catch(java.sql.SQLException e){
        
        }
    }

    
}
