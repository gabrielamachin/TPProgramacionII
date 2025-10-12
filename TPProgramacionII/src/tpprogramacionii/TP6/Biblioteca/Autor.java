package tpprogramacionii.TP6.Biblioteca;

public class Autor {
    // Atributos de instancia
    private String id;
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL AUTOR ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nacionalidad: " + this.nacionalidad);
        System.out.println("-----------------------------");
    }
    
    // Sobrescribir toString() para mejor representación
    @Override
    public String toString() {
        return String.format("Autor[ID: %s, Nombre: %s, Nacionalidad: %s]", 
                           this.id, this.nombre, this.nacionalidad);
    }
    
    // Getters
    public String getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}