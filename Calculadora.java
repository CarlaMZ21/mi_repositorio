import java.util.Scanner;

public class Calculadora {

    // Método para sumar dos números
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dos números
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return num1 / num2;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú
            System.out.println("\n--- Calculadora Básica ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
                break;
            }

            // Pedir los números al usuario
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Ejecutar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
