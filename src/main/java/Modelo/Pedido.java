/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Myke
 */
public class Pedido {
    String index;
    String producto;
    String cantidad;
    String precio;
    String total;
    
    int dia;
    int mes; 
    int año;

    public Pedido() {
    }

    public Pedido(String index, String producto, String cantidad, String precio, String total) {
        this.index = index;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public Pedido(String producto, String cantidad, String precio, String total, int dia, int mes, int año) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    

   

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    

    @Override
    public String toString() {
        return "Pedido{" + "index=" + index + ", producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}';
    }

    
    
    
    
    
    public ArrayList<Pedido> asignar(String ped, String cant, String pres)
    {
        String pr = ped;
        String ca = cant;
        String cash = pres;
        Pedido p = new Pedido();
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        
        Arrays.ped.add(p);
        
        return Arrays.ped;
    }
    
    public void asignarPed(String ped, String cant, String pres)
    {
        Pedido p = new Pedido();
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        
        Arrays.ped.add(p);
    }
    
    public void asignarPedidoHecho(String index,String ped, String cant, String pres, String total){
        Pedido p = new Pedido();
        p.setIndex(index);
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        p.setTotal(total);
        LocalDate fechaActual = LocalDate.now();
        
        int diapedido = fechaActual.getDayOfMonth();
        int mespedido = fechaActual.getMonthValue();
        int añopedido = fechaActual.getYear();
        
        p.setDia(diapedido);
        p.setMes(mespedido);
        p.setAño(añopedido);
 
        Arrays.pedidosHechos.add(p);
        
    }
    
    
 
}
