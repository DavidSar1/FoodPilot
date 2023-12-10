/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlmacenamientoMesas;
import Modelo.Mesa;
import Vista.AdministradorMesas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author PC
 */
public class ControladorMesa {
    ArrayList<Mesa> mesasA = new ArrayList<>();
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
        mesasA.add(ms);
        String datos[] = {Integer.toString(indexMesa),Integer.toString(capacidad)};
        mesas.agregarFila(datos);
    
    }
    
    
    public void eliminarMesa(int index, DefaultTableModel mesa){
        indexMesa -= 1;
        mesa.removeRow(index);
        
    }
    
    
    
    
    
    public void actualizarTabla(){
        
        Mesa mM = new Mesa();
        for(Mesa mesa : mesasA){
            String datos[] = {Integer.toString(mesa.getNumero()),Integer.toString(mesa.getCapacidad())};
            mesas.agregarFila(datos);
        }
        
                
    }
    
    public AdministradorMesas getMesa(){
        return mesas;
    }
    
    public void setMesa(AdministradorMesas mesas){
        this.mesas = mesas;
    }
    
    public void iniciar(){
        mesas.setVisible(true);
    }
    
    
}
