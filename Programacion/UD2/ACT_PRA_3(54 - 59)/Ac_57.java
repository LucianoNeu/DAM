package PROG.Prog7;
import java.util.Scanner;

public class Ac_57 {

    public static void dibujar_matriz (int [][] matriz_d) {
        for (int i = 0; i < matriz_d.length; i++) {
            for (int j = 0; j < matriz_d.length; j++) {
                System.out.print(matriz_d[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        int var_in;
        int sum1, resultado = 0;

        boolean lp = true;
        do {
            System.out.println("1-.Rellenar matriz.\n2-.Sumar una fila.\n3-.Suma una columna.\n4-.Suma diagonal.");
            System.out.println("5-.Suma diagonal invertida.\6-.Media de todos los valores.\n7-.Salir");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextInt();

            switch (var_in) {
                    case 1:
                        for (int i = 0; i <= 4; i++){
                            for (int j = 0; j <= 4; j++){
                                System.out.print("Introduce el numero de la matriz[" + i + ", " + j + "] : ");
                                matriz[i][j] = sc.nextInt();
                            }
                        }
                        dibujar_matriz(matriz);
                        System.out.println("Matriz completada.");
                        break;

                    case 2:
                        resultado = 0;
                        dibujar_matriz(matriz);
                        do {
                            System.out.print("Introduce el numero de la fila a sumar: ");
                            sum1 = sc.nextInt();
                        } while (sum1 < 0 || sum1 > 4);
                        
                        for (int i = 0; i < 4; i++){
                            resultado += matriz[sum1][i];
                        }
                        System.out.println("El resultado es: " + resultado);
                        break;
                    
                    case 3:
                        resultado = 0;
                        dibujar_matriz(matriz);
                        do {
                            System.out.print("Introduce el numero de la columna a sumar: ");
                            sum1 = sc.nextInt();
                        } while (sum1 < 0 || sum1 > 4);
                    
                        for (int i = 0; i < 4; i++){
                            resultado += matriz[i][sum1];
                        }
                        System.out.println("El resultado es: " + resultado);
                        break;
                    
                    case 4:
                        resultado = 0;
                        for (int i = 0; i < 4; i++){
                            resultado += matriz[i][i];
                        }
                        System.out.println("El resultado es: " + resultado);
                        break;
                    
                    case 5:
                        resultado = 0;
                        for (int i = 3; i >= 0; i--){
                            for (int j = 0; j < 4; j++){
                                resultado = matriz[i][j];
                            }
                        }
                        System.out.println("El resultado es: " + resultado);
                        break;
                    
                    case 6:
                        resultado = 0;
                        int div = 0;
                        for (int i = 0; i < 4; i++){
                            for (int j = 0; j < 4; j++){
                                resultado += matriz[i][j];
                                div += 1;
                            }
                        }    
                        resultado = resultado/div;
                        System.out.println("La media es: " + resultado);
                        break;
                    
                    case 7:
                        System.out.println("Saliendo . . . ");
                        lp = false;
                        break;
                    default:
                        System.out.println("Valor no valido.");
                        break;
                
            }
        } while (lp);
    }
}