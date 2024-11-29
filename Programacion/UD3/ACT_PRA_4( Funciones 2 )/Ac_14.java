package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_14 {
    public static void Triangulo(String a, int y){
        int x = y;
        int letra = 0;
        while (y != 0) {
            for(int i = 0; i <= x; i++){
                System.out.print(" ");
            }
            x -= 1;
            for(int j = 0; j <= letra; j++){
                System.out.print(a);
            }
            letra += 2;
            y -= 1;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra;
        int num_linas;

        System.out.print("Introduce el caracter: ");
        letra = sc.nextLine();
        System.out.print("Introduce el numero de filas: ");
        num_linas = sc.nextInt();

        Triangulo(letra, num_linas);
    }
}