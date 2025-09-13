package tpprogramacionii.TP3;

public class Ejercicio3_EncapsulamientoLibro {
    public static void main(String[] args) {
        // Crear un libro con datos iniciales
        Libro miLibro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        
        // Mostrar información inicial
        miLibro.mostrarInfo();
        
        // Intentar modificar el año con un valor inválido (futuro)
        miLibro.setAñoPublicacion(3000);
        System.out.println("Año actual después del intento: " + miLibro.getAñoPublicacion());
        System.out.println();
        
        // Intentar modificar el año con otro valor inválido (negativo)
        miLibro.setAñoPublicacion(-100);
        System.out.println("Año actual después del intento: " + miLibro.getAñoPublicacion());
        System.out.println();
        
        // Modificar el año con un valor válido
        miLibro.setAñoPublicacion(1984);
        System.out.println("Año actual después de la modificación: " + miLibro.getAñoPublicacion());
        System.out.println();
        
        // Mostrar información final
        System.out.println("Información final del libro:");
        miLibro.mostrarInfo();
    }
}
