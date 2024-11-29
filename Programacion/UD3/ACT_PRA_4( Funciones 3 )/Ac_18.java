package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_18 {
    public static String letra_dni(int num){
        String [] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
        if (Math.floor(num%23) <= 22) {
            int numero = (int) Math.floor(num%23);
            return letras[numero];
        }
        else {
            return "No valido";
        }
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int var_in;

        System.out.print("Introduce tu DNI: ");
        var_in = sc.nextInt();

        System.out.println("Tu letra es: " + letra_dni(var_in));
    }
}