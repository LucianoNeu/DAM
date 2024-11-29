package PROG;
import java.util.Scanner;

public class Ac_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, h;
        String var_in;

        System.out.print("Introduce la base del triangulo: ");
        b = sc.nextInt();
        System.out.print("Introduce la altura del triangulo: ");
        h = sc.nextInt();
        sc.skip("\n");

        boolean lp = true;
        while (lp) {
            System.out.println("El resultado es: " + ((b*h)/2));
            System.out.print("Deseas repetir (Y/N): ");
            var_in = sc.nextLine();
            if (var_in.toLowerCase().equals("y")){
                lp = true;
            }
            else if (var_in.toLowerCase().equals("n")){
                lp = false;
            }
            else {
                System.out.println("Entrada no valida.");
            }
        }
    }
}