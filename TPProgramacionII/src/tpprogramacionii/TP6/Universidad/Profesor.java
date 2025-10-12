package tpprogramacionii.TP6.Universidad;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    // Atributos de instancia
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Lado N de la relación 1 a N
    
    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Método para agregar curso (sincroniza ambos lados)
    public void agregarCurso(Curso curso) {
        // Verificar si el curso ya está en la lista
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this); // Esto actualiza el lado del curso
            }
            System.out.println("Curso '" + curso.getNombre() + "' agregado al profesor " + this.nombre);
        }
    }
    
    // Método para eliminar curso (sincroniza ambos lados)
    public void eliminarCurso(Curso curso) {
        if (this.cursos.contains(curso)) {
            this.cursos.remove(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() == this) {
                curso.setProfesor(null); // Esto actualiza el lado del curso
            }
            System.out.println("Curso '" + curso.getNombre() + "' eliminado del profesor " + this.nombre);
        }
    }
    
    // Listar cursos del profesor
    public void listarCursos() {
        if (this.cursos.isEmpty()) {
            System.out.println("El profesor " + this.nombre + " no tiene cursos asignados.");
            return;
        }
        
        System.out.println("\n=== CURSOS DEL PROFESOR " + this.nombre.toUpperCase() + " ===");
        for (Curso curso : this.cursos) {
            System.out.println("- Código: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
        }
    }
    
    // Mostrar información completa del profesor
    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DEL PROFESOR ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cantidad de cursos: " + this.cursos.size());
        System.out.println("-----------------------------");
    }
    
    // Sobrescribir toString()
    @Override
    public String toString() {
        return String.format("Profesor[ID: %s, Nombre: %s, Especialidad: %s, Cursos: %d]", 
                           this.id, this.nombre, this.especialidad, this.cursos.size());
    }
    
    // Getters
    public String getId() {
        return this.id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(this.cursos); // Devolvemos copia para proteger la encapsulación
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
