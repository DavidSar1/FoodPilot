/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Arrays;
import Modelo.Conexion;
import Modelo.Usuario;
import Vista.GestionAdministrador;
import Vista.GestionLogin;
import Vista.GestionMesero;
import Vista.GestionUsuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class ControladorUsers {
    GestionLogin lg;
    GestionUsuarios gu;
    GestionMesero gm;
    GestionAdministrador ga;
    
    //Con este metodo verifica si existe el nombre y la contraseña en la base de datos
    
    public ControladorUsers()
    {
        
    }
    
   
    public void verificacion()     
    {
        Usuario us = new Usuario();
        us.verificacion(lg.getUsuario().getText(), lg.getContraseña().getText(), lg.getBox());
        if(!us.pasa())
        {
            if(lg.getBox().equals("mesero"))
            {
                lg.dispose();
                GestionMesero gm = new GestionMesero();
                gm.iniciar();
            }
            if(lg.getBox().equals("admin"))
            {
                lg.dispose();
                ga = new GestionAdministrador(this);
                ga.iniciar();
            }
        }
    }
    
    public void agregarUsers()
    {
        Usuario us = new Usuario();
        us.registrarUser(gu.getUno().getText(), gu.getDos().getText(), gu.getTres());
    }
    
    public void consultarProductos()
    {
        gu.limpiarTabla();
        Arrays.user_conts.clear();
        Usuario us = new Usuario();
        ArrayList<Usuario> conts = us.consultarProductosTodos();
         for(Usuario us_con: conts){
             String datos[]={String.valueOf(us_con.getId()),us_con.getNombre(),us_con.getContraseña(),(us_con.getTipo())};
             gu.agregarFila(datos);
         }
    }
    

    
    public void eliminarUsuarios(int id)
    {
        Usuario us = new Usuario();
        us.eliminarProducto(id);
        consultarProductos();
    }
    
    public void actualiarUsuario(int id){
        Usuario us = new Usuario();
        us.setId(id);
        us.setNombre(this.gu.getNombreEdit().getText());
        us.setContraseña(this.gu.getContraEdit().getText());
        us.setTipo(this.gu.getComboEdit());
        //llamamos al metodo para registrar eb la base de datos
        us.actualizarProducto();
        consultarProductos();
        
    }

    public GestionAdministrador getvv()
    {
        return ga;
    }
    
    public void setVV(GestionAdministrador ga)
    {
        this.ga = ga;
    }
    public GestionMesero getVer()
    {
        return gm;
    }
    
    public void setVer(GestionMesero gm)
    {
        this.gm = gm;
    }
    public GestionUsuarios getView()
    {
        return gu;
    }
    
    public void setView(GestionUsuarios gu)
    {
        this.gu = gu;
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
