/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class HiloActualizar extends Thread {
    GestionMesero gMesero;

    public HiloActualizar(GestionMesero gMesero) {
        this.gMesero = gMesero;
    }

    @Override
    public void run() {
       while(true){
           try {
               gMesero.actualizarPed();
               sleep(10000);
           } catch (InterruptedException ex) {
               Logger.getLogger(HiloActualizar.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
    
    
    
}
