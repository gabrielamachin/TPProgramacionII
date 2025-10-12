package tpprogramacionii.TP6.Biblioteca;

import java.util.List;

public class MainBiblioteca {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===\n");
        
        // 1. Crear una biblioteca
        System.out.println("1. CREANDO BIBLIOTECA...");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear al menos tres autores
        System.out.println("\n2. CREANDO AUTORES...");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Mario Vargas Llosa", "Peruana");
        Autor autor4 = new Autor("A004", "Julio Cortázar", "Argentina");
        
        // Mostrar información de autores
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        
        // 3. Agregar 5 libros asociados a los autores
        System.out.println("\n3. AGREGANDO LIBROS A LA BIBLIOTECA...");
        biblioteca.agregarLibro("978-8437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-8401337208", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-8408015823", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("978-8466333727", "La ciudad y los perros", 1963, autor3);
        biblioteca.agregarLibro("978-8432216421", "Conversación en la catedral", 1969, autor3);
        biblioteca.agregarLibro("978-8437604947", "Libro duplicado", 2000, autor4); // Este fallará por ISBN duplicado
        
        // 4. Listar todos los libros con su información
        System.out.println("\n4. LISTANDO TODOS LOS LIBROS:");
        biblioteca.listarLibros();
        
        // 5. Buscar un libro por su ISBN
        System.out.println("\n5. BUSCANDO LIBRO POR ISBN '978-8408015823':");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-8408015823");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }
        
        // 6. Filtrar libros por año específico
        System.out.println("\n6. FILTRANDO LIBROS DEL AÑO 1967:");
        List<Libro> libros1967 = biblioteca.filtrarLibrosPorAnio(1967);
        if (libros1967.isEmpty()) {
            System.out.println("No hay libros publicados en 1967.");
        } else {
            for (Libro libro : libros1967) {
                libro.mostrarInfo();
            }
        }
        
        // 7. Eliminar un libro por ISBN
        System.out.println("\n7. ELIMINANDO LIBRO CON ISBN '978-8466333727':");
        biblioteca.eliminarLibro("978-8466333727");
        System.out.println("Libros restantes:");
        biblioteca.listarLibros();
        
        // 8. Mostrar cantidad total de libros
        System.out.println("\n8. CANTIDAD TOTAL DE LIBROS: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Listar todos los autores disponibles
        System.out.println("\n9. AUTORES DISPONIBLES EN LA BIBLIOTECA:");
        biblioteca.mostrarAutoresDisponibles();
        
        // Demostración de la composición
        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Si eliminamos la biblioteca, todos sus libros se pierden.");
        System.out.println("Cada libro pertenece a una biblioteca específica.");
        
        // Demostración de toString()
        System.out.println("\n=== USO DE toString() ===");
        if (!biblioteca.getLibros().isEmpty()) {
            System.out.println(biblioteca.getLibros().get(0).toString());
        }
    }
}
