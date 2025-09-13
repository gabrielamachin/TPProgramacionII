package tpprogramacionii.TP3;

public class Ejercicio2_RegistroMascotas {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota miMascota = new Mascota("Luna", "Perro", 3);
        
        // Mostrar información inicial
        miMascota.mostrarInfo();
        
        // Simular el paso del tiempo
        miMascota.cumplirAnios(3);
        miMascota.mostrarInfo();
        System.out.println();
    }
}