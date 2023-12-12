/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author oscar
 */
public class HiloCronometro extends Thread{
    ControladorMesero cMesero;
    int segundos, minutos;
    public HiloCronometro(ControladorMesero cMesero) {
        this.cMesero = cMesero;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (segundos == 60)
                {
                    segundos = 0;
                    minutos++;
                    
                
                }
                Thread.sleep(1000);
                segundos++;
                String minutoPedido = String.format("%02d:%02d", minutos, segundos);
                cMesero.gm.setTiempo(minutoPedido);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}
