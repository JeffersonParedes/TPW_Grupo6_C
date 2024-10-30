package tutoriasacademi;
abstract class Persona {
    int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    String fechaNacimiento;
    private String nacionalidad;
    private String genero;

    // Constructor
    public Persona(int codigo, String nombre, String apellido, String correo, String fechaNacimiento, String nacionalidad, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    // Getters y Setters
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos
    public void registrar() {
        // Lógica para registrar a la persona
    }

    public void iniciarSesion() {
        // Lógica para iniciar sesión
    }

    public void cerrarSesion() {
        // Lógica para cerrar sesión
    }
}

