import java.util.ArrayList;
import java.util.Iterator;

import Clases.*;

/*  EJERCICIO
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();
        arrayVehiculos.add(new Vehiculo(0, "Marca Generica", "BMX", "Rojo", 245));
        arrayVehiculos.add(new Coche(143256, "ABC 123", "Seat", "Leon", "Blanco", 3700, true));
        arrayVehiculos.add(new Coche(123456, "DEF 567", "BMW", "E4", "Blanco", 6500, false));
        arrayVehiculos.add(new Coche2Mano(789101, "GHI 891", "Fiat", "Croma", "Negro", 4350, true, 12400));
        arrayVehiculos.add(new Coche2Mano(112131, "JKL 112", "Honda", "Civic", "Rojo", 3600, false, 24000));

        Iterator<Vehiculo> it = arrayVehiculos.iterator();

        while (it.hasNext()) {
            Vehiculo coche = it.next();
            
            System.out.println("Vehiculo: " + coche.toString() + "\n");
        }
    }
}
*/

public class Main {
    public static void mostrarkms(ArrayList<Vehiculo> vehiculos) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i) instanceof Coche2Mano) {
                Coche2Mano tutu = (Coche2Mano) vehiculos.get(i);
                System.out.println("Coche2Mano : " + tutu.getKms());
            }
            else if (vehiculos.get(i) instanceof Coche) {
                System.out.println("Coche : " + 0);
            }
            else if (vehiculos.get(i) instanceof Vehiculo) {
                System.out.println("Vehiculo : " + 0);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();

        boolean[] rev = { false, true, false, false, true };
        arrayVehiculos.add(new Coche(789101, "GHI 891", "Fiat", "Croma", "Negro", 4350, rev));
        arrayVehiculos.add(new Coche2Mano(112131, "JKL 112", "Honda", "Civic", "Rojo", 3600, rev, 24000));

        Iterator<Vehiculo> it = arrayVehiculos.iterator();

        boolean[] rev1 = { true, true, false, false, true };

        while (it.hasNext()) {
            Coche coche = (Coche) it.next();

            coche.revisar(1);

            System.out.println(coche);

            coche.revisar(rev1);

            System.out.println(coche);
        }
    }
}