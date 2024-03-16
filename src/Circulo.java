import java.util.Scanner;

public class Circulo {
    public double calcular(int seleccionOperacion, Scanner scanner) {
        double resultado = 0;
        if (seleccionOperacion == 1) { // Área
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            resultado = Math.PI * Math.pow(radio, 2);
        } else if (seleccionOperacion == 2) { // Perímetro
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            resultado = 2 * Math.PI * radio;
        }
        return resultado;
    }
}
