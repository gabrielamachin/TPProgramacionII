package tpprogramacionii.Tp2;

import java.util.Scanner;

public class Ejercicio5_SumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        // Ciclo while hasta que se ingrese 0
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            // Verificar si es par
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }

        } while (numero != 0);

        // Mostrar resultado final
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
