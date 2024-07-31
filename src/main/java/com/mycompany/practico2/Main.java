package com.mycompany.practico2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Crea un objeto Scanner para leer la entrada del usuario y se definen dos variables para almacenar los números complejos.
        Scanner scanner = new Scanner(System.in);

        Complejo c1, c2;
//bucle do-while para ejecutar el menú principal repetidamente.
        do {
            System.out.println("\nMenu de numeros complejos:");
            System.out.println("1. Sumar dos numeros complejos");
            System.out.println("2. Multiplicar dos numeros complejos");
            System.out.println("3. Comparar dos numeros complejos (iguales o no)");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("0. Salir");

            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
//switch para ejecutar la acción correspondiente a la opción seleccionada.
            switch (opcion) {
                case 1:
                    c1 = leerComplejo("Primer");
                    c2 = leerComplejo("Segundo");
                    System.out.println("La suma de los numeros complejos es: " + c1.sumar(c2));
                    break;

                case 2:
                    c1 = leerComplejo("Primer");
                    c2 = leerComplejo("Segundo");
                    System.out.println("El producto de los numeros complejos es: " + c1.multiplicar(c2));
                    break;

                case 3:
                    c1 = leerComplejo("Primer");
                    c2 = leerComplejo("Segundo");
                    if (c1.esIgual(c2)) {
                        System.out.println("Los numeros complejos son iguales.");
                    } else {
                        System.out.println("Los numeros complejos no son iguales.");
                    }
                    break;

                case 4:
                    c1 = leerComplejo("Numero");
                    System.out.print("Ingrese un entero: ");
                    int entero = scanner.nextInt();
                    System.out.println("El resultado de la multiplicacion es: " + c1.multiplicarPorEntero(entero));
                    break;

                case 0:
                    System.out.println("Fin ");
                    break;

                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
            }
        } while (true);
    }

    private static Complejo leerComplejo(String descripcion) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la parte real del " + descripcion + " numero: ");
        double real = scanner.nextDouble();
        System.out.print("Ingrese la parte imaginaria del " + descripcion + " numero: ");
        double imaginaria = scanner.nextDouble();
        return new Complejo(real, imaginaria);
    }
}