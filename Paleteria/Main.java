package Paleteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create a list of palettes (Application of the collection concept)
        List<Paleta> paletas = new ArrayList<>();

        // Add palettes to the list
        paletas.add(new PaletaAgua("Strawberry", 15.0, true));
        paletas.add(new PaletaCrema("Chocolate", 20.0));
        paletas.add(new PaletaAgua("Lemon", 12.0, true));

        // Loop through the list of palettes using an iterator
        Iterator<Paleta> iterator = paletas.iterator();
        while (iterator.hasNext()) {
            Paleta paleta = iterator.next();
            System.out.println(paleta.getInfoPaleta());
        }
    }
}
