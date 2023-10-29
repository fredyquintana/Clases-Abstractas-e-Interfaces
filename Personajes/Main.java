package Personajes;


public class Main {
    public static void main(String[] args) {
        Jugador<String> jugador = new Jugador<>("Aragorn", 10, "Guerrero", "Magic");
        Enemigo enemigo = new Enemigo("Orco", 5, "Orco");

        jugador.atacar();
        jugador.usarHabilidad();

        enemigo.atacar();
        enemigo.gritar();
    }
}