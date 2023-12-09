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
    Mesero MeseroEncargado; 
    ArrayList<Producto> ProductosPedido = new ArrayList<>();
    Mesa MesaPedido;
    int TiempoEstimado;
    String Estado;
    

    public Pedido() {
    }

    public Pedido(Mesero MeseroEncargado, Mesa MesaPedido, int TiempoEstimado, String Estado) {
        this.MeseroEncargado = MeseroEncargado;
        this.MesaPedido = MesaPedido;
        this.TiempoEstimado = TiempoEstimado;
        this.Estado = Estado;
    }

    public Mesero getMeseroEncargado() {
        return MeseroEncargado;
    }

    public void setMeseroEncargado(Mesero MeseroEncargado) {
        this.MeseroEncargado = MeseroEncargado;
    }

    public ArrayList<Producto> getProductosPedido() {
        return ProductosPedido;
    }

    public void setProductosPedido(ArrayList<Producto> ProductosPedido) {
        this.ProductosPedido = ProductosPedido;
    }

    public Mesa getMesaPedido() {
        return MesaPedido;
    }

    public void setMesaPedido(Mesa MesaPedido) {
        this.MesaPedido = MesaPedido;
    }

    public int getTiempoEstimado() {
        return TiempoEstimado;
    }

    public void setTiempoEstimado(int TiempoEstimado) {
        this.TiempoEstimado = TiempoEstimado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
    
    
 
}
