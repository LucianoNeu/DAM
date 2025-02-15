package Clases;

public class Vehiculo {
    protected Integer numbastidor;
    protected String marca, modelo, color;
    protected float precio;

    //Constructor
    public Vehiculo(int numbastidor, String marca, String modelo, String color, float precio) {
        this.numbastidor = numbastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    // METHODs
    public String toString() {
        String datos = "" + this.numbastidor +"/"+ this.marca +"/"+ this.modelo +"/"+ this.color +"/"+ this.precio;
        return datos;
    }

    // GETs
    public Integer getNumbastidor() {
        return numbastidor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public float getPrecio() {
        return precio;
    }

    // SETs
    public void setNumbastidor(Integer numbastidor) {
        this.numbastidor = numbastidor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}