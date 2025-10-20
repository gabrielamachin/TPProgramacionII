package tpprogramacionii.TP7.FigurasGeometricas;

public class MainFiguras {
    public static void main(String[] args) {
        // Crear un array de figuras
        Figura[] figuras = new Figura[4];
        
        // Instanciar diferentes figuras
        figuras[0] = new Circulo("Círculo Pequeño", 5.0);
        figuras[1] = new Rectangulo("Rectángulo Grande", 10.0, 6.0);
        figuras[2] = new Circulo("Círculo Grande", 8.5);
        figuras[3] = new Rectangulo("Rectángulo Pequeño", 4.0, 3.0);
        
        // Mostrar el área de cada figura, usando polimorfismo
        System.out.println("Áreas de figuras geométricas");
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}
