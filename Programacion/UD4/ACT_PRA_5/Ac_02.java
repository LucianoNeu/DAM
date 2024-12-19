public class Ac_02 {

    public static class Coche {
        private String marca, modelo, anyo;

        // Constructores
        Coche(String marca, String modelo, String anyo) {
            this.marca = marca;
            this.modelo = modelo;
            this.anyo = anyo;
        }

        Coche(String marca, String modelo, Integer anyo) {
            this.marca = marca;
            this.modelo = modelo;
            this.anyo = "" + anyo;
        }

        // Sets
        void setMarca(String marca) {
            this.marca = marca;
        }

        void setModelo(String modelo) {
            this.modelo = modelo;
        }

        void setAnyo(String anyo) {
            this.anyo = anyo;
        }

        void setAnyo(Integer anyo) {
            this.anyo = "" + anyo;
        }

        // Gets
        String getMarca() {
            return marca;
        }

        String getModelo() {
            return modelo;
        }

        String getAnyo() {
            return anyo;
        }

        String mostrar() {
            return marca + " " + modelo + " " + anyo;
        }

        void claxon() {
            System.out.println("Piii Piii");
        }
    }

    public static void main(String[] args) {
        Coche coches[] = new Coche[4];

        coches[0] = new Coche("Honda", "Civic", "2007");
        coches[1] = new Coche("Toyota", "Supra", 1998);
        coches[2] = new Coche("Marca Generica 1", "Modelo 01", "2020");
        coches[3] = new Coche("Marca Generica 2", "Modelo 02", 2023);

        System.out.println(coches[1].mostrar());

        for (int i = 0; i < 4; i++) {
            System.out.println(coches[i].mostrar());
        }
    }
}