package Ac_04;

public class Conecta4 {
    private String matriz_conecta4[][] = new String[7][6];

    // Constructor
    public Conecta4() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                matriz_conecta4[i][j] = " ";
            }
        }
    }

    // SETs
    public void setO(int x, int y) {
        if (estaDisponible(x, y)) {
            matriz_conecta4[y][x] = "O";
        } else {
            System.out.println("Posicion ocupada.");
        }
    }

    public void setX(int x, int y) {
        if (estaDisponible(x, y)) {
            matriz_conecta4[y][x] = "X";
        } else {
            System.out.println("Posicion ocupada.");
        }
    }

    // Methods
    public boolean estaDisponible(int x, int y) {
        if (matriz_conecta4[y][x] != "X" && matriz_conecta4[y][x] != "O") {
            return true;
        } else {
            return false;
        }
    }

    public boolean esO(int x, int y) {
        if (matriz_conecta4[y][x] == "O") {
            return true;
        } else {
            return false;
        }
    }

    public boolean esX(int x, int y) {
        if (matriz_conecta4[y][x] == "X") {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarTablero() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                matriz_conecta4[i][j] = " ";
            }
        }
    }

    public void printTablero() {
        System.out.println("-------------------------");
        for (int i = 0; i < 7; i++) {
            System.out.print("| ");
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz_conecta4[i][j] + " | ");
            }
            System.out.println();
            System.out.print("-------------------------");
            System.out.println();
        }
    }
}