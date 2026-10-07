public class Personaje {

        private String nombre;
        private int puntosVida;
        private int poderAtaque;

        public Personaje(String nombre, int puntosVida, int poderAtaque) {

            this.nombre = nombre;
            this.puntosVida = puntosVida;
            this.poderAtaque = poderAtaque;

        }

        public String getNombre() {
            return nombre;
        }

        public int getPuntosVida() {
            return puntosVida;
        }

        public int getPoderAtaque() {
            return poderAtaque;
        }

        public boolean estaDerrotado() {
            return puntosVida <= 0;
        }

        public void atacar(Personaje oponente) {

            if (this.estaDerrotado()) {

                System.out.println(nombre + " está derrotado y no puede atacar.");
                return;

            }

            if (oponente.estaDerrotado()) {

                System.out.println(oponente.getNombre() + " ya está derrotado, " + nombre + " no puede atacarlo.");
                return;

            }

            System.out.println(nombre + " ataca a " + oponente.getNombre() + " con " + poderAtaque + " de poder.");
            oponente.recibirDanio(poderAtaque);
        }

        public void recibirDanio(int cantidad) {

            puntosVida = puntosVida - cantidad;

            if (puntosVida < 0) {
                puntosVida = 0;

            }

            System.out.println(nombre + " recibió " + cantidad + " de daño. Vida restante: " + puntosVida);

            if (estaDerrotado()) {
                System.out.println(nombre + " ha sido derrotado.");

            }
        }
}