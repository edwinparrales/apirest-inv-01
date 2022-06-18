package epv.apirest.main.modelo;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "catalogo_productos")
public class CatalogoProducto {
    @Id
    @Column(unique = true)
    private String codigo;

    private String descripcion;
    private String capacidad;
    private String modelo;
    private String marca;
    private Double valor;
    private Integer cantidad;
    private LocalDate fechaVence;
}
