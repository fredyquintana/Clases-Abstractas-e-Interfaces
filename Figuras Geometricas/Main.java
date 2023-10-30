import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        // Sort the figures by area
        Collections.sort(manejador.getFiguras(), (figura1, figura2) -> {
            double area1 = figura1.calcularArea();
            double area2 = figura2.calcularArea();
            return Double.compare(area1, area2);
        });

        System.out.println("Figuras ordenadas por área:");
        manejador.mostrarFiguras();

        // Get the shape type of an array of shapes using an iterator
        ArrayList<String> tiposDeFiguras = new ArrayList<>();
        Iterator<FiguraGeometrica> iterator = manejador.getFiguras().iterator();
        while (iterator.hasNext()) {
            FiguraGeometrica figura = iterator.next();
            tiposDeFiguras.add(figura.getNombre());
        }

        System.out.println("Types of figures in the arrangement:");
        for (String tipo : tiposDeFiguras) {
            System.out.println(tipo);
        }
    }
}

