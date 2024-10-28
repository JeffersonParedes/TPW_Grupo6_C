
package tutoriasacademi;




abstract class Persona {
    private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String fechaDeNacimiento;
    private String nacionalidad;
    
    
    
    
    public Persona(int codigo, String nombre, String apellido, String correo, String fechaDeNacimiento, String nacionalidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }




    // Método abstracto
    public abstract void mostrarInformacion();
    // Aca escribimos
    public static void main(String[] args) {

     
        
    }
}
