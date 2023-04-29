/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.AdministracionEducativa;
/**
 *
 * @author carlo
 */
public class Ejecutor {
    public static void main(String[] args) {
        AdministracionEducativa institucion = new AdministracionEducativa ();
        
        String nombre = "San Gerardo";
        String tipo = "Privada";
        int alumnos = 1500;
        int docentes = 150;
        int sedes = 2;
        double gastosProyectados = 270.50;
        
        institucion.establecerNombre(nombre);
        institucion.establecertipoInstitucion(tipo);
        institucion.establecerEstudiantes(alumnos);
        institucion.establecerDocentes(docentes);
        institucion.establecerSedes(sedes);
        institucion.establecerGastosPorEstudiante(gastosProyectados);
        
        institucion.calcularPresupuesto();
        
        System.out.printf("La institucion %s de tipo %s, con %d alumnos y %d"
                + " docentes.\nCon %d sedes a su favor; tiene un presupuesto"
                + " de alrededor de $%.2f\n", institucion.obtenerNombre()
                   , institucion.obtenerTipoInstitucion()
                   , institucion.obtenerEstudiantes()
                   , institucion.obtenerDocentes()
                   , institucion.obtenerSedes()
                   , institucion.obtenerPresupuesto());
                
    }
    
    
   
        
}

