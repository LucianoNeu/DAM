package PROG;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Ac_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] angulos = new double[3];
        int iguales = 0;

        for (int i = 0; i < 3; i++){
            System.out.print("Dime cual es el angulo " + (i + 1) + " : ");
            angulos[i] = sc.nextDouble();
        }

        for (int i = 0; i < 2; i++){
            if (angulos[i] == angulos[i+1]){
                iguales += 1;
            }
            if (i == 1 && angulos[0] == angulos[i+1]){
                iguales += 1;
            }
        }

        if (iguales == 0) {
            System.out.println("Es un triangulo escaleno");
        }
        else if (iguales == 1) {
            System.out.println("Es un triangulo Isoseles.");
        }
        else if (iguales == 3) {
            System.out.println("Es un triangulo eqilatero.");
        }
    }
}