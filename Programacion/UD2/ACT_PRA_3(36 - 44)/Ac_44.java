package PROG.Prog4;
import java.util.Scanner;

public class Ac_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] pelicula = {"El Padrino (The Godfather)", "Inception", "La La Land", "Parasite", "Forrest Gump"};
        String [] director = {"francis ford coppola", "christopher nolan", "damien chazelle", "bong joon-ho", "robert zemeckis"};
        int random, puntaje = 5, prg = 0, correctas = 0;
        String var_in;

        do {
            random = (int)Math.floor(Math.random()*4+1);

            System.out.println("Cual es el director de: " + pelicula[random]);
            System.out.print("Respuesta: ");
            var_in = sc.nextLine();
            System.out.println(var_in);
            if (var_in.toLowerCase().equals(director[random])){
                System.out.println(director[random]);
                System.out.println("La respuesta es correcta.");
                correctas += 1;
            }
            else{
                System.out.println(director[random]);
                System.out.println("Respuesta incorrecta.");
            }
            System.out.println("\n");
            prg += 1;
            System.out.print("Quieres continual(Y/N): ");
            var_in = sc.nextLine();
            if (var_in.toLowerCase().equals("n")){
                break;
            }
        } while (puntaje > 0);
        System.out.println("El porcentaje de acierto es: " + (((double)correctas/(double)prg)*100) + "%");
    }
}
