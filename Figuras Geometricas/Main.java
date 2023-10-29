
public class Main {
    public static void main(String[] args) {
        ManejadorFiguras<FiguraGeometrica> manejador = new ManejadorFiguras<>();

        Circulo circulo = new Circulo("Circle", 7.0);
        Rectangulo rectangulo = new Rectangulo("Rectangle", 8.0, 6.0);
        Triangulo triangulo = new Triangulo("Triangle", 2.0, 4.0);

        manejador.agregarFigura(circulo);
        manejador.agregarFigura(rectangulo);
        manejador.agregarFigura(triangulo);

        manejador.mostrarFiguras();
    }
}

