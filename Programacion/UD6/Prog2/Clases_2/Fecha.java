package Prog2.Clases_2;

public class Fecha {
    private Integer dia, mes, anyo;

    // Constructor
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    // GETs
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnyo() {
        return this.anyo;
    }

    // SETs
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnyo(int anyo){
        this.anyo = anyo;
    }
}