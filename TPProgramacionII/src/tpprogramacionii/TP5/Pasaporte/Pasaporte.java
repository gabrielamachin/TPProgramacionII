package tpprogramacionii.TP5.Pasaporte;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;           // Composición - unidireccional
    private Titular titular;     // Asociación - bidireccional
    
    // Constructor con composición (la foto se crea con el pasaporte)
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    
    // Getters y setters
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getFechaEmision() {
        return fechaEmision;
    }
    
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    // Aclaración: No hay setter para foto para mantener la composición fuerte
    
    public Titular getTitular() {
        return titular;
    }
    
    // Establecer la relación bidireccional con Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    @Override
    public String toString() {
        String titularInfo = (titular != null) ? titular.toString() : "null";
        return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + 
               "', foto=" + foto + ", titular=" + titularInfo + "}";
    }
}
