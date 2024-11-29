package PROG.Prog6_fun;

import java.util.Scanner;

public class Ac_03 {
    public static Integer Minimo(int a, int b){
        if( a > b ){
            return b;
        }
        else if( a < b ){
            return a;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Introduce A: ");
        a = sc.nextInt();
        System.out.println("Introduce B: ");
        b = sc.nextInt();

        System.out.println("El mayor es: " + Minimo(a, b));
    }
}
