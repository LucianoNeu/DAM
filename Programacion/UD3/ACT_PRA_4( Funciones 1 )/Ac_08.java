package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_08 {
    public static Integer suma1aN(Integer a){
        int suma = 0;
        for(int i = 1; i <= a; i++){
            suma += i;
        }
        return suma;
    }
    public static Integer producto1aN(Integer a){
        int prod = 1;
        for(int i = 1; i <= a; i++){
            prod *= i;
        }
        return prod;
    }
    public static float intermedio1aN(Integer a){
        return a / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Introduce N: ");
        x = sc.nextInt();

        System.out.println(suma1aN(x));
        System.out.println(producto1aN(x));
        System.out.println(intermedio1aN(x));
    }
}