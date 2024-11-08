/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.ArrayList;

import java.util.ArrayList;
import tutoriasacademi.logica.Persona;

/**
 *
 * @author jeffersonparedespretel
 */
public class PersonaArrayList {
     private ArrayList<Persona> listaPersonas;

    public PersonaArrayList() {
        listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
}
