package Prog5.Clases;

public class Jugador {
    private static int id;
    private String nom;
    private boolean vivo;

    // Constructor
    public Jugador(int id) {
        this.nom = "Jugador" + id;
        this.id += 1;
        this.vivo = true;
    }

    public boolean isVivo() {
        return this.vivo;
    }

    public boolean disparar(Revolver r) {
        if (r.disparar()) {
            return false;
        } else {
            return true;
        }
    }

    public static int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public static void setId(int id) {
        Jugador.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}