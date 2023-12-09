/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoMesas;



/**
 *
 * @author PC
 */
public class ControladorMesa {
    
    
    
    public boolean VerificarMesa(int Mesa){
        boolean ExisteMesa = false;
        try{
            
            for(int i = 0 ; i<AlmacenamientoMesas.AlmacenamientoMesas.size(); i++)
            {
                if(AlmacenamientoMesas.AlmacenamientoMesas.get(i).getCapacidad() == Mesa)
                {
                    ExisteMesa  = true;
                    return ExisteMesa;
                    
                }
            }
        }
        catch(Exception e){
            System.out.println("ERROR 01 BUSCANDO MESA EXISTENTE FALLO");
        }
        return ExisteMesa;
    }
    
    public boolean VerificarCapacidadMesa(int Mesa){
        boolean ExisteMesa = false;
        try{
            
            for(int i = 0 ; i<AlmacenamientoMesas.AlmacenamientoMesas.size(); i++)
            {
                if(AlmacenamientoMesas.AlmacenamientoMesas.get(i).getCapacidad() == Mesa)
                {
                    ExisteMesa  = true;
                    return ExisteMesa;
                    
                }
            }
        }
        catch(Exception e){
            System.out.println("ERROR 01 BUSCANDO MESA EXISTENTE FALLO");
        }
        return ExisteMesa;
    }
    
    public static void main(String[] args) {
        ControladorMesa c = new ControladorMesa();
        c.VerificarMesa(1);
    }
    
    
}
