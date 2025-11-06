package tpprogramacionii.TP8.EjerciciosExcepciones;

// Clase que usa la excepción personalizada
public class ValidadorEdad {
    public static void main(String[] args) {
        try {
            validarEdad(25);
            System.out.println("Edad válida.");
            
            validarEdad(-5);
            validarEdad(150);
            
        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación: " + e.getMessage());
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
    }
}
