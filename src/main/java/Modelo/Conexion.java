/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Myke
 */
public class Conexion {
    Connection conexion=null;
    String usuario ="postgres";
    String password="POSTGRES";
    
    
      public  Conexion() {
        try {
            // Invocamos el driver d ela base de datos
           
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
          
            //Conexion de la base de datos
            // Conectamos con la base de datos
            this.conexion = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/poe53",
                    usuario, password);
 
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    }
      
      
    public void ejecutar(String sql){
 
        try { 
            PreparedStatement stm = this.conexion.prepareStatement(sql);
            stm.execute();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
    }  
    
    public ResultSet ejecutarConsulta(String sql){
         try { 
            PreparedStatement stm = this.conexion.prepareStatement(sql);
            return stm.executeQuery();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
         return null;
         
    }
}
