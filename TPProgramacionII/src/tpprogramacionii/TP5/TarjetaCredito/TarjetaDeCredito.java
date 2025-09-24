package tpprogramacionii.TP5.TarjetaCredito;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;     // Asociación bidireccional
    private Banco banco;         // Agregación
    
    // Constructor básico
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Constructor completo
    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
    }
    
    // Getters y Setters
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    // Método para establecer la relación bidireccional con Cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    public Banco getBanco() {
        return banco;
    }
    
    // Setter para banco (agregación)
    public void setBanco(Banco banco) {
        this.banco = banco;
        // El banco existe independientemente (agregación)
    }
    
    // Método para mostrar información completa de la tarjeta
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE TARJETA ===");
        System.out.println("Número: " + numero);
        System.out.println("Fecha Vencimiento: " + fechaVencimiento);
        
        if (cliente != null) {
            System.out.println("Titular: " + cliente.getNombre() + " (DNI: " + cliente.getDni() + ")");
        } else {
            System.out.println("Titular: No asignado");
        }
        
        if (banco != null) {
            System.out.println("Banco Emisor: " + banco.getNombre() + " - CUIT: " + banco.getCuit());
        } else {
            System.out.println("Banco Emisor: No asignado");
        }
        
        // Validar si la tarjeta está vencida
        if (fechaVencimiento != null && fechaVencimiento.compareTo("2024-12") < 0) {
            System.out.println("Estado: VIGENTE");
        } else {
            System.out.println("Estado: VENCIDA");
        }
        System.out.println("==============================");
    }
    
    // Método para realizar un pago
    public void realizarPago(double monto, String descripcion) {
        System.out.println("💳 Realizando pago con tarjeta " + numero.substring(12));
        System.out.println("Monto: $" + monto);
        System.out.println("Descripción: " + descripcion);
        if (banco != null) {
            System.out.println("Procesado por: " + banco.getNombre());
        }
        System.out.println("✅ Pago realizado exitosamente");
    }
    
    @Override
    public String toString() {
        String clienteInfo = (cliente != null) ? cliente.toString() : "null";
        String bancoInfo = (banco != null) ? banco.toString() : "null";
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + fechaVencimiento + 
               "', cliente=" + clienteInfo + ", banco=" + bancoInfo + "}";
    }
}
