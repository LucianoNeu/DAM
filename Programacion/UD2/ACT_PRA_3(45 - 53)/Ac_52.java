package PROG.Prog5;
import java.util.Scanner;

public class Ac_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_in;
        Float sueldo;
        Float edad, horas, extra, antiguedad; 
        float descuento = 0;

        // cada puesto tiene: nombre = {pago_hora, pago_hora_extra}
        Float [] admin = {5f, 10f};
        Float [] tec = {7f, 14f};
        Float [] prof = {12f, 24f};
        Float [] ope = {3f, 16f};
        

        boolean lp;
        do {
            lp = false;
            System.out.println("Selecciona el empleo:");
            System.out.println("1-Administrativo.\n2-Tecnico.\n3-Profecional.\n4-Operario.\n5-Salir.");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextLine();

            switch (var_in) {
                case "1":
                    System.out.println("Introdce lo siguente.");
                    System.out.print("Edad: ");
                    edad = sc.nextFloat();
                    System.out.print("Horas: ");
                    horas = sc.nextFloat();
                    System.out.print("Horas Extra: ");
                    extra = sc.nextFloat();
                    System.out.print("Antiguedada (años): ");
                    antiguedad = sc.nextFloat();


                    sueldo = (horas * admin[0]) + (extra * admin[1]);


                    if (antiguedad >= 1 && antiguedad <= 3){
                        descuento = sueldo * 0.05f;
                    }
                    else if (antiguedad >= 4 && antiguedad <= 6){
                        descuento = sueldo * 0.1f;
                    }
                    else if (antiguedad >= 7 && antiguedad <= 10){
                        descuento = sueldo * 0.2f;
                    }
                    else if (antiguedad >= 11 && antiguedad <= 15){
                        descuento = sueldo * 0.5f;
                    }
                    else if (antiguedad >= 16){
                        descuento = sueldo * 1;
                    }
                    if (edad >= 65) {
                        sueldo = sueldo + descuento + (sueldo*0.03f) + (sueldo*0.1f);
                    }
                    else {
                        sueldo = sueldo + descuento + (sueldo*0.03f);
                    }

                    System.out.println("El sueldo es: " + sueldo);

                    break;

                case "2":
                    System.out.println("Introdce lo siguente.");
                    System.out.print("Edad: ");
                    edad = sc.nextFloat();
                    System.out.print("Horas: ");
                    horas = sc.nextFloat();
                    System.out.print("Horas Extra: ");
                    extra = sc.nextFloat();
                    System.out.print("Antiguedada (años): ");
                    antiguedad = sc.nextFloat();


                    sueldo = (horas * tec[0]) + (extra * tec[1]);


                    if (antiguedad >= 1 && antiguedad <= 3){
                        descuento = sueldo * 0.05f;
                    }
                    else if (antiguedad >= 4 && antiguedad <= 6){
                        descuento = sueldo * 0.1f;
                    }
                    else if (antiguedad >= 7 && antiguedad <= 10){
                        descuento = sueldo * 0.2f;
                    }
                    else if (antiguedad >= 11 && antiguedad <= 15){
                        descuento = sueldo * 0.5f;
                    }
                    else if (antiguedad >= 16){
                        descuento = sueldo * 1;
                    }
                    if (edad >= 65) {
                        sueldo = sueldo + descuento + (sueldo*0.03f) + (sueldo*0.1f);
                    }
                    else {
                        sueldo = sueldo + descuento + (sueldo*0.03f);
                    }

                    System.out.println("El sueldo es: " + sueldo);

                    break;

                case "3":
                    System.out.println("Introdce lo siguente.");
                    System.out.print("Edad: ");
                    edad = sc.nextFloat();
                    System.out.print("Horas: ");
                    horas = sc.nextFloat();
                    System.out.print("Horas Extra: ");
                    extra = sc.nextFloat();
                    System.out.print("Antiguedada (años): ");
                    antiguedad = sc.nextFloat();


                    sueldo = (horas * prof[0]) + (extra * prof[1]);


                    if (antiguedad >= 1 && antiguedad <= 3){
                        descuento = sueldo * 0.05f;
                    }
                    else if (antiguedad >= 4 && antiguedad <= 6){
                        descuento = sueldo * 0.1f;
                    }
                    else if (antiguedad >= 7 && antiguedad <= 10){
                        descuento = sueldo * 0.2f;
                    }
                    else if (antiguedad >= 11 && antiguedad <= 15){
                        descuento = sueldo * 0.5f;
                    }
                    else if (antiguedad >= 16){
                        descuento = sueldo * 1;
                    }
                    if (edad >= 65) {
                        sueldo = sueldo + descuento + (sueldo*0.03f) + (sueldo*0.1f);
                    }
                    else {
                        sueldo = sueldo + descuento + (sueldo*0.03f);
                    }
                    
                    System.out.println("El sueldo es: " + sueldo);

                    break;

                case "4":
                    System.out.println("Introdce lo siguente.");
                    System.out.print("Edad: ");
                    edad = sc.nextFloat();
                    System.out.print("Horas: ");
                    horas = sc.nextFloat();
                    System.out.print("Horas Extra: ");
                    extra = sc.nextFloat();
                    System.out.print("Antiguedada (años): ");
                    antiguedad = sc.nextFloat();


                    sueldo = (horas * ope[0]) + (extra * ope[1]);


                    if (antiguedad >= 1 && antiguedad <= 3){
                        descuento = sueldo * 0.05f;
                    }
                    else if (antiguedad >= 4 && antiguedad <= 6){
                        descuento = sueldo * 0.1f;
                    }
                    else if (antiguedad >= 7 && antiguedad <= 10){
                        descuento = sueldo * 0.2f;
                    }
                    else if (antiguedad >= 11 && antiguedad <= 15){
                        descuento = sueldo * 0.5f;
                    }
                    else if (antiguedad >= 16){
                        descuento = sueldo * 1;
                    }
                    if (edad >= 65) {
                        sueldo = sueldo + descuento + (sueldo*0.03f) + (sueldo*0.1f);
                    }
                    else {
                        sueldo = sueldo + descuento + (sueldo*0.03f);
                    }

                    System.out.println("El sueldo es: " + sueldo);

                    break;

                case "5":
                System.out.println("Saliedo . . .");
                    lp = false;
                    break;
                default:
                    System.out.println("valor no valido.");
                    lp = true;
                    break;
            }
        } while(lp);
    }
}
