package PROG.Prog4;
import java.util.Scanner;

public class Ac_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] billetes = new int[7];
        int precio;

        System.out.print("Cantidad a pagar: ");
        precio = sc.nextInt();

        while (!(precio <= 0)){
            if (precio < 5){
                System.out.println("El resto es " + precio);
                break;
            }

            billetes[0] += precio/500;
            precio -= (precio/500)*500;

            billetes[1] += precio/200;
            precio -= (precio/200)*200;

            billetes[2] += precio/100;
            precio -= (precio/100)*100;

            billetes[3] += precio/50;
            precio -= (precio/50)*50;

            billetes[4] += precio/20;
            precio -= (precio/20)*20;

            billetes[5] += precio/10;
            precio -= (precio/10)*10;
            
            billetes[6] += precio/5;
            precio -= (precio/5)*5;
        }

        System.out.println("Pagaras con: ");
        if(billetes[0]!=0){
            System.out.println(billetes[0] + " de 500");
        }
        if(billetes[1]!=0){
            System.out.println(billetes[1] + " de 200");
        }
        if(billetes[2]!=0){
            System.out.println(billetes[2] + " de 100");
        }
        if(billetes[3]!=0){
            System.out.println(billetes[3] + " de 50");
        }
        if(billetes[4]!=0){
            System.out.println(billetes[4] + " de 20");
        }
        if(billetes[5]!=0){
            System.out.println(billetes[5] + " de 10");
        }
        if(billetes[6]!=0){
            System.out.println(billetes[6] + " de 5");
        }
    }
}