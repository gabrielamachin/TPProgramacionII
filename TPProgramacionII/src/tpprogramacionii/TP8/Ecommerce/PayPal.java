package tpprogramacionii.TP8.Ecommerce;


public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Email: " + email);
        System.out.println("Monto: $" + monto);
        
        return true;
    }
}
