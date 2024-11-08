package tutoriasacademi.ArrayList;
import java.util.ArrayList;
import tutoriasacademi.logica.Alumno;

public class AlumnoArrayList {
    
    private ArrayList<Alumno> alumnos;

    public AlumnoArrayList() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public Alumno obtenerAlumno(int index) {
        return this.alumnos.get(index);
    }

    public int cantidadAlumnos() {
        return this.alumnos.size();
    }
}


