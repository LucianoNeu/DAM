package PROG.Prog4;
import java.util.Scanner;

public class Ac_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var_in, random1, random2, signo;
        int puntos = 0;

        System.out.println("Brain-Traning");
        do {
            signo = (int)Math.floor(Math.random()*4+1);
            random1 = (int)Math.floor(Math.random()*10+1);
            random2 = (int)Math.floor(Math.random()*10+1);

            if ( signo == 1) {
                System.out.println("Dime el resultado de: " + random1 + "+" +random2);
                System.out.print("Dime el resultado: ");
                var_in = sc.nextInt();
                if (var_in == (random1+random2)){
                    puntos += 1;
                    System.out.println("Respuesta correcta." + "\n");
                }
                else{
                    System.out.println("Respuesta incorrecta." + "\n");
                }
            }
            else if (signo == 2) {
                System.out.println("Dime el resultado de: " + random1 + "-" +random2);
                System.out.print("Dime el resultado: ");
                var_in = sc.nextInt();
                if (var_in == (random1-random2)){
                    puntos += 1;
                    System.out.println("Respuesta correcta." + "\n");
                }
                else{
                    System.out.println("Respuesta incorrecta." + "\n");
                }
            }
            else if (signo == 3) {
                System.out.println("Dime el resultado de: " + random1 + "x" +random2);
                System.out.print("Dime el resultado: ");
                var_in = sc.nextInt();
                if (var_in == (random1*random2)){
                    puntos += 1;
                    System.out.println("Respuesta correcta." + "\n");
                }
                else{
                    System.out.println("Respuesta incorrecta." + "\n");
                }
            }
            else if (signo == 4) {
                System.out.println("Dime el resultado de: " + random1 + "/" +random2);
                System.out.print("Dime el resultado: ");
                var_in = sc.nextInt();
                if (var_in == (random1/random2)){
                    puntos += 1;
                    System.out.println("Respuesta correcta." + "\n");
                }
                else{
                    System.out.println("Respuesta incorrecta." + "\n");
                }
            }
            System.out.println("Tu puntaje es: " + puntos + "\n");
        } while (puntos <= 20);
    }
}