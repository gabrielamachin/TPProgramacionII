package tpprogramacionii.TP3;

public class Ejercicio5_SimulacionNaveEspacial {
    public static void main(String[] args) {        
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);
        
        // Mostrar estado inicial
        System.out.println("Estado inicial:");
        nave.mostrarEstado();
        
        // Intentar despegar
        System.out.println("Intentado despegar:");
        nave.despegar();
        nave.mostrarEstado();
        
        // Intentar avanzar sin recargar
        System.out.println("Intentando avanzar sin recargar:");
        nave.avanzar(100); // Necesita 50 unidades, pero solo tiene 40
        nave.mostrarEstado();
        
        // Recargar combustible
        System.out.println("Recarga de combustible:");
        nave.recargarCombustible(40);
        nave.mostrarEstado();
        
        // Avanzar después de recargar
        System.out.println("Avanzando después de recargar:");
        nave.avanzar(100); // Ahora puede avanzar
        nave.mostrarEstado();
        
        // Intentar recargar demasiado combustible
        nave.recargarCombustible(200);
        nave.mostrarEstado();
        
        // Avanzar una distancia menor
        nave.avanzar(50);
        nave.mostrarEstado();
        
        // Probar con cantidad negativa
        nave.recargarCombustible(-10);
        
        // Intentar avanzar sin combustible
        nave.avanzar(10);
    }
}