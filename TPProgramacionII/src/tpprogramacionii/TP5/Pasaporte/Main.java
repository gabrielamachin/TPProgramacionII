package tpprogramacionii.TP5.Pasaporte;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PASAPORTES ===\n");
        
        // Crear un titular
        Titular titular = new Titular("Juan Pérez", "12345678A");
        System.out.println("Titular creado: " + titular);
        
        // Crear un pasaporte (que automáticamente crea la foto por composición)
        Pasaporte pasaporte = new Pasaporte("AB123456", "2024-01-15", "foto_juan.jpg", "JPEG");
        System.out.println("Pasaporte creado: " + pasaporte);
        
        // Establecer la relación bidireccional
        titular.setPasaporte(pasaporte);
        System.out.println("Relación bidireccional establecida");
        
        // Mostrar información completa
        System.out.println("\n=== INFORMACIÓN COMPLETA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Pasaporte asociado: " + titular.getPasaporte().getNumero());
        System.out.println("Foto del pasaporte: " + pasaporte.getFoto());
        
        // Verificar la relación bidireccional
        System.out.println("\n=== VERIFICACIÓN RELACIÓN BIDIRECCIONAL ===");
        System.out.println("¿Titular conoce su pasaporte? " + (titular.getPasaporte() != null ? "SÍ" : "NO"));
        System.out.println("¿Pasaporte conoce a su titular? " + (pasaporte.getTitular() != null ? "SÍ" : "NO"));
        System.out.println("¿Es el mismo titular? " + (titular.getPasaporte().getTitular() == titular ? "SÍ" : "NO"));
        
        // Demostrar la composición
        System.out.println("\n=== DEMOSTRACIÓN COMPOSICIÓN ===");
        System.out.println("La foto existe solo dentro del pasaporte:");
        System.out.println("Formato de foto: " + pasaporte.getFoto().getFormato());
        System.out.println("Imagen: " + pasaporte.getFoto().getImagen());
        
        System.out.println("\n=== EJECUCIÓN COMPLETADA ===");
    }
}
