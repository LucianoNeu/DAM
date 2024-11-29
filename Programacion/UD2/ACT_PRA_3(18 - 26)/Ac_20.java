package PROG;

import java.util.Scanner;

public class Ac_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        String sex;

        System.out.print("Dime tu sexo: ");
        sex = sc.nextLine();
        System.out.print("Dime tu nota: ");
        nota = sc.nextDouble();

        if (sex.toLowerCase().equals("hombre")){
            if (nota < 5){
                System.out.println("Suspenso");
            }
            else if (nota >= 5 && nota < 7 ){
                System.out.println("Aprobado");
            }
            else if (nota >= 7 && nota > 9 ){
                System.out.println("Notable");
            }
            else if (nota >= 9 && nota <= 10 ){
                System.out.println("Soblesaliente");
            }
        }
        else if (sex.toLowerCase().equals("mujer")){
            if (nota < 5){
                System.out.println("Suspensa");
            }
            else if (nota >= 5 && nota < 7 ){
                System.out.println("Aprobada");
            }
            else if (nota >= 7 && nota > 9 ){
                System.out.println("Notable");
            }
            else if (nota >= 9 && nota <= 10 ){
                System.out.println("Soblesaliente");
            }
        }
    }    
}
