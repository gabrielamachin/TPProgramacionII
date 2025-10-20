package tpprogramacionii.TP7.Animales;

public class Animal {
    // Atributos protegidos
    protected String nombre;
    protected String tipo;
    protected int edad;
    
    // Constructor
    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    
    // Método que será sobrescrito por las subclases
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }
    
    // Método que puede ser usado por todas las subclases
    public void describirAnimal() {
        System.out.println(nombre + " es un " + tipo + " de " + edad + " años");
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}