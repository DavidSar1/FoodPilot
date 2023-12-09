/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoMesas;
import javax.swing.JOptionPane;



/**
 *
 * @author PC
 */
public class ControladorMesa {
    
    
    
    public boolean VerificarMesaExistente(int Mesa){
        boolean ExisteMesa = false;
        try{
            
            for(int i = 0 ; i<AlmacenamientoMesas.Mesas.size(); i++)
            {
                if(AlmacenamientoMesas.Mesas.get(i).getNumero()== Mesa)
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
            
            for(int i = 0 ; i<AlmacenamientoMesas.Mesas.size(); i++)
            {
                if(AlmacenamientoMesas.Mesas.get(i).getCapacidad() == ClientesAtendidos)
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
    
    public boolean VerficacionMesa (int NumeroMesa , int ClientesAtendidos){
        if(VerificarMesaExistente(NumeroMesa) == true)
        {
            if(VerificarCapacidadMesa(ClientesAtendidos) == true)
                    {
                        return true;
                    
                    }
            else
            {
                JOptionPane.showInputDialog("La mesa ingresada no existe",this);
                return false;
            
            }
            
            
        }
        else
        {
            JOptionPane.showInputDialog("La mesa ingresada no existe",this);
            return false;
        
        }
    

    }
    
    
    
    
    
    
    
}
