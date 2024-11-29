package PROG.Prog5;
import java.util.Scanner;

public class Ac_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km, precio = 0;

        System.out.print("Introduce la cantidad de KM: ");
        km = sc.nextFloat();

        if (km > 10f && km < 100f){
            precio = km * 2;
        }
        else if (km > 100f && km < 999) {
            precio = km * 1.5f;
        }
        else if (km > 1000);
        precio = km * 1;
    }
}