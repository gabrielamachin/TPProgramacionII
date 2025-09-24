package tpprogramacionii.TP5.Celular;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Referencia bidireccional
    
    // Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public Celular getCelular() {
        return celular;
    }
    
    // Método para establecer la relación bidireccional
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    // Método para mostrar información del usuario
    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + " - DNI: " + dni);
        if (celular != null) {
            System.out.println("  Celular asignado: " + celular.getMarca() + " " + celular.getModelo());
        } else {
            System.out.println("  Sin celular asignado");
        }
    }
    
    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}