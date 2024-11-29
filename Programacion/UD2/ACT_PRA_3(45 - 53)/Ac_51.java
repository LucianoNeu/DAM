package PROG.Prog5;
import java.util.Scanner;

public class Ac_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_in;
        Integer contrasena;

        boolean con_correcta;
        do {
            con_correcta = false;
            System.out.println("Introduce la nueva contraseña para acceder al sistema.");
            System.out.print("Contraseña: ");
            contrasena = sc.nextInt();

            if (contrasena < 1000 && contrasena > 9999) {
                System.out.println("Contraseña no valida. \n Vuelve a intentar.");
                con_correcta = true;
            }
            else {
                System.out.println("Entrada valida.");
            }
        } while (con_correcta);
        
        boolean lp;
        do {
            lp = false;
            System.out.println("1-Acceder. \n2-Salir.");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextLine();
            switch (var_in) {
                case "1":    
                    System.out.print("introduce la contraseña:");
                    var_in = sc.nextLine();
                    if (var_in.equals(contrasena.toString())){
                        boolean lp2;
                        do {
                            lp2 = false;
                            System.out.println("Estas en el sistema");
                            System.out.println("1-Cambiar contraseña. \n2-Salir.");
                            System.out.print("Introduce una opcion: ");
                            var_in = sc.nextLine();
                    
                            switch (var_in) {
                                case "1":
                                    System.out.print("Introduce la nueva contraseña: ");
                                    contrasena = sc.nextInt();

                                    if (contrasena < 1000 && contrasena > 9999) {
                                        System.out.println("Contraseña no valida. \n Vuelve a intentar.");
                                        lp2 = true;
                                    }
                                    else {
                                        System.out.println("Entrada valida.");
                                        lp2 = true;
                                        sc.nextLine();
                                    }

                                    break;
                                case "2":
                                    System.out.println("Saliendo . . .");
                                    lp = true;
                                    lp2 = false;
                                    break;
                                default:
                                    System.out.println("Valor no valido.");
                                    lp2 = true;
                                    break;
                            }
                        } while (lp2);
                    }
                    else {
                        System.out.println("Contraseña no valida.");
                        lp = true;
                    }
                    break;
                case "2":
                    System.exit(2);
                    break;
                default:
                    System.out.println("Valor no valido.");
                    lp = true;
                    break;
            }
        } while (lp);
    }
}