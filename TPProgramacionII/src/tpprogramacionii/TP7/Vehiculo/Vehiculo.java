package tpprogramacionii.TP7.Vehiculo;

public class Vehiculo {
    // Atributos protegidos para que las subclases puedan acceder
    protected String marca;
    protected String modelo;
    
    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método mostrarInfo() que será sobrescrito
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    // Getters y setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
