package tpprogramacionii.TP3;

public class Mascota {
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Información de la mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    // Simular el paso del tiempo
    public void cumplirAnios(int años) {
        if (años > 0) {
            edad += años;
            System.out.println("¡" + nombre + " cumplió " + años + " años más! Ahora tiene " + edad + " años.");
        } else {
            System.out.println("Error: La cantidad de años debe ser positiva.");
        }
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }
}
