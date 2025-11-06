package tpprogramacionii.TP8.EjerciciosExcepciones;

import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = convertirAEntero(entrada);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: La cadena '" + entrada + "' no es un número entero válido.");
        } finally {
            scanner.close();
        }
    }
    
    public static int convertirAEntero(String cadena) {
        return Integer.parseInt(cadena);
    }
}
