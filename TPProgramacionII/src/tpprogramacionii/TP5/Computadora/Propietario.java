package tpprogramacionii.TP5.Computadora;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Referencia bidireccional
    
    // Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setters
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
    
    public Computadora getComputadora() {
        return computadora;
    }
    
    // Método para establecer la relación bidireccional
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
    // Método para mostrar información del propietario
    public void mostrarInfo() {
        System.out.println("Propietario: " + nombre + " - DNI: " + dni);
        if (computadora != null) {
            System.out.println("  Computadora asignada: " + computadora.getMarca() + 
                             " - Serie: " + computadora.getNumeroSerie());
        } else {
            System.out.println("  Sin computadora asignada");
        }
    }
    
    // Método para usar la computadora
    public void usarComputadora() {
        if (computadora != null) {
            System.out.println("El propietario " + nombre + " está usando la computadora:");
            computadora.mostrarEspecificaciones();
        } else {
            System.out.println("El propietario " + nombre + " no tiene computadora asignada");
        }
    }
    
    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}