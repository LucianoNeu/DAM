package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_20 {
    public static void tabla_m(int a){
        for(int i = 0; i <= 10; i++){
            System.out.println(i +" X "+ a +" = "+ i*a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        System.out.print("Introduce un numero: ");
        x = sc.nextInt();
        tabla_m(x);
    }
}