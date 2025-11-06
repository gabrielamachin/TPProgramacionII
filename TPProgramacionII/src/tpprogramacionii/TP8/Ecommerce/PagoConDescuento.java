package tpprogramacionii.TP8.Ecommerce;

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}