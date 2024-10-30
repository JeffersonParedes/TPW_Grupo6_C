/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class Pago {
     private double monto;
    private String metodoPago;

    public Pago(double monto, String metodoPago) {
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public boolean verificarPago() {
        // Simulación de verificación
        System.out.println("Pago verificado: " + monto + " usando " + metodoPago);
        return true;
    }

    public void calcularMonto(double tarifaPorHora, int horas) {
        this.monto = tarifaPorHora * horas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
}
