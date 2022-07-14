package epv.apirest.main.servicio;

import epv.apirest.main.modelo.Producto;
import epv.apirest.main.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public List<Producto> listar() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminar(Long id) {
         productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> buscar(Long id) {
        return (List<Producto>) productoRepository.findById(id).get();
    }

    @Override
    public List<Producto> buscarNombre(String descripcion) {
            return productoRepository.findByDescripcion(descripcion);
    }

    @Override
    public Producto buscarCodigo(String codigo) {
        return productoRepository.findByCodigo(codigo);
    }
    @Override
    public Optional<Producto> buscarId(Long id){
        return productoRepository.findById(id);
    }
}
