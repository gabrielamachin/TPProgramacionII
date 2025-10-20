package tpprogramacionii.TP7.FigurasGeometricas;

public class Circulo extends Figura {
    private double radio;
    
    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    // Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    // Getter y setter especifico
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
}