/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoProducto;
import Modelo.Arrays;
import Modelo.ListaPedido;
import Modelo.Mesa;
import Modelo.Pedido;
import Modelo.Producto;
import Vista.GestionMesero;
import Vista.GestionPedido;

/**
 *
 * @author Myke
 */
public class ControladorMesero  {
    
    GestionMesero gm;
    
   
    public void actualizarTabla(){
        HiloCronometro hCronometro = new HiloCronometro(this);
        hCronometro.start();
        //gm = new GestionMesero(this);
        for(Mesa mesa : Arrays.mesa_meseros){
            String datos[] = {Integer.toString(mesa.getCapacidad()),Integer.toString(mesa.getNumero()),"Libre"};
            gm.agregarFila(datos);
        }          
    }
    
    public void ls()
    {
        int contador = 0;
        //cada que le unda guardar me genere pedido +1 y estado siempre es en proceso
        //GestionMesero gss = new GestionMesero();
        //gss.limpiarTabla();
        //Arrays.listp.clear();

        while (true)
        {
            contador += 1;
            break;
        }
        
        ListaPedido lp = new ListaPedido();
        lp.asign(contador, "En proceso");
        for(Pedido bus: Arrays.ped)
        {
            
        }
        for(ListaPedido lsp: Arrays.listp)
        {
            String[] dat={String.valueOf(lsp.getPedido()),lsp.getEstado()};
            gm.agrego(dat);
        }  
    }
    
    public void agregar1Metodo(){
        Pedido n = new Pedido();
        n.setIndex("1");
        n.setProducto("Ensalada");
        n.setCantidad("2");
        n.setPrecio("1000");
        
        Pedido n2 = new Pedido();
        n2.setIndex("1");
        n2.setProducto("Ensalada");
        n2.setCantidad("2");
        n2.setPrecio("1000");
        Arrays.pedidosHechos.add(n);
        Arrays.pedidosHechos.add(n2);
        
    }

    public void asignarMesa()
    {
        
        Arrays.mesa_meseros.remove(gm.retorn());
    }
   
    public GestionMesero getData()
    {
        return gm;
    }
    
   
    public void setData(GestionMesero gm)
    {
        this.gm = gm;
    }
    
}
