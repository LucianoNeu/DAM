package Prog2;
import Prog2.Clases_2.Concursante;

public class Ac_01 {
    public static void main(String[] args) {
        Concursante concursante_1 = new Concursante("pacquito", "paco", "apellido_1", "apellido_2", 1, 2, 1998, 46370, "Chiva", "Calle ej", 12, 12, 8);

        System.out.println(concursante_1.getDomicilio_con().getCalle());

        System.out.println(concursante_1.getNom_con().getNombre());
    }
}