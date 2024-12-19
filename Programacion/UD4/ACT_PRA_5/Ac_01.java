public class Ac_01 {

    public static class Libro {
        private String codigo;
        private String titulo;
        private String autor;
        private Integer numpag;

        Libro(String codigo, String titulo, String autor, Integer numpag) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
            this.numpag = numpag;
        }

        void SetCodigo(String codigo_libro) {
            this.codigo = codigo_libro;
        }

        void SetTitulo(String titulo_libro) {
            this.titulo = titulo_libro;
        }

        void SetAutor(String autor_libro) {
            this.autor = autor_libro;
        }

        void SetNumpag(Integer num_paginas) {
            this.numpag = num_paginas;
        }

        String Mostrar() {
            return codigo + " " + titulo + " " + autor;
        }

        String GetCodigo() {
            return codigo;
        }

        String GetTitulo() {
            return titulo;
        }

        String GetAutor() {
            return autor;
        }

        Integer GetNumpag() {
            return numpag;
        }
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("001", "Quijote", "paco", 123);

        l1.SetAutor("Cervantes");
        System.out.println(l1.Mostrar());

        Libro l2 = new Libro("002", "El principito", "Antoine", 0);

        l2.SetNumpag(456);
        System.out.println(l2.Mostrar());
        String tit = l2.GetTitulo();
        System.out.println(tit);

        Libro l3 = new Libro("003", "El camino de los reyes", "Brandon", 1200);

        System.out.println(l3.Mostrar());
    }
}