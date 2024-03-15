/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgi;

/**
 *
 * @author Jose Felipe Quintero
 */
public class Capital {
    
    
    private double ingresos;
    private double egresos;
    private double ahorros;
    private double capitalLibre;

    public Capital(double ingresos, double egresos, double ahorros, double capitalLibre) {
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.ahorros = ahorros;
        this.capitalLibre = capitalLibre;
    }

    // Métodos para acceder y modificar los atributos
    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public double getAhorros() {
        return ahorros;
    }

    public void setAhorros(double ahorros) {
        this.ahorros = ahorros;
    }

    public double getCapitalLibre() {
        return capitalLibre;
    }

    public void setCapitalLibre(double capitalLibre) {
        this.capitalLibre = capitalLibre;
    }

    // Método para calcular el rendimiento de las inversiones
    public double calcularRendimientoInversiones(Inversiones inversiones) {
        return inversiones.getCriptomoneda() + inversiones.getCdt() + inversiones.getBienesRaices();
    }

    // Método para gestionar los ingresos
    public void gestionarIngresos(double cantidad) {
        ingresos += cantidad;
        capitalLibre += cantidad;
    }

    // Método para gestionar los egresos
    public void gestionarEgresos(double cantidad) {
        egresos += cantidad;
        capitalLibre -= cantidad;
    }
    
}
