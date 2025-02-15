package Clases;

import Interfaces.Alexa;

public class Television extends Electrodomestico implements Alexa{
    private int resolucion;
    private boolean smartTV;
    private String canal;

    // Constructores
    public Television() {
        super();
        this.resolucion = 32;
        this.smartTV = false;
        this.canal = "La 1 HD";
    }

    public Television(float precio_base, float peso) {
        super(precio_base, peso);
        this.resolucion = 32;
        this.smartTV = false;
        this.canal = "La 1 HD";
    }

    public Television(float precio_base, float peso, String color, char consumo_electrico, int resolucion,
            boolean smartTV, String canal) {

        super(precio_base, peso, color, consumo_electrico);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
        this.canal = canal;
    }

    // Metodos
    String canales [] = {"La 1 HD", "La 2 HD", "TD HD", "Antena 3 HD", "Telecinco HD", "Netfilx", "HBO", "Amazon Prime"};
    public void dimeAlexa(){
        if (smartTV){
            System.out.println("Canales Disponibles: ");
            for (String i : canales){
                System.out.println("- " + i);
            }
        }
    }

    public float precioFinal() {
        float nuevo_precio = calcularPrecioFinal();
        
        if (resolucion > 40) {
            nuevo_precio += (nuevo_precio * 0.3);
        }
        if (smartTV){
            nuevo_precio += 50;
        }

        return nuevo_precio;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getSmartTV() {
        return smartTV;
    }

    public String getCanal() {
        return canal;
    }
}
