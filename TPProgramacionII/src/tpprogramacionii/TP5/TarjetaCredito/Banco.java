package tpprogramacionii.TP5.TarjetaCredito;

public class Banco {
    private String nombre;
    private String cuit;
    
    // Constructor
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCuit() {
        return cuit;
    }
    
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    // Método para mostrar información del banco
    public void mostrarInfo() {
        System.out.println("Banco: " + nombre + " - CUIT: " + cuit);
    }
    
    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}
