package tpprogramacionii.TP5.Libro;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA LIBRO - AUTOR - EDITORIAL ===\n");
        
        // Demostración de ASOCIACIÓN UNIDIRECCIONAL y AGREGACIÓN
        System.out.println("1. CREACIÓN DE AUTORES Y EDITORIALES (independientes):");
        
        // Crear autores (existen independientemente)
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel Allende", "Chilena");
        Autor autor3 = new Autor("Mario Vargas Llosa", "Peruana");
        
        // Crear editoriales (existen independientemente, agregación)
        Editorial editorial1 = new Editorial("Alfaguara", "Madrid, España");
        Editorial editorial2 = new Editorial("Planeta", "Barcelona, España");
        Editorial editorial3 = new Editorial("Penguin Random House", "Nueva York, USA");
        
        System.out.println("Autores creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        System.out.println("\n Editoriales creadas:");
        editorial1.mostrarInfo();
        editorial2.mostrarInfo();
        editorial3.mostrarInfo();
        
        // Crear libros con relaciones
        System.out.println("\n2. CREACIÓN DE LIBROS CON RELACIONES:");
        
        Libro libro1 = new Libro("Cien años de soledad", "978-8437604947");
        libro1.setAutor(autor1);        // Asociación unidireccional
        libro1.setEditorial(editorial1); // Agregación
        
        Libro libro2 = new Libro("La casa de los espíritus", "978-8408058254");
        libro2.setAutor(autor2);        // Asociación unidireccional  
        libro2.setEditorial(editorial2); // Agregación
        
        Libro libro3 = new Libro("La ciudad y los perros", "978-8466337027", autor3, editorial3);
        
        System.out.println("Libros creados con relaciones:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        
        // Demostrar ASOCIACIÓN UNIDIRECCIONAL
        System.out.println("3. DEMOSTRACIÓN ASOCIACIÓN UNIDIRECCIONAL (Libro → Autor):");
        System.out.println("Libro1 conoce a su autor: " + (libro1.getAutor() != null ? "SÍ" : "NO"));
        System.out.println("Autor: " + libro1.getAutor().getNombre());
        
        // El autor NO conoce los libros (unidireccional)
        System.out.println("El autor NO tiene referencia a los libros (unidireccional)");
        
        // Demostrar AGREGACIÓN
        System.out.println("\n4. DEMOSTRACIÓN AGREGACIÓN (Libro → Editorial):");
        System.out.println("Libro1 conoce a su editorial: " + (libro1.getEditorial() != null ? "SÍ" : "NO"));
        System.out.println("Editorial: " + libro1.getEditorial().getNombre());
        
        // Flexibilidad de la agregación (cambiar editorial)
        System.out.println("\n5. FLEXIBILIDAD DE AGREGACIÓN (cambiar editorial):");
        System.out.println("Editorial actual de Libro2: " + libro2.getEditorial().getNombre());
        libro2.setEditorial(editorial3);
        System.out.println("Nueva editorial de Libro2: " + libro2.getEditorial().getNombre());
        System.out.println("Editorial original sigue existiendo: " + editorial2.getNombre());
        
        // Múltiples libros con misma editorial (AGREGACIÓN)
        System.out.println("\n6. MÚLTIPLES LIBROS CON MISMA EDITORIAL:");
        Libro libro4 = new Libro("El amor en los tiempos del cólera", "978-0307474728", autor1, editorial1);
        System.out.println("Mismo autor puede tener múltiples libros con misma editorial:");
        libro1.mostrarInformacion();
        libro4.mostrarInformacion();
        
        // Resumen final
        System.out.println("\n7. RESUMEN DEL SISTEMA:");
        System.out.println("Total autores: 3 (existen independientemente)");
        System.out.println("Total editoriales: 3 (existen independientemente)");
        System.out.println("Total libros: 4 (dependen de autores y editoriales)");
        
        System.out.println("\n=== EJECUCIÓN COMPLETADA ===");
    }
}
