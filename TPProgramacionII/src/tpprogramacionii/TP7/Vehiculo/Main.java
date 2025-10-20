package tpprogramacionii.TP7.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Instanciar un auto
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        
        miAuto.mostrarInfo();
        
        System.out.println("\n Demostración de polimorfismo");
        
        Vehiculo vehiculo = new Auto("Honda", "Civic", 2);
        vehiculo.mostrarInfo();
    }
}
