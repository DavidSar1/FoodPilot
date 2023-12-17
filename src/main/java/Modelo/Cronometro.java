/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oscar
 */
public class Cronometro implements Runnable {
    private Pedido pedido;

    public Cronometro(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Actualizar el tiempo del pedido
                // Puedes personalizar la lógica aquí
                Thread.sleep(1000); // Espera 1 segundo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
