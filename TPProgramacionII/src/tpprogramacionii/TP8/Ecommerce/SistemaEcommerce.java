package tpprogramacionii.TP8.Ecommerce;

public class SistemaEcommerce {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
        
        // Crear productos
        Producto laptop = new Producto("Laptop Gamer", 1200.00);
        Producto mouse = new Producto("Mouse Inalámbrico", 45.50);
        Producto teclado = new Producto("Teclado Mecánico", 89.99);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);
        
        // Mostrar productos del pedido
        System.out.println("=== PRODUCTOS EN EL PEDIDO ===");
        for (Producto producto : pedido.getProductos()) {
            System.out.println(producto);
        }
        
        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);
        
        // Procesar pago con tarjeta de crédito (con descuento)
        System.out.println("\n=== PROCESANDO PAGO CON TARJETA ===");
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Pérez");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        boolean pagoExitoso = tarjeta.procesarPago(totalConDescuento);
        
        if (pagoExitoso) {
            pedido.cambiarEstado("PAGADO");
            pedido.cambiarEstado("ENVIADO");
        }
        
        // Procesar pago con PayPal
        System.out.println("\n=== PROCESANDO PAGO CON PAYPAL ===");
        PayPal paypal = new PayPal("juan@email.com");
        boolean pagoPayPalExitoso = paypal.procesarPago(total);
        
        if (pagoPayPalExitoso) {
            pedido.cambiarEstado("PAGADO");
        }
    }
}
