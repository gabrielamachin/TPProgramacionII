package tpprogramacionii.TP6.SistemaStock;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA DE GESTIÓN DE STOCK");
        
        // Crear inventario
        Inventario inventario = new Inventario();
        
        // Crear al menos cinco productos con diferentes categorías
        System.out.println("1. CREANDO PRODUCTOS...");
        Producto p1 = new Producto("P001", "Laptop gamer", 2500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Arroz integral", 3.50, 100, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("P003", "Camisa mangas largas", 45.0, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sofá 3 plazas", 1200.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Smartphone", 1800.0, 25, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("P006", "Aceite de oliva", 8.0, 80, CategoriaProducto.ALIMENTOS);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        
        // 2. Listar todos los productos
        System.out.println("\n2. LISTANDO TODOS LOS PRODUCTOS:");
        inventario.listarProductos();
        
        // 3. Buscar un producto por ID
        System.out.println("3. BUSCANDO PRODUCTO POR ID 'P003':");
        Producto productoBuscado = inventario.buscarProductoPorId("P003");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        }
        
        // 4. Filtrar productos por categoría específica
        System.out.println("4. FILTRANDO PRODUCTOS DE ELECTRÓNICA:");
        List<Producto> electronicos = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronicos) {
            p.mostrarInfo();
        }
        
        // 5. Eliminar un producto por ID
        System.out.println("5. ELIMINANDO PRODUCTO 'P002':");
        inventario.eliminarProducto("P002");
        System.out.println("Productos restantes:");
        inventario.listarProductos();
        
        // 6. Actualizar stock de un producto
        System.out.println("6. ACTUALIZANDO STOCK DEL PRODUCTO 'P001' A 30:");
        inventario.actualizarStock("P001", 30);
        
        // 7. Mostrar total de stock disponible
        System.out.println("\n7. TOTAL DE STOCK DISPONIBLE: " + inventario.obtenerTotalStock());
        
        // 8. Obtener producto con mayor stock
        System.out.println("\n8. PRODUCTO CON MAYOR STOCK:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar productos por precio ($1000 - $3000)
        System.out.println("9. PRODUCTOS ENTRE $1000 Y $3000:");
        List<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : productosPorPrecio) {
            p.mostrarInfo();
        }
        
        // 10. Mostrar categorías disponibles
        System.out.println("10. CATEGORÍAS DISPONIBLES:");
        inventario.mostrarCategoriasDisponibles();
        
        // Demostración de métodos estáticos
        System.out.println("\n=== INFORMACIÓN ADICIONAL ===");
        System.out.println("Total de inventarios creados: " + Inventario.getTotalInventariosCreados());
        
        // Demostración de toString()
        System.out.println("\n=== USO DE toString() ===");
        System.out.println(p1.toString());
    }
}
