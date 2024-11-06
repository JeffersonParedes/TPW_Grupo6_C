/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriasacademi.logica;

/**
 *
 * @author jeffersonparedespretel
 */
public class Disponibilidad {
    private int Year;
    private String Mes;
    private int Dia;
    private double HoraIncio;
    private double HoraFin;

    public Disponibilidad(int Year, String Mes, int Dia, double HoraIncio, double HoraFin) {
        this.Year = Year;
        this.Mes = Mes;
        this.Dia = Dia;
        this.HoraIncio = HoraIncio;
        this.HoraFin = HoraFin;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public double getHoraIncio() {
        return HoraIncio;
    }

    public void setHoraIncio(double HoraIncio) {
        this.HoraIncio = HoraIncio;
    }

    public double getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(double HoraFin) {
        this.HoraFin = HoraFin;
    }
    

    
}
