package Clases;

public abstract class Electrodomestico {
    protected final float precio_base;
    protected final float peso;
    protected final String color;
    protected final char consumo_electrico;

    // Constructores
    public Electrodomestico(float precio_base, float peso, String color, char consumo_electrico) {
        this.precio_base = precio_base;
        this.peso = peso;
        if (comprobarColor(color)) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
        if (comprobarConsumoEnergetico(consumo_electrico)) {
            this.consumo_electrico = consumo_electrico;
        } else {
            this.consumo_electrico = 'F';
        }
    }

    public Electrodomestico(float precio_base, float peso) {
        this.precio_base = precio_base;
        this.peso = peso;
        this.color = "blanco";
        this.consumo_electrico = 'F';
    }

    public Electrodomestico() {
        this.precio_base = 100;
        this.peso = 5;
        this.color = "blanco";
        this.consumo_electrico = 'F';
    }

    // Metodos
    private boolean comprobarConsumoEnergetico(char letra) {
        char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        for (char i : letras) {
            if (i == letra) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarColor(String color) {
        String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
        for (String i : colores) {
            if (color.toLowerCase().equals(i)) {
                return true;
            }
        }
        return false;
    }

    public float calcularPrecioFinal() {
        int aumento_precio = 0;
        char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] valor = { 100, 80, 60, 50, 30, 10 };
        for (int i = 0; i < letras.length; i++) {
            if (consumo_electrico == letras[i]) {
                aumento_precio += valor[i];
            }
        }
        if (peso > 0 && peso < 19) {
            aumento_precio += 10;
        } else if (peso > 20 && peso < 49) {
            aumento_precio += 50;
        } else if (peso > 50 && peso < 79) {
            aumento_precio += 80;
        } else {
            aumento_precio += 100;
        }

        return precio_base + aumento_precio;
    }

    // GETs
    public double getPrecio_base() {
        return precio_base;
    }

    public float getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_electrico() {
        return consumo_electrico;
    }
}
