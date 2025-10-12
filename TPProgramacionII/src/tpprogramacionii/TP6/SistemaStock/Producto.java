package tpprogramacionii.TP6.SistemaStock;

public class Producto {
    // Atributos de instancia
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    // Constructor sobrecargado 1 -todos los parámetros
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Constructor sobrecargado 2 - sin cantidad (por defecto 0)
    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {
        this(id, nombre, precio, 0, categoria); // Reutiliza el primer constructor
    }
    
    // Métodos de instancia
    public void mostrarInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria + " - " + this.categoria.getDescripcion());
        System.out.println("-----------------------------");
    }
    
    @Override
    public String toString() {
        return String.format("Producto[ID: %s, Nombre: %s, Precio: $%.2f, Stock: %d, Categoría: %s]", 
                           this.id, this.nombre, this.precio, this.cantidad, this.categoria);
    }
    
    // Getters y setters
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public CategoriaProducto getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
}