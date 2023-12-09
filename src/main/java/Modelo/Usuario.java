/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.GestionLogin;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Myke
 */
public class Usuario {
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
        String sql = "select * from data";
        Conexion c = new Conexion();
        ResultSet rs= c.ejecutarConsulta(sql);
        try{
        while(rs.next()){
            Usuario u = new Usuario();
             u.setNombre(rs.getString("Nombres"));
             u.setContraseña(rs.getString("Contraseña"));
             
             Arrays.user.add(u);
        }
        }catch(java.sql.SQLException e){

        }
        return Arrays.user; 

    }
    
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public  void verificacion(String user, String psw) 
    {
        String usuarioIngresado = user;
        String contraseñaIngresada = psw;
        for(int i = 0; i < consultar().size();i++)
        {
            if (usuarioIngresado.equals(consultar().get(i).getNombre()) && contraseñaIngresada.equals(consultar().get(i).getContraseña())) 
                {
                    System.out.println("hola");
                    break;
                } 
        }
        
    }

    
}
