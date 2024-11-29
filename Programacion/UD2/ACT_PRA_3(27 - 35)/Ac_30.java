package PROG;
import java.util.ArrayList;
import java.util.Scanner;

public class Ac_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var_in = 1;
        ArrayList<Integer> salida = new ArrayList<Integer>();

        while (var_in != 0) {
            System.out.print("Introduce un numero: ");
            var_in = sc.nextInt();
            if (var_in > 0){
                salida.add(var_in);
            }
        }
        System.out.print("Los numeros positivos son: ");
        for(int i = 0; i < salida.size(); i++){
            System.out.print(salida.get(i) + " ");
        }
    }
}