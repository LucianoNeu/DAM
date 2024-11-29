package PROG;
import java.util.Scanner;
import java.util.ArrayList;

public class Ac_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> salida = new ArrayList<Integer>();
        int var_in = 0;

        for (int i = 0; i <= 30; i++){
            System.out.print("Introduce un numero " + (i+1) + ": ");
            var_in = sc.nextInt();
            if (var_in < 5 || var_in > -5){
                salida.add(var_in);
            }
        }
        System.out.print("Los valores (-5 < x < 5) son: ");
        for (int i = 0; i <= salida.size(); i++){
            System.out.print(salida.get(i) + " ");
        }
    }
}