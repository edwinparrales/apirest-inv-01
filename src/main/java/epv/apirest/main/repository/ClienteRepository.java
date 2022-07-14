package epv.apirest.main.repository;

import epv.apirest.main.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {

     public Cliente findByDocumento(String documento);
}
