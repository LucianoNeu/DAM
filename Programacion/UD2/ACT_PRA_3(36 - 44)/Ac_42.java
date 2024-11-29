package PROG.Prog4;
import java.util.Scanner;

public class Ac_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num1 = new int[7];
        int [] num2 = new int[7];
        int random, entrada, puntos = 0;
        boolean lp;

        do{

            System.out.println("Introduce tu numero.");
            for (int i = 0; i < 7; i++){
                System.out.print("Numero " + (i + 1) + ": ");
                entrada = sc.nextInt();
                num2[i] = entrada;
            }
            
            lp = false;
            num1[6] = (int)Math.floor(Math.random()*9+1);
            System.out.println(num1[6]);
            for (int i = 0; i<6; i++){
                random = (int)Math.floor(Math.random()*49+1);
                num1[i] = random;
            }
            System.out.println("El numero es: ");
            for (int i = 0; i < 6; i++){
                for(int j = 0; j < 6; j++){
                    random = (int)Math.floor(Math.random()*49+1);
                    if(num1[i] == num1[j] && j != i){
                        num1[i] = random;
                    }
                }
                System.out.print(num1[i] + ", ");
            }
            for (int i = 0; i < 7; i++){
                if(num1[i] == num2[i]){
                    puntos += 1;
                }
            }
            System.out.println("\n");
            if (puntos == 7){
                System.out.println("Tu numero es ganador.");
            }
            else{
                System.out.println("Tu numero no es ganador.");
            }
            System.out.print("Quieres volver a intentar(Y/N): ");
            sc.nextLine();
            String var_in = sc.nextLine();
            if (var_in.toLowerCase().equals("y")){
                lp = true;
            }
        }while(lp);
    }
}