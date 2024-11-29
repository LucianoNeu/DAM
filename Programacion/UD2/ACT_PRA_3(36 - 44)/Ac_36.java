package PROG.Prog4;
import java.util.Scanner;

public class Ac_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_in;
        double r;

        boolean lp = false;
        do{
            lp = false;
            System.out.println("1-Calcular area de una circunferencia");
            System.out.println("2-Calcular volumen de una circunferencia");
            System.out.print("Introduce el valor: ");
            var_in = sc.nextLine();
            switch (var_in) {
                case "1":
                    System.out.print("Introduce un radio: ");
                    r = sc.nextDouble();
                    sc.skip("\n");
                    System.out.println("El area es: " + (Math.PI * Math.pow(r, 2)));
                    System.out.print("Deseas volver al menu (Y/N): ");
                    var_in = sc.nextLine();
                    if (var_in.toLowerCase().equals("y")){
                        lp = true;
                    }
                    break;
                case "2":
                    System.out.print("Introduce un radio: ");
                    r = sc.nextDouble();
                    sc.skip("\n");
                    System.out.println("El volumen es: " + ((4 * Math.PI * Math.pow(r, 3))/3));
                    System.out.print("Deseas volver al menu (Y/N): ");
                    var_in = sc.nextLine();
                    if (var_in.toLowerCase().equals("y")){
                        lp = true;
                    }
                    break;
                default:
                    System.out.println("Valor no valido");
                    break;
            }
        }while (lp);
    }
}