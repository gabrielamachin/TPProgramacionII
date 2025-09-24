package tpprogramacionii.TP5.Computadora;

public class PlacaMadre {
    private String modelo;
    private String chipset;
    
    // Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    // Getters y setters
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    
    // Método para mostrar información de la placa madre
    public void mostrarInfo() {
        System.out.println("Placa Madre: " + modelo + " - Chipset: " + chipset);
    }
    
    // Método para simular funcionamiento
    public void inicializar() {
        System.out.println("Placa madre " + modelo + " inicializando...");
        System.out.println("Chipset " + chipset + " cargado");
        System.out.println("BIOS iniciada correctamente");
    }
    
    @Override
    public String toString() {
        return "PlacaMadre{modelo='" + modelo + "', chipset='" + chipset + "'}";
    }
}