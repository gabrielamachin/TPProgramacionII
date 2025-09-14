package tpprogramacionii.TP4;

public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0;
        totalEmpleados++;
    }
    
    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentajeAumento) {
        this.salario = this.salario * (1 + porcentajeAumento / 100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Empleado [Id= " + id + ", Nombre= " + nombre + ", Puesto= " + puesto + ", Salario= " + salario + "]";
    }
    
    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
