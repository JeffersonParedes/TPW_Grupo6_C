
package tutoriasacademi;


public class Administracion extends Persona {
    private String fechaGestion;
    private String descripcion;
    private String tipoGestion;

    public Administracion(int codigo, String nombre,int edad, String fechaGestion, String descripcion, String tipoGestion) {
        super(codigo, nombre, edad);
        this.fechaGestion = fechaGestion;
        this.descripcion = descripcion;
        this.tipoGestion = tipoGestion;
    }

    public String getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(String fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoGestion() {
        return tipoGestion;
    }

    public void setTipoGestion(String tipoGestion) {
        this.tipoGestion = tipoGestion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administración: " + getNombre() + ", Código: " + getCodigo() + ", edad : " + getEdad()+ ", Fecha de Gestión: " + fechaGestion + ", Descripción: " + descripcion + ", Tipo de Gestión: " + tipoGestion);
    }
}
