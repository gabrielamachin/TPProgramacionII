package tpprogramacionii.TP7.Empleado;

public abstract class Empleado {
    // Atributos protegidos
    protected String nombre;
    protected String id;
    protected double sueldoBase;
    
    // Constructor
    public Empleado(String nombre, String id, double sueldoBase) {
        this.nombre = nombre;
        this.id = id;
        this.sueldoBase = sueldoBase;
    }
    
    // Método abstracto que las subclases deben implementar
    public abstract double calcularSueldo();
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + 
                          " | Sueldo: $" + calcularSueldo());
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
