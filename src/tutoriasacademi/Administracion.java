
package tutoriasacademi;

public class Administracion extends Persona {
    private String puesto;
    private double salario;

    public Administracion(int codigo, String nombre, String apellido, String correo, String fechaNacimiento, String nacionalidad, String genero, String puesto, double salario) {
        super(codigo, nombre, apellido, correo, fechaNacimiento, nacionalidad, genero);
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters y Setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

 
    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() + ", Fecha de Nacimiento: " + getFechaNacimiento() + ", Nacionalidad: " + getNacionalidad() + ", Genero: " + getGenero() + ", Puesto: " + puesto + ", Salario: " + salario);
    }

    public void administrarUsuario() {
        // Lógica para administrar usuarios
    }

    public void banearUsuario() {
        // Lógica para banear usuarios
    }
}

