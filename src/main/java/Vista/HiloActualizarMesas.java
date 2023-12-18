/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class HiloActualizarMesas extends Thread{
    GestionMesero gMesero;

    public HiloActualizarMesas(GestionMesero gMesero) {
        this.gMesero = gMesero;
    }

    @Override
    public void run() {
       while(true){
           try {
               gMesero.actualizarTablaMesas();
               sleep(10000);
           } catch (InterruptedException ex) {
               Logger.getLogger(HiloActualizar.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
