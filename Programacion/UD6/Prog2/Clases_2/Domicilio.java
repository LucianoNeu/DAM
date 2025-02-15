package Prog2.Clases_2;

public class Domicilio {
    private String calle, poblacion;
    private Integer numero, piso, puerta, codigo_postal;

    // Constructor
    public Domicilio(Integer codigo_postal, String poblacion, String calle, Integer numero, Integer piso, Integer puerta) {
        this.codigo_postal = codigo_postal;
        this.poblacion = poblacion;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.puerta = puerta;
    }

    // GETs
    public Integer getCodigoPostal() {
        return this.codigo_postal;
    }

    public String getPoblacion() {
        return this.poblacion;
    }

    public String getCalle() {
        return this.calle;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getPiso() {
        return this.piso;
    }

    public Integer getPuerta() {
        return this.puerta;
    }

    // SETs
    public void setCodigoPostal(Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
}