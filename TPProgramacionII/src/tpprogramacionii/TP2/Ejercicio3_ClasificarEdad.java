package tpprogramacionii.Tp2;

import java.util.Scanner;

public class Ejercicio3_ClasificarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Clasificación por edad
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor.");
        } else {
            System.out.println("Edad no válida.");
        }
    }
}
