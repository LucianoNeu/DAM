package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_21 {
    public static Integer menu(){
        Scanner sc = new Scanner(System.in);
        int entrada;
        System.out.println("1.Calcular Circunferencia.\n2.Calcular Area.");
        System.out.print("Introduce una opcion: ");
        entrada = sc.nextInt();

        if (entrada > 0 && entrada < 3){
            return entrada;
        }
        else {
            System.out.println("Valor no valido.");
            return 0;
        }
    }

    public static double pideRadio(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Intoduce el radio: ");
        double radio = sc.nextDouble();

        return radio;
    }

    public static double circunferencia(double r){
        return ((Math.PI * 2) * r);
    }

    public static double area(double r){
        return (Math.PI * (Math.pow(r, 2)));
    }
    public static void main(String[] args) {
        int x = 0;
        double radio;

        x = menu();

        if (x == 1) {
            radio = pideRadio();
            System.out.println("La circunferencia es: " + circunferencia(radio));
        }
        else if (x == 2) {
            radio = pideRadio();
            System.out.println("El area es: " + area(radio));
        }        
    }
}