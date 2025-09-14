package tpprogramacionii.TP4;

public class GestionEmpleados {
    public static void main(String[] args) {
        // Crear empleados usando ambos constructores
        Empleado empleado1 = new Empleado(1, "Juan Pérez", "Desarrollador", 2500.0);
        Empleado empleado2 = new Empleado("María García", "Diseñadora");
        Empleado empleado3 = new Empleado("Carlos López", "Analista");
        Empleado empleado4 = new Empleado(4, "Sofía Rodríguez", "Gerente", 4000.0);
        
        // Aplicar aumentos de salario
        System.out.println("Salario antes del aumento: $" + empleado1.getSalario());
        empleado1.actualizarSalario(10.0); // 10% de aumento
        System.out.println("Salario después del 10%: $" + empleado1.getSalario());
        
        System.out.println("\nSalario antes del aumento: $" + empleado2.getSalario());
        empleado2.actualizarSalario(500); // $500 de aumento fijo
        System.out.println("Salario después de $500: $" + empleado2.getSalario());
        
        // Mostrar información de todos los empleados
        System.out.println("Información de todos los empleados:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probar diferentes escenarios
        System.out.println("Pruebas adicionales:");
        empleado3.actualizarSalario(15.0); // 15% de aumento
        empleado4.actualizarSalario(1000); // $1000 de aumento fijo
        
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Verificar que el contador sigue funcionando
        Empleado empleado5 = new Empleado("Pedro Sánchez", "Tester");
        System.out.println("Nuevo empleado creado:");
        System.out.println(empleado5.toString());
        System.out.println("Total actualizado de empleados: " + Empleado.mostrarTotalEmpleados());
    }   
}
