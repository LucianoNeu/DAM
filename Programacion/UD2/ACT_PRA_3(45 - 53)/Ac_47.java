package PROG.Prog5;
import java.util.Scanner;

public class Ac_47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int horas;
        float salario = 0, salario_neto = 0;

        System.out.println("Calculadora de salario neto.");
        System.out.println("Introduce la cantidad de horas: ");
        horas = sc.nextInt();

        if (horas <= 35){
            salario = horas * 8;
        }
        else if (horas > 35){
            salario = horas * 12;
        }

        if (salario <= 600){
            salario_neto = salario;
        }
        else if (salario >= 600 && salario <= 1000){
            salario_neto = salario - ((salario - 600) * 0.25f);
        }
        else if (salario > 1000){
            salario_neto = salario - (400 * 0.25f) + ((salario - 1000) * 0.45f); 
        }

        System.out.println("El salario Neto es: " + salario_neto);


    }
}