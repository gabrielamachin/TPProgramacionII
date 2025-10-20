package tpprogramacionii.TP7.Animales;

public class Perro extends Animal {
    private String raza;
    
    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, "Perro", edad);
        this.raza = raza;
    }
    
    // Sobrescribe el método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
    
    // Sobrescribe describirAnimal()
    @Override
    public void describirAnimal() {
        System.out.println(nombre + " es un perro de raza " + raza + " y tiene " + edad + " años");
    }
    
    // Método específico de Perro
    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola felizmente");
    }
    
    public String getRaza() {
        return raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
