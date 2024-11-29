package PROG;
import java.util.Scanner;

public class Ac_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var_in = 0; 
        int suma = 0;

        while (0 <= var_in) {
            suma += var_in;
            System.out.print("Introduce los numeros: ");
            var_in = sc.nextInt();    
        }
        System.out.println("La suma de los positivos es: " + suma);
    }
}
