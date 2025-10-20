package tpprogramacionii.TP7.Empleado;

public class EmpleadoTemporal extends Empleado {
    private double bonoProductividad;
    private int horasExtras;
    private double pagoPorHoraExtra;
    
    // Constructor
    public EmpleadoTemporal(String nombre, String id, double sueldoBase, 
                           int horasExtras) {
        super(nombre, id, sueldoBase);
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = 50.0; // $50 por hora extra
        this.bonoProductividad = sueldoBase * 0.10; // 10% del sueldo base
    }
    
    // Implementación del método abstracto calcularSueldo()
    @Override
    public double calcularSueldo() {
        double pagoHorasExtras = horasExtras * pagoPorHoraExtra;
        return sueldoBase + bonoProductividad + pagoHorasExtras;
    }
    
    public double getBonoProductividad() {
        return bonoProductividad;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }
    
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }
    
    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
}
