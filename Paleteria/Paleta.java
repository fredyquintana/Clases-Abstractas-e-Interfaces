package Paleteria;

// Abstract class "Palette" as the base class
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

// Class "PaletaAgua" that inherits from "Paleta"
class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    @Override
    public String getInfoPaleta() {
        String baseInfo = baseAgua ? "water-based" : "no water-based";
        return "Flavor palette: " + getSabor() + ", Price: $" + getPrecio() + ", Base: " + baseInfo;
    }
}

// Class "PaletaCrema" that inherits from "Paleta"
class PaletaCrema extends Paleta {
    public PaletaCrema(String sabor, double precio) {
        super(sabor, precio);
    }

    @Override
    public String getInfoPaleta() {
        return "Flavor palette: " + getSabor() + ", Price: $" + getPrecio() + ", Base: Cream";
    }
}

// Generic class "PaletaGenerica" for different types of paletas
class PaletaGenerica<T extends Paleta> {
    private T paleta;

    public PaletaGenerica(T paleta) {
        this.paleta = paleta;
    }

    public T getPaleta() {
        return paleta;
    }

    public String getInfoPaleta() {
        return paleta.getInfoPaleta();
    }
}



