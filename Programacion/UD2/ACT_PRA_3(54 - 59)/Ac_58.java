package PROG.Prog7;

public class Ac_58 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        boolean lp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    lp = false;
                    matriz[i][j] = (int)(Math.random()*100 + 1);
                    
                    for (int x = 0; x < i; x++) {
                        for (int y = 0; y < j; y++) {
                            if (matriz[i][j] == matriz[x][y]) {
                                lp = true;
                            }
                        }
                    } 
                }while (lp);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println();
        }
    }
}