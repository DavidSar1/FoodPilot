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
                gp.agregarFila(new String[]{AlmacenamientoProducto.Productos.get(i).getNombre(),String.valueOf(AlmacenamientoProducto.Productos.get(i).getPrecio()),
                    AlmacenamientoProducto.Productos.get(i).getEstado(),AlmacenamientoProducto.Productos.get(i).getDescripcion()});
            }
        
        }
    }
    
    public void EliminarProducto(){
        String nombreProducto =  gp.getNombreEliminar();
        boolean Eliminado = false;
        for(int i = 0; i < 4 ; i++)
            { 
                if(AlmacenamientoProducto.Productos.get(i).getNombre().equals(nombreProducto))
                {
                    AlmacenamientoProducto.Productos.remove(i);
                    Eliminado = true;
                    
                }
            }
        if (Eliminado == true)
        {
            JOptionPane.showMessageDialog(gp, "El producto ha sido eliminado con exito");
        }
        else{
            JOptionPane.showMessageDialog(gp, "El producto no se encuentra en la base de datos");
        
        }
    }
    
    public void ModificarProducto1(){
        String NombreModificar = gp.getNombreModificar(); 
        
        if (VerificarProductoExistente(NombreModificar) == true)
        {
            for(int i = 0; i < 4 ; i++)
            {
                if(AlmacenamientoProducto.Productos.get(i).equals(NombreModificar))
                {
                    
                    gp.nombreModificar.setEditable(false);
                    
                    gp.setPrecioModificar(String.valueOf(AlmacenamientoProducto.Productos.get(i).getPrecio()));
                    gp.setDescripcion(AlmacenamientoProducto.Productos.get(i).getDescripcion());
                    break;
                    
                }
            
            }
                
        
        }
        else
        {
            JOptionPane.showMessageDialog(gp, "El producto que quieres modificar no existe");
                    
        }
    }
    
    
    public void modificarProducto2(){
        try {
            float precioM = Float.parseFloat(gp.getPrecioModificar());
            String descripcionM = gp.getDescripcionModificar();
            String NombreModificar = gp.getNombreModificar();
            String Estado = gp.getEstadoModificar();
            for(int i = 0; i < 4 ; i++)
            {
                if(AlmacenamientoProducto.Productos.get(i).getNombre().equals(NombreModificar))
                {
                    
                    gp.nombreModificar.setEditable(false);
                    AlmacenamientoProducto.Productos.get(i).setDescripcion(descripcionM);
                    AlmacenamientoProducto.Productos.get(i).setPrecio(precioM);
                    AlmacenamientoProducto.Productos.get(i).setEstado(Estado);
                    break;
                    
                }
            
            }
            JOptionPane.showMessageDialog(gp, "El producto ha sido modificado con exito");
            
            
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(gp, "Ingresa un precio correcto");
        
        }

    
    }
}
