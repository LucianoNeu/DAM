package PROG;
import java.util.Scanner;

public class Ac_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] pos_x = new double[2];
        double [] pos_y = new double[2];

        for (int i = 0; i < 2; i++){
            System.out.print("Introduce X" + (i+1) + ": ");
            pos_x[i] = sc.nextDouble();
            System.out.print("Introduce Y" + (i+1) + ": ");
            pos_y[i] = sc.nextDouble();
        }

        double rs_x = (pos_x[1] - pos_x[0]);
        double rs_y = (pos_y[1] - pos_y[0]);

        double formula = (Math.sqrt((Math.pow(rs_x, 2))+(Math.pow(rs_y, 2))));
        System.out.println("La distancia euclidea es: " + formula);
    }
}