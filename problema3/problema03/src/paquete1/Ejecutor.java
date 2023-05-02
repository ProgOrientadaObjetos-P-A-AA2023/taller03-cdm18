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
        AdministracionEducativa institucion = new AdministracionEducativa();
        AdministracionEducativa institucion2 = new AdministracionEducativa();

        String nombre = "San Peters";
        String tipo = "Publica";
        int alumnos = 200;
        int docentes = 50;
        int sedes = 2;
        double gastosProyectados = 270.50;
        
        
        String nombre2 = "San Gerardo";
        String tipo2 = "Privada";
        int alumnos2 = 1500;
        int docentes2 = 150;
        int sedes2 = 3;
        double gastosProyectados2 = 443.50;
        
        

        institucion.establecerNombre(nombre);
        institucion.establecertipoInstitucion(tipo);
        institucion.establecerEstudiantes(alumnos);
        institucion.establecerDocentes(docentes);
        institucion.establecerSedes(sedes);
        institucion.establecerGastosPorEstudiante(gastosProyectados);
        institucion.calcularPresupuesto();
        
        System.out.printf("La institucion %s de tipo %s, con %d alumnos y %d"
                + " docentes.\nCon %d sedes a su favor; tiene un presupuesto"
                + " de alrededor de $%.2f\n", institucion.obtenerNombre(),
                 institucion.obtenerTipoInstitucion(),
                 institucion.obtenerEstudiantes(),
                 institucion.obtenerDocentes(),
                 institucion.obtenerSedes(),
                 institucion.obtenerPresupuesto());
        
        
        institucion.establecerNombre(nombre2);
        institucion.establecertipoInstitucion(tipo2);
        institucion.establecerEstudiantes(alumnos2);
        institucion.establecerDocentes(docentes2);
        institucion.establecerSedes(sedes2);
        institucion.establecerGastosPorEstudiante(gastosProyectados2);
        institucion.calcularPresupuesto();
        
        System.out.println("");
        
          
        System.out.printf("La institucion %s de tipo %s, con %d alumnos y %d"
                + " docentes.\nCon %d sedes a su favor; tiene un presupuesto"
                + " de alrededor de $%.2f\n", institucion.obtenerNombre(),
                 institucion.obtenerTipoInstitucion(),
                 institucion.obtenerEstudiantes(),
                 institucion.obtenerDocentes(),
                 institucion.obtenerSedes(),
                 institucion.obtenerPresupuesto());

    }

}
