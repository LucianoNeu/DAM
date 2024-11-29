package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_19 {

    public static boolean pitagoras(int x, int y, int z){
        if ( (Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z,2) ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        System.out.println("Comprobar : x² + y² = z²");

        System.out.print("Introudce X: ");
        x = sc.nextInt();
        System.out.print("Introduce Y: ");
        y = sc.nextInt();
        System.out.print("Introduce Z: ");
        z = sc.nextInt();

        if (pitagoras(x, y, z)) {
            System.out.println("Si se cumple.");
        }
        else {
            System.out.println("No se cumple.");
        }
    }
}