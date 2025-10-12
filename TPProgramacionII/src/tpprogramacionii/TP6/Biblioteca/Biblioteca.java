package tpprogramacionii.TP6.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    // Atributos de instancia
    private String nombre;
    private List<Libro> libros; // Composición 1 a N: Biblioteca contiene Libros
    
    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Inicializamos la colección
        System.out.println("Biblioteca '" + this.nombre + "' creada.");
    }
    
    // Método para agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Verificar si el ISBN ya existe
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("Error: Ya existe un libro con ISBN '" + isbn + "'");
                return;
            }
        }
        
        // Crear y agregar el nuevo libro
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }
    
    // Método sobrecargado para agregar libro ya creado
    public void agregarLibro(Libro libro) {
        // Verificar si el ISBN ya existe
        for (Libro l : this.libros) {
            if (l.getIsbn().equals(libro.getIsbn())) {
                System.out.println("Error: Ya existe un libro con ISBN '" + libro.getIsbn() + "'");
                return;
            }
        }
        
        this.libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }
    
    // Listar todos los libros
    public void listarLibros() {
        if (this.libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca '" + this.nombre + "'.");
            return;
        }
        
        System.out.println("\n=== LIBROS EN BIBLIOTECA: " + this.nombre.toUpperCase() + " ===");
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
        System.out.println("Total: " + this.libros.size() + " libros.");
    }
    
    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // Libro no encontrado
    }
    
    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            this.libros.remove(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' eliminado de la biblioteca.");
            return true;
        }
        System.out.println("Libro con ISBN '" + isbn + "' no encontrado.");
        return false;
    }
    
    // Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    // Filtrar libros por año
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }
    
    // Mostrar autores disponibles (sin duplicados)
    public void mostrarAutoresDisponibles() {
        if (this.libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        
        Set<String> autoresUnicos = new HashSet<>();
        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor().getNombre() + " - " + libro.getAutor().getNacionalidad());
        }
        
        System.out.println("\n=== AUTORES DISPONIBLES EN LA BIBLIOTECA ===");
        for (String autorInfo : autoresUnicos) {
            System.out.println("- " + autorInfo);
        }
    }
    
    // Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public List<Libro> getLibros() {
        return new ArrayList<>(this.libros); // Devolvemos copia para proteger la composición
    }
}
