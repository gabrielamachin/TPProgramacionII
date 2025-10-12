package tpprogramacionii.TP6.Universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ACADÉMICO UNIVERSITARIO ===\n");
        
        // 1. Crear universidad
        System.out.println("1. CREANDO UNIVERSIDAD...");
        Universidad universidad = new Universidad("Universidad Nacional");
        
        // 2. Crear al menos 3 profesores y 5 cursos
        System.out.println("\n2. CREANDO PROFESORES Y CURSOS...");
        
        // Crear profesores
        Profesor prof1 = new Profesor("P001", "Dr. Carlos Méndez", "Matemática");
        Profesor prof2 = new Profesor("P002", "Dra. Ana López", "Física");
        Profesor prof3 = new Profesor("P003", "Dr. Roberto Díaz", "Programación");
        
        // Crear cursos
        Curso curso1 = new Curso("MAT101", "Cálculo I");
        Curso curso2 = new Curso("MAT102", "Cálculo II");
        Curso curso3 = new Curso("FIS101", "Física General");
        Curso curso4 = new Curso("PROG101", "Programación I");
        Curso curso5 = new Curso("PROG102", "Programación II");
        
        // 3. Agregar profesores y cursos a la universidad
        System.out.println("\n3. AGREGANDO A LA UNIVERSIDAD...");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // 4. Asignar profesores a cursos
        System.out.println("\n4. ASIGNANDO PROFESORES A CURSOS...");
        universidad.asignarProfesorACurso("MAT101", "P001");
        universidad.asignarProfesorACurso("MAT102", "P001");
        universidad.asignarProfesorACurso("FIS101", "P002");
        universidad.asignarProfesorACurso("PROG101", "P003");
        universidad.asignarProfesorACurso("PROG102", "P003");
        
        // 5. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\n5. LISTANDO INFORMACIÓN COMPLETA:");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // Mostrar cursos de cada profesor
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // 6. Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n6. CAMBIANDO PROFESOR DE CURSO 'MAT102':");
        System.out.println("ANTES del cambio:");
        curso2.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();
        
        universidad.asignarProfesorACurso("MAT102", "P002");
        
        System.out.println("DESPUÉS del cambio:");
        curso2.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();
        
        // 7. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n7. ELIMINANDO CURSO 'PROG101':");
        System.out.println("ANTES de eliminar:");
        prof3.listarCursos();
        
        universidad.eliminarCurso("PROG101");
        
        System.out.println("DESPUÉS de eliminar:");
        prof3.listarCursos();
        
        // 8. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n8. ELIMINANDO PROFESOR 'P002':");
        System.out.println("Cursos de P002 antes de eliminar:");
        for (Curso curso : universidad.getCursos()) {
            if (curso.getProfesor() == prof2) {
                curso.mostrarInfo();
            }
        }
        
        universidad.eliminarProfesor("P002");
        
        System.out.println("Cursos que tenían a P002 después de eliminar:");
        for (Curso curso : universidad.getCursos()) {
            if (curso.getCodigo().equals("MAT102") || curso.getCodigo().equals("FIS101")) {
                curso.mostrarInfo();
            }
        }
        
        // 9. Mostrar reporte final
        System.out.println("\n9. REPORTE FINAL:");
        universidad.mostrarReporteCursosPorProfesor();
        
        // Demostración de la bidireccionalidad
        System.out.println("\n=== VERIFICACIÓN DE BIDIRECCIONALIDAD ===");
        System.out.println("Desde curso se accede a profesor: " + 
                          (curso1.getProfesor() != null ? curso1.getProfesor().getNombre() : "null"));
        System.out.println("Desde profesor se accede a cursos: " + prof1.getCursos().size() + " cursos");
    }
}
