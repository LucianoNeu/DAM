package PROG.Prog4;

public class Ac_41 {
    public static void main(String[] args) {
        int num = 2;
        int suma = 0;
        int suma1 = 0;
        int suma2 = 0;

        int count1 = 0;
        do {
            count1 = num;
            suma2 += count1;
            num += 3;
        }while (count1 < 100);
        System.out.println("El resultado es: " + suma2);
        num = 2;

        int count = 0;
        while (count < 100) {
            count = num;
            suma1 += count;
            num += 3;
        }
        System.out.println("El resultado es: " + suma1);
        num = 2;

        for (int i = 0; i < 100;){
            i = num;
            suma += i;
            num += 3;
        }
        System.out.println("El resultado es: " + suma);
    }
}