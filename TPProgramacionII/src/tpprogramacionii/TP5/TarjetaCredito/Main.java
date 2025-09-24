package tpprogramacionii.TP5.TarjetaCredito;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA TARJETA DE CRÉDITO - CLIENTE - BANCO ===\n");
        
        // Demostración de agregación (Bancos existen independientemente)
        System.out.println("1. CREACIÓN DE BANCOS (AGREGACIÓN):");
        
        Banco banco1 = new Banco("Banco Nacional", "30-12345678-9");
        Banco banco2 = new Banco("Banco Provincial", "30-87654321-1");
        Banco banco3 = new Banco("Banco Internacional", "30-55555555-5");
        
        System.out.println("Bancos creados (existen independientemente):");
        banco1.mostrarInfo();
        banco2.mostrarInfo();
        banco3.mostrarInfo();
        
        // Crear clientes
        System.out.println("\n2. CREACIÓN DE CLIENTES:");
        Cliente cliente1 = new Cliente("Ana Martínez", "28987654A");
        Cliente cliente2 = new Cliente("Pedro Rodríguez", "33221144B");
        Cliente cliente3 = new Cliente("Laura González", "44556677C");
        
        System.out.println("✅ Clientes creados:");
        cliente1.mostrarInfo();
        cliente2.mostrarInfo();
        cliente3.mostrarInfo();
        
        // Crear tarjetas de crédito
        System.out.println("\n3. CREACIÓN DE TARJETAS CON RELACIONES:");
        
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "2025-06");
        tarjeta1.setBanco(banco1);  // Agregación
        tarjeta1.setCliente(cliente1); // Asociación bidireccional
        
        TarjetaDeCredito tarjeta2 = new TarjetaDeCredito("9876-5432-1098-7654", "2024-08", cliente2, banco2);
        TarjetaDeCredito tarjeta3 = new TarjetaDeCredito("5555-6666-7777-8888", "2026-12", cliente3, banco3);
        
        System.out.println("Tarjetas creadas con relaciones:");
        tarjeta1.mostrarInformacion();
        tarjeta2.mostrarInformacion();
        tarjeta3.mostrarInformacion();
        
        // Demostrar ASOCIACIÓN BIDIRECCIONAL
        System.out.println("4. DEMOSTRACIÓN ASOCIACIÓN BIDIRECCIONAL:");
        System.out.println("Tarjeta1 conoce a su cliente: " + (tarjeta1.getCliente() != null ? "SÍ" : "NO"));
        System.out.println("Cliente1 conoce su tarjeta: " + (cliente1.getTarjeta() != null ? "SÍ" : "NO"));
        System.out.println("¿Es la misma tarjeta? " + (cliente1.getTarjeta() == tarjeta1 ? "SÍ" : "NO"));
        
        // Demostrar AGREGACIÓN
        System.out.println("\n5. DEMOSTRACIÓN AGREGACIÓN (flexibilidad):");
        System.out.println("Tarjeta2 actualmente del banco: " + tarjeta2.getBanco().getNombre());
        
        // Cambiar de banco (agregación permite esto)
        tarjeta2.setBanco(banco1);
        System.out.println("Tarjeta2 ahora del banco: " + tarjeta2.getBanco().getNombre());
        System.out.println("Banco original sigue existiendo: " + banco2.getNombre());
        
        // Múltiples tarjetas con mismo banco
        System.out.println("\n6. MÚLTIPLES TARJETAS CON MISMO BANCO:");
        TarjetaDeCredito tarjeta4 = new TarjetaDeCredito("1111-2222-3333-4444", "2025-03", cliente1, banco1);
        System.out.println("Cliente " + cliente1.getNombre() + " tiene 2 tarjetas del mismo banco:");
        tarjeta1.mostrarInformacion();
        tarjeta4.mostrarInformacion();
        
        // Funcionalidad adicional: realizar pagos
        System.out.println("\n7. FUNCIONALIDAD - REALIZAR PAGOS:");
        tarjeta1.realizarPago(1500.75, "Compra en supermercado");
        System.out.println();
        tarjeta3.realizarPago(899.99, "Compra en tienda online");
        
        // Escenario: cliente sin tarjeta
        System.out.println("\n8. ESCENARIO: CLIENTE SIN TARJETA:");
        Cliente clienteSinTarjeta = new Cliente("Carlos López", "99887766D");
        clienteSinTarjeta.mostrarInfo();
        
        // Asignar tarjeta posteriormente
        TarjetaDeCredito tarjeta5 = new TarjetaDeCredito("9999-8888-7777-6666", "2025-09");
        tarjeta5.setBanco(banco3);
        clienteSinTarjeta.setTarjeta(tarjeta5);
        
        System.out.println("Después de asignar tarjeta:");
        clienteSinTarjeta.mostrarInfo();
        
        // Resumen final
        System.out.println("\n9. RESUMEN DEL SISTEMA:");
        System.out.println("Total bancos: 3 (existen independientemente)");
        System.out.println("Total clientes: 4");
        System.out.println("Total tarjetas: 5");
        System.out.println("Relaciones: Bidireccional (Tarjeta↔Cliente) + Agregación (Tarjeta→Banco)");
        
        System.out.println("\n=== EJECUCIÓN COMPLETADA ===");
    }
}
