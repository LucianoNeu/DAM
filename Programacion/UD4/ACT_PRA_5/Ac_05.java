import Ac_05.Puzzle;
import java.util.Scanner;

public class Ac_05 {
    public static void main(String[] args) {
        Puzzle juego = new Puzzle(1, 1);

        Scanner sc = new Scanner(System.in);
        String var_in;
        int puntos = 0;
        boolean lp = true;
        boolean lp1 = true;

        do {
            System.out.println("1-Jugar\n2-Ver Puntos\n3-Salir.");
            System.out.print("Introduce una opcion: ");

            var_in = sc.nextLine();

            switch (var_in) {
                case "1":
                    System.out.println("Empezando juego.");
                    System.out.println("---------------------");
                    
                    do {
                        juego.mostrar();
                        System.out.println("----(x para salir)---");
                        
                        System.out.println("Mueve la casilla con (W A S D): ");
                        var_in = sc.nextLine();

                        if (var_in.toLowerCase().equals("w")){
                            juego.subir();
                        }
                        else if (var_in.toLowerCase().equals("a")){
                            juego.moverIzquierda();
                        }
                        else if (var_in.toLowerCase().equals("s")){
                            juego.bajar();
                        }
                        else if (var_in.toLowerCase().equals("d")){
                            juego.moverDerecha();
                        }
                        else if (var_in.toLowerCase().equals("x")){
                            lp1 = false;
                        }


                        if (juego.estaResuelto()){
                            juego.mostrar();
                            System.out.println("---------------------");
                            System.out.println("HAS GANADO.");
                            puntos += 1;
                            lp1 = false;
                        }

                    } while (lp1);                
                    break;
            
                case "2":
                System.out.println("---------------------");
                System.out.println("TUS PUNTOS SON: " + puntos);
                System.out.println("---------------------");
                    break;

                case "3":
                    System.out.println("Saliendo . . .");
                    lp = false;
                    break;
                default:
                    System.out.println("Valor no valido.");
                    break;
            }
        } while (lp);
    }
}