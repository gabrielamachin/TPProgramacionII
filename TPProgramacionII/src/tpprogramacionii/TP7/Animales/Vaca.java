package tpprogramacionii.TP7.Animales;

public class Vaca extends Animal {
    private int litrosLecheDiarios;
    
    // Constructor
    public Vaca(String nombre, int edad, int litrosLecheDiarios) {
        super(nombre, "Vaca", edad);
        this.litrosLecheDiarios = litrosLecheDiarios;
    }
    
    // Sobrescribe el método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuu!");
    }
    
    // Sobrescribe describirAnimal()
    @Override
    public void describirAnimal() {
        System.out.println(nombre + " es una vaca que produce " + litrosLecheDiarios + 
                          " litros de leche diarios y tiene " + edad + " años");
    }
    
    // Método específico de Vaca
    public void producirLeche() {
        System.out.println(nombre + " está produciendo " + litrosLecheDiarios + " litros de leche");
    }
    
    public int getLitrosLecheDiarios() {
        return litrosLecheDiarios;
    }
    
    public void setLitrosLecheDiarios(int litrosLecheDiarios) {
        this.litrosLecheDiarios = litrosLecheDiarios;
    }
}