package Paleteria;

public class Main {
    public static void main(String[] args) {
        // Create example palettes
        PaletaAgua paletaAgua1 = new PaletaAgua("Strawberry", 15.0, true);
        PaletaCrema paletaCrema1 = new PaletaCrema("Chocolate", 20.0);
        
        // Show palette information
        System.out.println(paletaAgua1.getInfoPaleta() + ", Base type: " + paletaAgua1.getTipoBase());
        System.out.println(paletaCrema1.getInfoPaleta() + ", Base type: " + paletaCrema1.getTipoBase());
    }
}
