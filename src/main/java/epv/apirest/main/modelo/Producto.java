package epv.apirest.main.modelo;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(unique = true,nullable = false)
    @NotEmpty(message = "El codigo no puede ser vacio")
    private String codigo;
    @Column(length = 200,nullable = false)
    @NotEmpty(message = "La descripcion no puede ser vacia")
    @NotBlank
    private String descripcion;
    @Column(length = 80)
    private String capacidad;
    @Column(length = 80)
    private String modelo;
    @Column(length = 80)
    private String marca;
    @Column(nullable = false)
    @Min(1)
    private Integer cantidad;
    @Column(length = 80)
    private String categoria;
    @Column(nullable = false)
    private Double valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", capacidad=" + capacidad + ", modelo=" + modelo + ", marca=" + marca + ", cantidad=" + cantidad + ", categoria=" + categoria + ", valor=" + valor + '}';
    }

   
    


}
