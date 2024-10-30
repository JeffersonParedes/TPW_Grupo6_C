/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysList;
import  java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexr
 */
public class Profesorarraylist {
    
    List<Profesorarraylist> listaProfesores = new ArrayList<>();

    public void agregar(Profesorarraylist p) {
        listaProfesores.add(p);
    }

    public void quitar(Profesorarraylist p) {
        listaProfesores.remove(p);
    }

    public Profesorarraylist obtener(int pos) {
        return listaProfesores.get(pos);
    }

    public List<Profesorarraylist> listar() {
        return this.listaProfesores;
    }
}
