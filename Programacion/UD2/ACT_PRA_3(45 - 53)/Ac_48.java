package PROG.Prog5;
import java.util.Scanner;

public class Ac_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] precio = {200, 180, 120, 80}; 
        int dias;
        String categoria;

        System.out.print("Introduce los dias de estancia del cliente: ");
        dias = sc.nextInt();
        sc.skip("\n");
        System.out.print("Introduce la categoria de habitacion: ");
        categoria = sc.nextLine();

        if (categoria.toLowerCase().equals("a")){
            System.out.println("El precio es: " + (dias * precio[0]));
        }
        else if (categoria.toLowerCase().equals("b")){
            System.out.println("El precio es: " + (dias * precio[1]));
        }
        else if (categoria.toLowerCase().equals("c")){
            System.out.println("El precio es: " + (dias * precio[2]));
        }
        else if (categoria.toLowerCase().equals("d")){
            System.out.println("El precio es: " + (dias * precio[3]));
        }
        else{
            System.out.println("Valor no valido;");
        }
    }
}