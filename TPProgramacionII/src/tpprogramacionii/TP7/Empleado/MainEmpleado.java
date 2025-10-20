package tpprogramacionii.TP7.Empleado;

import java.util.ArrayList;
import java.util.List;

public class MainEmpleado {
 public static void main(String[] args) {
        // Crear lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        
        // Agregar empleados de diferentes tipos
        empleados.add(new EmpleadoPlanta("Juan Pérez", "EMP001", 3000, 5));
        empleados.add(new EmpleadoTemporal("María García", "EMP002", 2500, 8));
        empleados.add(new EmpleadoPlanta("Carlos López", "EMP003", 3500, 10));
        empleados.add(new EmpleadoTemporal("Ana Martínez", "EMP004", 2800, 5));
        empleados.add(new EmpleadoPlanta("Pedro Rodríguez", "EMP005", 3200, 3));
        
        // Invocar calcularSueldo() polimórficamente
        System.out.println("Sueldos de todos los empleados");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
        
        // Usar instanceof para clasificar
        System.out.println("\n Clasificación de empleados");
        clasificarEmpleados(empleados);
    }
    
    // Método que usa instanceof para clasificar empleados
    public static void clasificarEmpleados(List<Empleado> empleados) {
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                EmpleadoPlanta empPlanta = (EmpleadoPlanta) empleado;
                System.out.println("Planta: " + empleado.getNombre() + 
                                 " - Años antigüedad: " + empPlanta.getAñosAntiguedad());
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                EmpleadoTemporal empTemp = (EmpleadoTemporal) empleado;
                System.out.println("Temporal: " + empleado.getNombre() + 
                                 " - Horas extras: " + empTemp.getHorasExtras());
            }
        }
        
        System.out.println("\nTotal empleados de planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        System.out.println("Total general: " + (contadorPlanta + contadorTemporal));
    }
}