package Clases;

public class Coche extends Vehiculo {
    protected String matricula;
    protected boolean[] revisiones = new boolean[5];

    // Constructor
    public Coche(int numbastidor, String matricula, String marca, String modelo, String color, float precio,
            boolean[] revisiones) {
        super(numbastidor, marca, modelo, color, precio);
        this.matricula = matricula;
        this.revisiones = revisiones;
    }
    
    // METHODs
    public String toString() {
        String revs = "";
        for (int i = 0; i < 5; i++) {
            if (revisiones[i] == true) {
                revs = "Revicion " + i + "True ";
            } else {
                revs = "Revicion " + i + "False ";
            }
        }
        String datos = "" + this.numbastidor + "/" + this.matricula + "/" + this.marca + "/" + this.modelo + "/"
                + this.color + "/" + this.precio + "/" + revs;
        return datos;
    }

    public void revisar(int numRev) {
        if (numRev > 0 && numRev < 6) {
            this.revisiones[numRev] = true;
        } else {
            System.out.println("ERROR: Numero de revicion no valido.");
        }
    }

    public void revisar(boolean[] rev) {
        if (rev.length == this.revisiones.length) {
            for (int i = 0; i < rev.length; i++) {
                this.revisiones[i] = rev[i];
            }
        } else {
            System.out.println("ERROR: Array demaciado largo, maximo 5.");
        }
    }

    // GETs
    public String getMatricula() {
        return this.matricula;
    }

    public boolean[] getRevisiones() {
        return this.revisiones;
    }

    // SETs
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setRevisiones(boolean[] revisiones) {
        this.revisiones = revisiones;
    }

}
