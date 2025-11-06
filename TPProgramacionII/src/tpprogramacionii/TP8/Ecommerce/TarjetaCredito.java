package tpprogramacionii.TP8.Ecommerce;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("Titular: " + titular);
        System.out.println("Monto: $" + monto);
        // Lógica de procesamiento de pago
        return true; // Simulamos pago exitoso
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // Aplicar 5% de descuento para tarjeta de crédito
        double descuento = monto * 0.05;
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }
}
