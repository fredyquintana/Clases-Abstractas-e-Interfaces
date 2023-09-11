package Paleteria;
// Abstract class "Palette" as base class
abstract class Paleta {
    private String sabor;
    private double precio;

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    // Abstract method to get information about the palette
    public abstract String getInfoPaleta();
}

// Class "PaletteWater" that inherits from "Palette"
class PaletaAgua extends Paleta implements Base {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    @Override
    public String getInfoPaleta() {
        String baseInfo = baseAgua ? "water based" : "no water based";
        return "Flavor palette: " + getSabor() + ", Price: $" + getPrecio() + ", Base: " + baseInfo;
    }

    @Override
    public String getTipoBase() {
        return "Water";
    }
}

// Class "PaletaCrema" that inherits from "Paleta"
class PaletaCrema extends Paleta implements Base {
    public PaletaCrema(String sabor, double precio) {
        super(sabor, precio);
    }

    @Override
    public String getInfoPaleta() {
        return "flavor palette: " + getSabor() + ", Price: $" + getPrecio() + ", Base: Cream";
    }

    @Override
    public String getTipoBase() {
        return "Cream";
    }
}