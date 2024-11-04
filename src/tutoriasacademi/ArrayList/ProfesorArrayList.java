/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.ArrayList;
import  java.util.ArrayList;
import java.util.List;
import tutoriasacademi.Profesor;
/**
 *
 * @author alexr
 */
public class ProfesorArrayList {

    List<Profesor> listaProfesores = new ArrayList<>();

    public void agregar(Profesor p) {
        listaProfesores.add(p);
    }

    public void quitar(Profesor p) {
        listaProfesores.remove(p);
    }

    public Profesor obtener(int pos) {
        return listaProfesores.get(pos);
    }

    public List<Profesor> listar() {
        return this.listaProfesores;
    }
}

