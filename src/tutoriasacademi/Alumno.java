package tutoriasacademi;

public class Alumno extends Persona {
    private String NivelEducativo;
    private String CentroEducativo;

    public Alumno(int codigo, String nombre, String apellido, String correo, String fechaNacimiento, String nacionalidad, String genero, String NivelEducativo, String CentroEducativo) {
        super(codigo, nombre, apellido, correo, fechaNacimiento, nacionalidad, genero);
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

    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() + ", Fecha de Nacimiento: " + getFechaNacimiento() + ", Nacionalidad: " + getNacionalidad() + ", Genero: " + getGenero() + ", Nivel Educativo: " + NivelEducativo + ", Centro Educativo: " + CentroEducativo);
    }
}

