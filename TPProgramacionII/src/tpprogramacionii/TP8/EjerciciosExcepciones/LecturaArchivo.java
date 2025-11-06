package tpprogramacionii.TP8.EjerciciosExcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        
        try {
            leerArchivo(nombreArchivo);
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + nombreArchivo + "' no existe.");
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
    
    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        Scanner lector = new Scanner(archivo);
        
        System.out.println("Contenido del archivo:");
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            System.out.println(linea);
        }
        
        lector.close();
    }
}
