/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoProducto;
import Modelo.Arrays;
import Modelo.ListaPedido;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.numerosStaticos;
import Vista.AdministradorMesas;
import Vista.EditarPedido;
import Vista.GestionPedido;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ControladorPedido {
    GestionPedido gp;
    EditarPedido eP;
    int indexpedido = 0;
    float precioTotal;
    float valorTotalPedido;
    float totalAnterior;
    float tot;
    
    public void ListarProductos(){
        
        gp.limpiarTabla();
        Producto prod = new Producto();
        for(Producto prodc : AlmacenamientoProducto.productosC){
            String datos[] = {prodc.getNombre(),String.valueOf(prodc.getPrecio()),prodc.getEstado(),prodc.getDescripcion()};
            gp.agregarFila(datos);
        }
        
    }
    public void ListarProductosEdit(){
        
        eP.limpiarTablaEdit();
        Producto prod = new Producto();
        for(Producto prodc : AlmacenamientoProducto.productosC){
            String datos[] = {prodc.getNombre(),String.valueOf(prodc.getPrecio()),prodc.getEstado(),prodc.getDescripcion()};
            eP.agregarFila(datos);
        }
        
    }
    
    public void productoEditar(EditarPedido ep1, int  index){
        String strIndex = Integer.toString(index);
        boolean ver = true;
        ep1.limpiarTablaEditar();
        
        
        for(Pedido pedi : Arrays.pedidosHechos){
            if(pedi.getIndex().equals(strIndex)){
                String datos[] = {pedi.getProducto(),pedi.getCantidad(),pedi.getPrecio()};
                tot += Float.parseFloat(pedi.getCantidad()) * Float.parseFloat(pedi.getPrecio());
                ep1.agregarFilaEditar(datos);
            } else {
            }
        }   
    }
    
    public float tot()
    {
        return tot;
    }
    
   
    public GestionPedido getPedido(){
        return gp;
    }
    
    public void setPedido(GestionPedido gp){
        this.gp = gp;
    }
    
    public EditarPedido getEditPedido(){
        return eP;
    }
    
    public void setEditPedido(EditarPedido eP){
        this.eP = eP;
        
    }
    
   
    
    
    public void meterPedidoEntablaPedido()
    {
        gp.limpiar();
        Pedido p = new Pedido();
        
        for(int i = 0; i< AlmacenamientoProducto.productosC.size();i++)
        {
            if(gp.getSelect().getText().equals(AlmacenamientoProducto.productosC.get(i).getNombre()))
            {
                precioTotal = AlmacenamientoProducto.productosC.get(i).getPrecio()* Float.parseFloat(gp.getCant().getText());
                p.asignar(gp.getSelect().getText(), gp.getCant().getText(), String.valueOf(precioTotal));   
                break; 
            }
        }
        
        
        for(Pedido col: Arrays.ped)
        {
            String[] data = {col.getProducto(),col.getCantidad(),String.valueOf(col.getPrecio())};
            gp.agg(data);
        }
        float totalPedido = 0;
        for(int i = 0 ; i< Arrays.ped.size();i++)    
        {
            totalPedido += Float.parseFloat(Arrays.ped.get(i).getPrecio());
        }
        
        gp.setTotalPedido(String.valueOf(totalPedido));
    }
    
     public void crearPedido(){
        numerosStaticos.index += 1;
        String total = "1";
        Pedido p = new Pedido();
        for(Pedido pedido : Arrays.ped){
            p.asignarPedidoHecho(String.valueOf(numerosStaticos.index), pedido.getProducto(), pedido.getCantidad(), String.valueOf(pedido.getPrecio()), total);
        }
    }
     
     public void editaPedido(int index){
         
        String strIndex = Integer.toString(index);
        Pedido p = new Pedido();

        Iterator<Pedido> iterator = Arrays.pedidosHechos.iterator();
           while (iterator.hasNext()) {
               Pedido pedido = iterator.next();
               if (pedido.getIndex().equals(strIndex)) {
                   iterator.remove();  // Esto es seguro durante la iteración
               }
           }
        String total = "1";
        for(Pedido pedido : Arrays.ped){
            p.asignarPedidoHecho(String.valueOf(index), pedido.getProducto(), pedido.getCantidad(), String.valueOf(pedido.getPrecio()), total);
        }
        
     }
     
     
    public void eliminarPructoPedido(int index, String nombre){
        String strIndex = Integer.toString(index);
        Iterator<Pedido> iterator = Arrays.pedidosHechos.iterator();
        while (iterator.hasNext()) {
            Pedido ped = iterator.next();
            if (ped.getIndex().equals(strIndex) && ped.getProducto().equals(nombre)) {
                iterator.remove();  // Esto es seguro durante la iteración
                break;  // Salir del bucle una vez que se ha encontrado y eliminado el pedido
            }
        }
    }
   
    
    public void editPed()
    {
        
        eP.limpiarTablaEditar();
        Pedido p = new Pedido();
        for(int i = 0; i< AlmacenamientoProducto.productosC.size();i++)
        {
            if(eP.getSelect().getText().equals(AlmacenamientoProducto.productosC.get(i).getNombre()))
            {
                
                precioTotal = AlmacenamientoProducto.productosC.get(i).getPrecio()* Float.parseFloat(eP.getCant().getText());
                
                p.asignar(eP.getSelect().getText(), eP.getCant().getText(), String.valueOf(precioTotal));
                break; 
            }
        }
        
        
        
        
        for(Pedido col: Arrays.ped)
        {
            String[] data = {col.getProducto(),col.getCantidad(),String.valueOf(col.getPrecio())};
            eP.agregarFilaEditar(data);
        }
        
        for(int i = 0; i< AlmacenamientoProducto.productosC.size();i++)
        {
            if(eP.getSelect().getText().equals(AlmacenamientoProducto.productosC.get(i).getNombre()))
            {
               valorTotalPedido += AlmacenamientoProducto.productosC.get(i).getPrecio()* Float.parseFloat(eP.getCant().getText());
            }
        }
        

        eP.totalpedidoeditar(String.valueOf(valorTotalPedido));  
    }
    

}
