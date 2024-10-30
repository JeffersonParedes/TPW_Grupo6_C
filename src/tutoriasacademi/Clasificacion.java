/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class Clasificacion {
    private int puntuacion;
    private String comentario;
    private String fecha;

    public Clasificacion(int puntuacion, String comentario, String fecha) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public void asignarClasificacion(int puntuacion, String comentario) {
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public void verClasificacion() {
        System.out.println("Puntuación: " + puntuacion);
        System.out.println("Comentario: " + comentario);
        System.out.println("Fecha: " + fecha);
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
