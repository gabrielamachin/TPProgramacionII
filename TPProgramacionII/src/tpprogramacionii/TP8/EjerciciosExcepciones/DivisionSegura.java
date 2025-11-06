package tpprogramacionii.TP8.EjerciciosExcepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingresa el dividendo: ");
            double dividendo = scanner.nextDouble();
            
            System.out.print("Ingresa el divisor: ");
            double divisor = scanner.nextDouble();
            
            double resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre cero.");
        } catch (Exception e) {
            System.err.println("Error: Entrada inválida.");
        } finally {
            scanner.close();
        }
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor cero");
        }
        return a / b;
    }
}