package tpprogramacionii.TP3;

public class Libro {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }
    
    // Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // Setter con validación para añoPublicacion
    public void setAñoPublicacion(int añoPublicacion) {
        int añoActual = java.time.Year.now().getValue();
        
        if (añoPublicacion <= añoActual && añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Error: El año de publicación (" + añoPublicacion + 
                             ") no es válido. Debe estar entre 1 y " + añoActual);
        }
    }
    
    // Mostrar información del libro
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("=============================");
    }
}
