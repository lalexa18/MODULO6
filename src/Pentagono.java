import java.util.Scanner;

public class Pentagono{
    public double calcular(int seleccionOperacion, Scanner scanner) {
        double resultado = 0;
        if (seleccionOperacion == 1) { // Área
            System.out.print("Ingrese el perímetro del pentágono: ");
            double perimetroPentagono = scanner.nextDouble();
            System.out.print("Ingrese la apotema del pentágono: ");
            double apotemaPentagono = scanner.nextDouble();
            resultado = (perimetroPentagono * apotemaPentagono) / 2;
        } else if (seleccionOperacion == 2) { // Perímetro
            System.out.print("Ingrese el lado del pentágono: ");
            double ladoPentagono = scanner.nextDouble();
            resultado = 5 * ladoPentagono;
        }
        return resultado;
    }
}