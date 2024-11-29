package PROG.Prog6_fun;

public class Ac_15 {
    public static int Suma_Array(int [] a){
        int suma = 0;
        for (int i = 0; i< a.length; i++){
            suma += a[i];
        }
        return suma;
    }
    public static double Media_Array(int [] a){
        double media = Suma_Array(a)/a.length;
        return media;
    }
    public static void main(String[] args) {
        int [] num = new int[101];

        for (int i = 1; i <= 100; i++){
            num[i] = i;
        }

    System.out.println("La suma total es: " + Suma_Array(num));
    System.out.println("La media total es: " + Media_Array(num));
    }    
}