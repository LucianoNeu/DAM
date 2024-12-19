package Ac_05;

public class Puzzle {
    private Integer matriz_juego[][] = new Integer[4][4];
    private Integer x_vacio;
    private Integer y_vacio;

    // Constructor
    public Puzzle(int x, int y) {
        this.x_vacio = x;
        this.y_vacio = y;
        int nums[] = new int[15];
        int poos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == y && j == x) {
                    matriz_juego[i][j] = 0;
                } else {
                    int rand = (int) (Math.random() * 15 + 1);
                    for (int k = 0; k <= poos; k++) {
                        if (rand == nums[k]) {
                            rand = (int) (Math.random() * 15 + 1);
                            k = -1;
                        }
                    }
                    nums[poos] = rand;
                    matriz_juego[i][j] = rand;
                    poos += 1;
                }
            }
        }
    }

    // GETs
    public int getPosicion(int x, int y) {
        return matriz_juego[y][x];
    }

    public int getFilaEspacio() {
        return x_vacio;
    }

    public int getColumnaEspacio() {
        return y_vacio;
    }

    // Methods
    public void mostrar() {
        System.out.println("-----------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                if (matriz_juego[j][i] == 0) {
                    System.out.print("  | ");
                } else if (matriz_juego[j][i] < 10) {
                    System.out.print(matriz_juego[j][i] + " | ");
                } else {
                    System.out.print(matriz_juego[j][i] + "| ");
                }
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    // Movimientos
    public boolean bajar() {
        int num_mov;
        int posx, posy;

        if (getColumnaEspacio() == 3) {
            return false;
        } else {
            num_mov = matriz_juego[getFilaEspacio()][getColumnaEspacio() + 1];
            posx = getFilaEspacio();
            posy = getColumnaEspacio() + 1;
            matriz_juego[getFilaEspacio()][getColumnaEspacio()] = num_mov;
            matriz_juego[posx][posy] = 0;
            x_vacio = posx;
            y_vacio = posy;
            return true;
        }
    }

    public boolean subir() {
        int num_mov;
        int posx, posy;

        if (getColumnaEspacio() == 0) {
            return false;
        } else {
            num_mov = matriz_juego[getFilaEspacio()][getColumnaEspacio() - 1];
            posx = getFilaEspacio();
            posy = getColumnaEspacio() - 1;
            matriz_juego[getFilaEspacio()][getColumnaEspacio()] = num_mov;
            matriz_juego[posx][posy] = 0;
            x_vacio = posx;
            y_vacio = posy;
            return true;
        }
    }

    public boolean moverDerecha() {
        int num_mov;
        int posx, posy;

        if (getFilaEspacio() == 3) {
            return false;
        } else {
            num_mov = matriz_juego[getFilaEspacio() + 1][getColumnaEspacio()];
            posx = getFilaEspacio() + 1;
            posy = getColumnaEspacio();
            matriz_juego[getFilaEspacio()][getColumnaEspacio()] = num_mov;
            matriz_juego[posx][posy] = 0;
            x_vacio = posx;
            y_vacio = posy;
            return true;
        }
    }

    public boolean moverIzquierda() {
        int num_mov;
        int posx, posy;

        if (getFilaEspacio() == 0) {
            return false;
        } else {
            num_mov = matriz_juego[getFilaEspacio() - 1][getColumnaEspacio()];
            posx = getFilaEspacio() - 1;
            posy = getColumnaEspacio();
            matriz_juego[getFilaEspacio()][getColumnaEspacio()] = num_mov;
            matriz_juego[posx][posy] = 0;
            x_vacio = posx;
            y_vacio = posy;
            return true;
        }
    }

    // Resuelto
    public boolean estaResuelto() {
        boolean resultado = false;
        int numero = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz_juego[j][i] == numero) {
                    if (matriz_juego[j][i] == 15) {
                        resultado = true;
                    }
                    numero += 1;
                } else {
                    resultado = false;
                }
            }
        }
        return resultado;
    }
}