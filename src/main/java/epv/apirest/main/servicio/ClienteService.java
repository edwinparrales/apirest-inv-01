package epv.apirest.main.servicio;

import epv.apirest.main.modelo.Cliente;
import epv.apirest.main.modelo.Producto;
import epv.apirest.main.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public Cliente crear(Cliente cl) {
        return clienteRepository.save(cl);
    }
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }
    @Override
    public void eliminar(Long id){
        clienteRepository.deleteById(id);
    }



	@Override
	public Cliente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
}
