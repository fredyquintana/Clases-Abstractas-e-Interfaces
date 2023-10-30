import java.util.ArrayList;

// Definition of the abstract class FiguraGeometrica
abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Abstract method to calculate the area of the figure
    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }
}

// Definition of the interface for two-dimensional figures
interface FiguraBidimensional {
    double calcularPerimetro();
}

// Derived class to represent a circle
class Circulo extends FiguraGeometrica implements FiguraBidimensional {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Derived class to represent a rectangle
class Rectangulo extends FiguraGeometrica implements FiguraBidimensional {
    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }
}

// Derived class to represent a triangle
class Triangulo extends FiguraGeometrica implements FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // In a generic triangle, it is not possible to calculate the perimeter with just the base and height.
        return -1;
    }
}

// Generic class to manage and display geometric figures
class ManejadorFiguras<T extends FiguraGeometrica> {
    private ArrayList<T> figuras = new ArrayList<>();

    public void agregarFigura(T figura) {
        figuras.add(figura);
    }

    public void mostrarFiguras() {
        for (T figura : figuras) {
            System.out.println("Type: " + figura.getNombre());
            System.out.println("Area: " + figura.calcularArea());
            if (figura instanceof FiguraBidimensional) {
                FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
                System.out.println("Perimeter: " + figuraBidimensional.calcularPerimetro());
            }
            System.out.println();
        }
    }

    public ArrayList<T> getFiguras() {
        return figuras;
    }
}

