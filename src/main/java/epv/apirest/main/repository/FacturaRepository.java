package epv.apirest.main.repository;

import epv.apirest.main.modelo.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepository extends CrudRepository<Factura,Long> {
}
