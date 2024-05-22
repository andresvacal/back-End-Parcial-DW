package DTO;


public class LibroDTO {
    private Long id;
    private String nombre;
    private String autor;
    private String fechaEscritura;
    private int edicion;
    private double precio;
    private String tipoLibro;
    private String famaEscritor;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(String fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public String getFamaEscritor() {
        return famaEscritor;
    }

    public void setFamaEscritor(String famaEscritor) {
        this.famaEscritor = famaEscritor;
    }
}
