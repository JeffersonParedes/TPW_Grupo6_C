
package tutoriasacademi;


public class Reporte {
    private int codigo;
    private String contenido;
    private String tipo;
    private String fecha;
    
    public Reporte (int codigo, String contenido, String tipo, String fecha){
        this.codigo = codigo;
        this.contenido = contenido;
        this.tipo = tipo;
        this.fecha = fecha;
                 
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public void crearReporte(int codigo, String contenido, String tipo, String fecha) { 
        this.codigo = codigo; 
        this.contenido = contenido; 
        this.tipo = tipo;
        this.fecha = fecha; 
    } 
    
    
    public void mostrarDetalles() { 
        System.out.println("Código: " + codigo); 
        System.out.println("Contenido: " + contenido); 
        System.out.println("Tipo: " + tipo); 
        System.out.println("Fecha: " + fecha);
    
}
}