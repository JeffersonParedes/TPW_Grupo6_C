/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class ComprobanteDePago {
     private int id;
    private String fechaPago;
    private String destinatario;
    private Pago pago;

    public ComprobanteDePago(int id,String fechaPago, String destinatario, Pago pago) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.destinatario = destinatario;
        this.pago = pago;
        this.fechaPago = java.time.LocalDate.now().toString();
    }

    public void generarComprobante() {
        System.out.println("Generando comprobante de pago...");
        System.out.println("ID: " + id);
        System.out.println("Fecha de Pago: " + fechaPago);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Monto: " + pago.verificarPago());
    }

    public void verDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Fecha de Pago: " + fechaPago);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Monto: " + pago.verificarPago());
    }

    public boolean comprobarEstado() {
        // Simulación de estado
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
}
