/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.celularesEquipo;

/**
 *
 * @author carlo
 */
public class Ejecutor {

    public static void main(String[] args) {

        celularesEquipo cel = new celularesEquipo();

        String os = "iOS 16.4.1";
        String mac = "44:BA:20:10:02:HJ";
        int imei = 512121355;
        int iva = 12;
        double tamanioPantalla = 5.9;
        double costoInicial = 1525.99;

        cel.establecerOs(os);
        cel.establecerMacAdress(mac);
        cel.establecerImei(imei);
        cel.establecerIva(iva);
        cel.establecerTamanioPantalla(tamanioPantalla);
        cel.establecerCostoInicial(costoInicial);
        cel.calcularIvaInicial();
        cel.calcularCostoFinal();

        System.out.printf("Sistema operativo: %s\n"
                + "Direccion MAC: %s\n"
                + "IMEI: %d\n"
                + "Iva: %d por ciento\n"
                + "Tamaño de pantalla: %.2f''\n"
                + "Costo inicial: %.2f\n"
                + "Costo final (+iva): %.2f\n"
                , cel.obtenerOs()
                , cel.obtenerMacAdress()
                , cel.obtenerImei()
                , cel.obtenerIva()
                , cel.obtenerTamanio()
                , cel.obtenerCostoInicial()
                , cel.obtenerCostoFinal());

    }
}
