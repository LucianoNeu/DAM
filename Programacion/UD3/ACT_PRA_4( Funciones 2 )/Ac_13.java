package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_13 {
    public static float calc_descuento (float a, float b){
        return (b/a) * 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio_sin, precio_con;

        System.out.print("Introduce el precion total: ");
        precio_sin = sc.nextFloat();
        System.out.print("Intoduce el precion con descuento: ");
        precio_con = sc.nextFloat();

        System.out.println("Tu descuento es de: " + calc_descuento(precio_sin, precio_con) + "%");
    }
}
