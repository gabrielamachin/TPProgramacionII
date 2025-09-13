package tpprogramacionii.TP3;

public class NaveEspacial {
    // Atributos
    private String nombre;
    private double combustible; // en unidades
    private final double COMBUSTIBLE_MAXIMO = 100.0; // límite máximo
    private final double CONSUMO_POR_KM = 0.5; // consumo por kilómetro
    
    // Constructor
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, COMBUSTIBLE_MAXIMO);
    }
    
    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave " + nombre + " ha despegado exitosamente! (-10 unidades de combustible)");
        } else {
            System.out.println("La nave " + nombre + " no puede despegar. Combustible insuficiente (" + combustible + " unidades). Se necesitan 10 unidades.");
        }
    }
    
    // Método para avanzar una distancia
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * CONSUMO_POR_KM;
        
        if (combustibleNecesario <= combustible) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " km. (-" + combustibleNecesario + " unidades de combustible)");
        } else {
            double distanciaPosible = combustible / CONSUMO_POR_KM;
            System.out.println("La nave " + nombre + " no puede avanzar " + distancia + " km.");
            System.out.println("Combustible insuficiente. Solo puede avanzar " + String.format("%.1f", distanciaPosible) + " km con " + combustible + " unidades.");
        }
    }
    
    // Método para recargar combustible
    public void recargarCombustible(double cantidad) {
        if (cantidad > 0) {
            double espacioDisponible = COMBUSTIBLE_MAXIMO - combustible;
            
            if (cantidad <= espacioDisponible) {
                combustible += cantidad;
                System.out.println("La nave " + nombre + " recargó " + cantidad + " unidades de combustible.");
            } else {
                combustible = COMBUSTIBLE_MAXIMO;
                System.out.println("La nave " + nombre + " recargó " + espacioDisponible + " unidades (límite máximo alcanzado).");
                System.out.println("Se desperdiciaron " + (cantidad - espacioDisponible) + " unidades.");
            }
        } else {
            System.out.println("Error: La cantidad de combustible debe ser positiva.");
        }
    }
    
    // Método para mostrar el estado de la nave
    public void mostrarEstado() {
        System.out.println("Información de la nave espacial");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + String.format("%.1f", combustible) + " / " + COMBUSTIBLE_MAXIMO + " unidades");
        System.out.println("Estado: " + (combustible > 0 ? "Operativa" : "Sin combustible"));
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    public double getCombustibleMaximo() {
        return COMBUSTIBLE_MAXIMO;
    }
}