package tpprogramacionii.TP5.Computadora;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;   // Composición - unidireccional
    private Propietario propietario; // Asociación - bidireccional
    
    // Constructor con composición (la placa madre se crea con la computadora)
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // Composición
    }
    
    // Getters y setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    
    // No hay setter para placaMadre (composición fuerte)
    // La placa madre no puede cambiarse una vez creada
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    // Método para establecer la relación bidireccional con Propietario
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    // Método para mostrar especificaciones completas
    public void mostrarEspecificaciones() {
        System.out.println("=== ESPECIFICACIONES DE COMPUTADORA ===");
        System.out.println("Marca: " + marca);
        System.out.println("Número de Serie: " + numeroSerie);
        
        if (placaMadre != null) {
            System.out.println("Placa Madre: " + placaMadre.getModelo() + 
                             " - Chipset: " + placaMadre.getChipset());
        }
        
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre() + 
                             " (DNI: " + propietario.getDni() + ")");
        } else {
            System.out.println("Propietario: No asignado");
        }
        System.out.println("=====================================");
    }
    
    // Método para encender la computadora
    public void encender() {
        System.out.println("Encendiendo computadora " + marca + "..." );
        if (placaMadre != null) {
            placaMadre.inicializar();
        }
        System.out.println("Computadora lista para usar");
    }
    
    // Método para apagar la computadora
    public void apagar() {
        System.out.println("Apagando computadora " + marca + "...");
        System.out.println("Computadora apagada correctamente");
    }
    
    @Override
    public String toString() {
        String propietarioInfo = (propietario != null) ? propietario.toString() : "null";
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + 
               "', placaMadre=" + placaMadre + ", propietario=" + propietarioInfo + "}";
    }
}