package Personajes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a collection (ArrayList) of characters that includes players and enemies
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Jugador<>("Aragorn", 10, "Guerrero", "Magic"));
        personajes.add(new Enemigo("Orco", 5, "Orco"));

        // Use an iterator to loop through the collection and perform actions on all characters
        Iterator<Personaje> iterator = personajes.iterator();
        while (iterator.hasNext()) {
            Personaje personaje = iterator.next();
            personaje.atacar();
            if (personaje instanceof Jugador) {
                ((Jugador<?>) personaje).usarHabilidad();
            } else if (personaje instanceof Enemigo) {
                ((Enemigo) personaje).gritar();
            }
        }
    }
}
