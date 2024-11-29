package PROG;

public class Ac_32 {
    public static void main(String[] args) {
        int pares = 0;
        int num = 1;
        int suma = 0;
        double producto = 1;

        while (pares <= 100){
            if ((num%2) == 0){
                pares += 1;
                producto = producto * num;
                suma = suma + num;
            }
            num += 1;
        }
        System.out.println("La suma de los primeros 100 pares es: " + suma);
        System.out.println("El producto de los primeros 100 pares es: " + producto);
    }
}