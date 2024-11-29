package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_09 {
    public static int MayorArray(int [] a){
        int cont = 1;
        while (cont != 0) {
            cont = 0;
            for (int i = 0; i < (a.length - 1); i++){
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    cont += 1;
                }
            }
        }
        return a[a.length - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.print("Introduce el N" + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("El mayor es: " + MayorArray(numeros));
    }
}