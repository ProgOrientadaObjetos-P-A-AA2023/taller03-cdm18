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
        celularesEquipo cel2 = new celularesEquipo();

        String os = "iOS 16.4.1";
        String mac = "44:BA:20:10:02:HJ";
        int imei = 512121355;
        int iva = 12;
        double tamanioPantalla = 5.9;
        double costoInicial = 1525.99;
        
        String os2 = "Android 1.14";
        String mac2 = "43:BB:21:15:12:LJ";
        int imei2 = 4412341;
        int iva2 = 12;
        double tamanioPantalla2 = 6.2;
        double costoInicial2 = 1200.99;
        
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
        
      
        
        cel.establecerOs(os2);
        cel.establecerMacAdress(mac2);
        cel.establecerImei(imei2);
        cel.establecerIva(iva);
        cel.establecerTamanioPantalla(tamanioPantalla2);
        cel.establecerCostoInicial(costoInicial2);
        cel.calcularIvaInicial();
        cel.calcularCostoFinal();

        System.out.println("");    
        
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
