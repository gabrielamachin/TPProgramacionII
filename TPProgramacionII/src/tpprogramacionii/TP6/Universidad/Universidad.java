package tpprogramacionii.TP6.Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    // Atributos de instancia
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("Universidad '" + this.nombre + "' creada.");
    }
    
    // Agregar profesor
    public void agregarProfesor(Profesor profesor) {
        if (!this.profesores.contains(profesor)) {
            this.profesores.add(profesor);
            System.out.println("Profesor '" + profesor.getNombre() + "' agregado a la universidad.");
        }
    }
    
    // Agregar curso
    public void agregarCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            System.out.println("Curso '" + curso.getNombre() + "' agregado a la universidad.");
        }
    }
    
    // Asignar profesor a curso (método para la bidireccionalidad)
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso == null) {
            System.out.println("Error: Curso con código '" + codigoCurso + "' no encontrado.");
            return false;
        }
        
        if (profesor == null) {
            System.out.println("Error: Profesor con ID '" + idProfesor + "' no encontrado.");
            return false;
        }
        
        // Esta llamada activa la sincronización bidireccional
        curso.setProfesor(profesor);
        System.out.println("Profesor '" + profesor.getNombre() + "' asignado al curso '" + curso.getNombre() + "'");
        return true;
    }
    
    // Listar profesores
    public void listarProfesores() {
        if (this.profesores.isEmpty()) {
            System.out.println("No hay profesores en la universidad.");
            return;
        }
        
        System.out.println("\n=== PROFESORES DE LA UNIVERSIDAD " + this.nombre.toUpperCase() + " ===");
        for (Profesor profesor : this.profesores) {
            profesor.mostrarInfo();
        }
    }
    
    // Listar cursos
    public void listarCursos() {
        if (this.cursos.isEmpty()) {
            System.out.println("No hay cursos en la universidad.");
            return;
        }
        
        System.out.println("\n=== CURSOS DE LA UNIVERSIDAD " + this.nombre.toUpperCase() + " ===");
        for (Curso curso : this.cursos) {
            curso.mostrarInfo();
        }
    }
    
    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : this.profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    // Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : this.cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    // Eliminar curso
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con el profesor antes de eliminar
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            this.cursos.remove(curso);
            System.out.println("Curso '" + curso.getNombre() + "' eliminado de la universidad.");
            return true;
        }
        System.out.println("Curso con código '" + codigo + "' no encontrado.");
        return false;
    }
    
    // Eliminar profesor
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null en todos los cursos que dictaba
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            this.profesores.remove(profesor);
            System.out.println("Profesor '" + profesor.getNombre() + "' eliminado de la universidad.");
            return true;
        }
        System.out.println("Profesor con ID '" + id + "' no encontrado.");
        return false;
    }
    
    // Mostrar reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : this.profesores) {
            System.out.println("- " + profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
        }
        
        // Mostrar cursos sin profesor
        int cursosSinProfesor = 0;
        for (Curso curso : this.cursos) {
            if (curso.getProfesor() == null) {
                cursosSinProfesor++;
            }
        }
        System.out.println("- Cursos sin profesor asignado: " + cursosSinProfesor);
    }
    
    // Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public List<Profesor> getProfesores() {
        return new ArrayList<>(this.profesores);
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(this.cursos);
    }
}
