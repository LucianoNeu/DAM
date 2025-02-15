package Prog3;

import Prog3.Clases.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ac_01 {
    public static void main(String[] args) {
        Verificar_alu Verificar = new Verificar_alu();
        Scanner sc = new Scanner(System.in);

        // Datos Dinamicos donde se guardaran los alumnos.
        ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>();

        LinkedList<Alumno> listAlumnos = new LinkedList<Alumno>();

        HashMap<String, Alumno> mapAlumno = new HashMap<String, Alumno>();

        // Creacion de los 4 alumnos.
        for (int i = 0; i < 4; i++) {
            String nombre, apellido, dni, telefono, email, fecha_tmp;
            long nia;
            int edad;
            String[] fecha = new String[2];
            LocalDate fecha_nc;

            System.out.println("Creacion de Alumnos.");
            sc.skip("\n");
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            sc.skip("\n");
            System.out.print("Apellido: ");
            apellido = sc.nextLine();

            do {
                sc.skip("\n");
                System.out.print("Email: ");
                email = sc.nextLine();
            } while (!Verificar.ValidaEmail(email));

            do {
                sc.skip("\n");
                System.out.print("Telefono: ");
                telefono = sc.nextLine();
            } while (!Verificar.ValidaTelefono(telefono));

            do {
                sc.skip("\n");
                System.out.print("DNI: ");
                dni = sc.nextLine();
            } while (!Verificar.ValidaDNI(dni));

            sc.skip("\n");
            System.out.print("NIA: ");
            nia = sc.nextLong();
            sc.skip("\n");
            if (!Verificar.ValidaNIA(nia)) {
                nia = 9999;
            }

            do {
                sc.skip("\n");
                System.out.print("Edad: ");
                edad = sc.nextInt();

                sc.skip("\n");
                System.out.print("Fecha de Nacimiento (dd/mm/aa): ");
                fecha_tmp = sc.next();
                fecha = fecha_tmp.split("/");

                fecha_nc = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]),
                        Integer.parseInt(fecha[0]));
            } while (!Verificar.ValidaFecha_nc(fecha_nc, edad));

            // Guardar alumnos en datos dinamicos.
            String alu_cd = "alu-" + Alumno.getNalumno();

            arrayAlumnos.add(new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                    Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));

            mapAlumno.put(alu_cd, new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                    Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));

            listAlumnos.add(new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                    Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));
        }
        System.out.flush();
        System.out.println("Alumnos creados.");

        // Iteradores
        Iterator<Alumno> it_array = arrayAlumnos.iterator();

        Iterator<Alumno> it_list = arrayAlumnos.iterator();

        System.out.println();
        System.out.println("Alumnos en HashMap: ");
        for (int i = 4; i < 4; i++) {
            String cd = "alu-" + i;
            mapAlumno.get(cd).InfoAlu();
        }

        System.out.println();
        System.out.println("Alumnos en Array: ");
        while (it_array.hasNext()) {
            Alumno it_1 = it_array.next();
            it_1.InfoAlu();
        }

        System.out.println();
        System.out.println("Alumnos en LinkedList: ");
        while (it_list.hasNext()) {
            Alumno it_2 = it_list.next();
            it_2.InfoAlu();
        }

        // Busqueda Alumno.
        Integer var_in = 0;
        do {
            System.out.println("Codigo de Alumno: ");
            var_in = sc.nextInt();

            arrayAlumnos.get(var_in).InfoAlu();
        } while (!(var_in < Alumno.getNalumno()));

        // Insercion Alumno.

        String nombre, apellido, dni, telefono, email, fecha_tmp;
        long nia;
        int edad;
        String[] fecha = new String[2];
        LocalDate fecha_nc;

        System.out.println("Creacion de Alumnos.");
        sc.skip("\n");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        sc.skip("\n");
        System.out.print("Apellido: ");
        apellido = sc.nextLine();

        do {
            sc.skip("\n");
            System.out.print("Email: ");
            email = sc.nextLine();
        } while (!Verificar.ValidaEmail(email));

        do {
            sc.skip("\n");
            System.out.print("Telefono: ");
            telefono = sc.nextLine();
        } while (!Verificar.ValidaTelefono(telefono));

        do {
            sc.skip("\n");
            System.out.print("DNI: ");
            dni = sc.nextLine();
        } while (!Verificar.ValidaDNI(dni));

        sc.skip("\n");
        System.out.print("NIA: ");
        nia = sc.nextLong();
        sc.skip("\n");
        if (!Verificar.ValidaNIA(nia)) {
            nia = 9999;
        }

        do {
            sc.skip("\n");
            System.out.print("Edad: ");
            edad = sc.nextInt();

            sc.skip("\n");
            System.out.print("Fecha de Nacimiento (dd/mm/aa): ");
            fecha_tmp = sc.next();
            fecha = fecha_tmp.split("/");

            fecha_nc = LocalDate.of(Integer.parseInt(fecha[2]), Integer.parseInt(fecha[1]),
                    Integer.parseInt(fecha[0]));
        } while (!Verificar.ValidaFecha_nc(fecha_nc, edad));

        // Guardar alumnos en datos dinamicos.
        String alu_cd = "alu-" + Alumno.getNalumno();

        arrayAlumnos.add(new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));

        mapAlumno.put(alu_cd, new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));

        listAlumnos.add(new Alumno(nombre, apellido, dni, nia, edad, Integer.parseInt(fecha[0]),
                Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]), telefono, email));

        // Borrar Alumno
        do {
            System.out.println("Codigo de Alumno: ");
            var_in = sc.nextInt();

            arrayAlumnos.remove(var_in);
            listAlumnos.remove(var_in);
            mapAlumno.remove(("alu-" + var_in));
        } while (!(var_in < 4));
    }
}