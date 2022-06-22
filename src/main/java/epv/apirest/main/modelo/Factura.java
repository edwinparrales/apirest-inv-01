package epv.apirest.main.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_factura")
     private Long id;
     private String codigo;
     private LocalDate fecha;
     private double valImpuestoIva;
     private double valImpuestoConsumo;
     private double valRetencion;
     private double valTotal;

     @ManyToOne
     @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
     private Cliente cliente;


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



    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValImpuestoIva() {
        return valImpuestoIva;
    }

    public void setValImpuestoIva(double valImpuestoIva) {
        this.valImpuestoIva = valImpuestoIva;
    }

    public double getValImpuestoConsumo() {
        return valImpuestoConsumo;
    }

    public void setValImpuestoConsumo(double valImpuestoConsumo) {
        this.valImpuestoConsumo = valImpuestoConsumo;
    }

    public double getValRetencion() {
        return valRetencion;
    }

    public void setValRetencion(double valRetencion) {
        this.valRetencion = valRetencion;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +

                ", fecha=" + fecha +
                ", valImpuestoIva=" + valImpuestoIva +
                ", valImpuestoConsumo=" + valImpuestoConsumo +
                ", valRetencion=" + valRetencion +
                ", valTotal=" + valTotal +
                ", cliente=" + cliente +
                '}';
    }
}
