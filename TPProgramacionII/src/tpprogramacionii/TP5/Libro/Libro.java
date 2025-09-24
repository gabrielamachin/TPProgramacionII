package tpprogramacionii.TP5.Libro;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;         // Asociación unidireccional
    private Editorial editorial; // Agregación
    
    // Constructor básico
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    // Constructor completo
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    // Setter para autor (Asociación unidireccional)
    public void setAutor(Autor autor) {
        this.autor = autor;
        // No hay referencia inversa (unidireccional)
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    // Setter para editorial (agregación)
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
        // La editorial existe independientemente
    }
    
    // Mostrar información completa del libro
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
        } else {
            System.out.println("Autor: No asignado");
        }
        
        if (editorial != null) {
            System.out.println("Editorial: " + editorial.getNombre() + " - " + editorial.getDireccion());
        } else {
            System.out.println("Editorial: No asignada");
        }
        System.out.println("=============================");
    }
    
    @Override
    public String toString() {
        String autorInfo = (autor != null) ? autor.toString() : "null";
        String editorialInfo = (editorial != null) ? editorial.toString() : "null";
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + 
               "', autor=" + autorInfo + ", editorial=" + editorialInfo + "}";
    }
}
