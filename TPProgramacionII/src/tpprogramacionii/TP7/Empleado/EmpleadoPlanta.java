package tpprogramacionii.TP7.Empleado;

public class EmpleadoPlanta extends Empleado {
    private double bonoAntiguedad;
    private int añosAntiguedad;
    
    // Constructor
    public EmpleadoPlanta(String nombre, String id, double sueldoBase, 
                         int añosAntiguedad) {
        super(nombre, id, sueldoBase);
        this.añosAntiguedad = añosAntiguedad;
        this.bonoAntiguedad = añosAntiguedad * 500;
    }
    
    // Implementación del método abstracto calcularSueldo()
    @Override
    public double calcularSueldo() {
        return sueldoBase + bonoAntiguedad;
    }

    public double getBonoAntiguedad() {
        return bonoAntiguedad;
    }
    
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }
    
    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
        this.bonoAntiguedad = añosAntiguedad * 500;
    }
}