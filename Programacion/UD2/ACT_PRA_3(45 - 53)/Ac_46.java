package PROG.Prog5;
import java.util.Scanner;

public class Ac_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] lista = new int[3];
        String var_in;

        boolean lp;
        do{
            lp = false;
            for (int i = 0; i < lista.length; i++){
                System.out.println("Introduce el numero " + (i+1) + ": ");
                lista[i] = sc.nextInt();
            }
            System.out.println("Como quieres ordenarlos?");
            System.out.println("1.De menor a mayor.");
            System.out.println("2.De mayor a menor.");
            System.out.println("Introduce una opcion: ");
            sc.nextLine();
            var_in = sc.nextLine();
            
            int temp = 0;
            int bubble = 1;
            switch (var_in) {
                case "1":
                    while (bubble != 0) {
                        for(int i = 0; i < (lista.length - 1); i++){
                            if (lista[i] > lista[i+1]){
                                temp = lista[i];
                                lista[i] = lista[i+1];
                                lista[i+1] = temp;
                                bubble += 1;
                            }
                            else{
                                bubble = 0;
                            }
                        }
                    }   
                    break;
                case "2":
                    while (bubble != 0) {
                        for(int i = 0; i < (lista.length - 1); i++){
                            if (lista[i] < lista[i+1]){
                                temp = lista[i];
                                lista[i] = lista[i+1];
                                lista[i+1] = temp;
                                bubble += 1;
                            }
                            else{
                                bubble = 0;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Valor no valido.");
                    lp = true;
                    break;
                }

            System.out.print("La lista ordenada es: ");
            for (int i = 0; i < lista.length; i++){
                System.out.print(lista[i] + " ");
            }
            System.out.println("\n");
            System.out.println("Quieres volver a ordenar(Y/N): ");
            var_in = sc.nextLine();
            if (var_in.toLowerCase().equals("y")){
                lp = true;
            }
        }while(lp);
    }
}