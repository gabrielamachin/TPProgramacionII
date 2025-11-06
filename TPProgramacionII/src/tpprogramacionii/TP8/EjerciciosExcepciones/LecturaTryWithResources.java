package tpprogramacionii.TP8.EjerciciosExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaTryWithResources {
    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";
        
        try {
            leerArchivoConTryWithResources(nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public static void leerArchivoConTryWithResources(String nombreArchivo) throws IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Contenido del archivo:");
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }            
        }
    }
}
