package tpprogramacionii.TP7.Animales;

import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        // Crear lista de animales
        List<Animal> animales = new ArrayList<>();
        
        // Crear diferentes animales
        animales.add(new Perro("Maverick", 3, "Labrador"));
        animales.add(new Gato("Candy", 2, true));
        animales.add(new Vaca("Margarita", 5, 20));
        animales.add(new Perro("Tobi", 7, "Pastor alemán"));
        animales.add(new Gato("Simba", 4, false));
        animales.add(new Vaca("Bianca", 3, 15));
        
        // Mostrar sus sonidos con polimorfismo
        System.out.println("Sonidos de los animales");
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }
        
        // Describir los animales
        System.out.println("\n Descripción de los animales:");
        mostrarComportamientosEspecificos(animales);
    }
    
    // Demostrar el uso de instanceof y métodos específicos
    public static void mostrarComportamientosEspecificos(List<Animal> animales) {
        for (Animal animal : animales) {
            animal.describirAnimal();
            
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;
                perro.moverCola();
            } else if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                gato.ronronear();
            } else if (animal instanceof Vaca) {
                Vaca vaca = (Vaca) animal;
                vaca.producirLeche();
            }
        }
    }
}
