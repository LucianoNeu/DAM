package Prog2.Clases_2;

public class Tiempo {
    private Integer hora, minutos, segundos, centecimas;

    // Constructor
    public Tiempo(int hora, int minutos, int segundos, int centecimas) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.centecimas = centecimas;
    }

    // GETs
    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public int getCentecimas() {
        return this.centecimas;
    }

    // SETs
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setCentecimas(int centecimas) {
        this.centecimas = centecimas;
    }
}
