package PROG.Prog6_fun;

import java.util.Scanner;

public class Ac_02 {
    
    public static boolean MayorEdad(int a){
        if ( a >= 18 ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Introduce tu edad: ");
        x = sc.nextInt();

        System.out.println("Eres mayor de edad? : " + MayorEdad(x));
    }
}
