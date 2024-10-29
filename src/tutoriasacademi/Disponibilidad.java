
package tutoriasacademi;


public class Disponibilidad {
    
    private int año;
    private String mes;
    private int dia;
    private double horaInicio;
    private double horaFin;
    
    public Disponibilidad (int año, String mes, int dia, double horaInicio, double horaFin){
   this.año = año;
   this.mes = mes;
   this.dia = dia;
   this.horaInicio = horaInicio;
   this.horaFin = horaFin;
        
    
}

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }
    
    public void mostrarDisponibilidad() { 
        System.out.println("Disponibilidad:"); 
        System.out.println("Año: " + año); 
        System.out.println("Mes: " + mes); 
        System.out.println("Día: " + dia); 
        System.out.println("Hora de inicio: " + horaInicio); 
        System.out.println("Hora de fin: " + horaFin);
    
    
}
    }