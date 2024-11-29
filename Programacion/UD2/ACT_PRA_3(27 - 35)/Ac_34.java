package PROG;
import java.util.*;

public class Ac_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int var_in;
        int suma_pr = 0;
        int suma_im = 0;

        boolean lp = true;
        while (lp){
            System.out.print("Introduce un numero: ");
            var_in = sc.nextInt();
            if (var_in <= 0){
                lp = false;
            }
            lista.add(var_in);
        }
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i)%2 == 0){
                suma_pr += lista.get(i);
            }
            else {
                suma_im += lista.get(i);
            }
        }
        System.out.println("La suma de los pares es: " + suma_pr);
        System.out.println("La suma de los impares es: " + suma_im);
    }
}