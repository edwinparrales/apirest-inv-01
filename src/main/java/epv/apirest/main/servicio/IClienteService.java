package epv.apirest.main.servicio;

import java.util.List;

import epv.apirest.main.modelo.Cliente;

public interface IClienteService {
    public List<Cliente> listar();
    public Cliente crear(Cliente cliente);
    public void eliminar(Long id);
    public Cliente buscar(Long id);
    public Cliente buscarDni(String dni);

}
