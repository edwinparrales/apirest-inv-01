package epv.apirest.main.servicio;

import epv.apirest.main.modelo.Cliente;
import epv.apirest.main.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public Cliente crear(Cliente cl) {
        return clienteRepository.save(cl);
    }

    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    public void eliminar(String dni){
        clienteRepository.deleteById(dni);
    }
}
