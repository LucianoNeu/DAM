package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_16 {
    public static int[] Valor_rd(int [] lista){
        for (int i = 0; i < lista.length; i++){
            lista[i] = (int)Math.floor(Math.random()*50+1);
        }
        return lista;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el tamaño del array: ");
        int [] numeros = new int[sc.nextInt()];

        numeros = Valor_rd(numeros);

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}