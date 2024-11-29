package PROG.Prog4;
import java.util.Scanner;

public class Ac_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Introduce el valor 1: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el valor 2: ");
        num2 = sc.nextDouble();

        if (num2 < num1){
            double temp = num2;
            num2 = num1;
            num1 = temp;
        }

        for (double i = num1; i <= num2; i += 1){
            System.out.println("El cuadrado de " + i +" es: " + Math.sqrt(i));
            System.out.println("Y el cubo es: " + Math.pow(i, 2));
        }
    }    
}