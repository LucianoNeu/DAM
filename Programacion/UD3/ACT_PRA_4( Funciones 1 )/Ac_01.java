package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_01 {

    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Introduce X: ");
        x = sc.nextDouble();
        System.out.print("Introduce Y: ");
        y = sc.nextDouble();

        System.out.println("El resultado es: " + multiplicar(x, y));
    }
}
