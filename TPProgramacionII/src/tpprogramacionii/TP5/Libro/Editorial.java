package tpprogramacionii.TP5.Libro;

public class Editorial {
    private String nombre;
    private String direccion;
    
    // Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Método para mostrar información de la editorial
    public void mostrarInfo() {
        System.out.println("Editorial: " + nombre + " - Dirección: " + direccion);
    }
    
    @Override
    public String toString() {
        return "Editorial{nombre='" + nombre + "', direccion='" + direccion + "'}";
    }
}
