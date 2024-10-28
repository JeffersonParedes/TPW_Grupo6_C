
package tutoriasacademi;

public class Profesor extends Persona{
     
    private String Especialidad;
    private String Descripcion;
    private double CostoPorHora;
    private String MaterialEstudio;
    private String Disponibilidad;
    private String Reportar;     
    
    public Profesor(int codigo, String nombre, String apellido, String correo, String fechaDeNacimiento, String nacionalidad, String Especialidad, String Descripcion, double CostoPorHora, String MaterialEstudio, String Disponibilidad, String Reportar) {
        super(codigo, nombre, apellido, correo, fechaDeNacimiento, nacionalidad);
       
        this.Especialidad = Especialidad;
        this.Descripcion = Descripcion;
        this.CostoPorHora = CostoPorHora;
        this.MaterialEstudio = MaterialEstudio;
        this.Disponibilidad = Disponibilidad;
        this.Reportar = Reportar;
              
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

    public String getMaterialEstudio() {
        return MaterialEstudio;
    }

    public void setMaterialEstudio(String MaterialEstudio) {
        this.MaterialEstudio = MaterialEstudio;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public String getReportar() {
        return Reportar;
    }

    public void setReportar(String Reportar) {
        this.Reportar = Reportar;
    }

    


                                                                                                                                                                                                                                                                
    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo: " + getCodigo() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Correo: " + getCorreo() +", fechaDeNacimiento : " + getFechaDeNacimiento()+ ", nacionalidad : " + getNacionalidad() + ", Especialidad: " + Especialidad + ", Descripcion :  " + Descripcion + ", Costo Por Hora : " + CostoPorHora + ", Material Estudio : " + MaterialEstudio + ", Disponibilidad : " + Disponibilidad +", Reportar : " + Reportar);
    }
}