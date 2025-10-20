package tpprogramacionii.TP7.Vehiculo;

public class Auto extends Vehiculo {
    // Atributo adicional específico de Auto
    private int cantidadPuertas;
    
    // Constructor que llama al constructor de la clase base
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    // Sobrescribe el método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
    
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
