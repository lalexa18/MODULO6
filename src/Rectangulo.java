import java.util.Scanner;

public class Rectangulo {
    public double calcular(int seleccionOperacion, Scanner scanner) {
        double resultado = 0;
        if (seleccionOperacion == 1) { // Área
            System.out.print("Ingrese la base del rectángulo: ");
            double baseRectangulo = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double alturaRectangulo = scanner.nextDouble();
            resultado = baseRectangulo * alturaRectangulo;
        } else if (seleccionOperacion == 2) { // Perímetro
            System.out.print("Ingrese la base del rectángulo: ");
            double baseRectangulo = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double alturaRectangulo = scanner.nextDouble();
            resultado = 2 * (baseRectangulo + alturaRectangulo);
        }
        return resultado;
    }
}