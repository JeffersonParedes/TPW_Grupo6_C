/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class Tema {
     private String titulo;
    private String contenido;
    private String asignatura;
    private String fechaCreacion;

    public Tema(String titulo, String contenido, String asignatura) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.asignatura = asignatura;
        this.fechaCreacion = java.time.LocalDate.now().toString();
    }

    public void mostrarTema() {
        System.out.println("Título del Tema: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Fecha de Creación: " + fechaCreacion);
    }

    public void agregarTema(String nuevoContenido) {
        this.contenido += "\n" + nuevoContenido;
    }

    public void removerTema() {
        this.contenido = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
