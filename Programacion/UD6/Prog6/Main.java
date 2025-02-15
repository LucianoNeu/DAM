import java.util.ArrayList;

import Clases.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

        // Lavadoras
        electrodomesticos.add(new Lavadora());

        electrodomesticos.add(new Lavadora(250, 30));

        electrodomesticos.add(new Lavadora(350, 45, "rojo", 'A', true, "economico", 32));

        // Televiciones
        electrodomesticos.add(new Television());

        electrodomesticos.add(new Television(760, 27));

        electrodomesticos.add(new Television(890, 40, "negro", 'B', 75, true, "La 1 HD"));


        // Dime Alexa
        for (Electrodomestico j : electrodomesticos) {
            if (j instanceof Lavadora) {
                ((Lavadora) j).dimeAlexa();
                System.out.println();
            } else if (j instanceof Television) {
                ((Television) j).dimeAlexa();
                System.out.println();
            }
        }

        // PrecioFinal

        float PrecioTeleviciones = 0;
        float PrecioLavadoras = 0;

        for (Electrodomestico i : electrodomesticos){
            if (i instanceof Lavadora){
                PrecioLavadoras += ((Lavadora) i).precioFinal();
            } else if (i instanceof Television) {
                PrecioTeleviciones += ((Television) i).precioFinal();
            }
        }
        System.out.println("Precio Televiciones: " + PrecioTeleviciones + "\nPrecio Lavadoras: " + PrecioLavadoras + "\nPrecio Total: " + (PrecioLavadoras + PrecioTeleviciones));
    }
}
