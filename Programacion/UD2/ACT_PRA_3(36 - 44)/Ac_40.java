package PROG.Prog4;
import java.util.Scanner;

public class Ac_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_in;
        
        boolean lp;
        do {
            lp = false;
            System.out.println("1-Juegos de salon.");
            System.out.println("2-Juegos al aire libre.");
            System.out.print("Introduce el valor deseado: ");
            var_in = sc.nextLine();

            switch (var_in) {
                case "1":
                    System.out.println("Cartas, ajedrez, damas, prendas");
                    System.out.print("Quieres volver al menu(Y/N): ");
                    var_in = sc.nextLine();
                    if (var_in.toLowerCase().equals("y")){
                        lp = true;
                    }
                    break;
                case "2":
                    System.out.println("1-Individuales.");
                    System.out.println("2-Colectivos.");
                    System.out.print("Introduce el valore deseado: ");
                    var_in = sc.nextLine();
                    switch (var_in) {
                        case "1":
                            System.out.println("Individuales: atletismo, senderismo, natacion.");
                            break;
                        case "2":
                            System.out.println("Colectivo: gimnasia, ritmica, rugby, polo, futbol.");
                            break;
                        default:
                            break;
                    }
                    System.out.print("Quieres volvr al menu(Y/N): ");
                    var_in = sc.nextLine();
                    if (var_in.toLowerCase().equals("y")){
                        lp = true;
                    }
                    break;
                default:
                    break;
            }
        } while (lp);
    }
}