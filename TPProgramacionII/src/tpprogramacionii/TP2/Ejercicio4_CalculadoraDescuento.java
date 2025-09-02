package tpprogramacionii.Tp2;

import java.util.Scanner;

public class Ejercicio4_CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        scanner.nextLine();

        // Solicitar la categoría del producto
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();

        double descuento = 0;

        // Aplicar descuento según categoría
        switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.println("La categoría no es válida. No se aplicará descuento.");
                break;
        }

        // Calcular el precio final
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        // Mostrar resultados
        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        } else {
            System.out.println("Descuento aplicado: 0%");
        }

        System.out.println("Precio final: " + precioFinal);
    }
}
