/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoMesas;
import Modelo.Arrays;
import Modelo.Mesa;
import Vista.AdministradorMesas;
import Vista.GestionAdministrador;
import Vista.GestionMesero;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PC
 */
public class ControladorMesa {
    
    AdministradorMesas mesas;
    int indexMesa;
    int capacidad = 6;
    
    
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
    
    
    
    public boolean VerficacionMesa (int NumeroMesa , int ClientesAtendidos){
        if(VerificarMesaExistente(NumeroMesa) == true)
        {
            return true;

        }
        else
        {
            JOptionPane.showInputDialog("La mesa ingresada no existe",this);
            return false;
        
        }
    

    }
    
    public void agregarMesa(){
        indexMesa += 1;
        Mesa ms = new Mesa();
        ms.setCapacidad(indexMesa);
        ms.setNumero(capacidad);
        ms.setEstado("Libre");
        Arrays.mesa_meseros.add(ms);
        String datos[] = {Integer.toString(indexMesa),Integer.toString(capacidad)};
        mesas.agregarFila(datos);  
    }
    
    
    public void eliminarMesa(int index, DefaultTableModel mesa){
        indexMesa -= 1;
        mesa.removeRow(index);
        
    }
    
    
    
    
    
    public void actualizarTabla(){
        
        Mesa mM = new Mesa();
        //gm = new GestionMesero(this);
        for(Mesa mesa : Arrays.mesa_meseros){
            String datos[] = {Integer.toString(mesa.getNumero()),Integer.toString(mesa.getCapacidad()),mesa.getEstado()};
            mesas.agregarFila(datos);
        }          
    }
    
    
    
    public AdministradorMesas getMesa(){
        return mesas;
    }
    
    public void setMesa(AdministradorMesas mesas){
        this.mesas = mesas;
    }
    
    
    
    
}
