/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Evaluacion {
    private Tema Tema;
    private int NumeroDePreguntas;
    private int PuntajeTotal;
    private Calificacion Calificacion;

    public Evaluacion(Tema Tema, int NumeroDePreguntas, int PuntajeTotal, Calificacion Calificacion) {
        this.Tema = Tema;
        this.NumeroDePreguntas = NumeroDePreguntas;
        this.PuntajeTotal = PuntajeTotal;
        this.Calificacion = Calificacion;
    }

    public Tema getTema() {
        return Tema;
    }

    public void setTema(Tema Tema) {
        this.Tema = Tema;
    }

    public int getNumeroDePreguntas() {
        return NumeroDePreguntas;
    }

    public void setNumeroDePreguntas(int NumeroDePreguntas) {
        this.NumeroDePreguntas = NumeroDePreguntas;
    }

    public int getPuntajeTotal() {
        return PuntajeTotal;
    }

    public void setPuntajeTotal(int PuntajeTotal) {
        this.PuntajeTotal = PuntajeTotal;
    }

    public Calificacion getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Calificacion Calificacion) {
        this.Calificacion = Calificacion;
    }
    

    
}
