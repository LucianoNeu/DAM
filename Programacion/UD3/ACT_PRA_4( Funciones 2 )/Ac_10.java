package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_10 {
    public static boolean VerificacionFecha(int d, int m, int a){
        if (d < 30 && m < 12 && a > 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año, dia, mes;

        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        año = sc.nextInt();

        System.out.println("La fecha es: " + VerificacionFecha(dia, mes, año));
    }
}
