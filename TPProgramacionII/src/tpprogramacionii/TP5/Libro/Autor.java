package tpprogramacionii.TP5.Libro;

public class Autor {
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    // Mostrar información del autor
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " - Nacionalidad: " + nacionalidad);
    }
    
    @Override
    public String toString() {
        return "Autor{nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}";
    }
}
