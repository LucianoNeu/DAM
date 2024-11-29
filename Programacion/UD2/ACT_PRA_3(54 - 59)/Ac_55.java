package PROG.Prog7;
import java.util.Scanner;

public class Ac_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int var_in;

        System.out.print("Introduce el numero de columnas: ");
        var_in = sc.nextInt();

        matriz = new int[5][var_in];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < var_in; j++) {
                matriz[i][j] = (int)(Math.random()*100 + 1);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < var_in; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}