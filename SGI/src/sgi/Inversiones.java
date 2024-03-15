/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgi;

/**
 *
 * @author Jose Felipe Quintero
 */
public class Inversiones {
    
    
    private double criptomoneda;
    private double cdt;
    private double bienesRaices;

    public Inversiones(double criptomoneda, double cdt, double bienesRaices) {
        this.criptomoneda = criptomoneda;
        this.cdt = cdt;
        this.bienesRaices = bienesRaices;
    }

    // Métodos para acceder y modificar los atributos
    public double getCriptomoneda() {
        return criptomoneda;
    }

    public void setCriptomoneda(double criptomoneda) {
        this.criptomoneda = criptomoneda;
    }

    public double getCdt() {
        return cdt;
    }

    public void setCdt(double cdt) {
        this.cdt = cdt;
    }

    public double getBienesRaices() {
        return bienesRaices;
    }

    public void setBienesRaices(double bienesRaices) {
        this.bienesRaices = bienesRaices;
    }

    // Método para invertir una cantidad de monto en un tipo de inversión específico
    public void invertir(double monto, String tipoInversion) {
        switch (tipoInversion) {
            case "criptomoneda":
                criptomoneda += monto;
                break;
            case "cdt":
                cdt += monto;
                break;
            case "bienesRaices":
                bienesRaices += monto;
                break;
            default:
                System.out.println("Tipo de inversión no válido");
        }
    }

    // Método para establecer la duración de la inversión en meses
    public void establecerDuracionInversion(int duracion, String tipoInversion) {
        // Implementar la lógica para establecer la duración de la inversión según el tipo
    }

    // Método para calcular la ganancia o pérdida de una inversión
    public double calcularGananciaPerdida(double montoInicial, double montoFinal) {
        return montoFinal - montoInicial;
    }

    // Método para calcular el rendimiento total de las inversiones
    public double calcularRendimientoTotal() {
        return criptomoneda + cdt + bienesRaices;
    }
}
    
    
