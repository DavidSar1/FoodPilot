/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Arrays;
import Modelo.Mesa;
import Vista.GestionMesero;

/**
 *
 * @author Myke
 */
public class ControladorMesero  {
    
    GestionMesero gm;
    
   
    public void actualizarTabla(){
        //gm = new GestionMesero(this);
        for(Mesa mesa : Arrays.mesa_meseros){
            String datos[] = {Integer.toString(mesa.getNumero()),Integer.toString(mesa.getCapacidad())};
            gm.agregarFila(datos);
        }          
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
