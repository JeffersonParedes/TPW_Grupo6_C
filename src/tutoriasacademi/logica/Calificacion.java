/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Calificacion {
    private double Puntuacion;
    private String Comentarios;
    private String Fecha;

    public Calificacion(double Puntuacion, String Comentarios, String Fecha) {
        this.Puntuacion = Puntuacion;
        this.Comentarios = Comentarios;
        this.Fecha = Fecha;
    }

    public double getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(double Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
  
}
