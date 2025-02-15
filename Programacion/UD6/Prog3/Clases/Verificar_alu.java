package Prog3.Clases;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificar_alu {

    public boolean ValidaDNI(String dni) {
        Pattern patron = Pattern.compile("^[0-9]{8}[a-zA-Z]{1}");
        Matcher mach = patron.matcher(dni);
        try {
            if (mach.find() == false) {
                System.out.println("ERROR: El DNI no es valido.");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean ValidaNIA(long nia) {
        try {
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean ValidaTelefono(String telefono) {
        Pattern patron = Pattern.compile("^[678]{1}[0-9]{8}");
        Matcher mach = patron.matcher(telefono);

        try {
            if (mach.find() == false) {
                System.out.println("ERROR: El telefono no es valido.");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean ValidaFecha_nc(LocalDate fecha_nc, int edad) {

        try {
            if (LocalDate.now().compareTo(fecha_nc) != edad) {
                System.out.println("ERROR: Edad no valida.");
                return false;
            } else if (fecha_nc == LocalDate.now()) {
                System.out.println("ERROR: Edad no valida.");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean ValidaEmail(String email) {
        Pattern patron = Pattern.compile("^[a-zA-Z0-9-_]*[@]{1}[a-zA-Z]*\\.[a-z]{2,}");
        Matcher mach = patron.matcher(email);

        try {
            if (mach.find() == false) {
                System.out.println("ERROR: Email no valido.");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }
}