public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circle", 7.0);
        Rectangulo rectangulo = new Rectangulo("Rectangle", 8.0, 6.0);
        Triangulo triangulo = new Triangulo("Triangle", 2.0, 4.0);

        // Calculate and display areas
        System.out.println(circulo.getNombre() + ": Area = " + circulo.calcularArea());
        System.out.println(rectangulo.getNombre() + ": Area = " + rectangulo.calcularArea());
        System.out.println(triangulo.getNombre() + ": Area = " + triangulo.calcularArea());

        // Calculate and display perimeters (only for two-dimensional figures)
        if (circulo instanceof FiguraBidimensional) {
            FiguraBidimensional figuraBidimensional = (FiguraBidimensional) circulo;
            System.out.println(circulo.getNombre() + ": Perimeter = " + figuraBidimensional.calcularPerimetro());
        }

        if (rectangulo instanceof FiguraBidimensional) {
            FiguraBidimensional figuraBidimensional = (FiguraBidimensional) rectangulo;
            System.out.println(rectangulo.getNombre() + ": Perimeter = " + figuraBidimensional.calcularPerimetro());
        }
    }
}

