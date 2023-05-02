/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.Terreno;
/**
 *
 * @author carlo
 */
public class Ejecutor {

    public static void main(String[] args) {
        Terreno t = new Terreno ();
        Terreno t2 = new Terreno ();
        
        double ancho = 20;
        double largo = 100;
        double valorMetroCuadrado = 12;
        
        double ancho2 = 40;
        double largo2 = 100;
        double valorMetroCuadrado2 = 15;
        
        t.establecerAncho_terreno(ancho);
        t.establecerLargo_terreno(largo);
        t.establecerValorMetroCuadrado(valorMetroCuadrado);
        t.calcularArea();
        t.calcularCosto_terreno();
        
        System.out.printf("El area del terreno es %.2f, con un costo de "
                + "%.2f$ \n", t.obtenerArea_terreno(), t.obtenerCosto_terreno());
        
        t.establecerAncho_terreno(ancho2);
        t.establecerLargo_terreno(largo2);
        t.establecerValorMetroCuadrado(valorMetroCuadrado2);
        t.calcularArea();
        t.calcularCosto_terreno();
       
        System.out.printf("El area del terreno es %.2f, con un costo de "
                + "%.2f$ \n", t.obtenerArea_terreno(), t.obtenerCosto_terreno());
    }
    
    
        
           
}
    
