package PROG.Prog7;
import java.util.Scanner;

public class Ac_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero_usr = 0;
        int var_in;
        String var_st;

        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        double[][] precio = {
        {1.1, 0.8, 1.5, 0.9},
        {1.8, 1, 1.2, 1},
        {1.8, 1.3, 1.2, 0.8},
        {1.5, 1.1, 1.1, 1.1}
        };
        int[][] cantidad = {
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5},
        {5, 5, 5, 5}
        };

        boolean lp;
        do {
            System.out.println("1-Meter dinero.\n2-Pedir golosina.\n3-Mostrar golosinas.\n4-Rellenar golosinas.\n5-Apagar.");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextInt();

            lp = true;
            switch (var_in) {
                case 1:
                    System.out.println("Dinero actual: " + dinero_usr);
                    System.out.print("Introduce la cantidad: ");
                    dinero_usr += sc.nextInt();
                    break;
            
                case 2:
                    System.out.print("Introduce la posicion: ");
                    sc.nextLine();
                    var_st = sc.nextLine();
                    int x = Integer.parseInt(var_st.substring(0, 1));
                    int y = Integer.parseInt(var_st.substring(1));

                    if (cantidad[x][y] > 0) {
                        if (precio[x][y] <= dinero_usr) {
                            System.out.println("Soltando golosina.");
                            dinero_usr -= precio[x][y];
                        }
                        else {
                            System.out.println("Dinero insuficiente.");
                        }
                    }
                    else {
                        System.out.println("No hay producto.");
                    }

                    break;                

                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(nombresGolosinas[i][j] + " | ");
                            System.out.print(precio[i][j] + " $ | ");
                            System.out.print(cantidad[i][j] + " || ");
                        }
                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.print("Introduce la posicion: ");
                    sc.nextLine();
                    var_st = sc.nextLine();
                    x = Integer.parseInt(var_st.substring(0, 1));
                    y = Integer.parseInt(var_st.substring(1));    

                    var_in = sc.nextInt();
                    
                    cantidad[x][y] += var_in;
                    System.out.println("La cantidad actual es: " + cantidad[x][y]);

                    break;

                case 5:
                    System.out.println("Saliendo . . .");
                    lp = false;
                    break;

                default:
                    System.out.println("Valor no valido.");
                    lp = true;
                    break;
            }
        } while (lp);
    }
}