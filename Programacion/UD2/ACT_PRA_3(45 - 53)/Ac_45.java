package PROG.Prog5;
import java.util.Scanner;

public class Ac_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precio = 2.10f;
        float var_in = 0;
        int [] monedas = new int[4];
    
        System.out.println("Maquina explendedora");
        System.out.println("Precio producto 2,10.");
        System.out.print("Introduce el importe: ");
        var_in = sc.nextFloat();
        var_in = Math.round(var_in*100)/100f;

        while (var_in < precio) {
            System.out.println("cantidad insuficuente.");
            System.out.print("Introduce el importe: ");
            var_in += sc.nextFloat();
            var_in = Math.round(var_in*100)/100f;
        }

        if (var_in == precio){
            System.out.println("Cantidad correcta.");
            System.exit(2);
        }

        float vuelto = var_in-precio;
        vuelto = Math.round(vuelto*100)/100f;
        System.out.println("vuelto: " + vuelto);

        while (vuelto > 0f){
            if (vuelto >= 0.5f){
                monedas[0] = Math.round(vuelto/0.5f);       
                vuelto -= 0.5f*monedas[0];
            }
            else if (vuelto >= 0.2f){
                monedas[1] = Math.round(vuelto/0.2f);       
                vuelto -= 0.2f*monedas[1];
            }
            else if (vuelto >= 0.1f){
                monedas[2] = Math.round(vuelto/0.1f);       
                vuelto -= 0.1f*monedas[2];
            }
            else if (vuelto >= 0.05f) {
                monedas[3] = Math.round(vuelto/0.05f);
                vuelto -= 0.05f*monedas[3];
            }
            vuelto = Math.round(vuelto*100)/100f;
        }

        System.out.println("El vuelto es: ");
        if (monedas[0] > 0) {
            System.out.println(monedas[0] + " monedas de 50 centimos");
        }
        if (monedas[1] > 0) {
            System.out.println(monedas[1] + " monedas de 20 centimos");
        }
        if (monedas[2] > 0) {
            System.out.println(monedas[2] + " monedas de 10 centimos");
        }
        if (monedas[3] > 0) {
            System.out.println(monedas[3] + " monedas de 5 centimos");
        }
    }
}