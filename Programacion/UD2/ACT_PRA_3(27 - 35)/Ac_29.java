package PROG;
import java.util.Scanner;

public class Ac_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int factorial;
        int total = 1;

        System.out.print("Introduce el numero para calcular su factorial: ");
        factorial = sc.nextInt();

        for(int i = 1; i <= factorial; i++){
            total *= i;
        }
        System.out.println("Su factorial es: " + total);
    }
}
