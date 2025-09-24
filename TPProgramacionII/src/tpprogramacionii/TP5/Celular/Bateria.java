package tpprogramacionii.TP5.Celular;

public class Bateria {
    private String modelo;
    private int capacidad;
    
    // Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters y setters
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    // Método para mostrar información de la batería
    public void mostrarInfo() {
        System.out.println("Batería: " + modelo + " - " + capacidad + "mAh");
    }
    
    @Override
    public String toString() {
        return "Bateria{modelo='" + modelo + "', capacidad=" + capacidad + "mAh}";
    }
}