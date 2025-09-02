package tpprogramacionii.Tp2;

import java.util.Scanner;

public class Ejercicio7_ValidacionNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        // Validación con do-while
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }
}
