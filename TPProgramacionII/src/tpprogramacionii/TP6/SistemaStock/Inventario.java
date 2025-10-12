package tpprogramacionii.TP6.SistemaStock;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // Atributo de instancia
    private ArrayList<Producto> productos;
    
    // Atributo estático
    private static int totalInventariosCreados = 0;
    
    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
        totalInventariosCreados++; // Incrementa el contador estático
    }
    
    // Método estático
    public static int getTotalInventariosCreados() {
        return totalInventariosCreados;
    }
    
    // Métodos de instancia
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }
    
    public void listarProductos() {
        if (this.productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        
        System.out.println("\n=== LISTA DE PRODUCTOS ===");
        for (Producto producto : this.productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto producto : this.productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }
    
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            this.productos.remove(producto);
            System.out.println("Producto '" + producto.getNombre() + "' eliminado.");
            return true;
        }
        System.out.println("Producto con ID '" + id + "' no encontrado.");
        return false;
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para '" + producto.getNombre() + "': " + nuevaCantidad);
            return true;
        }
        System.out.println("Producto con ID '" + id + "' no encontrado.");
        return false;
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getCategoria() == categoria) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (this.productos.isEmpty()) {
            return null;
        }
        
        Producto productoMayorStock = this.productos.get(0);
        for (Producto producto : this.productos) {
            if (producto.getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = producto;
            }
        }
        return productoMayorStock;
    }
    
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("CATEGORÍAS DISPONIBLES");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + " - " + categoria.getDescripcion());
        }
    }
}
