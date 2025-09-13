package tpprogramacionii.TP3;

public class Gallina {
    // Atributos
    private int idGallina;
    private int edad; // en meses
    private int huevosPuestos;
    
    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    // Método para poner huevos
    public void ponerHuevo() {
    if (edad >= 6) {
        // Aclaración: las gallinas empiezan a poner huevos a partir de los 6 meses.
        int huevos = (int)(Math.random() * 3); // 0, 1 o 2 huevos
        if (huevos > 0) {
            huevosPuestos += huevos;
            System.out.println("Gallina " + idGallina + " puso " + huevos + " huevos.");
        } else {
            System.out.println("Gallina " + idGallina + " no puso huevos hoy.");
        }
    } else {
            System.out.println("Gallina " + idGallina + " es joven (" + edad + 
                         " meses) para poner huevos. Necesita tener al menos 6 meses.");
        }
    }
    
    // Método para pasar el tiempo
    public void envejecer(int meses) {
        if (meses > 0) {
            edad += meses;
            System.out.println("Gallina " + idGallina + " ha envejecido " + meses + 
                             " meses. Ahora tiene " + edad + " meses.");
        } else {
            System.out.println("Error: La cantidad de meses debe ser positiva.");
        }
    }
        
    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("Estado gallina" + idGallina + ":");
        System.out.println("Edad: " + edad + " meses");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
    
    // Getters
    public int getIdGallina() {
        return idGallina;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
}
