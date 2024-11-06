/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Alumno extends Persona {
    private String NivelEducativo;
    private String CentroEsucativo;

    public Alumno(String NivelEducativo, String CentroEsucativo, int codigo, String Nombre, String Apellido, String Correo, tutoriasacademi.logica.Rol Rol, String Nacionalidad, String Genero, String Usuario, String Clave) {
        super(codigo, Nombre, Apellido, Correo, Rol, Nacionalidad, Genero, Usuario, Clave);
        this.NivelEducativo = NivelEducativo;
        this.CentroEsucativo = CentroEsucativo;
    }
    

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public String getCentroEsucativo() {
        return CentroEsucativo;
    }

    public void setCentroEsucativo(String CentroEsucativo) {
        this.CentroEsucativo = CentroEsucativo;
    }

}
