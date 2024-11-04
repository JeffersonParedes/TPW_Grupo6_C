package tutoriasacademi.ArrayList;

import java.util.ArrayList;
import java.util.List;
import tutoriasacademi.Alumno;

public class AlumnoArrayList {
    
    List<Alumno> listaAlumnos = new ArrayList<>();

    // Método para agregar un alumno a la lista
    public void agregar(Alumno a) {
        listaAlumnos.add(a);
    }

    // Método para quitar un alumno de la lista
    public void quitar(Alumno a) {
        listaAlumnos.remove(a);
    }


    // Método para listar todos los alumnos
    public List<Alumno> listar() {
        return this.listaAlumnos;
    }
}
