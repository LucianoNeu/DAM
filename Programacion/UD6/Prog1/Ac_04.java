import java.util.Scanner;
import Ac_04.Conecta4;

public class Ac_04 {
    public static void main(String[] args) {
        Conecta4 juego = new Conecta4();

        int suelo[] = { 6, 6, 6, 6, 6, 6 };

        Scanner sc = new Scanner(System.in);
        int var_in;

        boolean lp = true;
        while (lp) {
            System.out.println("1-Iniciar juego.\n2-Limpiar tablero.\n3-Salir.");
            var_in = sc.nextInt();

            switch (var_in) {
                case 1:
                    boolean jugando = true;
                    while (jugando) {
                        System.out.println("Jugador 1 (Introduce la posicion 1-6): ");
                        var_in = sc.nextInt();
                        juego.setX((var_in - 1), suelo[(var_in - 1)]);
                        suelo[(var_in - 1)] -= 1;

                        juego.printTablero();

                        System.out.println("Jugador 2 (11 para salir)(Introduce la posicion 1-6): ");
                        var_in = sc.nextInt();
                        if (var_in != 11) {
                            juego.setO((var_in - 1), suelo[(var_in - 1)]);
                            suelo[(var_in - 1)] -= 1;
                        }
                        else{
                            jugando = false;
                        }
                        juego.printTablero();

                    }

                    juego.printTablero();
                    break;
                case 2:
                    juego.limpiarTablero();
                    for (int i = 0; i < 6; i++){
                        suelo[i] = 6;
                    }
                    System.out.println("Tablero limpio.");
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    lp = false;
                    break;
                default:
                    System.out.println("Valor no valido.");
                    break;
            }
        }
    }
}
