/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Myke
 */
public class Pedido {
    String producto;
    String cantidad;
    String precio;

    public Pedido() {
    }

    public Pedido(String producto, String cantidad, String precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
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
    
    
 
}
