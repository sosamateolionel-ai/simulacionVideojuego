//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Personaje guerrero = new Personaje("Guerrero", 100, 20);
    Personaje mago = new Personaje("Mago", 80, 30);

    int turno = 1;

    while (!guerrero.estaDerrotado() && !mago.estaDerrotado()) {

        System.out.println("\n--- Turno " + turno + " ---");

        guerrero.atacar(mago);

        if (mago.estaDerrotado()) {

            break; // si el mago cayó en este turno el guerrero no sigue atacando

        }

        mago.atacar(guerrero);

        turno++;

    }

    System.out.println("\n--- Fin de la batalla ---");

    if (guerrero.estaDerrotado()) {

        System.out.println(mago.getNombre() + " gana la batalla.");

    } else {

        System.out.println(guerrero.getNombre() + " gana la batalla.");
    }
}
