package PROG;
import java.util.Scanner;

public class Ac_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.print("Dime tu Edad: ");
        edad = sc.nextInt();

        if (edad < 5){
            System.out.println("No debes de pagar");
            System.exit(2);
        }
        else if (edad < 15){
            System.out.println("Debes de pagar 2 euros");
            System.exit(2);
        }
        else if (edad > 15){
            System.out.println("Debes de pagar 3 euros");
            System.exit(2);
        }
    }
}
