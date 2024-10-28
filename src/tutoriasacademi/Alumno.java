/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;



    public class Alumno extends Persona {
    private String NivelEducativo;
    private String CentroEducativo;
    

    public Alumno(int codigo, String nombre, String apellido, String correo, String fechaDeNacimiento, String nacionalidad, String NivelEducativo , String CentroEducativo) {
        super(codigo, nombre, apellido, correo, fechaDeNacimiento, nacionalidad);
        this.NivelEducativo = NivelEducativo;
        this.CentroEducativo = CentroEducativo;
    }

    public String getNivelEducativo() {
        return NivelEducativo;
    }

    public void setNivelEducativo(String NivelEducativo) {
        this.NivelEducativo = NivelEducativo;
    }

    public String getCentroEducativo() {
        return CentroEducativo;
    }

    public void setCentroEducativo(String CentroEducativo) {
        this.CentroEducativo = CentroEducativo;
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() +", fechaDeNacimiento : " + getFechaDeNacimiento()+ ", nacionalidad : " + getNacionalidad() + ", nivelEducativo : " + NivelEducativo + ", Centro Educativo :  " + CentroEducativo);
    }
}
