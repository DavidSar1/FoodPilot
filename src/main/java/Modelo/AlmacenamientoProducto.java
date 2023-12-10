/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author PC
 */
public class AlmacenamientoProducto {
    
    public static ArrayList<Producto> productosC = new ArrayList<>(Arrays.asList(
        new Producto("Ensalada", "Ensalada fresca con lechuga romana, crutones, queso parmesano y aderezo César.", "ACTIVO", 10000),
        new Producto("Pasta Carbonara", "Pasta con salsa cremosa de huevo, queso parmesano y panceta.", "ACTIVO", 9000),
        new Producto("Ensalada Cesar", "Ensalada fresca con lechuga romana, crutones, queso parmesano y aderezo César.", "ACTIVO", 7000),
        new Producto("Sopa de Tomate", "Sopa caliente de tomate con hierbas y un toque de crema.", "ACTIVO", 5000),
        new Producto("Hamburguesa", "Hamburguesa jugosa con queso, lechuga, tomate y salsa especial.", "ACTIVO", 10000),
        new Producto("Pollo a la Parrilla", "Pechuga de pollo a la parrilla marinada con hierbas y especias.", "ACTIVO", 9000),
        new Producto("Filete de Salmon", "Filete de salmón fresco a la parrilla con limón y eneldo.", "ACTIVO", 15000),
        new Producto("Tarta de Manzana", "Tarta de manzana casera con una bola de helado de vainilla.", "ACTIVO", 6000),
        new Producto("Cafe Expreso", "Café expreso recién hecho, perfecto para terminar la comida.", "ACTIVO", 3000),
        new Producto("Te Verde", "Té verde caliente, perfecto para una tarde relajante.", "ACTIVO", 2500)
    ));
}
