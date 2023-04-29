/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author carlo
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void calcularCosto_terreno (){
        costo_terreno = area*valorMetroCuadrado;
    }
    public void establecerAncho_terreno (double at){
        ancho = at;
    }
    public void establecerLargo_terreno (double lt){
        largo = lt;
    }
    public void calcularArea (){
        area = ancho*largo;
    }
    public void establecerValorMetroCuadrado (double valor){
        valorMetroCuadrado = valor;
    }
    
    public double obtenerCosto_terreno (){
        return costo_terreno;
    }
    public double obtenerAncho_terreno (){
        return ancho;
    }
    public double obtenerLargo_terreno (){
        return largo;
    }
    public double obtenerArea_terreno (){
        return area;
    }
    public double obtenerValorMetroCuadrado (){
        return valorMetroCuadrado;
    } 
}
