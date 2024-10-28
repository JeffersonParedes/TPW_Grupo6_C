
package tutoriasacademi;


public class Administracion extends Persona {
    private String puesto;
    private double descripcion;
  

    public Administracion(int codigo, String nombre, String apellido, String correo, String fechaDeNacimiento, String nacionalidad, String puesto, double descripcion) {
        super(codigo, nombre, apellido, correo, fechaDeNacimiento, nacionalidad);
        this.puesto = puesto;
        this.descripcion = descripcion;
  
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(double descripcion) {
        this.descripcion = descripcion;
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() +", fechaDeNacimiento : " + getFechaDeNacimiento()+ ", nacionalidad : " + getNacionalidad() + ", Puesto: " + puesto + ", Descripción: " + descripcion);
    }
}
