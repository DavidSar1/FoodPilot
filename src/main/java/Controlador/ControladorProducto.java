/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.GestionProductos;
import Modelo.Producto;
import Modelo.AlmacenamientoProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ControladorProducto {
    GestionProductos gp ;

    public ControladorProducto() {
    }

    public ControladorProducto(GestionProductos gp) {
        this.gp = gp;
    }

    public GestionProductos getGp() {
        return gp;
    }

    public void setGp(GestionProductos gp) {
        this.gp = gp;
    }
    
    
    
    public void CrearProducto(){
        try{
            if(gp.getNombre().equals("") && gp.getPrecio().equals("") && gp.getDescripcion().equals("")&& VerificarProductoExistente(gp.getNombre()))
            {
                String Nombre = gp.getNombre();
                float precio = Float.parseFloat(gp.getPrecio());
                String Descripcion = gp.getDescripcion();
                String Estado = "ACTIVO";
                
                Producto p = new Producto(Nombre, Descripcion, Estado, "", precio);
                AlmacenamientoProducto.Productos.add(p);
                JOptionPane.showMessageDialog(gp, "El producto ha sido creado correctamente");
                gp.setNombre("");
                gp.setPrecio("");
                gp.setDescripcion("");
  
            }
            
            
            
            

        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(gp, "Por favor ingresa un valor correcto en el precio");
        
        
        }
    }
    
    public boolean VerificarProductoExistente(String nombre){
        boolean Existe = false ; 
        for(int i = 0; i < AlmacenamientoProducto.Productos.size() ; i++)
            
            
        {
            if(AlmacenamientoProducto.Productos.get(i).getNombre().equals(nombre))
            {
                JOptionPane.showMessageDialog(gp, "El prodcuto ya existe");
                Existe = true ;
                break;
            }
        }
        return Existe;
    
    
    
    
    
    }
    
    public void ListarProductos(){
        for(int i = 0; i < AlmacenamientoProducto.Productos.size() ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            { 
                //gp.agregarFila(new String[]{AlmacenamientoProducto.Productos.get(i).getNombre(),String.valueOf(AlmacenamientoProducto.Productos.get(i).getPrecio()),
                    //AlmacenamientoProducto.Productos.get(i).getEstado(),AlmacenamientoProducto.Productos.get(i).getDescripcion()});
            }
        
        }
        
    
    
    
    }
    
}
