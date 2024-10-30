
package tutoriasacademi;

public class Profesor extends Persona {
    private String especialidad;
    private String descripcion;
    private double costoPorHora;
    private String materialEstudio; // Cambiado a String
    private String disponibilidad; // Cambiado a String

    public Profesor(String nombre, String apellido, String correo) {
        super(codigo, nombre, apellido, correo, fechaNacimiento, nacionalidad, genero);
        this.especialidad = especialidad;
        this.descripcion = descripcion;
        this.costoPorHora = costoPorHora;
        this.materialEstudio = materialEstudio;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public String getMaterialEstudio() {
        return materialEstudio;
    }

    public void setMaterialEstudio(String materialEstudio) {
        this.materialEstudio = materialEstudio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() + ", Fecha de Nacimiento: " + getFechaNacimiento() + ", Nacionalidad: " + getNacionalidad() + ", Genero: " + getGenero() + ", Especialidad: " + especialidad + ", Descripcion: " + descripcion + ", Costo por Hora: " + costoPorHora + ", Material de Estudio: " + materialEstudio + ", Disponibilidad: " + disponibilidad);
    }

    public void ofrecerTutoria() {
        // Lógica para ofrecer una tutoría
    }

    public void calificar() {
        // Lógica para calificar
    }

    public void reportar() {
        // Lógica para reportar
    }
}
