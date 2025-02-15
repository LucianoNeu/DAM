package Prog2;

import Prog2.Clases_2.Alumno;
import java.util.Scanner;

public class Ac_02 {

    public static void leerAlumno(Alumno alumno_a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Num alumno: ");
        alumno_a.setNum(sc.nextInt());
        System.out.print("Edad alumno: ");
        alumno_a.setEdad(sc.nextInt());
        System.out.print("Curso alumno: ");
        alumno_a.setCurso(sc.nextInt());
        System.out.print("Nombre alumno: ");
        alumno_a.setNombre(sc.nextLine());
    }

    public static void imprimirAlumno(Alumno alumno_a) {
        System.out.println(alumno_a.getNum());
        System.out.println(alumno_a.getEdad());
        System.out.println(alumno_a.getCurso());
        System.out.println(alumno_a.getNombre());
    }

    public static void copiarAlumno(Alumno alu_og, Alumno alu_cp) {
        alu_cp.setNum(alu_og.getNum());
        alu_cp.setEdad(alu_og.getEdad());
        alu_cp.setCurso(alu_og.getCurso());
        alu_cp.setNombre(alu_og.getNombre());
    }

    public static boolean igualAlumno(Alumno alu_1, Alumno alu_2) {
        int igual = 0;
        if (alu_1.getNum() == alu_2.getNum()) {
            igual += 1;
        }
        if (alu_1.getEdad() == alu_2.getEdad()) {
            igual += 1;
        }
        if (alu_1.getCurso() == alu_2.getCurso()) {
            igual += 1;
        }
        if (alu_1.getNombre() == alu_2.getNombre()) {
            igual += 1;
        }

        if (igual == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Alumno alum_1 = new Alumno();
    }
}