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
import Vista.EditarPedido;
import Vista.GestionPedido;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ControladorPedido {
    GestionPedido gp;
    EditarPedido eP;
    int indexpedido = 0;
    
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
    
    public void productoEditar(EditarPedido ep1, String index){
        
        ep1.limpiarTablaEditar();
        Producto prod = new Producto();
        for(int i = 0; i < Arrays.pedidosHechos.size();i++){
            if(Arrays.pedidosHechos.get(i).getIndex().equals(index)){
                String datos[] = {Arrays.pedidosHechos.get(i).getProducto(),Arrays.pedidosHechos.get(i).getCantidad(),Arrays.pedidosHechos.get(i).getPrecio()};
                ep1.agregarFilaEditar(datos);
            } else {
                JOptionPane.showMessageDialog(null, "Idiota");
            }

        }
        
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
    
    public void CrearPedido()
    {
        indexpedido += 1;
        gp.limpiar();
        
        Pedido p = new Pedido();
        
        for(int i = 0; i< AlmacenamientoProducto.productosC.size();i++)
        {
            if(gp.getSelect().getText().equals(AlmacenamientoProducto.productosC.get(i).getNombre()))
            {
                System.out.println(gp.getCant().getText());
                Float precioTotal = AlmacenamientoProducto.productosC.get(i).getPrecio()* Float.parseFloat(gp.getCant().getText());
                p.asignar(gp.getSelect().getText(), gp.getCant().getText(), String.valueOf(precioTotal));
                p.asignarPedidoHecho(String.valueOf(indexpedido), gp.getSelect().getText(), gp.getCant().getText(), String.valueOf(precioTotal), gp.getTotal().getText());
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
        
        System.out.println(totalPedido);
        
        
    }
    
    
    
}
