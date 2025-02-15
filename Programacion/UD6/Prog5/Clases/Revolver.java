package Prog5.Clases;

public class Revolver {
    private int pos_act, pos_bala;

    // Constructor
    public Revolver() {
        pos_bala = generarNumeroAleatorio(1, 6);

        pos_act = generarNumeroAleatorio(1, 6);
    }

    // Generar num random
    private int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public boolean disparar() {
        if (pos_act == pos_bala) {
            return true;
        } else {
            siguenteBala();
            return false;
        }
    }

    public void siguenteBala(){
        if (pos_act == 6){
            pos_act = 1;
        } else {
            pos_act ++;
        }
    }

    public String toString() {
        return "Posicion Actual: " + pos_act + "\nPosicion Bala: " + pos_bala;
    }
}