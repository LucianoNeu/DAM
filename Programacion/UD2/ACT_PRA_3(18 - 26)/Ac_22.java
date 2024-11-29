package PROG;
import java.util.Scanner;

public class Ac_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] notas = new double[4];
        double media;

        for (int i = 0; i < 4; i++){
            System.out.print("Introduce la nota N" + (i+1) + " : ");
            notas[i] = sc.nextDouble();
        }

        media = ((notas[0] + notas[1] + notas[2] + notas[3])/4);

        if (media >= 4.5){
            System.out.println("Tu medias es: " + media + " Y estas Aprovado");
        }
        else if (media < 4.5){
            System.out.println("Tu medias es: " + media + " Y no estas Aprovado");
        }
    }
}