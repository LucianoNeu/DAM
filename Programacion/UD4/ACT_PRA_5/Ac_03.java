public class Ac_03 {

    public static class Hora {
        private Integer horas, minuto = 0;

        // Constructor
        Hora(int hora, int minutos) {
            this.horas = hora;
            if (minutos > 60) {
                adelantar(minutos);
            } else {
                this.minuto = minutos;
            }
        }

        // GETs
        Integer getHoras() {
            return horas;
        }

        Integer getMinutos() {
            return minuto;
        }

        // Methods
        void adelantar(int minutos) {
            horas += minutos / 60;
            minutos = minutos % 60;
            minuto += minutos;
        }

        void retrasar(int minutos) {
            horas -= minutos / 60;
            minutos = minutos % 60;
            minuto -= minutos;
        }

        void convertir() {
            int hs = 0;
            int min = minuto;

            if (horas > 24) {
                hs = horas;
                while (hs > 24) {
                    hs -= 24;
                }
            } else {
                hs = horas;
            }

            if (hs < 0) {
                hs = hs * (-1);
            }
            if (hs < 13) {
                System.out.println(hs + ":" + min + " AM");
            } else {
                System.out.println(hs + ":" + min + " PM");
            }
        }
    }

    public static void main(String[] args) {
        Hora horas_x = new Hora(48, 65);
        horas_x.convertir();

        horas_x.adelantar(120);

        horas_x.convertir();

        horas_x.retrasar(240);

        horas_x.convertir();
    }
}
