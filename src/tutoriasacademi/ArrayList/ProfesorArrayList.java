/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.ArrayList;
import java.util.ArrayList;
import tutoriasacademi.logica.Tutor;

/**
 *
 * @author alexr
 */
public class ProfesorArrayList {
    private ArrayList<Tutor> tutores;

    public ProfesorArrayList() {
        this.tutores = new ArrayList<>();
    }

    public void agregarTutor(Tutor tutor) {
        this.tutores.add(tutor);
    }

    public Tutor obtenerTutor(int index) {
        return this.tutores.get(index);
    }

    public int cantidadTutores() {
        return this.tutores.size();
    }
    
}

