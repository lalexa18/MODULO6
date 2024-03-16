import java.util.Scanner;

public class Triangulo {
    public double calcular(int seleccionOperacion, Scanner scanner) {
        double resultado = 0;
        if (seleccionOperacion == 1) { // Área
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
            resultado = (base * altura) / 2;
        } else if (seleccionOperacion == 2) { // Perímetro
            System.out.print("Ingrese el lado del triángulo: ");
            double ladoTriangulo = scanner.nextDouble();
            resultado = 3 * ladoTriangulo;
        }
        return resultado;
    }
}