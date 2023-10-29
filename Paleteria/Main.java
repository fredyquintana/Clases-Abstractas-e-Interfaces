package Paleteria;

public class Main {
    public static void main(String[] args) {
        // Create example palettes
        PaletaAgua paletaAgua1 = new PaletaAgua("Strawberry", 15.0, true);
        PaletaCrema paletaCrema1 = new PaletaCrema("Chocolate", 20.0);

        // Create generic paleta instances
        PaletaGenerica<PaletaAgua> paletaAguaGenerica = new PaletaGenerica<>(paletaAgua1);
        PaletaGenerica<PaletaCrema> paletaCremaGenerica = new PaletaGenerica<>(paletaCrema1);

        // Show palette information using generics
        System.out.println(paletaAguaGenerica.getInfoPaleta());
        System.out.println(paletaCremaGenerica.getInfoPaleta());
    }
}