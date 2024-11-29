package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_05 {

    public static double Mill_a_Km(double a){
        return a * 1.60934;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milla;

        System.out.println("Pasar de milla a km.");
        System.out.print("Introduce millas: ");
        milla = sc.nextDouble();
        
        System.out.println("Son :" + Mill_a_Km(milla) + "km");
    }
}