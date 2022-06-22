package epv.apirest.main.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name="detalle_facturas")
public class DetalleFactura implements Serializable {

    @EmbeddedId
    KeyDteFactura keyDteFactura;
    private Integer cantidad;
    private Double valorTotal;
    @ManyToOne
    @JoinColumn(name = "id_factura",insertable = false,updatable = false)
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "id_producto",insertable = false,updatable = false)
    private Producto producto;

    public KeyDteFactura getKeyDteFactura() {
        return keyDteFactura;
    }

    public void setKeyDteFactura(KeyDteFactura keyDteFactura) {
        this.keyDteFactura = keyDteFactura;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "keyDteFactura=" + keyDteFactura +
                ", cantidad=" + cantidad +
                ", valorTotal=" + valorTotal +
                ", factura=" + factura +
                ", producto=" + producto +
                '}';
    }
}
