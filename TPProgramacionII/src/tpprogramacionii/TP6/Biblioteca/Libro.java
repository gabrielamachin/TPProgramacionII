package tpprogramacionii.TP6.Biblioteca;

public class Libro {
    // Atributos de instancia
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    // Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor; // Composición: el libro tiene un autor
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL LIBRO ===");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Año de publicación: " + this.anioPublicacion);
        System.out.println("Autor: " + this.autor.getNombre());
        System.out.println("-----------------------------");
    }
    
    @Override
    public String toString() {
        return String.format("Libro[ISBN: %s, Título: %s, Año: %d, Autor: %s]", 
                           this.isbn, this.titulo, this.anioPublicacion, this.autor.getNombre());
    }
    
    // Getters
    public String getIsbn() {
        return this.isbn;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    
    public Autor getAutor() {
        return this.autor;
    }
    
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
