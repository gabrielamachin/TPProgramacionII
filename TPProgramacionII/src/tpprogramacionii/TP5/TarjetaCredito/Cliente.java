package tpprogramacionii.TP5.TarjetaCredito;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Referencia bidireccional
    
    // Constructor
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    // Método para establecer la relación bidireccional
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
    
    // Método para mostrar información del cliente
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " - DNI: " + dni);
        if (tarjeta != null) {
            System.out.println("  Tarjeta asociada: " + tarjeta.getNumero() + 
                             " - Vence: " + tarjeta.getFechaVencimiento());
            if (tarjeta.getBanco() != null) {
                System.out.println("  Banco emisor: " + tarjeta.getBanco().getNombre());
            }
        } else {
            System.out.println("  Sin tarjeta asociada");
        }
    }
    
    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
