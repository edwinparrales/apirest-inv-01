package epv.apirest.main.modelo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
public class KeyDteFactura implements Serializable {
    @Column(name = "id_producto")
     private Long idProducto;
    @Column(name = "id_factura")
     private Long idFactura;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }
}
