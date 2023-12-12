/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaPedido;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class HiloEntregado implements Runnable {
    public ListaPedido lpedido;
    public HiloEntregado(ListaPedido lpedido) {
        this.lpedido = lpedido;
    }

    @Override
    public void run() {
            try {
                sleep(10000);
            } catch (InterruptedException ex) {
                    Logger.getLogger(HiloEntregado.class.getName()).log(Level.SEVERE, null, ex);
                }
            
    }
}
