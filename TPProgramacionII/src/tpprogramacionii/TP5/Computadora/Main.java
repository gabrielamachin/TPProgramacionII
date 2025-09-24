package tpprogramacionii.TP5.Computadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA COMPUTADORA - PLACA MADRE - PROPIETARIO ===\n");
        
        // Demostración de compopsición (PlacaMadre se crea con Computadora)
        System.out.println("1. DEMOSTRACIÓN DE COMPOSICIÓN:");
        System.out.println("Las placas madre se crean DENTRO de las computadoras:\n");
        
        // Crear computadoras (automáticamente crean sus placas madre por COMPOSICIÓN)
        Computadora compu1 = new Computadora("Dell", "DLXPS123456", "Dell Motherboard X1", "Intel Z790");
        Computadora compu2 = new Computadora("HP", "HPPAV789012", "HP Pavilion Board", "AMD B650");
        Computadora compu3 = new Computadora("Lenovo", "LNVYO345678", "Lenovo ThinkBoard", "Intel H770");
        
        System.out.println("Computadoras creadas (con composición de placas madre):");
        compu1.mostrarEspecificaciones();
        compu2.mostrarEspecificaciones();
        compu3.mostrarEspecificaciones();
        
        // Crear propietarios
        System.out.println("\n2. CREACIÓN DE PROPIETARIOS:");
        Propietario propietario1 = new Propietario("Carlos Ruiz", "33445566A");
        Propietario propietario2 = new Propietario("María Lopez", "44556677B");
        Propietario propietario3 = new Propietario("Ana Torres", "55667788C");
        
        System.out.println("Propietarios creados:");
        propietario1.mostrarInfo();
        propietario2.mostrarInfo();
        propietario3.mostrarInfo();
        
        // Establecer relaciones bidireccionales
        System.out.println("\n3. ESTABLECER RELACIONES BIDIRECCIONALES:");
        propietario1.setComputadora(compu1);
        propietario2.setComputadora(compu2);
        propietario3.setComputadora(compu3);
        
        System.out.println("Relaciones bidireccionales establecidas:");
        propietario1.mostrarInfo();
        propietario2.mostrarInfo();
        propietario3.mostrarInfo();
        
        // Verificar relación bidireccional
        System.out.println("\n4. VERIFICACIÓN RELACIÓN BIDIRECCIONAL:");
        System.out.println("Propietario1 conoce su computadora: " + (propietario1.getComputadora() != null ? "SÍ" : "NO"));
        System.out.println("Computadora1 conoce a su propietario: " + (compu1.getPropietario() != null ? "SÍ" : "NO"));
        System.out.println("¿Es el mismo propietario? " + (propietario1.getComputadora().getPropietario() == propietario1 ? "SÍ" : "NO"));
        
        // Demostrar COMPOSICIÓN (la placa madre no existe independientemente)
        System.out.println("\n5. DEMOSTRACIÓN COMPOSICIÓN:");
        System.out.println("La placa madre existe SOLO dentro de la computadora:");
        System.out.println("Placa madre de Compu1: " + compu1.getPlacaMadre().getModelo());
        
        // Intentar acceder a la placa madre desde la computadora (éxito)
        System.out.println("Acceso directo a placa madre desde computadora: " + 
                          compu1.getPlacaMadre().getModelo());
        
        // No hay forma de acceder a la placa madre independientemente (composición)
        System.out.println("No existe referencia independiente a la placa madre");
        
        // Funcionalidad: encender computadoras
        System.out.println("\n6. FUNCIONALIDAD - ENCENDER COMPUTADORAS:");
        compu1.encender();
        System.out.println();
        compu2.encender();
        
        // Propietarios usando computadoras
        System.out.println("\n7. PROPIETARIOS USANDO COMPUTADORAS:");
        propietario1.usarComputadora();
        System.out.println();
        propietario2.usarComputadora();
        
        // Escenario: cambiar propietario (asociación bidireccional flexible)
        System.out.println("\n8. CAMBIO DE PROPIETARIO (asociación bidireccional):");
        System.out.println("Computadora3 actualmente de: " + compu3.getPropietario().getNombre());
        
        Propietario nuevoPropietario = new Propietario("Juan Castro", "66778899D");
        compu3.setPropietario(nuevoPropietario);
        
        System.out.println("Computadora3 ahora de: " + compu3.getPropietario().getNombre());
        System.out.println("Propietario anterior: " + propietario3.getNombre() + " ahora sin computadora");
        propietario3.mostrarInfo();
        
        // Demostrar que la COMPOSICIÓN no permite cambiar la placa madre
        System.out.println("\n9. COMPOSICIÓN vs AGREGACIÓN (comparación):");
        System.out.println("NO se puede cambiar la placa madre (composición fuerte)");
        System.out.println("SÍ se puede cambiar el propietario (asociación bidireccional)");
        
        // Apagar computadoras
        System.out.println("\n10. APAGAR COMPUTADORAS:");
        compu1.apagar();
        compu2.apagar();
        
        // Resumen final
        System.out.println("\n11. RESUMEN DEL SISTEMA:");
        System.out.println("Total computadoras: 3 (cada una con su placa madre por COMPOSICIÓN)");
        System.out.println("Total propietarios: 4");
        System.out.println("Total placas madre: 3 (solo existen dentro de las computadoras)");
        System.out.println("Relaciones: Bidireccional (Computadora↔Propietario) + Composición (Computadora→PlacaMadre)");
        
        System.out.println("\n=== EJECUCIÓN COMPLETADA ===");
    }
}