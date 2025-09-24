package tpprogramacionii.TP5.Celular;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;     // Agregación - unidireccional
    private Usuario usuario;     // Asociación - bidireccional
    
    // Constructor sin batería
    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Constructor con batería
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Agregación
    }
    
    // Getters y setters
    public String getImei() {
        return imei;
    }
    
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    // Setter para batería (Agregación, la batería puede cambiarse)
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    // Método para establecer la relación bidireccional con Usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    // Método para mostrar información completa del celular
    public void mostrarInfoCompleta() {
        System.out.println("Celular: " + marca + " " + modelo);
        System.out.println("  IMEI: " + imei);
        if (bateria != null) {
            System.out.println("  Batería: " + bateria.getModelo() + " - " + bateria.getCapacidad() + "mAh");
        } else {
            System.out.println("  Sin batería asignada");
        }
        if (usuario != null) {
            System.out.println("  Usuario: " + usuario.getNombre() + " (DNI: " + usuario.getDni() + ")");
        } else {
            System.out.println("  Sin usuario asignado");
        }
    }
    
    @Override
    public String toString() {
        String bateriaInfo = (bateria != null) ? bateria.toString() : "null";
        String usuarioInfo = (usuario != null) ? usuario.toString() : "null";
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo + 
               "', bateria=" + bateriaInfo + ", usuario=" + usuarioInfo + "}";
    }
}