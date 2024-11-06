/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Administracion extends Persona{
    private String Puesto;
    private String Salario;

    public Administracion(String Puesto, String Salario, int codigo, String Nombre, String Apellido, String Correo, tutoriasacademi.logica.Rol Rol, String Nacionalidad, String Genero, String Usuario, String Clave) {
        super(codigo, Nombre, Apellido, Correo, Rol, Nacionalidad, Genero, Usuario, Clave);
        this.Puesto = Puesto;
        this.Salario = Salario;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }
    
}
