package PROG;
import java.util.Scanner;

public class Ac_26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String var_entrada;

        System.out.print("Introduce un caracter: ");
        var_entrada = sc.nextLine();
        
        if (var_entrada.toLowerCase().equals("r")){
            System.out.println("ROJO");
        }

        else if (var_entrada.toLowerCase().equals("v")){
            System.out.println("VERDE");
        }

        else if (var_entrada.toLowerCase().equals("a")){
            System.out.println("AZUL");
        }

        else if (var_entrada.toLowerCase().equals("n")){
            System.out.println("NEGRO");
        }
    }
}
