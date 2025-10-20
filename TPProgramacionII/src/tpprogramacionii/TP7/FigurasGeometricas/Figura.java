package tpprogramacionii.TP7.FigurasGeometricas;

public abstract class Figura {
    // Atributo protegido
    protected String nombre;
    
    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto que las subclases deben implementar
    public abstract double calcularArea();
    
    // Método para mostrar información
    public void mostrarArea() {
        System.out.println(nombre + " - Área: " + calcularArea());
    }
    
    // Getter y setter
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
