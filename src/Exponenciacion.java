import java.util.Scanner;

public class Exponenciacion {
    public double calcular(int seleccionOperacion,Scanner scanner) {
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();

        double resultado = Math.pow(base, exponente);
        return resultado;
    }
}