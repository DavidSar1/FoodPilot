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
public class Arrays {
    public static ArrayList<Usuario> user = new ArrayList();
    public static ArrayList<Usuario> user_conts = new ArrayList();
    public static ArrayList<Mesa> mesa_meseros = new ArrayList();
    public static ArrayList<Producto> ProductosPedido = new ArrayList<>();
    public static ArrayList<Pedido> ped = new ArrayList<>();
    public static ArrayList<ListaPedido> listp = new ArrayList<>();
    public static ArrayList<Pedido> pedidosHechos = new ArrayList<>();
    
     public void datosquemados() {
        Pedido ped1 = new Pedido("hamburguesa", "5", "50000", "50000", 1, 11, 2023);
        Pedido ped2 =new Pedido("papas a la francesa", "5", "50000", "50000", 10, 11, 2023);
        Pedido ped3 =new Pedido("perro caliente", "5", "50000", "50000", 20, 11, 2023);
        Pedido ped4 =new Pedido("pizza", "5", "50000", "50000", 1, 12, 2023);
        Pedido ped5 =new Pedido("jugo de mango", "5", "50000", "50000", 10, 12, 2023);
        
        pedidosHechos.add(ped1);
        pedidosHechos.add(ped2);
        pedidosHechos.add(ped3);
        pedidosHechos.add(ped4);
        pedidosHechos.add(ped5);
    
    
    }
    
    
    public static ArrayList<String> total = new ArrayList<>();
}
