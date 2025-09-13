package tpprogramacionii.TP3;

public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInformacion() {
        System.out.println("Información del estudiante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion += puntos;
            if (calificacion > 100) {
                calificacion = 100;
            }
            System.out.println("Calificación aumentada en " + puntos + " puntos.");
        } else {
            System.out.println("Error: Los puntos deben ser positivos.");
        }
    }
    
    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
            if (calificacion < 0) {
                calificacion = 0;
            }
            System.out.println("Calificación disminuida en " + puntos + " puntos.");
        } else {
            System.out.println("Error: Los puntos deben ser positivos.");
        }
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 100) {
            this.calificacion = calificacion;
        }
    }
}
