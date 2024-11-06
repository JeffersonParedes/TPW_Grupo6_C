/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Tutor extends Persona {
    private String Especialidad;
    private String Descripcion;
    private double CostoPorHora;
    private MaterialDeEstudio MaterialDeEstudio;
    private Disponibilidad Disponibilidad;

    public Tutor(String Especialidad, String Descripcion, double CostoPorHora, MaterialDeEstudio MaterialDeEstudio, Disponibilidad Disponibilidad, int codigo, String Nombre, String Apellido, String Correo, tutoriasacademi.logica.Rol Rol, String Nacionalidad, String Genero, String Usuario, String Clave) {
        super(codigo, Nombre, Apellido, Correo, Rol, Nacionalidad, Genero, Usuario, Clave);
        this.Especialidad = Especialidad;
        this.Descripcion = Descripcion;
        this.CostoPorHora = CostoPorHora;
        this.MaterialDeEstudio = MaterialDeEstudio;
        this.Disponibilidad = Disponibilidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getCostoPorHora() {
        return CostoPorHora;
    }

    public void setCostoPorHora(double CostoPorHora) {
        this.CostoPorHora = CostoPorHora;
    }

    public MaterialDeEstudio getMaterialDeEstudio() {
        return MaterialDeEstudio;
    }

    public void setMaterialDeEstudio(MaterialDeEstudio MaterialDeEstudio) {
        this.MaterialDeEstudio = MaterialDeEstudio;
    }

    public Disponibilidad getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    
    
}
