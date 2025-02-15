package Clases;

import Interfaces.Alexa;

public class Lavadora extends Electrodomestico implements Alexa{
    private final boolean inteligente;
    private final String programa;
    private final float carga;

    // Constructor
    public Lavadora(float precio_base, float peso, String color, char consumo_electrico, boolean inteligente,
            String programa, float carga) {

        super(precio_base, peso, color, consumo_electrico);
        this.inteligente = inteligente;
        this.programa = programa;
        this.carga = carga;
    }

    public Lavadora(float precio_base, float peso) {
        super(precio_base, peso);
        this.carga = 5;
        this.inteligente = false;
        this.programa = "economico";
    }

    public Lavadora() {
        super();
        this.carga = 5;
        this.inteligente = false;
        this.programa = "economico";
    }

    // Metodos
    private String [] programas = {"Económico", "Lana", "Algodón", "Sintéticos", "Ropaoscura", "Rápido", "Sport"};
    public void dimeAlexa(){
        if (inteligente){
            System.out.println("Programas Disponibles: ");
            for (String i : programas){
                System.out.println("- " + i);
            }
        }
    }

    public float precioFinal() {
        float nuevo_precio = calcularPrecioFinal();

        if (carga > 30) {
            nuevo_precio += 50;
        }
        if (inteligente) {
            nuevo_precio += 25;
        }

        return nuevo_precio;
    }

    // Gets
    public boolean getInteligente() {
        return inteligente;
    }

    public String getPrograma() {
        return programa;
    }

    public float getCarga() {
        return carga;
    }
}
