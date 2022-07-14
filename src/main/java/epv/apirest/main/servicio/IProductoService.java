package epv.apirest.main.servicio;

import epv.apirest.main.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> listar();
    public Producto crear(Producto producto);
    public void eliminar(Long id);
    public List<Producto> buscar(Long id);
    public List<Producto> buscarNombre(String descripcion);
    public Producto buscarCodigo(String codigo);
    public Optional<Producto> buscarId(Long id);

}
