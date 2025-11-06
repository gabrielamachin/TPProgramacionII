package tpprogramacionii.TP8.EjerciciosExcepciones;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE MANEJO DE EXCEPCIONES ===");
        
        // 1. División segura
        System.out.println("\n--- División Segura ---");
        realizarDivision(scanner);
        
        // 2. Conversión de cadena a número
        System.out.println("\n--- Conversión de Cadena a Número ---");
        realizarConversion(scanner);
        
        // 3. Validación de edad
        System.out.println("\n--- Validación de Edad ---");
        validarEdades();
        
        // 4. Lectura de archivo con try-with-resources
        System.out.println("\n--- Lectura de Archivo ---");
        leerArchivoSeguro("ejemplo.txt");
        
        scanner.close();
    }
    
    public static void realizarDivision(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingrese el divisor: ");
            double divisor = scanner.nextDouble();
            
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado de la división: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error de entrada: " + e.getMessage());
            scanner.nextLine(); // Limpiar buffer
        }
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    public static void realizarConversion(Scanner scanner) {
        scanner.nextLine();
        
        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido exitosamente: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: '" + entrada + "' no es un número entero válido");
        }
    }
    
    public static void validarEdades() {
        int[] edades = {25, -5, 130, 45, -10};
        
        for (int edad : edades) {
            try {
                validarEdad(edad);
                System.out.println("Edad " + edad + ": VÁLIDA");
            } catch (EdadInvalidaException e) {
                System.err.println("Edad " + edad + ": " + e.getMessage());
            }
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("Edad no puede ser negativa");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("Edad no puede ser mayor a 120");
        }
    }
    
    public static void leerArchivoSeguro(String nombreArchivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Leyendo archivo '" + nombreArchivo + "':");
            String linea;
            int numeroLinea = 1;
            
            while ((linea = lector.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}