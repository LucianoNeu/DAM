package Prog5;

import Prog5.Clases.*;

public class Main {
    public static void crearJugadores(Jugador[] j) {
        for (int i = 0; i < j.length; i++) {
            j[i] = new Jugador(i);
        }
    }

    public static void ronda(Jugador[] j, Revolver r) {

        boolean lp = true;
        while (lp) {
            for (int i = 0; i < j.length; i++) {
                if (j[i].disparar(r) && j[i].isVivo()) {
                    System.out.println("El " + j[i].getNom() + " esta Vivo.");
                } else {
                    System.out.println("El " + j[i].getNom() + " esta Muerto.");
                    lp = false;
                    break;
                }
            }
        }
        System.out.println("Juego terminado.");
    }

    public static void main(String[] args) {
        Jugador[] players = new Jugador[6];

        Revolver rev = new Revolver();

        crearJugadores(players);

        System.out.println(rev);

        ronda(players, rev);
    }
}