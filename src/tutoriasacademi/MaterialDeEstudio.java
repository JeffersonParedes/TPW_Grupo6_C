/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class MaterialDeEstudio {
    private String titulo;
    private String descripcion;
    private  String tipo;
    private Tema tema;
    private Evaluacion evaluacion;
    
    public MaterialDeEstudio(String titulo, String descripcion, String tipo, Tema tema, Evaluacion evaluacion
    ){
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.tema = tema;
    this.evaluacion = evaluacion;
    }
    public void mostrarMaterial(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Tipo: " + tipo);
          tema.mostrarTema();
          evaluacion.mostrarEvaluacion();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }
    
}
