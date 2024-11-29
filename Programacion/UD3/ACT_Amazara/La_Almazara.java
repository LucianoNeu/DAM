package Programacion_AC;
import java.util.Scanner;

public class La_Almazara {
    //Print calendario
    public static void print_matriz(int matriz [][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void print_matriz_str(String matriz [][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    //Crear calendario
    public static void crear_calendario(int citas[][], String dias_usados[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                citas[i][j] = 0;
                dias_usados[i][j] = "*";
            }
        }
    }
    // Rellenar dias.
    public static void rellenar_kilos_dia(int kilos, int citas[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                int kilos_extra = (int)(Math.random()* 1000 + 1);
                citas[i][j] = kilos + kilos_extra;
            }
        }
        for (int i = 0; i < 4; i++) {
            citas[i][(int)(Math.random()*7)] = -1;
        }
    }
    //Calidad litros
    public static float LitrosAceite(String calidad, int kilos) {

        if (calidad.equals("suprema")) {
            return ((kilos/100f) * 28f);
        }
        else if (calidad.equals("buena")) {
            return ((kilos/100f) * 22f);
        }
        else if (calidad.equals("regular")) {
            return ((kilos/100f) * 15f);
        }
        else if (calidad.equals("mala")) {
            return ((kilos/100f) * 8f);
        }
        else {
            return -1f;
        }
    }
    //numero a dia de la semana
    public static String dias (int num){
        String dias_semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        return dias_semana[num];
    }
    //comprueba si se puede hacer aceite
    public static boolean SePuedeHacerAceite(int kilos, int citas[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (citas[i][j] != -1) {
                    kilos -= citas[i][j];
                }
            }
        }
        if (kilos == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //lista de agricultores
    public static void listar_agricultor(String nombre, String dias_usados[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (!dias_usados[i][j].equals("*")) {
                    String diaa = dias_usados[i][j];
                    String datos [] = diaa.split("-");
                    if (datos[1].equals(nombre)) {
                        System.out.println("El dia: " + datos[0] + " " + nombre + " procesa " + datos[2] + " Kilos de olivas.");
                    }
                }
            }
        }
    }
    //devuelve los dias que se utilizaran para hacer el aceite
    public static int dias_para_hacer_aceite(String nombre, int numkilos, int citas[][], String dias_semana[][]) {
        int dias = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j< 7 ; j++) {
                if (dias_semana[i][j].equals("*") && citas[i][j] != -1) {
                    //Realizara los calculos
                    int kilos_por_dia = citas[i][j];
                    if (numkilos > kilos_por_dia) {
                        numkilos -= kilos_por_dia;
                        citas[i][j] = 0;
                        String dia_str = dias(j);
                        dias_semana [i][j] = dia_str + "-" + nombre + "-" + kilos_por_dia;
                        dias += 1;
                    }
                    else if ( numkilos < kilos_por_dia) {
                        numkilos = 0;
                    }
                }
            }
        }
        return dias;
    }

    //Main
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int var_in;
        String var_str;

        //Creacion de citas y dias.
        int citas[][] = new int[4][7];
        String dias_usados[][] = new String[4][7];
        crear_calendario(citas, dias_usados);

        //Interfas
        boolean lp = false;
        do {
            System.out.println("*************************************");
            System.out.println("1. Inicializar el mes en la amazara. (1)\n2. Nuevo agricultor. (2)");
            System.out.println("3. Listar por agricultor. (3)\n4. Salir (4)");
            System.out.print("Introduce una opcion: ");
            var_in = sc.nextInt();
            System.out.println("*************************************");

            switch (var_in) {
                case 1:
                    System.out.println("Introduce el valor a sumar a los posibles 1000 kilos que la amazara puede procesar");
                    var_in = sc.nextInt();
                    rellenar_kilos_dia(var_in, citas);
                    System.out.println("*************************************");
                    print_matriz(citas);
                    System.out.println("*************************************");
                    lp = true;
                    break;
                case 2:
                    System.out.println("Introduce tu nombre: ");
                    sc.nextLine();
                    var_str = sc.nextLine();
                    String nombre = var_str;
                    System.out.println("Introduce los kilos que quieres llevar a la amazara");
                    var_in = sc.nextInt();
                    System.out.println("introduce la calidad: (suprema/buena/regular/mala)");
                    sc.nextLine();
                    var_str = (sc.nextLine()).toLowerCase();
                    System.out.println("Para la calidad " + var_str + " los litros de aceite que corresponden son: " + LitrosAceite(var_str, var_in));
                    System.out.println("Los dias para realizar aceite son los siguientes: ");
                    System.out.println(dias_para_hacer_aceite(nombre, var_in, citas, dias_usados));
                    print_matriz_str(dias_usados);
                    lp = true;
                    break;
                case 3:
                    System.out.println("Introduce el nombre del agricultor para listar");
                    sc.nextLine();
                    var_str = sc.nextLine();
                    listar_agricultor(var_str, dias_usados);
                    lp = true;
                    break;
                case 4:
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