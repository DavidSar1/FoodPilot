/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoProducto;
import Modelo.Arrays;
import Modelo.ListaPedido;
import Modelo.Mesa;
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
        for(ListaPedido lsp: Arrays.listp)
        {
            String dat[]={String.valueOf(lsp.getPedido()),lsp.getEstado()};
            gm.agrego(dat);
        }
            
        
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
