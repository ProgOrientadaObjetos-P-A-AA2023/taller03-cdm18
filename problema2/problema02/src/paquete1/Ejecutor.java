/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.EquivalenteHora;

/**
 *
 * @author carlo
 */
public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora conversor = new EquivalenteHora();
        EquivalenteHora conversor2 = new EquivalenteHora();

        double horas = 24;
        double horas2 = 350;

        conversor.establecerHoras(horas);
        conversor.calcularMinutos();
        conversor.calcularSegundos();
        conversor.calcularDias();
        
        System.out.printf("Las horas ingresadas son %.2f, siendo %.2f minutos,"
                + " %.2f segundos y %.2f dia/s \n", conversor.obtenerHoras(),
                conversor.obtenerMinutos(), conversor.obtenerSegundos(),
                conversor.obtenerDias());
        
        conversor.establecerHoras(horas2);
        conversor.calcularMinutos();
        conversor.calcularSegundos();
        conversor.calcularDias();

        System.out.printf("Las horas ingresadas son %.2f, siendo %.2f minutos,"
                + " %.2f segundos y %.2f dia/s \n", conversor.obtenerHoras(),
                conversor.obtenerMinutos(), conversor.obtenerSegundos(),
                conversor.obtenerDias());
    }

}
