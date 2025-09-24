package tpprogramacionii.TP5.Celular;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA CELULAR - USUARIO - BATERÍA ===\n");
        
        // Demostración de AGREGACIÓN (Batería existe independientemente)
        System.out.println("1. DEMOSTRACIÓN DE AGREGACIÓN:");
        Bateria bateria1 = new Bateria("Li-ion XYZ", 4000);
        Bateria bateria2 = new Bateria("Li-po ABC", 5000);
        
        System.out.println("Baterías creadas independientemente:");
        bateria1.mostrarInfo();
        bateria2.mostrarInfo();
        
        // Crear celulares con agregación de baterías
        Celular celular1 = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria1);
        Celular celular2 = new Celular("987654321098765", "iPhone", "13 Pro", bateria2);
        
        System.out.println("\n Celulares creados con agregación de baterías:");
        celular1.mostrarInfoCompleta();
        celular2.mostrarInfoCompleta();
        
        // Demostración de asociación bidireccional
        System.out.println("\n2. DEMOSTRACIÓN DE ASOCIACIÓN BIDIRECCIONAL:");
        Usuario usuario1 = new Usuario("María García", "87654321B");
        Usuario usuario2 = new Usuario("Carlos López", "11223344C");
        
        System.out.println("Usuarios creados:");
        usuario1.mostrarInfo();
        usuario2.mostrarInfo();
        
        // Establecer relaciones bidireccionales
        usuario1.setCelular(celular1);
        usuario2.setCelular(celular2);
        
        System.out.println("\nDespués de establecer relaciones bidireccionales:");
        usuario1.mostrarInfo();
        usuario2.mostrarInfo();
        
        // Verificar relaciones bidireccionales
        System.out.println("\n3. VERIFICACIÓN DE RELACIONES BIDIRECCIONALES:");
        System.out.println("¿Usuario1 conoce su celular? " + (usuario1.getCelular() != null ? "SÍ" : "NO"));
        System.out.println("¿Celular1 conoce a su usuario? " + (celular1.getUsuario() != null ? "SÍ" : "NO"));
        System.out.println("¿Es el mismo usuario? " + (usuario1.getCelular().getUsuario() == usuario1 ? "SÍ" : "NO"));
        
        // Demostrar flexibilidad de la AGREGACIÓN
        System.out.println("\n4. FLEXIBILIDAD DE AGREGACIÓN (cambiar batería):");
        System.out.println("Batería actual de Celular1: " + celular1.getBateria().getModelo());
        
        Bateria bateriaNueva = new Bateria("Li-ion Ultra", 6000);
        celular1.setBateria(bateriaNueva);
        System.out.println("Nueva batería de Celular1: " + celular1.getBateria().getModelo());
        
        // La batería original sigue existiendo independientemente
        System.out.println("Batería original sigue existiendo: " + bateria1.getModelo());
        
        // Mostrar estado final
        System.out.println("\n5. ESTADO FINAL DEL SISTEMA:");
        celular1.mostrarInfoCompleta();
        celular2.mostrarInfoCompleta();
        
        System.out.println("\n=== EJECUCIÓN COMPLETADA ===");
    }
}