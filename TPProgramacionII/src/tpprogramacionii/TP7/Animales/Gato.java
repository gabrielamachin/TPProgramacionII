package tpprogramacionii.TP7.Animales;

public class Gato extends Animal {
    private boolean esDeInterior;
    
    // Constructor
    public Gato(String nombre, int edad, boolean esDeInterior) {
        super(nombre, "Gato", edad);
        this.esDeInterior = esDeInterior;
    }
    
    // Sobrescribe el método hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
    
    // Sobrescribe describirAnimal()
    @Override
    public void describirAnimal() {
        String tipoVivienda = esDeInterior ? "interior" : "exterior";
        System.out.println(nombre + " es un gato de " + tipoVivienda + " y tiene " + edad + " años");
    }
    
    // Método específico de Gato
    public void ronronear() {
        System.out.println(nombre + " está ronroneando: Prrr");
    }
    
    public boolean isEsDeInterior() {
        return esDeInterior;
    }
    
    public void setEsDeInterior(boolean esDeInterior) {
        this.esDeInterior = esDeInterior;
    }
}
