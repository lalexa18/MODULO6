import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resultados = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"CÍRCULO", "CUADRADO", "TRIÁNGULO", "RECTÁNGULO", "PENTÁGONO"};

            System.out.println("\n   LISTA DE OPCIONES \n");
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }
            int seleccionFigura;
            while (true) {
                System.out.print("\nSeleccione el número de la figura: ");
                seleccionFigura = scanner.nextInt();

                if (seleccionFigura > 5 || seleccionFigura < 1) {
                    System.out.println("¡Error! Por favor, seleccione un número válido de la lista.");
                } else {
                    break;
                }
            }
            String[] selecciona = {"Área", "Perímetro"};

            System.out.println("\n   LISTA DE OPCIONES ");
            for (int i = 0; i < selecciona.length; i++) {
                System.out.println((i + 1) + ". " + selecciona[i]);
            }
            int seleccionOperacion;
            while (true) {
                System.out.print("\nSeleccione un número: ");
                try {
                    seleccionOperacion = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("¡Error! Por favor, ingrese un número válido.");
                    scanner.nextLine();
                    continue;
                }
                if (seleccionOperacion > 2 || seleccionOperacion < 1) {
                    System.out.println("¡Error! El número ingresado no se encuentra en la lista.");
                } else {
                    break;
                }
            }
            double resultado = 0;
            switch (seleccionFigura) {
                case 1: // Círculo
                    Circulo circulo = new Circulo();
                    resultado = circulo.calcular(seleccionOperacion, scanner);
                    break;

                case 2: // Cuadrado
                    Cuadrado cuadrado = new Cuadrado();
                    resultado = cuadrado.calcular(seleccionOperacion, scanner);
                    break;

                case 3: // Triángulo
                    Triangulo triangulo = new Triangulo();
                    resultado = triangulo.calcular(seleccionOperacion, scanner);
                    break;

                case 4: // Rectángulo
                    Rectangulo rectangulo = new Rectangulo();
                    resultado = rectangulo.calcular(seleccionOperacion, scanner);
                    break;

                case 5: // Pentágono
                    Pentagono pentagono = new Pentagono();
                    resultado = pentagono.calcular(seleccionOperacion, scanner);
                    break;

                default:
                    System.out.println("Selección inválida. Por favor, elija una opción válida.");
            }
            resultados.add(resultado);

            System.out.println("\nResultado:");
            System.out.println("El resultado es: " + resultado);

            System.out.print("\n¿Desea ingresar nuevos datos? (si/no): ");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
                System.out.println("¡Adiosito dijo Monchito!");
            }
        }
        System.out.println("\nResultados:");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println((i + 1) + ". " + resultados.get(i));
        }
    }
}