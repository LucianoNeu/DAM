package PROG;
import java.util.Scanner;

public class Ac_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Hacer tabla de: ");
        x = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(x + "x" + i + " = " + (x*i));
        }
    }
}
