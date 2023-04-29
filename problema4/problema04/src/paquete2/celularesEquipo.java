/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author carlo
 */
public class celularesEquipo {

    private String os;
    private String mac;
    private int imei;
    private int iva;
    private double tamanioPantalla;
    private double costoInicial;
    private double costoFinal;
    private double ivaCostoInicial;
    
     public void establecerOs(String oS) {
        os = oS;
    }

    public void establecerMacAdress(String macAdress) {
        mac = macAdress;
    }

    public void establecerImei(int im) {
        imei = im;
    }

    public void establecerTamanioPantalla(double pantalla) {
        tamanioPantalla = pantalla;
    }

    public void establecerCostoInicial(double costoI) {
        costoInicial = costoI;
    }

    public void establecerIva(int i) {
        iva = i;
    }

    public void calcularIvaInicial() {
        ivaCostoInicial = (costoInicial*iva)/100;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial ;
    }

    
    public String obtenerOs() {
        return os;
    }

    public String obtenerMacAdress() {
        return mac;
    }

    public int obtenerImei() {
        return imei;
    }

    public double obtenerTamanio() {
        return tamanioPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public double obtenerIvaInicial() {
        return ivaCostoInicial;
    }

    public int obtenerIva() {
        return iva;
    }

}
