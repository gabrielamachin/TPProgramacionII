package tpprogramacionii.TP3;

public class Ejercicio4_GestionGallinas {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(1, 3);  // Gallina joven de 3 meses
        Gallina gallina2 = new Gallina(2, 8);  // Gallina adulta de 8 meses
        
        // Mostrar estado inicial
        System.out.println("Estaod inicial:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Intento de poner huevos (gallina1 es muy joven)
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        System.out.println();
        
        // Envejecer las gallinas
        gallina1.envejecer(3);
        gallina2.envejecer(3);
        System.out.println();
        
        // Simular puesta de huevos después de envejecer
        gallina1.ponerHuevo();  // Ahora tiene 6 meses y puede poner
        gallina2.ponerHuevo();  // Ahora tiene 11 meses
        System.out.println();
        
        // Mostrar estado final
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
