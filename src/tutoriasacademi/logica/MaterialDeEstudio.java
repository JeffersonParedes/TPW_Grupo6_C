/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class MaterialDeEstudio {
    private String Titulo;
    private String Descripcion;
    private String Tipo;
    private Tema Tema;
    private Evaluacion Evaluacion;

    public MaterialDeEstudio(String Titulo, String Descripcion, String Tipo, Tema Tema, Evaluacion Evaluacion) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.Tema = Tema;
        this.Evaluacion = Evaluacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Tema getTema() {
        return Tema;
    }

    public void setTema(Tema Tema) {
        this.Tema = Tema;
    }

    public Evaluacion getEvaluacion() {
        return Evaluacion;
    }

    public void setEvaluacion(Evaluacion Evaluacion) {
        this.Evaluacion = Evaluacion;
    }
    
}
