package tpprogramacionii.Tp2;

public class Ejercicio13_ImpresionRecursiva {
    // Función recursiva para imprimir precios
    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        imprimirPreciosRecursivo(precios, indice + 1); // llamada recursiva parael siguiente índice
    }
    
    public static void main(String[] args) {
        // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales con función recursiva
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);

        // c. Modificar un precio específico
        precios[2] = 129.99;

        // d. Mostrar precios modificados con función recursiva
        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }
}
