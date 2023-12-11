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
import Vista.AdministradorMesas;
import Vista.GestionPedido;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ControladorPedido {
    GestionPedido gp;
    
   public void ListarProductos(){
        
        gp.limpiarTabla();
        Producto prod = new Producto();
        for(Producto prodc : AlmacenamientoProducto.productosC){
            String datos[] = {prodc.getNombre(),String.valueOf(prodc.getPrecio()),prodc.getEstado(),prodc.getDescripcion()};
            gp.agregarFila(datos);
        }
        
    }
   
    public GestionPedido getPedido(){
        return gp;
    }
    
    public void setPedido(GestionPedido gp){
        this.gp = gp;
    }
    
    public void CrearPedido()
    {
        gp.limpiar();
        
        Pedido p = new Pedido();
        
        for(int i = 0; i< AlmacenamientoProducto.productosC.size();i++)
        {
            if(gp.getSelect().getText().equals(AlmacenamientoProducto.productosC.get(i).getNombre()))
            {
                p.asignar(gp.getSelect().getText(), gp.getCant().getText(), String.valueOf(AlmacenamientoProducto.productosC.get(i).getPrecio()));

                break; 
            }
        }

        for(Pedido col: Arrays.ped)
        {
             String data[]={col.getProducto(),col.getCantidad(),String.valueOf(col.getPrecio())};
             gp.agg(data);
        }
        
        
    }
    
    
    
}
