package tpprogramacionii.Tp2;
import java.util.Scanner;

public class Ejercicio11_CalcularDescuentoEspecial {
    
    // Variable global para el descuento (10%)
    static double descuentoEspecial = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        
        // Variable local para el descuento aplicado
        double descuentoAplicado = precio * descuentoEspecial;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}
