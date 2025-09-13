package tpprogramacionii.TP3;

public class Ejercicio1_RegistroEstudiantes {
    public static void main(String[] args) {
        // Instanciar un estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Garcia", "Matemática", 75.5);
        
        // Mostrar la información inicial
        estudiante1.mostrarInformacion();
        
        // Aumentar calificación
        estudiante1.subirCalificacion(10.0);
        estudiante1.mostrarInformacion();
        
        // Disminuir calificación
        estudiante1.bajarCalificacion(5.5);
        estudiante1.mostrarInformacion();
    }
}
