package tpprogramacionii.TP6.Universidad;

public class Curso {
    // Atributos de instancia
    private String codigo;
    private String nombre;
    private Profesor profesor; // Lado 1 de la relación 1 a N
    
    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor
    }
    
    // Método para asignar profesor (sincroniza ambos lados)
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tiene un profesor, eliminarnos de su lista
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar el nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Si el nuevo profesor no es null, agregarnos a su lista
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    // Mostrar información del curso
    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        if (this.profesor != null) {
            System.out.println("Profesor: " + this.profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("-----------------------------");
    }
    
    @Override
    public String toString() {
        String profesorNombre = (this.profesor != null) ? this.profesor.getNombre() : "No asignado";
        return String.format("Curso[Código: %s, Nombre: %s, Profesor: %s]", 
                           this.codigo, this.nombre, profesorNombre);
    }
    
    // Getters
    public String getCodigo() {
        return this.codigo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}