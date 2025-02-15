package Prog2.Clases_2;

public class Alumno {
    private String nombre;
    private Integer num, edad, curso;

    // CONSTRUCTOR
    public Alumno() {
        this.num = 0;
        this.edad = 0;
        this.curso = 0;
        this.nombre = "";
    }

    public Alumno(int num, int edad, int curso, String nombre) {
        this.num = num;
        this.edad = edad;
        this.curso = curso;
        this.nombre = nombre;
    }

    public Alumno(Alumno alumno_original) {
        this.num = alumno_original.getNum();
        this.edad = alumno_original.getEdad();
        this.curso = alumno_original.getCurso();
        this.nombre = alumno_original.getNombre();
    }

    // GETs
    public int getNum() {
        return this.num;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getCurso() {
        return this.curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    // SETs
    public void setNum(int num) {
        this.num = num;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}