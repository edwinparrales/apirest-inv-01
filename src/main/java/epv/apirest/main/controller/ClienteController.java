package epv.apirest.main.controller;

import epv.apirest.main.modelo.Cliente;
import epv.apirest.main.servicio.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/cliente")
public class ClienteController {
    @Autowired
    ClienteService clService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar() {

        return new ResponseEntity<>(clService.listar(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente) {

        return new ResponseEntity<>(clService.crear(cliente), HttpStatus.CREATED);
    }
}
