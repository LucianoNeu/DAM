package PROG.Prog6_fun;

import java.util.Scanner;

public class Ac_06 {
    public static double Calc_IVA(double a){
        return a * 0.21;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;

        System.out.println("Calculador de IVA.");
        System.out.print("Introduce un precio: ");
        precio = sc.nextDouble();

        System.out.println("El total es: " + (precio + Calc_IVA(precio)));
    }
}
