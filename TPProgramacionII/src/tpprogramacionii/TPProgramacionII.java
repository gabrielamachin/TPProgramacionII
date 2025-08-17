package tpprogramacionii;
import java.util.Scanner;

public class TPProgramacionII {

    // Ejercicio 2
    public static void holaMundo() {
        System.out.println("¡Hola, Java!");
    }
    
    // Ejercicio 3
    public static void imprimirValores() {
        // Declaración de las variables
        String nombre = "Pablo";
        int edad = 25;
        double altura = 1.70;
        boolean estudiante = true;

        // Imprimir los valores en la consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);
    }
    
    // Ejercicio 4
    public static void mostrarDatosUsuario() {
       Scanner scanner = new Scanner(System.in);
       
       // Solicitar y leer el nombre
       System.out.print("Ingrese su nombre: ");
       String nombre = scanner.nextLine();  // Esta lectura está bien

       // Solicitar y leer la edad
       System.out.print("Ingrese su edad: ");
       int edad = scanner.nextInt();

       // Limpiar el salto de línea que queda después de nextInt()
       scanner.nextLine();

       // Imprimir el nombre y la edad en pantalla
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);
    }
    
    // Ejercicio 5
    public static void calcularOperaciones() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el primer número
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        // Limpiar el salto de línea que queda después de nextInt()
        scanner.nextLine();

        // Solicitar y leer el segundo número
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num2 != 0 ? (double) num1 / num2 : 0;  // Evitar división por cero

        // Mostrar los resultados en la consola
        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
        System.out.println("Resultado de la división: " + division);
    }
    
    // Ejercicio 6
    public static void mostrarInfoCaracteresEscape() {
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
    
    // Ejercicio 8
    public static void dividirEnteros() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar la división
        double resultado = num1 / num2;

        // Mostrar el resultado
        System.out.println("Resultado de la división (double): " + resultado);
    }
    
    // Ejercicio 9
    public static void errorEjemplo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Corregido
        System.out.println("Hola, " + nombre);
    }
        
    public static void main(String[] args) {
        holaMundo();
        imprimirValores();
        mostrarDatosUsuario();
        calcularOperaciones();
        mostrarInfoCaracteresEscape();
        dividirEnteros();
        errorEjemplo();
    }  
}
