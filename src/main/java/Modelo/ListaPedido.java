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
public class ListaPedido {
    int Pedido;
    String estado;

    public ListaPedido() {
    }

    public ListaPedido(int Pedido, String estado) {
        this.Pedido = Pedido;
        this.estado = estado;
    }

    public int getPedido() {
        return Pedido;
    }

    public void setPedido(int Pedido) {
        this.Pedido = Pedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public ArrayList<ListaPedido> asign(int pid, String est)
    {
        int pde = pid;
        String es = est;
        
        ListaPedido lp = new ListaPedido();
        lp.setPedido(pid);
        lp.setEstado(est);
        
        Arrays.listp.add(lp);
        
        return Arrays.listp;
    }
          
}
