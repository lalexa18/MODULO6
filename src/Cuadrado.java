import java.util.Scanner;

public class Cuadrado {
    public double calcular(int seleccionOperacion, Scanner scanner) {
        double resultado = 0;
        if (seleccionOperacion == 1) { // Área
            System.out.print("Ingrese el lado del cuadrado: ");
            double ladoCuadrado = scanner.nextDouble();
            resultado = Math.pow(ladoCuadrado, 2);
        } else if (seleccionOperacion == 2) { // Perímetro
            System.out.print("Ingrese el lado del cuadrado: ");
            double ladoCuadrado = scanner.nextDouble();
            resultado = 4 * ladoCuadrado;
        }
        return resultado;
    }
}
