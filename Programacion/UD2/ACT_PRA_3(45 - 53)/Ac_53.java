package PROG.Prog5;
import java.util.Scanner;

public class Ac_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        String var_in;


        boolean lp;
        do {
            lp = true;

            System.out.println("1.-Operaciones básicas.\n2.-Operaciones complejas.\n3.-Salir.");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextLine();

            switch (var_in) {
                case "1":
                    System.out.println("a.-Suma.\nb.-Resta.\nc.-Producto.\nd.-Divicion.");    
                    var_in = sc.nextLine();

                    switch (var_in) {
                        case "a":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();
                            System.out.print("Introduce Y: ");
                            y = sc.nextFloat();

                            System.out.println("Resultado: " + (x+y));
                            break;
                        case "b":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();
                            System.out.print("Introduce Y: ");
                            y = sc.nextFloat();

                            System.out.println("Resultado: " + (x-y));
                            break;
                        case "c":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();
                            System.out.print("Introduce Y: ");
                            y = sc.nextFloat();

                            System.out.println("Resultado: " + (x*y));
                            break;
                        case "d":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();
                            System.out.print("Introduce Y: ");
                            y = sc.nextFloat();

                            System.out.println("Resultado: " + (x/y));
                            break;
                        default:
                            System.out.println("Valor no valido.");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("a.-Potencia.\nb.-Raiz cuadrada.");
                    var_in = sc.nextLine();

                    switch (var_in) {
                        case "a":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();
                            System.out.print("Introduce a cuanto la potencia: ");
                            y = sc.nextFloat();

                            System.out.println("Resultado: " + (Math.pow(x, y)));
                            break;
                    
                        case "b":
                            System.out.print("Introduce X: ");
                            x = sc.nextFloat();

                            System.out.println("Resultado: " + (Math.sqrt(x)));
                        default:
                            System.out.println("Valor no valido.");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Saliendo . . .");
                    lp = false;
                    break;
                default:
                    break;
            }
        } while (lp);
    }
}