package epv.apirest.main.repository;

import epv.apirest.main.modelo.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto,Long> {
    public List<Producto> findByDescripcion(String descripcion);
    public Producto findByCodigo(String codigo);
}
