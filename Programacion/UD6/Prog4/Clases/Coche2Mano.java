package Clases;

public class Coche2Mano extends Coche {
    private Integer kms;

    public Coche2Mano(int numbastidor, String matricula, String marca, String modelo, String color, float precio,
            boolean [] revisiones, int kms) {

        super(numbastidor, matricula, marca, modelo, color, precio, revisiones);
        this.kms = kms;
    }

    // METHODs
    public String toString() {
        String datos = "" + this.numbastidor + "/" + this.matricula + "/" + this.marca + "/" + this.modelo + "/"
                + this.color + "/" + this.precio + "/" + revisiones + "/" + this.kms;
        return datos;
    }

    // GETs
    public Integer getKms() {
        return kms;
    }

    // SETs
    public void setKms(Integer kms) {
        this.kms = kms;
    }
}