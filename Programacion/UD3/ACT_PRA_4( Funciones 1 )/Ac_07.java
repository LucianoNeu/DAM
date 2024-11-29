package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_07 {
    public static double Area_Rectangulo(double a, double b){
        return a * b;
    }

    public static double Perimetro_Rectangulo(double a, double b){
        return (a*2)+(b*2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Introduce ancho: ");
        x = sc.nextDouble();
        System.out.println("Introduce alto: ");
        y = sc.nextDouble();
        
        System.out.println("Area: " + Area_Rectangulo(x, y));
        System.out.println("Area: " + Perimetro_Rectangulo(x, y));
    }
}
