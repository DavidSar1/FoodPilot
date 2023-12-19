/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Arrays;
import Modelo.Pedido;
import Vista.AdministrarConsulta;

/**
 *
 * @author PC
 */
public class ControladorVentas {
    
    AdministrarConsulta ac;

    

    public void setAc(AdministrarConsulta ac) {
        this.ac = ac;
    }
    
    
    public void consultarFecha(int diaInicial, int mesInicial, int añoInicial, int diaFinal,int mesFinal,int añoFinal){
        
      
        for(int i = 0;i< Arrays.pedidosHechos.size();i++)
        {
            if(diaInicial>= Arrays.pedidosHechos.get(i).getDia() 
                && mesInicial >= Arrays.pedidosHechos.get(i).getMes() 
                && añoInicial >= Arrays.pedidosHechos.get(i).getAño()
                && diaFinal <= Arrays.pedidosHechos.get(i).getDia()  
                && mesFinal <= Arrays.pedidosHechos.get(i).getMes() 
                && añoFinal <= Arrays.pedidosHechos.get(i).getAño()
                    
                    )
            
            {
            
            String producto = Arrays.pedidosHechos.get(i).getProducto();
        }
            break;
    
    
    }
    
}

}
