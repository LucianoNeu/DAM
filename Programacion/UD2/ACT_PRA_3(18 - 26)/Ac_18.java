package PROG;
import java.util.Scanner;

public class Ac_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes, dias;

        System.out.print("Introduce el mes (1-12): ");
        mes = sc.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                System.out.println("Mes no valido");
                return;
        }
        System.out.println("El Mes " + mes + " Tiene " + dias + " Dias.");
    }
}