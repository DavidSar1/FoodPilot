/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.GestionProductos;
import Modelo.Producto;
import Modelo.AlmacenamientoProducto;
import Modelo.Arrays;
import Modelo.Mesa;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ControladorProducto {
    GestionProductos gp ;
    int ingresarDatos10 = 0;
    
    

    public ControladorProducto() {
    }

    public ControladorProducto(GestionProductos gp) {
        this.gp = gp;
    }

    public GestionProductos getGp() {
        return gp;
    }
    
    public void setGp(GestionProductos gp){
        this.gp = gp;
        
    }
    
    

    
    public void CrearProducto(){
        try{
            if(gp.getNombre().equals("") && gp.getPrecio().equals("") && gp.getDescripcion().equals("")&& VerificarProductoExistente(gp.getNombre()))
            {
                JOptionPane.showMessageDialog(null, "Debes ingresar todos los campos!");
            } else {
                String Nombre = gp.getNombre();
                float precio = Float.parseFloat(gp.getPrecio());
                String Descripcion = gp.getDescripcion();
                String Estado = "ACTIVO";
                
                Producto p = new Producto(Nombre, Descripcion, Estado, precio);
                AlmacenamientoProducto.productosC.add(p);
                JOptionPane.showMessageDialog(gp, "El producto ha sido creado correctamente");
                String data[] = {Nombre, String.valueOf(precio),Estado, Descripcion};
                gp.agregarFila(data);
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
        for(int i = 0; i < AlmacenamientoProducto.productosC.size() ; i++) 
        {
            if(AlmacenamientoProducto.productosC.get(i).getNombre().equals(nombre))
            {
                JOptionPane.showMessageDialog(null, "El prodcuto ya existe");
                Existe = true ;
                break;
            }
        }
        return Existe;
   
    }
    
    public void ListarProductos(){
        
        gp.limpiarTabla();
        Producto prod = new Producto();
        for(Producto prodc : AlmacenamientoProducto.productosC){
            String datos[] = {prodc.getNombre(),String.valueOf(prodc.getPrecio()),prodc.getEstado(),prodc.getDescripcion()};
            gp.agregarFila(datos);
        }
        /*
        for(int i = 0; i < AlmacenamientoProducto.Productos.size() ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            { 
                gp.agregarFila(new String[]{AlmacenamientoProducto.Productos.get(i).getNombre(),String.valueOf(AlmacenamientoProducto.Productos.get(i).getPrecio()),
                    AlmacenamientoProducto.Productos.get(i).getEstado(),AlmacenamientoProducto.Productos.get(i).getDescripcion()});
            }
        
        }*/
    }
    
    public void EliminarProducto(){
        
        String nombreProducto =  gp.getNombreEliminar();
        boolean Eliminado = false;
        for(int i = 0; i < 4 ; i++)
            { 
                if(AlmacenamientoProducto.productosC.get(i).getNombre().equals(nombreProducto))
                {
                    AlmacenamientoProducto.productosC.remove(i);
                    Eliminado = true;
                    break;
                    
                }
            }
        if (Eliminado == true)
        {
            JOptionPane.showMessageDialog(gp, "El producto ha sido eliminado con exito");
            gp.setNombreEliminar("");
            ListarProductos();
        }
        else{
            JOptionPane.showMessageDialog(gp, "El producto no se encuentra en la base de datos");
        
        }
       
        
    }
    
    public void ModificarProducto1(){
        String NombreModificar = gp.getNombreModificar(); 
        if(AlmacenamientoProducto.productosC.isEmpty()){
            System.out.println("Hola");
        } else {
            System.out.println("holaentreaquielse");
         for(int i = 0; i < AlmacenamientoProducto.productosC.size() ; i++)
            {
                if(AlmacenamientoProducto.productosC.get(i).getNombre().equals(NombreModificar))
                { 
                    System.out.println("holaentreaqui");
                    gp.nombreModificar.setEditable(false);  
                    gp.setPrecioModificar(String.valueOf(AlmacenamientoProducto.productosC.get(i).getPrecio()));
                    gp.setDescripcionModificar(AlmacenamientoProducto.productosC.get(i).getDescripcion());
                    break;
                    
                } else
                {
                    JOptionPane.showMessageDialog(gp, "El producto que quieres modificar no existe");

                }
            
            }
         }
        ListarProductos();
 
    }
    
    
    public void modificarProducto2(){
        try {
            float precioM = Float.parseFloat(gp.getPrecioModificar());
            String descripcionM = gp.getDescripcionModificar();
            String NombreModificar = gp.getNombreModificar();
            String Estado = gp.getEstadoModificar();
            for(int i = 0; i < 4 ; i++)
            {
                if(AlmacenamientoProducto.productosC.get(i).getNombre().equals(NombreModificar))
                {
                    
                    gp.nombreModificar.setEditable(false);
                    AlmacenamientoProducto.productosC.get(i).setDescripcion(descripcionM);
                    AlmacenamientoProducto.productosC.get(i).setPrecio(precioM);
                    AlmacenamientoProducto.productosC.get(i).setEstado(Estado);
                    break;
                    
                }
            
            }
            JOptionPane.showMessageDialog(gp, "El producto ha sido modificado con exito");
            
            
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(gp, "Ingresa un precio correcto");
        
        }

        ListarProductos();
    }
    
}
