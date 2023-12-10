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
             u.setNombre(rs.getString("Nombres"));
             u.setContraseña(rs.getString("Contraseña"));
             
             Arrays.user.add(u);
        }
        }catch(java.sql.SQLException e){

        }
        return Arrays.user; 

    }
    
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    public  void verificacion(String user, String psw, String type) 
    {
        consultar();
        String usuarioIngresado = user;
        String contraseñaIngresada = psw;
        String tipe = type;
        for(int i = 0; i < consultar().size();i++)
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
    
}
