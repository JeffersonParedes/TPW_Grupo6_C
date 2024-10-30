/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author alexr
 */
public class Evaluacion {
 private String tema;
    private int numeroDePreguntas;
    private double puntajePreguntaIndividual;
    private int puntajeTotal;
    private Clasificacion clasificacion;

    public Evaluacion(String tema, int numeroDePreguntas, double puntajePreguntaIndividual) {
        this.tema = tema;
        this.numeroDePreguntas = numeroDePreguntas;
        this.puntajePreguntaIndividual = puntajePreguntaIndividual;
        this.puntajeTotal = calcularPuntajeTotal();
    }

    private int calcularPuntajeTotal() {
        return (int) (numeroDePreguntas * puntajePreguntaIndividual);
    }

    public void determinarClasificacion(int puntuacion, String comentario) {
        this.clasificacion = new Clasificacion(puntuacion, comentario, java.time.LocalDate.now().toString());
    }

    public void evaluarAlumno() {
        System.out.println("Evaluación de tema: " + tema);
        System.out.println("Puntaje Total: " + puntajeTotal);
        if (clasificacion != null) {
            clasificacion.verClasificacion();
        }
    }

    public void mostrarEvaluacion() {
        System.out.println("Tema: " + tema);
        System.out.println("Número de Preguntas: " + numeroDePreguntas);
        System.out.println("Puntaje por Pregunta: " + puntajePreguntaIndividual);
        System.out.println("Puntaje Total: " + puntajeTotal);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroDePreguntas() {
        return numeroDePreguntas;
    }

    public void setNumeroDePreguntas(int numeroDePreguntas) {
        this.numeroDePreguntas = numeroDePreguntas;
    }

    public double getPuntajePreguntaIndividual() {
        return puntajePreguntaIndividual;
    }

    public void setPuntajePreguntaIndividual(double puntajePreguntaIndividual) {
        this.puntajePreguntaIndividual = puntajePreguntaIndividual;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    
}
