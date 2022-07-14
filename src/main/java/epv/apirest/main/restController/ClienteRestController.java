package epv.apirest.main.restController;

import epv.apirest.main.modelo.Cliente;
import epv.apirest.main.servicio.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping
@CrossOrigin(origins = "*")
public class ClienteRestController {
    @Autowired
    ClienteService clService;

    @GetMapping("api/cliente/listar")
    public ResponseEntity<List<Cliente>> list() {

        return new ResponseEntity<>(clService.listar(), HttpStatus.OK);
    }

    @PostMapping("api/cliente/crear")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {

        return new ResponseEntity<>(clService.crear(cliente), HttpStatus.CREATED);
    }
    @DeleteMapping("api/cliente/eliminar/{dni}")
    public void delete(@PathVariable(name = "dni") Long id){
    	
        clService.eliminar(id);
    }
}
