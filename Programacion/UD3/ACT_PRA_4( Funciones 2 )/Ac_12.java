package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_12 {
    public static double KM_a_Milla(double a){
        double Milla = a /1.609;
        return Milla;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km;

        System.out.print("Introduce una distancia en KM: ");
        km = sc.nextDouble();

        System.out.println(km + "km son " + KM_a_Milla(km) + " Millas");
    }
}
