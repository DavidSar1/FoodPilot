/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Mesa {
    
    ArrayList<Mesa> mesas = new ArrayList<>();
    int numero;
    int capacidad;
    
    

    public Mesa() {
    }

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void guardarArryList(int a, int b){
        Mesa ms = new Mesa();
        ms.setNumero(a);
        ms.setCapacidad(b);
        
        mesas.add(ms);
        
    }
    
    public ArrayList setArrayList(){
        
        
        return mesas;
    }
   
    
    
    
    
}
