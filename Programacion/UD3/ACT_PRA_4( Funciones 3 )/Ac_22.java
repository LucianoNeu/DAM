package PROG.Prog6_fun;
import java.util.Scanner;

public class Ac_22 {
    public static Integer menu(){
        Scanner sc = new Scanner(System.in);
        int entrada;
        System.out.println("1.Calcular Circunferencia.\n2.Calcular Area.\n3.Calcular Volumen\n4.Todas.\n5.Salir");
        System.out.print("Introduce una opcion: ");
        entrada = sc.nextInt();

        if (entrada > 0 && entrada < 6){
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

    public static double vol(double r){
        return ((Math.PI*(4f/3f)) * Math.pow(r, 3));
    }
    public static void main(String[] args) {
        int x = 0;
        double radio;
        boolean lp;

        x = menu();

        if (x == 5) {
            lp = false;
        }
        else {
            lp = true;
        }
        
        while (lp) {
            radio = pideRadio();

            if (x == 1) {
                System.out.println("La circunferencia es: " + circunferencia(radio));
            }
            else if (x == 2) {
                System.out.println("El area es: " + area(radio));
            }
            else if (x == 3) {
                System.out.println("El volumen es: "+ vol(radio));
            }
            else if (x == 4) {
                System.out.println("La circunferencia es: " + circunferencia(radio));
                System.out.println("El area es: " + area(radio));
                System.out.println("El volumen es: "+ vol(radio));
            }
        }
    }
}