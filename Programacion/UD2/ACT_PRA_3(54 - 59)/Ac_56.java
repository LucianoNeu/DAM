package PROG.Prog7;
import java.util.Scanner;

public class Ac_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int [][] matriz2;
        int [][] matriz_resultante;
        int var_in;
        
        System.out.print("Introduce las dimencions de la matriz (nXn): ");
        var_in = sc.nextInt();
        matriz = new int[var_in][var_in];
        matriz2 = new int[var_in][var_in];
        matriz_resultante = new int[var_in][var_in];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Introduce A" + i + "," + j + ": ");
                var_in = sc.nextInt();
                matriz[i][j] = var_in;
                System.out.print("Introduce B" + i + "," + j + ": ");
                var_in = sc.nextInt();
                matriz[i][j] = var_in;

                matriz_resultante[i][j] = matriz[i][j] + matriz[i][j];
            }
        }

        System.out.println("Resultado: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz_resultante[i][j] + "|");
            }
            System.out.println("");
        }
    }
}