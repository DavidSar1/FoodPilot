/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author Myke
 */
public class Pedido {
    String index;
    String producto;
    String cantidad;
    String precio;
    String total;
    Timer timer;
    int tiempoTranscurrido;
    
    int dia;
    int mes; 
    int año;

    public Pedido() {
    }

    public Pedido(String index, String producto, String cantidad, String precio, String total) {
        this.index = index;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.tiempoTranscurrido = 60;
        this.timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoTranscurrido--;
                
                if (tiempoTranscurrido <= 60) { 
                    timer.stop();
                }
            }
        });
        this.timer.setRepeats(true);
    }
    
    public boolean estaTemporizadorIniciado() {
        return timer != null && timer.isRunning();
    }
    
    public void iniciarTemporizador() {
        // Verificar que el temporizador no sea nulo antes de iniciar
        if (timer != null) {
            timer.start();
        } else {
            System.out.println("Pedido no encontrado");
        }
    }
    
    
    public void detenerTemporizador() {
        timer.stop();
    }
    
    public String getTiempoTranscurridoFormateado() {
        int minutos = tiempoTranscurrido / 60;
        int segundos = tiempoTranscurrido;
        String ent = "Entregado!";
        if(minutos == 0 && segundos == 0){
            return ent;
        } else {
            return String.format("%02d:%02d", minutos, segundos);
        }
    }
    
    public Pedido obtenerPedido(int index) {
        if (index >= 0 && index < Modelo.Arrays.pedidosHechos.size()) {
            return Modelo.Arrays.pedidosHechos.get(index);
        } else {
            // Manejar la situación en la que el índice es inválido, por ejemplo, retornar null o lanzar una excepción.
            return null;
        }
    }

    public Pedido(String producto, String cantidad, String precio, String total, int dia, int mes, int año) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
   

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    

    @Override
    public String toString() {
        return "Pedido{" + "index=" + index + ", producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + ", total=" + total + '}';
    }

    
    
    
    
    
    public ArrayList<Pedido> asignar(String ped, String cant, String pres)
    {
        String pr = ped;
        String ca = cant;
        String cash = pres;
        Pedido p = new Pedido();
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        
        Arrays.ped.add(p);
        
        return Arrays.ped;
    }
    
    public void asignarPed(String ped, String cant, String pres)
    {
        Pedido p = new Pedido();
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        
        Arrays.ped.add(p);
    }
    
    public void asignarPedidoHecho(String index, String producto, String cantidad, String precio, String total) {
        Pedido ped = new Pedido();
        this.index = index;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.tiempoTranscurrido = 60;
        this.timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoTranscurrido--;
                // Puedes agregar lógica adicional aquí si es necesario
                if (tiempoTranscurrido == 0) { // 10 minutos = 600 segundos
                    detenerTemporizador(); // Detener el temporizador después de 10 minutos
                }
            }
        });
        this.timer.setRepeats(true);
        
  
    }
    
    
    
    public ArrayList<Pedido> asignarTmp(String ped, String cant, String pres)
    {
        //String ck = index;
        String pr = ped;
        String ca = cant;
        String cash = pres;
        Pedido p = new Pedido();
        //p.setIndex(ck);
        p.setProducto(ped);
        p.setCantidad(cant);
        p.setPrecio(pres);
        
        Arrays.ListEsp.add(p);
        
        return Arrays.ListEsp;
    }
    
    
 
}
