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
    int contador;
    int ped = 0;
    HiloEntregado hActualizar;
   
    public void actualizarTabla(){
        HiloCronometro hCronometro = new HiloCronometro(this);
        hCronometro.start();
        //gm = new GestionMesero(this);
        for(Mesa mesa : Arrays.mesa_meseros){
            String datos[] = {Integer.toString(mesa.getCapacidad()),Integer.toString(mesa.getNumero()),"Libre"};
            gm.agregarFila(datos);
        }          
    }
    
    public void cambiarEstado(){
        
    }
    
    public void ls()
    {
        boolean agg = true;
        //cada que le unda guardar me genere pedido +1 y estado siempre es en proceso
        
        gm.limpiarTabla();
        //Arrays.listp.clear();

        while (agg)
        {
            contador += 1;
            break;
            
        }
        
        ListaPedido lp = new ListaPedido();
        lp.asign(contador, "En proceso");
        Thread thread = new Thread(new HiloEntregado(lp));
        thread.start();
        if(ped < Arrays.pedidosHechos.size())
        {
            for (ListaPedido lsp : Arrays.listp) 
            {
                String[] dat = {String.valueOf(lsp.getPedido()), lsp.getEstado()};
                gm.agrego(dat);
            }
        }
        ped = Arrays.pedidosHechos.size();
    }
    
    public  void setHiloEntregado(HiloEntregado hActualizar){
        this.hActualizar = hActualizar;
    }
    
    public void eliminarPedido()
    {
        gm.columnaPedido();
        for (int i = 0; i < Arrays.pedidosHechos.size();i++) 
        {
            if (i == gm.columnaPedido()-1)
            {
                Arrays.pedidosHechos.remove(i);
            }
        }
        System.out.println(Arrays.pedidosHechos.toString());
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
