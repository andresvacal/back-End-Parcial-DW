package model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nombre;
    private String Autor;
    private Date FechaEscritura;
    private int Edicion;
    private float precio;
    private String TipoLubro;
    private String FamaEscritor;
    public Libro(String nombre, String autor, Date fechaEscritura, int edicion, float precio, String tipoLubro,
            String famaEscritor) {
        Nombre = nombre;
        Autor = autor;
        FechaEscritura = fechaEscritura;
        Edicion = edicion;
        this.precio = precio;
        TipoLubro = tipoLubro;
        FamaEscritor = famaEscritor;
    }
    public Libro() {
    }
}
