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
    
    
    
    public boolean VerificarMesaExistente(int Mesa){
        boolean ExisteMesa = false;
        try{
            
            for(int i = 0 ; i<AlmacenamientoMesas.AlmacenamientoMesas.size(); i++)
            {
                if(AlmacenamientoMesas.AlmacenamientoMesas.get(i).getNumero()== Mesa)
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
    
    public boolean VerificarCapacidadMesa(int ClientesAtendidos){
        boolean CapacidadMesa = false;
        try{
            
            for(int i = 0 ; i<AlmacenamientoMesas.AlmacenamientoMesas.size(); i++)
            {
                if(AlmacenamientoMesas.AlmacenamientoMesas.get(i).getCapacidad() == ClientesAtendidos)
                {
                    CapacidadMesa  = true;
                    return CapacidadMesa;
                    
                }
            }
        }
        catch(Exception e){
            System.out.println("ERROR 01 VERIFICANDO CAPACIDAD MESA FALLO");
        }
        return CapacidadMesa;
    }
    
    
    
    
    
    
    
}
