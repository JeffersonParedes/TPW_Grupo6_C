/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi;

/**
 *
 * @author jeffersonparedespretel
 */
public class HoraSeleccionada {
   
    private int año;
    private String mes;
    private int dia;
    private double HoraInicio;
    private double HoraFin;
   
    public HoraSeleccionada(int año, String mes, int dia, double HoraInicio, double HoraFin) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
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
        return HoraInicio;
    }

    public void setHoraInicio(double HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public double getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(double HoraFin) {
        this.HoraFin = HoraFin;
    }
    
    
    
}
