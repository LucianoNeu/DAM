package PROG.Prog4;
import java.util.Scanner;

public class Ac_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_in;
        boolean lp = false;
        do {
            lp = false;
            System.out.println("1-Calcular area y perimetro de un circulo");
            System.out.println("2-Calcular area y perimetro de un rectangulo");
            System.out.println("3-Calcular area y perimetro de un cuadrado");
            System.out.println("4-Calcular area y perimetro de un rombo");
            System.out.println("5-Calcular area y perimetro de un triangulo");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextLine();
            switch (var_in) {
                case "1":
                    System.out.print("Introduce el radio: ");
                    double radio = sc.nextDouble();
                    System.out.println("El area es " + Math.PI * Math.pow(radio, 2));
                    System.out.println("Y su perimetro: " + (2 * Math.PI * radio));
                    break;
                case "2":
                    System.out.print("Introduce la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("El area es " + base*altura);
                    System.out.println("Y su perimetro: " + ((base*2) + (altura*2)));
                    break;
                case "3":
                    System.out.print("Introduce el valor de un lado: ");
                    double lado = sc.nextDouble();
                    System.out.println("El area es " + Math.pow(lado, 2));
                    System.out.println("Y su perimetro: " + (lado*4));
                    break;
                case "4":
                    System.out.print("Introduce un lado: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double altura2 = sc.nextDouble();
                    System.out.println("El area es " + lado2*altura2);
                    System.out.println("Y su perimetro: " + ((lado2*2) + (altura2*2)));
                    break;
                case "5":
                    System.out.print("Introduce la base: ");
                    double base2 = sc.nextDouble();
                    System.out.print("Introduce la altura: ");
                    double altura3 = sc.nextDouble();
                    System.out.println("El area es " + (base2*altura3)/2);
                    System.out.println("Y su perimetro: " + (1/2 * base2 * altura3));
                    break;
                default:
                    break;
            }
            System.out.println("Quires volver al menu(Y/N): ");
            sc.nextLine();
            var_in = sc.nextLine();
            if (var_in.toLowerCase().equals("y")){
                lp = true;
            }
        } while (lp);
        
    }
}