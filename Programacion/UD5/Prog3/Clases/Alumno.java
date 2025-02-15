package Prog3.Clases;

import Prog3.Clases.Verificar_alu;
import java.time.LocalDate;

public class Alumno {
    private String nombre, apellido, dni, telefono, email;
    private long nia;
    private int edad;
    private LocalDate fecha_nc;
    private Verificar_alu VerificarAlu = new Verificar_alu();

    private static int nalumno;

    // CONSTRUCTOR
    public Alumno(String nombre, String apellido, String dni, long nia, int edad, int dia, int mes, int anyo,
            String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.nia = nia;
        this.edad = edad;
        this.fecha_nc = LocalDate.of(anyo, mes, dia);
        nalumno++;
    }

    // GETs
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public long getNia() {
        return nia;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFecha_nc() {
        return fecha_nc;
    }

    public static int getNalumno() {
        return nalumno;
    }

    // SETs
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {

        if (VerificarAlu.ValidaDNI(dni)){
            this.dni = dni;
        } else {
            System.out.println("No se puede cambiar el dni.");
        }
    }

    public void setTelefono(String telefono) {
        
        if (VerificarAlu.ValidaTelefono(telefono)){
            this.telefono = telefono;
        } else {
            System.out.println("No se puede cambiar el Telefono.");
        }
    }

    public void setEmail(String email) {
        
        if (VerificarAlu.ValidaEmail(email)){
            this.email = email;
        } else {
            System.out.println("No se puede cambiar el Email.");
        }
    }

    public void setFecha_nc(LocalDate fecha_nc) {
        
        if (VerificarAlu.ValidaFecha_nc(fecha_nc, this.edad)){
            this.fecha_nc = fecha_nc;
            this.edad = (LocalDate.now().compareTo(fecha_nc));
        } else {
            System.out.println("No se puede cambiar la Fecha de nacimiento.");
        }
    }

    // METHODs
    public void InfoAlu() {
        System.out.println("Alumno:\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad
                + "\nEmail: " + this.email);
        System.out.println();
    }

}