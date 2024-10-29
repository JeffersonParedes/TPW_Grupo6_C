/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author jeffersonparedespretel
 */
public class Reserva {
    private int codigo;
    private Alumno Alumno;
    private Profesor Profesor;
    private HoraSeleccionada Horario;
    private String TipoDeTutoria;
    private String Tema;

    public Reserva(int codigo, Alumno Alumno, Profesor Profesor, HoraSeleccionada Horario, String TipoDeTutoria, String Tema) {
        this.codigo = codigo;
        this.Alumno = Alumno;
        this.Profesor = Profesor;
        this.Horario = Horario;
        this.TipoDeTutoria = TipoDeTutoria;
        this.Tema = Tema;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Profesor getProfesor() {
        return Profesor;
    }

    public void setProfesor(Profesor Profesor) {
        this.Profesor = Profesor;
    }

    public HoraSeleccionada getHorario() {
        return Horario;
    }

    public void setHorario(HoraSeleccionada Horario) {
        this.Horario = Horario;
    }
    
    public String getTipoDeTutoria() {
        return TipoDeTutoria;
    }

    public void setTipoDeTutoria(String TipoDeTutoria) {
        this.TipoDeTutoria = TipoDeTutoria;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    
}
