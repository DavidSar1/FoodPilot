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
    String tipo;
    boolean ver = true;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String tipo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public String getTipo()
    {
        return tipo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
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
             u.setNombre(rs.getString("nombres"));
             u.setContraseña(rs.getString("contraseña"));
             u.setTipo(rs.getString("tipo"));
             
             Arrays.user.add(u);
        }
        }catch(java.sql.SQLException e){

        }
        return Arrays.user; 
    }
    
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public  void verificacion(String user, String psw, String type) 
    {
        
        String usuarioIngresado = user;
        String contraseñaIngresada = psw;
        String tipe = type;
        consultar();
        for(int i = 0; i < Arrays.user.size();i++)
        {
            if (usuarioIngresado.equals(Arrays.user.get(i).getNombre()) && contraseñaIngresada.equals(Arrays.user.get(i).getContraseña()) && tipe.equals(Arrays.user.get(i).getTipo())) 
                {    
                    ver = false;
                    break;
                } 
        }
        
    }

        
    public boolean pasa()
    {
        return ver;
    }
    
    public void registrarUser(String name, String contra, String tipe)
    {
        String name_admin = name;
        String contra_admin = contra;
        String tipe_Admin = tipe;
        
        Conexion c = new Conexion();
        c.ejecutar("insert into data (nombres, contraseña,tipo) values('"+name_admin+"','"+contra_admin+"','"+tipe_Admin+"');");
    }
    
    public ArrayList<Usuario> consultarProductosTodos()
    {
        String sql = "select * from data";
        Conexion c = new Conexion();
        ResultSet rs= c.ejecutarConsulta(sql);
        
        try
        {
            while(rs.next())
            {
                Usuario us = new Usuario();
                 us.setNombre(rs.getString("nombres"));
                 us.setContraseña(rs.getString("contraseña"));
                 us.setTipo(rs.getString("tipo"));

                 Arrays.user_conts.add(us);
                 System.out.println(Arrays.user_conts);
                 
            }
        }
        catch(java.sql.SQLException e)
        {
            e.printStackTrace();
        }
        
        return Arrays.user_conts; 
    }
}
