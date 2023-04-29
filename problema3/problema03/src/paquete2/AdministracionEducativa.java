/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author carlo
 */
public class AdministracionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int estudiantes;
    private int docentes;
    private int sedes;
    private double gastosPorEstudiante;
    private double presupuesto;

    public void establecerNombre(String nm) {
        nombre = nm;
    }

    public void establecertipoInstitucion(String tipo) {
        tipoInstitucion = tipo;
    }

    public void establecerEstudiantes(int est) {
        estudiantes = est;
    }

    public void establecerDocentes(int doc) {
        docentes = doc;
    }

    public void establecerSedes(int sed) {
        sedes = sed;
    }

    public void establecerGastosPorEstudiante(double gastos) {
        gastosPorEstudiante = gastos;
    }

    public void calcularPresupuesto() {
        presupuesto = estudiantes * gastosPorEstudiante;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerEstudiantes() {
        return estudiantes;
    }

    public int obtenerDocentes() {
        return docentes;
    }

    public int obtenerSedes() {
        return sedes;
    }

    public double obtenerGastos() {
        return gastosPorEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
