package PROG;
import java.util.Scanner;

public class Ac_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double correctas, preguntas;
        double porcentage;

        System.out.print("Numero de preguntas totales: ");
        preguntas = sc.nextInt();
        sc.skip("\n");
        System.out.print("Numero de preguntas correctas: ");
        correctas = sc.nextInt();

        porcentage = ((correctas/preguntas)*100);

        if (porcentage < 50){
            System.out.println("El resultado es malo");
        }
        else if (porcentage >= 50 && porcentage < 70){
            System.out.println("El resultado es regular");
        }
        else if (porcentage >= 70 && porcentage < 90){
            System.out.println("El resultado es Bueno");
        }
        else if (porcentage >= 90){
            System.out.println("El resultado es Muy bueno");
        }
    }    
}
