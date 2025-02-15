package Prog2.Clases_2;

import Prog2.Clases_2.*;

public class Concursante {
    private String nom_art;
    private Nombre nom_con;
    private Fecha fecha_con;
    private Domicilio domicilio_con;

    // Constructor
    public Concursante(String nom_art, String nom_com, String apellido1, String apellido2, int dia, int mes, int anyo,
            int cod_pos, String poblacion, String calle, int num_dic, int piso, int num_pta) {
        this.nom_art = nom_art;
        this.nom_con = new Nombre(nom_com, apellido1, apellido2);
        this.fecha_con = new Fecha(dia, mes, anyo);
        this.domicilio_con = new Domicilio(cod_pos, poblacion, calle, num_dic, piso, num_pta);
    }

    // GETs
    public String getNom_art() {
        return nom_art;
    }

    public Nombre getNom_con() {
        return nom_con;
    }

    public Fecha getFecha_con() {
        return fecha_con;
    }

    public Domicilio getDomicilio_con() {
        return domicilio_con;
    }

    // SETs
    public void setNom_art(String nom_art) {
        this.nom_art = nom_art;
    }

    public void setNom_con(Nombre nom_con) {
        this.nom_con = nom_con;
    }

    public void setFecha_con(Fecha fecha_con) {
        this.fecha_con = fecha_con;
    }

    public void setDomicilio_con(Domicilio domicilio_con) {
        this.domicilio_con = domicilio_con;
    }
}