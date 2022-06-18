package epv.apirest.main.repository;

import epv.apirest.main.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente,String> {
}
