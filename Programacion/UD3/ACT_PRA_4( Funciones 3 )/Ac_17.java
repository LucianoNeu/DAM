package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_17 {
    public static Integer num_primos(int numero){
        
        int primo = 0;
        for (int i = 1; i <= numero; i++){
            if (numero%i == 0){
                primo += 1;
            }
        }
        if (primo == 2){
            int num = numero;
            return num;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var_in, numeros = 0;
        int [] lista_primos = new int[100];

        do {
            System.out.print("Introduce un numero: ");
            var_in = sc.nextInt();
            lista_primos[numeros] = num_primos(var_in);
            numeros += 1;
        } while (var_in != 0);

        System.out.println("Estos son los numeros primos:");
        for (int i = 0; i <= numeros; i++){
            if (lista_primos[i] != 0){
                System.out.println("Numero: " + lista_primos[i]);
            }
        }
    }
}