package tpprogramacionii.TP7.FigurasGeometricas;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Implementación del método abstracto calcularArea()
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // Getters y setters específicos
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
